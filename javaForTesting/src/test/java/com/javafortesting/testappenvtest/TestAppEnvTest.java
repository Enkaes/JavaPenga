package com.javafortesting.testappenvtest;

import org.junit.jupiter.api.Test;

import javafortesting.testappenv.TestAppEnv;
import static javafortesting.testappenv.TestAppEnv.DOMAIN;
import static javafortesting.testappenv.TestAppEnv.PORT;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAppEnvTest{

    @Test
    public void canGetUrlStatically(){
        // static import -> can use without instantiating the TestAppEnv class
        assertEquals("https://google.com", DOMAIN+PORT);

        // static usage -> imported entire class, has to be instantiated with TestAppEnv.
        assertEquals("https://google.com", TestAppEnv.getUrl());
    }
}