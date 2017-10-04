package TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {

	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver/chromedriver");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("ganesanHari");
		driver.findElementById("pass").sendKeys("ganesan");
		driver.quit();
	}
	
}
