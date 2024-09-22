package Pages;
//TestNG - 2nd Class - 9/1/2024

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellers {
	WebDriver driver;
	@FindBy(linkText = "Kindle Store") WebElement KindleStore;

public BestSellers (WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	
public void ClickKindleStore() {
	KindleStore.click();
}


}
