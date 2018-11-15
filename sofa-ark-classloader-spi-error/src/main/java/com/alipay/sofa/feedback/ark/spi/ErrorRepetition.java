/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.sofa.feedback.ark.spi;

import org.junit.Assert;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * @author qilong.zql 18/11/16-上午1:02
 */
public class ErrorRepetition {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        Assert.assertNotNull(engine);
    }
}