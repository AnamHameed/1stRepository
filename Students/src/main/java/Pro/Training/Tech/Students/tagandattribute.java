package Pro.Training.Tech.Students;
//2ND CLASS
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tagandattribute {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement createnew = driver.findElement(By.partialLinkText("Create"));
		createnew.click();
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Anam");
			
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Ham1d");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("anam@yahoo.com");
		
		WebElement confirmemail = driver.findElement(By.name("reg_email_confirmation__"));
		confirmemail.sendKeys("anam@yahoo.com");
		
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("idk");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select ob = new Select(month);
		ob.selectByIndex(0);
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select obj = new Select(day);
		obj.selectByIndex(7);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select objct = new Select(year);
		objct.selectByIndex(7);
		
		Thread.sleep(1000);
		WebElement female = driver.findElement(By.name("sex"));
		female.click();
//When it's hard to identify the unique attribute we have to use Xpath to get to the right element using eith Absolute XPath or Relative XPath
		Thread.sleep(1000);
		WebElement signup = driver.findElement(By.name("websubmit"));
		signup.click();

	}

}
