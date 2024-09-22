package Pro.Training.Tech.Students;
// 
// also the 3rd Class with Priority of a test method.

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstClass {
	WebDriver driver;
  @Test (priority = 0)
  public void f() throws InterruptedException {
	  System.out.println("This is Test Annotation");
	  WebElement bestsellers = driver.findElement(By.linkText("Best Sellers"));
		
	  Actions ob = new Actions (driver);
	  Thread.sleep(1000);
	  ob.keyDown(Keys.LEFT_SHIFT).build().perform();
	  bestsellers.click();
	  ob.keyUp(Keys.LEFT_SHIFT).build().perform();
		
		Set<String> windowhandlebrowsers = driver.getWindowHandles();
		System.out.println("All the Windows: " + windowhandlebrowsers);
		
		Iterator<String> iterators = windowhandlebrowsers.iterator(); 
		System.out.println("Idk wti: "+ iterators);
		
		String FirstWindowHandle = iterators.next();
		System.out.println("1st iterator: " + FirstWindowHandle);
		
		String SecondWindowHandle = iterators.next();
		System.out.println("2nd iterator: " + SecondWindowHandle);
				
		driver.switchTo().window(SecondWindowHandle);
		WebElement stores = driver.findElement(By.linkText("Kindle Store"));
		stores.click();
  }
  
  @Test(priority = 1) // this will change the priority of execution, It won't execute in alphabetical order now.
  public void g() throws InterruptedException {
	  WebElement movecursor = driver.findElement(By.id("nav-link-accountList"));
		//used action class here
		Actions ob = new Actions(driver);
		Thread.sleep(1000);
		ob.moveToElement(movecursor).build().perform();
		//move the cursor and then click on it
		WebElement clicknow = driver.findElement(By.linkText("Orders"));
		Thread.sleep(1000);
		ob.moveToElement(clicknow).click().build().perform();
  }
  
  // If there are multiple methods, they run in alphabetical order using the name of the method.
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.out.println("This is Before Method Annotation");
	  System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.navigate().to("https://www.amazon.com/");
		
		Thread.sleep(10000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  System.out.println("This is After Method Annotation");
	  Thread.sleep(1000);
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is Before Class Annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is After Class Annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is Before Test Annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is After Test Annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is Before Suite Annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is After Suite Annotation");
  }

}
