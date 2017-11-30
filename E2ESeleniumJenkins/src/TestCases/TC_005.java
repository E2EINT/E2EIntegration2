package TestCases;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_005 { //PowerPoint 2013 - Standard
	@Test
	public void testcase1() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver/chromedriver");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.fadvassessments.com/onlinetesting/gamma.html");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		//WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElementByName("ID").sendKeys("qatest");
		driver.findElementByName("username").sendKeys("administrator");
		driver.findElementByName("password").sendKeys("Sk1llCheck!");
		driver.findElementByName("login").click();
		driver.findElement(By.linkText("Administer Testing")).click();
		driver.findElement(By.linkText("Administer Tests")).click();
		//"EN_P5F_ST_F","PowerPoint 2013 - Standard
		driver.findElement(By.xpath("//select[@id='all_tests']/option[@value='EN_P5F_ST_F']")).click();
		driver.findElement(By.xpath("//input[@name='add']")).click();
		driver.findElement(By.xpath("//select[@name='sub_tests']/option[@value='EN_P5F_ST_F']")).click();
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
		driver.findElement(By.xpath(".//*[@id='btnBeginTest']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();	
		WebElement elemnt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='tutorial1_btn0']")));
		elemnt.click();
        driver.findElement(By.xpath(".//*[@id='tutorial1_btn0']")).click();
        driver.findElement(By.xpath(".//*[@id='tutorial1_btn0']")).click();
        driver.findElement(By.xpath(".//*[@id='tutorial1_btn0']")).click(); Thread.sleep(1000);
        WebElement hometab = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("hometab_rtm_tr1")));
        hometab.click();
        WebElement infobv2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='infobv2_003_rtm_tr23']")));
        infobv2.click();
        WebElement openbv1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='openbv1_003_rtm_tr20']")));
        openbv1.click();Thread.sleep(1000);
        WebElement openbv2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("openbv2_003_rtm_tr21")));
        openbv2.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("003opendb_tr11")));
	    Actions act = new Actions(driver);
	    act.doubleClick(driver.findElement(By.xpath(".//*[@id='003opendb_tr11']"))).build().perform();
	    
	    driver.findElement(By.xpath(".//*[@id='tutorial7b_btn0']")).click();
	    
	    driver.findElement(By.xpath(".//*[@id='tutorial7b_btn0']")).click();
	    
	    driver.findElement(By.xpath(".//*[@id='tutorial7b_btn0']")).click();
	    
	    driver.findElement(By.xpath(".//*[@id='tutorial7b_btn0']")).click();
	    
	    driver.findElement(By.xpath(".//*[@id='tutorial12_btn0']")).click();

	   
	    // Question 1
	    
   // Thread.sleep(7000);
		/*Wait<WebDriver> waitt = new FluentWait<WebDriver>(driver)
			       .withTimeout(10, TimeUnit.SECONDS)
			       .pollingEvery(1, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class)
			       .withMessage("User defined wait timed out after 20 seconds");
		
		int var_ele_size= driver.findElements(By.xpath(".//*[@id='hometab_rtm_tr1']")).size();
		 System.out.println("size of the elelemt"+var_ele_size);
		 
		    By mySelector = By.xpath(".//*[@id='scaleArea']/span/div[1]");
	    List<WebElement> myElements = driver.findElements(mySelector);
	    for(WebElement e : myElements) {
	      System.out.println(e.getText());  System.out.println(e.getAttribute("disabled"));
	    }

		 */    
	    wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));
	    driver.findElement(By.xpath(".//*[@id='hometab_rtm_tr1']")).click();
	    driver.findElement(By.xpath(".//*[@id='infobv_rtm_tr20']")).click();
	    driver.findElement(By.xpath(".//*[@id='saveasbv_rtm_tr22']")).click();
	    driver.findElement(By.xpath(".//*[@id='okcboxtype_btn2']")).click();
	    wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
	    driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();Thread.sleep(1000);
	    // Question 2
	    wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("title_rtm_tr0"))).click();
	    wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
	    driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click(); Thread.sleep(1000);
	    // Question 3
	    wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='scaleArea']/span/div[1]"),"Task Instructions"));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("begin_tr11")));
	    driver.findElement(By.xpath(".//*[@id='begin_tr11']")).click();
	    new Actions(driver).sendKeys(Keys.DELETE).perform();
	    wait.until(ExpectedConditions.attributeToBe(By.id("btnAnswerComplete"),"disabled",""));
	    driver.findElement(By.xpath(".//*[@id='btnAnswerComplete']")).click();
	    
	}
	
}

	
		