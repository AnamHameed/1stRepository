package Pro.Training.Tech.Students;
//2ND DAY - Ibrowsers is Sir's class
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class howtoopenbrowserandsite {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
//how to setup the browser and how to open the website into the browser
				System.setProperty("webdriver.chrome.driver" , "C:\\Users\\fairy\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver ();
				driver.navigate().to("https://www.quran.com");
//How to navigate within a browser
			//using thread exception to add time within... 3000 = 3 secs
			//	Thread.sleep(3000);
				driver.navigate().refresh();
			//	Thread.sleep(3000);
				driver.manage().window().maximize();
			//	Thread.sleep(3000);
				driver.navigate().back();
			//	Thread.sleep(3000);
				driver.navigate().forward();
		
//How to get the session ID of the browser - Chrome in this example
				String sessions = driver.getWindowHandle();
				System.out.println(sessions);
				
//How to get the title of the website
				String titles = driver.getTitle();
				System.out.println(titles);
				
//How to get the value of the url/website
				String urls = driver.getCurrentUrl();
				System.out.println(urls);
				
//How to close the browser - both close and quit are the options available
//				driver.close();
//				driver.quit();
				

	}

}
