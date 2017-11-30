package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnotationMthods {
	@Test
	public void test1(){
		System.out.println("Test1");	
	}
	
	@Test
	public void test2(){
		System.out.println("Test2");	
	}
	
	@BeforeMethod
	public void beforetest1(){
		System.out.println("Before Methods");
	}
	
	@AfterMethod
	public void Aftertest2(){
		System.out.println("After Methods");
	}


}
