package Pages;
//TestNG - 2nd Class - 9/1/2024

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver; //Global Driver
@FindBy(linkText = "Best Sellers") WebElement BestSellersLink;

public HomePage(WebDriver driver) //Local Driver
{
	this.driver = driver;
	PageFactory.initElements(driver, this); //this is pointing to global driver. this keyword will work with global only.
}

public void BestSellersClick() {
	BestSellersLink.click();
}

}
