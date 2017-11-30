package TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_004 { //Accounting - Financial Statements
	@Test
	public void testcase1() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver/chromedriver");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.fadvassessments.com/onlinetesting/gamma.html");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElementByName("ID").sendKeys("qatest");
		driver.findElementByName("username").sendKeys("administrator");
		driver.findElementByName("password").sendKeys("Sk1llCheck!");
		driver.findElementByName("login").click();
		driver.findElement(By.linkText("Administer Testing")).click();
		driver.findElement(By.linkText("Administer Tests")).click();
		//"EN_ACCIN","Accounting - Financial Statements
		driver.findElement(By.xpath("//select[@id='all_tests']/option[@value='EN_ACCIN']")).click();
		driver.findElement(By.xpath("//input[@name='add']")).click();
		driver.findElement(By.xpath("//select[@name='sub_tests']/option[@value='EN_ACCIN']")).click();
		driver.findElement(By.xpath("//input[@value='Begin Testing']")).click();	
		driver.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("Ganesan");
		driver.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("Sivarama");
		driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("Ganesan123");
		driver.findElement(By.xpath("//option[@value='Male']")).click();
		driver.findElement(By.xpath("//option[@value='Under 40']")).click();
		driver.findElement(By.xpath("//option[@value='Caucasian']")).click();
		driver.findElement(By.xpath("//option[@value='I prefer not to answer']")).click();
		driver.findElement(By.xpath("//button[@id='btnCompleteReg']")).click();
		//driver.findElement(By.xpath(".//*[@id='btnAgree']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btnBeginTest']")).click();
		//driver.findElement(By.xpath(".//*[@id='button3']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
	    Thread.sleep(4000);
	    //driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='options_btn0']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='options_btn0']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='options_btn0']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='options_btn0']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='button4']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='button2']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='button2']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='button2']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='button2']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='button2']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("Gan123");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// SKIP 13 question 
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("Gan123");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// SKIP 15 question 
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click();
		//  16 question 
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("Gan123");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
	     //  17 question 
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("Gan123");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		//  18 question 
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("Gan123");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		//  19 question
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("Gan123");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
	    //  20 question
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("Gan123");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		 //  21 question
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("Gan123");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		//  22 question
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("Gan123");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
	   //  23 question
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("Gan123");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		//  24 question
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("Gan123");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		// SKIP 25 question 
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btnAnswerSkip']")).click();
		//click Review button
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btnReview']")).click();
		//Click on Review question 
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='lblSecondCell1']/u/i")).click();
	    // answer review question 14th question
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='search1']")).sendKeys("Gan123");
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
		//Click on Exit button 
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btn5cExit']")).click();
		//Click on Exit/finish button 
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btnExitTestSession']")).click();
		
	
		
	}
	
}

	
		