package Pro.Training.Tech.Students;
//4th Class -1
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class popupissue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.manage().window().maximize();

//GURU99 pop up issue
		WebElement submission = driver.findElement(By.name("submit"));
		submission.click();
//now the pop up is there. we have to make the pop up go away by tackling it first by OK or CANCEL. 
		Thread.sleep(1000);
//to click Cancel
		driver.switchTo().alert().dismiss();
//to click OK
		driver.switchTo().alert().accept();
//to tackle the next alert		
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

			
		
	}

}
