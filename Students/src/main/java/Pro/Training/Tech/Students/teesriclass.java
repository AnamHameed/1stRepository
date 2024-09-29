package Pro.Training.Tech.Students;
//3RD CLASS
import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class teesriclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//how to select the values from the drop down menus
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver (); //chromedriver constructor is without argument
		driver.navigate().to("https://www.facebook.com");
//How to navigate within a browser
	//using thread exception to add time within... 3000 = 3 secs
	//	Thread.sleep(3000);
		driver.navigate().refresh();
	//	Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement createnewaccount = driver.findElement(By.linkText("Create new account"));
		createnewaccount.click();
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Anam");
			
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Ham1d");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("anam@gmail.com");
		
		WebElement confirmemail = driver.findElement(By.name("reg_email_confirmation__"));
		confirmemail.sendKeys("anam@gmail.com");
		
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("idk");
		
	/*WebElement forgtlk=driver.findElement(By.linkText("Forgot password?"));
	WebElement forgtlk=driver.findElement(By.partialLinkText("Forgot"));
	forgtlk.click();*/ //Sir's code
		
		
		
		
//select is a tag from a drop down menu when trying to select a month in the creating new account. select tag is special in selenium, we will creat the object of the class
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select ob = new Select(month);
		//ob.selectByIndex(1);
		//ob.selectByValue("10");
		//ob.selectByVisibleText("Dec");
		//Thread.sleep(3000); // to feel the difference while executing
		ob.selectByIndex(0);
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select obj = new Select(day);
		obj.selectByIndex(7);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select objct = new Select(year);
		objct.selectByIndex(7);
/*		
		Thread.sleep(3000);
//how to select the toggle points. It's an element on it's own in fb site we are inspecting.		
		WebElement female = driver.findElement(By.(""));
		female.click();
		Select object = new Select(female);
		obj.selectByValue("1");
		
		WebElement male = driver.findElement(By.id("u_2_5_fT"));
		Select objects = new Select(male);
		objct.selectByValue("2");
		
		WebElement gender = driver.findElement(By.name("sex"));
		Select objectss = new Select(gender);
		objct.selectByValue("-1");
	
		WebElement signup = driver.findElement(By.linkText("Sign Up"));
		signup.click();
*/	
/*		
XPath is what you write on your own. it's useful when you are unable to find a locator. It's a syntax of finding an element on a page with the XPath.
HTML DOM structure is what we were inspecting in the browser. DOM structure starts from the HTML.
xPath has to follow the tags step by step to reach to the desired destination
	Absolute XPath: direct way to find the element. if changes occur then error will come/problem occurs too. deals with the tags mostly.
always start with single slash
always start from the very beginning
inspect the element, controlF to find the element, and write down your absolute path by typing each portion in the line right above the find path.
each portion is representing one tag. absolute always starts with / one single slash
		/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input			
with the Xpath it may point to more than one element. the above path is pointing to 3 elements in this case. 
		grouping and indexing in XPath when you have more than one element
		add ( )[] to specify which element you want
		FEMALE
	(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[1]
		MALE
	(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]	
		CUSTOM
	(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[3]
		
It's a long path where if developer may change something on their end, it will effect your work, in this case it will be static xpath

		//Relative XPath: mostly used XPath
it always starts with double slash
we can jump to a specific line 
we 1st write basic XPath: //tag name and in the bracket any attribute we want and it's value
these attribute doesn't have to be supported by selenium
with contain you don't have to write the full value, a portion of it should work
Text XPath is a useful tool

		
*/
	//	WebElement female = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[1]"));
	//	female.click();
		
	//	WebElement male = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]"));
	//	male.click();
		
		WebElement custom = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[3]"));
		custom.click();
		
		WebElement pronoun = driver.findElement(By.name("preferred_pronoun"));
		Select pro = new Select(pronoun);
		pro.selectByVisibleText("She: \"Wish her a happy birthday!\"");
		
		WebElement gender = driver.findElement(By.name("custom_gender"));
		gender.sendKeys("Female");
		
		Thread.sleep(3000);
		WebElement signup = driver.findElement(By.linkText("Sign Up"));
		signup.click();
		
//FILL all the elements with the help of Xpath
		
	}

}
