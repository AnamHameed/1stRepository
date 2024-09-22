package Pages;
// Sir didn't do it as told on the 2nd class 9/1/2024. I don't know if we will do it or not.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	WebDriver driver;
	
	public MainPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
/*	
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver ();
	driver.navigate().to("https://www.amazon.com/");
	
	Thread.sleep(10000);
	driver.navigate().refresh();
	driver.manage().window().maximize();
*/	
	
}
