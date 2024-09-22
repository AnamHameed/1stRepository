package Common;
//4th Class - 9/8/2024 - Also made Function.xml file
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class Reusable {
	public WebDriver driver;

  @BeforeMethod
  @Parameters ({"browsers","websites"})
  public void beforeMethod(String browser, String websites) throws InterruptedException {
		if (browser.equalsIgnoreCase("Chrome")) {
		  	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		  	driver = new ChromeDriver ();
		  	driver.get(websites);
		  	Thread.sleep(9000);
		  	driver.manage().window().maximize();
		  	}
		  	else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver ();
			driver.get(websites);
		  	Thread.sleep(9000);
		  	driver.manage().window().maximize();
		  	}
		  	else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver ();
			driver.get(websites);
			Thread.sleep(9000);
			driver.manage().window().maximize();
			}
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit(); 
  }

  public void screenshots () throws IOException {
		Date date = new Date();
		System.out.println(date); 
		String jk = date.toString().replace(" ", "_").replace(":", "_"); 
		File capture = (((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE));
		FileHandler.copy(capture, new File("C:\\Users\\fairy\\eclipse-workspace\\Students\\Screenshots\\"+jk+"_output.jpg"));
	}

}
