package TestCases;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

public class TC_006 { //Typing Test
	@Test
	public void testcase1() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver/chromedriver");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.fadvassessments.com/onlinetesting/gamma.html");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElementByName("ID").sendKeys("qatest");
		driver.findElementByName("username").sendKeys("administrator");
		driver.findElementByName("password").sendKeys("Sk1llCheck!");
		driver.findElementByName("login").click();
		driver.findElement(By.linkText("Administer Testing")).click();
		driver.findElement(By.linkText("Administer Tests")).click();
		//"Flash-based typing engine: "EN_TYPSS","Typing Test
		driver.findElement(By.xpath("//select[@id='all_tests']/option[@value='EN_TYPSS']")).click();
		driver.findElement(By.xpath("//input[@name='add']")).click();
		driver.findElement(By.xpath("//select[@name='sub_tests']/option[@value='EN_TYPSS']")).click();
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
		Thread.sleep(9000);
		driver.findElement(By.xpath(".//*[@id='btnBeginTest']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath(".//*[@id='page1_btn1']")).click();	
		Thread.sleep(9000);
		driver.findElement(By.xpath(".//*[@id='page2_btn0']")).click();	
		// typing form 
		Thread.sleep(9000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).click();
		//driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("As a company, we constantly strive to improve our products, as well as our customer satisfaction. In that spirit, we are looking to implement one of two possible plans to ensure that these objectives are being met. One plan is to form a company review committee consisting of production managers, production-line workers, inspectors, and a consultant in quality control. This council would brainstorm ways to increase the quality of production and inspection methods. The committee could also make suggestions on the steps necessary to achieve the desired results through new training methods and the purchase of additional equipment. A possible timeline would begin with the committee convening early in September to draft ideas for improvements. At that time, they could also designate teams to investigate different methods for accomplishing the plans. The committee could meet again in October to report back on their findings and decide upon new procedures for our manufacturing and inspection. Their recommended changes could be implemented in November. Once the changes are made, a future meeting could be scheduled to determine whether or not the changes are effective. At that time, we might want to establish the committee as part of our company. They could meet every month or so to ensure that we are maintaining the highest standards in the quality of our products and the satisfaction of our customers. If necessary, we could maintain the consultant or hire a full-time quality-control person to see that the recommendations of the committee are implemented promptly and effectively. An alternative plan calls for a select committee of executives to survey methods of quality control used at companies most similar to our own. Such companies could include Ajax Manufacturing, the Leviathan Corporation and Olympus Industries. Under this plan, the executive committee could compile a list of methods used by our rivals to achieve high quality. After all of the data are compiled, the executive committee would determine which methods would best be adopted to maintain top-notch quality in our products. Once the new techniques are determined, the executives could purchase any necessary equipment. In addition, they may also decide upon additional training for managers, workers and inspectors in order to put the new methods into effect. By presenting employees with a completed plan, rather than asking for suggestions and recommendations, we can save needed time and the cost of hiring an outside consultant. Under this plan, the executive committee could meet with managers and inspectors weekly to see that the new methods are being properly implemented and that the quality of our products is improving. Once the initial recommendations are implemented, it might be wise to begin rotating the membership of this committee so all executives could become involved in the drive for higher quality. Rotating the membership would also allow executives to bring their special expertise to the problem and offer some fresh insights and suggestions. Please consider the two possible plans and bring your thoughts to our staff meeting next week.");
	
		//StopWatch sw = new StopWatch();
		//driver.manage().setSpeed(Speed.MEDIUM);
		//EventFiringWebDriver
		
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("As a company, we constantly strive to improve our products, as well as our customer satisfaction. In that spirit, we are looking to implement one of two possible plans to ensure that these objectives are being met. One plan is to form a company review committee consisting of production managers, production-line workers,");
		
		/*sw.reset();
		sw.start();
		sw.stop();*/
		
		//Console.WriteLine(string.Format(" [{0} ms]", sw.ElapsedMilliseconds));
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("inspectors, and a consultant in quality control. This council would brainstorm ways to increase the quality of production and inspection methods. The committee could also make suggestions on the steps necessary to achieve the desired results through new training methods and the purchase of additional equipment.");
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("A possible timeline would begin with the committee convening early in September to draft ideas for improvements. At that time, they could also designate teams to investigate different methods for accomplishing the plans. The committee could meet again in October to report back on their findings and decide upon new procedures");
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("for our manufacturing and inspection. Their recommended changes could be implemented in November. Once the changes are made, a future meeting could be scheduled to determine whether or not the changes are effective. At that time, we might want to establish the committee as part of our company. They could meet every month or so to");
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("ensure that we are maintaining the highest standards in the quality of our products and the satisfaction of our customers. If necessary, we could maintain the consultant or hire a full-time quality-control person to see that the recommendations of the committee are implemented promptly and effectively. An alternative plan calls for a"); 
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("select committee of executives to survey methods of quality control used at companies most similar to our own. Such companies could include Ajax Manufacturing, the Leviathan Corporation and Olympus Industries. Under this plan, the executive committee could compile a list of methods used by our rivals to achieve high quality. After all of");
		Thread.sleep(88000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("the data are compiled, the executive committee would determine which methods would best be adopted to maintain top-notch quality in our products. Once the new techniques are determined, the executives could purchase any necessary equipment. In addition, they may also decide upon additional training for managers, workers and inspectors in order");
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys(" to put the new methods into effect. By presenting employees with a completed plan, rather than asking for suggestions and recommendations, we can save needed time and the cost of hiring an outside consultant. Under this plan, the executive committee could meet with managers and inspectors weekly to see that the new methods are being properly");
		Thread.sleep(000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys(" implemented and that the quality of our products is improving. Once the initial recommendations are implemented, it might be wise to begin rotating the membership of this committee so all executives could become involved in the drive for higher quality. Rotating the membership would also allow executives to bring their special expertise");
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@id='typingform_rtx6']")).sendKeys("to the problem and offer some fresh insights and suggestions. Please consider the two possible plans and bring your thoughts to our staff meeting next week.");
		
	
		
		//Console.WriteLine(string.Format(" [{0} ms]", sw.ElapsedMilliseconds));
	}
	
	
}

	
		