package TestCases;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testAnotationTest {
	@Test
	public void test1(){
		System.out.println("Test1");	
	}
	
	@Test
	public void test2(){
		System.out.println("Test2");	
	}
	
	@BeforeTest
	public void beforetest1(){
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void Aftertest2(){
		System.out.println("After Test");
	}
}
	
	