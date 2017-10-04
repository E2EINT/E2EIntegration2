package TestCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_002 {

	@Test
	public void testcase2()
	{
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Driver/firefoxdriver/geckodriver");
		//FirefoxDriver driver  = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver/chromedriver");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("ganesan");
		driver.findElementById("pass").sendKeys("ganesh");
		driver.quit();
	}
	
}
