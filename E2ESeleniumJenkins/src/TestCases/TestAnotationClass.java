package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAnotationClass {
	
	@Test
	public void test1(){
		System.out.println("Test1");	
	}
	
	@Test
	public void test2(){
		System.out.println("Test2");	
	}
	
	@BeforeClass
	public void beforetest1(){
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void Aftertest2(){
		System.out.println("After Class");
	}


}
