package com.wkuai.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {
    //最基本注解，用于把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是在测试方法之前执行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在测试方法之后执行的");
    }
}
