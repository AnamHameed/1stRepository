package Pro.Training.Tech.Students;
//5th Class
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://www.amazon.com/");
		
		Thread.sleep(10000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("field-keywords"));
		search.sendKeys("Computer");
		
//create the object of the actions class
		Actions ob = new Actions (driver);		
//key down means when we press a key on a keyboard
//key up means when we leave the pressure from the key
//ctrl A - select all
		Thread.sleep(1000);
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//Cntrl C - copy
		Thread.sleep(1000);
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//clear- use the following to clear any field and use it right after what you need to be clearing
		search.clear();
//click 
		search.click();
//Cntrl v - paste
		Thread.sleep(1000);
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		search.sendKeys(" is awesome");
		WebElement searchnow = driver.findElement(By.id("nav-search-submit-button"));
		searchnow.click();
		
//how to do a right click on any element		
		
		
	}

}
