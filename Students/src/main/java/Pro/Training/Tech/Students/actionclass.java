package Pro.Training.Tech.Students;
//4th Class -3
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class actionclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://www.amazon.com/");
		
		Thread.sleep(10000); //because amazon is checking if a human is using the website or not. so we give time here to put that code manually and then let the code run afterwards
		
		driver.navigate().refresh();
		driver.manage().window().maximize();
	
//AMAZON		
// where you don't click but just move your cursor to a specific place and it shows a popup
		Thread.sleep(3000);
		WebElement movecursor = driver.findElement(By.id("nav-link-accountList"));
		//used action class here
		Actions ob = new Actions(driver);
		Thread.sleep(3000);
		ob.moveToElement(movecursor).build().perform();
		//move the cursor and then click on it
		WebElement clicknow = driver.findElement(By.linkText("Orders"));
		Thread.sleep(1000);
		ob.moveToElement(clicknow).click().build().perform();		
	
		
		
	}

}
