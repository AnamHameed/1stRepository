package Pro.Training.Tech.Students;
import java.util.Iterator;
import java.util.Set;

//6th Class - 8/31/2024
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.Iterators;


public class multiplewindows {
//6th Class - 8/31/2024
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*
When browser a new window when you click on something. We can handle multiple windows in Selenium. When 2 windows are open, 
we can tell it to switch to the second window, finish the task and come back to main window.

get the window handle of current window and then switch control to the specific window using driver.getWindowHandles();
after getting window handles, we have to save them so we can use them later
	string handle one value, can't handle multiple values at the same time.
	Set<String> will handle multiple values
how to extract the value from the set: iterator get the value from the set

	how to open amazon, how to get the window handle, click on a best sellers, action class to use keyboard commands to open a the best sellers in a new window, 
	get the handles of that browser as well, use iterators, with the help of iterators it will go from the 1st one to the next.  
		
*/		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://www.amazon.com/");
		
		Thread.sleep(10000);
		driver.navigate().refresh();
		driver.manage().window().maximize();	
		
		//String currentwindow = driver.getWindowHandle();
		//System.out.println("Main Window: " + currentwindow);
		
		WebElement bestsellers = driver.findElement(By.linkText("Best Sellers"));
		Actions ob = new Actions (driver);
		Thread.sleep(1000);
		ob.keyDown(Keys.LEFT_SHIFT).build().perform();
		bestsellers.click();
		ob.keyUp(Keys.LEFT_SHIFT).build().perform();
		
		Set<String> windowhandlebrowsers = driver.getWindowHandles();
		System.out.println("All the Windows: " + windowhandlebrowsers); //will give me all the window handles in [1, 2, ...] depending on how many windows
		
		Iterator<String> iterators = windowhandlebrowsers.iterator(); //extracting the strings which we gathered in the previous line by getting windows handles.
		System.out.println("Idk wti: "+ iterators); //giving me gibberish in console
		
		String FirstWindowHandle = iterators.next();
		System.out.println("1st iterator: " + FirstWindowHandle);
		
		String SecondWindowHandle = iterators.next();
		System.out.println("2nd iterator: " + SecondWindowHandle);
				
		driver.switchTo().window(SecondWindowHandle);
		WebElement stores = driver.findElement(By.linkText("Kindle Store"));
		stores.click();
		
		
		
	}

}
