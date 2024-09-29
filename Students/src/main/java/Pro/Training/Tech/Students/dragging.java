package Pro.Training.Tech.Students;
//4th class - Actonsit - sir's class name

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragging {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://www.jqueryui.com/");
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
	
		WebElement click = driver.findElement(By.linkText("Droppable"));
		click.click();
		
		//Sir's code
		/*WebElement signes=driver.findElement(By.id("nav-link-accountList"));
		Actions ob=new Actions(driver);
		Thread.sleep(6000);
		ob.moveToElement(signes).build().perform();
		
		Thread.sleep(6000);
		WebElement musics=driver.findElement(By.linkText("Music Library"));
	 ob.moveToElement(musics).click().build().perform();*/
		
		
		Actions ob = new Actions(driver);
		driver.switchTo().frame(0);
	//you have to count the iframes within the main frame, they will be indexed to start with 0 and move forward
		Thread.sleep(1000);
		WebElement drag = driver.findElement(By.id("draggable"));
//iframes are websites inside the website. nested websites. selenium consider it as a different website so we have to tell it that it's an iframe. 
// switch from parent window to the 

		WebElement drop = driver.findElement(By.id("droppable"));
		ob.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Resizable")).click();
	
		
		
		
	}

}
