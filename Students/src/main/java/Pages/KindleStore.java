package Pages;
//TestNG - 2nd Class - 9/1/2024

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KindleStore {
	WebDriver driver;
	@FindBy(xpath = "//*[text()='Best Sellers in Kindle Store']") WebElement Textontop;
	
	public KindleStore (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String GetTextontop () {
		String gettingtext = Textontop.getText();
		return gettingtext;
	}

}
