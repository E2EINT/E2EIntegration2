package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_002 { //Asurion PSS Part 1 (2014)

	@Test
	public void testcase1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver/chromedriver");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.fadvassessments.com/onlinetesting/gamma.html");
		driver.findElementByName("ID").sendKeys("qatest");
		driver.findElementByName("username").sendKeys("administrator");
		driver.findElementByName("password").sendKeys("Sk1llCheck!");
		driver.findElementByName("login").click();
		driver.findElement(By.linkText("Administer Testing")).click();
		driver.findElement(By.linkText("Administer Tests")).click();
		//Client-required test2: "ENASPT12014","Asurion PSS Part 1 (2014)
		driver.findElement(By.xpath("//select[@id='all_tests']/option[@value='ENASPT12014']")).click();
		driver.findElement(By.xpath("//input[@name='add']")).click();
		driver.findElement(By.xpath("//select[@name='sub_tests']/option[@value='ENASPT12014']")).click();
		driver.findElement(By.xpath("//input[@value='Begin Testing']")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("Ganesan");
		driver.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("Sivarama");
		driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("Ganesan123");
		driver.findElement(By.xpath("//option[@value='Male']")).click();
		driver.findElement(By.xpath("//option[@value='Under 40']")).click();
		driver.findElement(By.xpath("//option[@value='Caucasian']")).click();
		driver.findElement(By.xpath("//option[@value='I prefer not to answer']")).click();
		driver.findElement(By.xpath("//button[@id='btnCompleteReg']")).click();
		driver.findElement(By.xpath("//button[@id='btnBeginTest']")).click();
	    Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,40);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='itemWrapper']/div[2]//button")));   
	    WebElement el = driver.findElement(By.xpath(".//*[@id='itemWrapper']/div[2]//button"));
	    Actions act=new Actions(driver);
	    act.moveToElement(el).click().build().perform();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(".//*[@id='itemWrapper']/div[2]//button"));
	    WebElement elt = driver.findElement(By.xpath(".//*[@id='itemWrapper']/div[2]//button"));
	    Actions actt=new Actions(driver);		
	    actt.moveToElement(elt).click().build().perform();
	    Thread.sleep(2000); 
		driver.findElement(By.xpath("//div[@id='simArea']//*[@id='options_btn0']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='simArea']//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='simArea']//*[@id='button3']")).click();	
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		//================ First Drag and Drop question #  =============== 
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='draggables_rtx1']")));   
		WebElement  sourcelocator1 = driver.findElement(By.xpath(".//*[@id='draggables_rtx1']"));
		WebElement destinationlocator1 =driver.findElement(By.xpath(".//*[@id='droppables_tr2']"));
	    Actions drag1=new Actions(driver);
	    drag1.dragAndDrop(sourcelocator1,destinationlocator1).perform();
	    Thread.sleep(200);  
		WebElement  sourcelocator2 = driver.findElement(By.xpath(".//*[@id='draggables_rtx2']"));
		WebElement destinationlocator2 =driver.findElement(By.xpath(".//*[@id='droppables_tr4']"));
	    Actions drag2=new Actions(driver);
	    drag2.dragAndDrop(sourcelocator2,destinationlocator2).perform();
	    Thread.sleep(200);
		WebElement  sourcelocator3 = driver.findElement(By.xpath(".//*[@id='draggables_rtx3']"));
		WebElement destinationlocator3 =driver.findElement(By.xpath(".//*[@id='droppables_tr0']"));
	    Actions drag3=new Actions(driver);
	    drag3.dragAndDrop(sourcelocator3,destinationlocator3).perform();
	    Thread.sleep(200);
		WebElement  sourcelocator4 = driver.findElement(By.xpath(".//*[@id='draggables_rtx4']"));
		WebElement destinationlocator4 =driver.findElement(By.xpath(".//*[@id='droppables_tr3']"));
	    Actions drag4=new Actions(driver);
	    drag4.dragAndDrop(sourcelocator4,destinationlocator4).perform();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='simArea']//*[@id='button3']")));   
		driver.findElement(By.xpath("//div[@id='simArea']//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='simArea']//*[@id='button3']")));   
		driver.findElement(By.xpath("//div[@id='simArea']//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='simArea']//*[@id='button3']")));   
		driver.findElement(By.xpath("//div[@id='simArea']//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		//================ Second Drag and Drop question # 8 =============== 
		Thread.sleep(3000);
		WebElement  sourcelocator11 = driver.findElement(By.xpath(".//*[@id='draggables_rtx1']"));
		WebElement destinationlocator11 =driver.findElement(By.xpath(".//*[@id='droppables_tr4']"));
	    Actions drag11=new Actions(driver);
	    drag11.dragAndDrop(sourcelocator11,destinationlocator11).perform();
	    Thread.sleep(200);
		WebElement  sourcelocator22 = driver.findElement(By.xpath(".//*[@id='draggables_rtx2']"));
		WebElement destinationlocator22 =driver.findElement(By.xpath(".//*[@id='droppables_tr3']"));
	    Actions drag22=new Actions(driver);
	    drag22.dragAndDrop(sourcelocator22,destinationlocator22).perform();
	    Thread.sleep(200);
		WebElement  sourcelocator33 = driver.findElement(By.xpath(".//*[@id='draggables_rtx3']"));
		WebElement destinationlocator33 =driver.findElement(By.xpath(".//*[@id='droppables_tr2']"));
	    Actions drag33=new Actions(driver);
	    drag33.dragAndDrop(sourcelocator33,destinationlocator33).perform();
	    Thread.sleep(200);
		WebElement  sourcelocator44 = driver.findElement(By.xpath(".//*[@id='draggables_rtx4']"));
		WebElement destinationlocator44 =driver.findElement(By.xpath(".//*[@id='droppables_tr0']"));
	    Actions drag44=new Actions(driver);
	    drag44.dragAndDrop(sourcelocator44,destinationlocator44).perform();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='simArea']//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='simArea']//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='simArea']//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='simArea']//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		// Question number 14 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='simArea']//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(10000);
		new Actions(driver).keyDown(Keys.COMMAND).sendKeys(String.valueOf('\u007A')).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(10000);
		WebElement testt = driver.findElement(By.xpath(".//*[@id='begin_tr20']"));
		new Actions(driver).contextClick(testt).sendKeys(String.valueOf('\u0077')).sendKeys(String.valueOf('\u0066')).perform();
	    driver.findElement(By.xpath(".//*[@id='rightpanenew_txt0']")).clear();
	    driver.findElement(By.xpath(".//*[@id='rightpanenew_txt0']")).click();
	    driver.findElement(By.xpath(".//*[@id='rightpanenew_txt0']")).sendKeys("products");
	 	new Actions(driver).sendKeys(String.valueOf('\u0050')).perform();
		Thread.sleep(2000);
	 	new Actions(driver).sendKeys(String.valueOf('\u0052')).perform();
		Thread.sleep(700);
	 	new Actions(driver).sendKeys(String.valueOf('\u004F')).perform();
		Thread.sleep(700);
	 	new Actions(driver).sendKeys(String.valueOf('\u0044')).perform();
		Thread.sleep(700);
	 	new Actions(driver).sendKeys(String.valueOf('\u0055')).perform();
		Thread.sleep(700);
	 	new Actions(driver).sendKeys(String.valueOf('\u0043')).perform();
		Thread.sleep(700);
	 	new Actions(driver).sendKeys(String.valueOf('\u0054')).perform();
		Thread.sleep(700);
	 	new Actions(driver).sendKeys(String.valueOf('\u0053')).perform();
		Thread.sleep(2000);
	 	new Actions(driver).sendKeys(Keys.ENTER).perform();
	 	Thread.sleep(4000);
	 	driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
	 	//question # 16
	 	Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(8000);
		//question # 17
		new Actions(driver).keyDown(Keys.COMMAND).sendKeys(String.valueOf('\u0078')).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		//question # 18
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		//question # 19
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		//question # 20
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		//drag and drop question # 21
		Thread.sleep(4000);
		WebElement  sourcelocator21 = driver.findElement(By.xpath(".//*[@id='draggables_rtx1']"));
		WebElement destinationlocator21 =driver.findElement(By.xpath(".//*[@id='droppables_tr4']"));
	    Actions drag21=new Actions(driver);
	    drag21.dragAndDrop(sourcelocator21,destinationlocator21).perform();
	    Thread.sleep(200);
		WebElement  sourcelocator211 = driver.findElement(By.xpath(".//*[@id='draggables_rtx2']"));
		WebElement destinationlocator211 =driver.findElement(By.xpath(".//*[@id='droppables_tr3']"));
	    Actions drag221=new Actions(driver);
	    drag221.dragAndDrop(sourcelocator211,destinationlocator211).perform();
	    Thread.sleep(200);
		WebElement  sourcelocator212 = driver.findElement(By.xpath(".//*[@id='draggables_rtx3']"));
		WebElement destinationlocator212 =driver.findElement(By.xpath(".//*[@id='droppables_tr2']"));
	    Actions drag222=new Actions(driver);
	    drag222.dragAndDrop(sourcelocator212,destinationlocator212).perform();
	    Thread.sleep(200);
		WebElement  sourcelocator213 = driver.findElement(By.xpath(".//*[@id='draggables_rtx4']"));
		WebElement destinationlocator213 =driver.findElement(By.xpath(".//*[@id='droppables_tr0']"));
	    Actions drag223=new Actions(driver);
	    drag223.dragAndDrop(sourcelocator213,destinationlocator213).perform();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
        // question # 22
		driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(3000);
		// question # 23
		driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(3000);
		// question # 24
		driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(3000);
		// question # 25
		driver.findElement(By.xpath(".//*[@id='button3']")).click();
		driver.findElement(By.xpath("//button[@id='btnAnswerComplete']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btnContinue']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btnExitTestSession']")).click();
		Thread.sleep(3000);
		//driver.quit();
		
	}
}
