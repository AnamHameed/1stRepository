package Pro.Training.Tech.Students;
import java.time.Duration;
//5th class
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
		
		driver.navigate().refresh();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
/*

if we use thread.sleep, regardless of the error it will wait.
wait time issues. synchronization: the speed of the script is not matching with the speed of the browser. 
If browser is slower than the code and it's a speed mismatch, because of this mismatch we use implicit wait and explicit wait to resolve this issue of not synchronization.

-IMPLICIT WAIT: it will not throw the script, instead it will wait and it will wait for any code which we write after this syntax. only write it once		
If there is no error it will just keep going with implicit and only wait if there is an error

-EXPLICIT WAIT: it works on different condition. explicit wait will act until the condition we put on the condition on any element. to make sure it stays on the screen.
wait.until(ExpectedConditions.visibilityOf(rightclick));
				
			
*/		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@style='cursor: pointer;']")));
		
		WebElement rightclick = driver.findElement(By.xpath("//img[@style='cursor: pointer;']"));
		Actions ob = new Actions(driver);
		ob.contextClick(rightclick).build().perform(); //will help do the right click function
		
	}

}
