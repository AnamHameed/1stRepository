package Pro.Training.Tech.Students;
//5th Class - Rights - Sir's class name
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		WebElement rightclick = driver.findElement(By.xpath("//img[@style='cursor: pointer;']"));
		
/*	//Sir Saleem's code
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		WebDriverWait oj=new WebDriverWait(driver, "");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement rightjk=driver.findElement(By.xpath("//img[@style='cursor: pointer;']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@style='cursor: pointer']")));
*/
		
		Actions ob = new Actions(driver);
		Thread.sleep(1000);
		ob.contextClick(rightclick).build().perform(); //will help do the right click function
		
		
		
		
	}
	
	//wait time issues. synchronization: the speed of the script is not matching with the speed of the browser. one can be slower than the other, so just because of this mismatch we use implicit wait and explicit wait to resolve this issue of not syncing.
	

}
