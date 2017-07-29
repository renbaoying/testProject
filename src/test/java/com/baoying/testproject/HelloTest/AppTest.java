package com.baoying.testproject.HelloTest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.beust.testng.TestNG;



/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest
   
{
//	@BeforeClass
//	public void setup(){
//		System.out.println("BeforeClass");
//	}
//	@AfterClass
//	public void teardown(){
//		System.out.println("AfterClass");
//	}
//	@BeforeMethod
//	public void method(){
//		System.out.println("BeforeMethod");
//	}
    @Test
    public void Test(){
    	String str = "test";
    	Assert.assertEquals(str, "test");
//    	Assert.fail("message is fail!");
    }
//    @Test
//    public void Test1(){
//    	String str = "test1";
//    	AssertJUnit.assertEquals(str, "test1");
////    	Assert.fail("message is fail!");
//    }
}
