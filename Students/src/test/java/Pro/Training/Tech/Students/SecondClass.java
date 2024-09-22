package Pro.Training.Tech.Students;
//TestNG - 2nd Class - 9/1/2024
//same as PageObjectModel class from Sir Saleem
//3rd class is also in as a soft assert class
//3rd Class - Dependency of one method on another
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Reusable;
import Pages.BestSellers;
import Pages.HomePage;
import Pages.KindleStore;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class SecondClass extends Reusable {
	// WebDriver driver; //because we made reusable class and it's in there
  @Test
  public void f() throws IOException {
	  HomePage ob = new HomePage (driver);
	  ob.BestSellersClick();
	  
	  BestSellers obj = new BestSellers(driver);
	  obj.ClickKindleStore();
	  
	  KindleStore objct = new KindleStore(driver);
	  String togetthetext = objct.GetTextontop();
	  System.out.println(togetthetext);
	  screenshots();
	//  assertEquals(togetthetext, "Best Sellers in Kindle Store"); //to verify the expected result with the actual result  
//3rd Class 9/7/2024
	  SoftAssert jk = new SoftAssert();
	  jk.assertEquals(togetthetext, "Best Sellers in Kindle Store");
	  System.out.println("This is after assertion");
	  jk.assertAll();
	  // if assertion fail then it will stop the whole code with assertequals. soft assert will still execute the whole code. but if we add assertAll in the end, that would make it equal to the assertEquals command.
	  // I'm not sure why we then use softassert followed by assertall if that's equal to 	  
  }
  
  @Test //(dependsOnMethods = "f")
  public void a() {
	  System.out.println("This method is dependent on f method's success");
  }
  //dependent method will only execute if the 1st or earlier method was successful. It won't execute if the other method fails.
  //BECAUSE OF THE REUSABLE CLASS WE CAN SKIP IT HERE
  
  /* 
  @BeforeMethod
  public void beforeMethod() throws InterruptedException, IOException {
		browsers("Chrome");
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(10000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		screenshots();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
  }
  
  public void browsers (String browser) {
	  	if (browser.equalsIgnoreCase("Chrome")) {
	  	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
	  	driver = new ChromeDriver ();
	  	}
	  	else if (browser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver ();
	  	}
	  	else if (browser.equalsIgnoreCase("Firefox")) {
	  		System.setProperty("webdriver.firefox.driver" , "C:\Users\fairy\eclipse-workspace\Students\Drivers\geckodriver.exe");
			driver = new FirefoxDriver ();	
	  	}
}
 
public void screenshots () throws IOException {
//data type of screenshot will be file
	Date date = new Date();
	System.out.println(date); //this will give the time of when that screenshot was taken and more details like day, month, date, time, time zone and year.
	// we can use this object 
	//File is in string format, time is not in string format. we will have to convert it into a string format
	String jk = date.toString().replace(" ", "_").replace(":", "_"); // this is converting any data type to a string data type. we will replace the space and colons with underscore.
	File capture = (((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE));
	FileHandler.copy(capture, new File("C:\\Users\\fairy\\eclipse-workspace\\Students\\Screenshots\\"+jk+"_output.jpg"));
//everytime the name of the file should change if we are trying to take multiple screenshots.
//we can use parameterization and use time stamp to acheive this goal.
//This code will now handle all the screenshots we take
}
  */
}
