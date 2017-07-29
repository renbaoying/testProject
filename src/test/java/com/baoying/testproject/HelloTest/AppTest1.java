package com.baoying.testproject.HelloTest;

import org.testng.annotations.Test;

public class AppTest1 extends BaseTest{
    @Test(description = "测试testng初始化共有类")
    public void Test2(){
    	System.out.println("------Test2----"+str);
    }
}
