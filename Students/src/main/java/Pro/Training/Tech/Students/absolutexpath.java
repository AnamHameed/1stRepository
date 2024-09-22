package Pro.Training.Tech.Students;
//3RD CLASS
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class absolutexpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement createnewaccount = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/div/form/div/a)[2]"));
		createnewaccount.click();
		
		Thread.sleep(6000);
		WebElement firstname = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/div/div/div/div/input)[1]")); //this is not going in the write spot!
		firstname.sendKeys("Anam");
		Thread.sleep(1000);	
		WebElement lastname = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/div/div/div/div/input)[2]"));
		lastname.sendKeys("Ham1d");
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/div/div/input)[1]"));
		email.sendKeys("anam@gmail.com");
		Thread.sleep(1000);			
		//WebElement confirmemail = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/div/div/div/input)[1]"));
		//confirmemail.sendKeys("anam@gmail.com");
		//Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/div/div/input)[2]"));
		password.sendKeys("idk");
		
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/div/span/span/select)[1]"));
		Select ob = new Select(month);
		ob.selectByIndex(0);
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/div/span/span/select)[2]"));
		Select obj = new Select(day);
		obj.selectByIndex(7);
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/div/span/span/select)[3]"));
		Select objct = new Select(year);
		objct.selectByIndex(7);
		Thread.sleep(1000);
		
//		WebElement female = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[1]"));
//		female.click();
		
		WebElement male = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]"));
		male.click();
/*
		WebElement custom = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[3]"));
		custom.click();
		
		WebElement pronoun = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div/div/div/select"));
		Select pro = new Select(pronoun);
		pro.selectByVisibleText("She: \"Wish her a happy birthday!\"");
		
		WebElement gender = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/div/div/input)[3]"));
		gender.sendKeys("Female");
*/		
		Thread.sleep(1000);
		WebElement signup = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div/div/button"));
		signup.click();
		
	}

}
