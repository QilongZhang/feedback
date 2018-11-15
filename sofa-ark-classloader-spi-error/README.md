+ 在 IDE 直接启动 main 方法，无报错

+ 执行 mvn clean install 生成 ark fatjar. 执行 java -jar target/sofa-ark-classloader-spi-error/target/sofa-ark-classloader-spi-error-1.0.0-executable-ark.jar 报错

```java
Caused by: java.lang.reflect.InvocationTargetException
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at com.alipay.sofa.ark.bootstrap.MainMethodRunner.run(MainMethodRunner.java:48)
        at com.alipay.sofa.ark.container.model.BizModel.start(BizModel.java:180)
        at com.alipay.sofa.ark.container.service.biz.DefaultBizDeployer.deploy(DefaultBizDeployer.java:52)
        ... 13 more
Caused by: java.lang.AssertionError
        at org.junit.Assert.fail(Assert.java:86)
        at org.junit.Assert.assertTrue(Assert.java:41)
        at org.junit.Assert.assertNotNull(Assert.java:712)
        at org.junit.Assert.assertNotNull(Assert.java:722)
        at com.alipay.sofa.feedback.ark.spi.ErrorRepetition.main(ErrorRepetition.java:19)
        ... 20 more

```