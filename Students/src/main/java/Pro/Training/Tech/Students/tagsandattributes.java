package Pro.Training.Tech.Students;
//2ND CLASS
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagsandattributes {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//How to navigate within the website and where to click, where to type. that location is what we call elements. we locate elements in different ways.
		//8 Locators in Selenium: ID, link, partiallinktext, classname, name, Xpath, Css selector, Tagname 
		//use a unique locator so it only identifies what you want it to
			//each line has a tag and attribute. 1st word is a tag after '<' and then there can be multiple attributes and those can be assigned values within "".
			//attributes are the locators. but selenium doesn't support all the attribute. Only the 8 mentioned above.
		//how to save it into the variable. enteremail is the name of the variable
		
			WebElement enteremail =  driver.findElement(By.name("email"));
			enteremail.sendKeys("anam@yahoo.com");
			Thread.sleep(1000);
			WebElement enterpassword = driver.findElement(By.name("pass"));
			enterpassword.sendKeys("idk");
		//	WebElement pressenter = driver.findElement(By.class("x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1"));
		//	pressenter.click();
	//how to fill the form and link the element in the code above
//how to use linktext locator: a, href, 
			Thread.sleep(1000);
//			WebElement forgotlink = driver.findElement(By.linkText("Forgot password?"));
//			forgotlink.click();

//if we use the partial link text then we don't have to use the whole text. it will apply in a link text.
//			Thread.sleep(1000);
			WebElement forgotbiglink = driver.findElement(By.partialLinkText("Forgot"));
			forgotbiglink.click();
							

	}

}
