package com.baoying.testproject.HelloTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public String str = "";
   @BeforeClass
   public void  Init(){
	   System.out.println("Test beforeclass init!");
	   str = "sssssssssssssss";
   }
   @AfterClass
   public void end(){
	   System.out.println("test afterclass end");
   }
   
}
