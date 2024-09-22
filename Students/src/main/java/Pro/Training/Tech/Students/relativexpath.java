package Pro.Training.Tech.Students;
//3RD CLASS
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class relativexpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement createnewaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createnewaccount.click();
		
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.xpath("//input[@aria-label='First name']"));
		firstname.sendKeys("Anam");
			
		WebElement lastname = driver.findElement(By.xpath("//input[@aria-label='Last name']"));
		lastname.sendKeys("Ham1d");
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
		email.sendKeys("anam@yahoo.com");
		//Thread.sleep(1000);
		//WebElement confirmemail = driver.findElement(By.xpath("//input[@aria-label='Re-enter email']"));
		//confirmemail.sendKeys("anam@yahoo.com");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("//input[@aria-label='New password']"));
		password.sendKeys("idk");
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select ob = new Select(month);
		ob.selectByIndex(0);
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select obj = new Select(day);
		obj.selectByIndex(7);
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select objct = new Select(year);
		objct.selectByIndex(7);
		Thread.sleep(1000);
//		WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
//		female.click();
		
//		WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
//		male.click();
		
		WebElement custom = driver.findElement(By.xpath("//input[@value='-1']"));
		custom.click();
		Thread.sleep(1000);
		WebElement pronoun = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
		Select pro = new Select(pronoun);
		pro.selectByVisibleText("She: \"Wish her a happy birthday!\"");
		
		WebElement gender = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		gender.sendKeys("Female");
		Thread.sleep(1000);
		WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signup.click();
	
	}

}
