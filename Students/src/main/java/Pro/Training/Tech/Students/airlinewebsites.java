package Pro.Training.Tech.Students;
//4th Class -2
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class airlinewebsites {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://www.cheapoair.com/");
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
//AIRLINE SITE CALENDAR POP UP		
		Thread.sleep(3000);
		WebElement departure = driver.findElement(By.xpath("//input[@aria-label='Choose a departure date. expanded']"));
		departure.click();
		
		Thread.sleep(3000);
		WebElement ddate = driver.findElement(By.xpath("//a[@aria-label='26 August 2024']"));
		ddate.click();
		
		Thread.sleep(3000);
		WebElement adate = driver.findElement(By.xpath("//a[@aria-label='27 September 2024']"));
		adate.click();
		

		
	}

}
