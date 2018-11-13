package com.spinningnoodle.gradle.java.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ServiceTest {

    @Test
    public void testAdd() {
        Service service = new Service();
        Assert.assertEquals(3,service.addSomething(1,2));
    }

    public static class InnerClass {
        int a;

    }



}