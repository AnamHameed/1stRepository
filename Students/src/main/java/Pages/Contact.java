package Pages;
//6th Class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {
	WebDriver driver;
	@FindBy(name = "form_fields[name]")
	WebElement FirstNameField;
	@FindBy(name = "form_fields[field_6c5f814]")
	WebElement LastNameField;
	@FindBy(name = "form_fields[email]")
	WebElement Email;
	
	public Contact (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void FirstNameTexts(String fname) throws InterruptedException {
		FirstNameField.clear();
		FirstNameField.sendKeys(fname);
		Thread.sleep(3000);
	}
	
	public void LastNameTexts(String lname) throws InterruptedException {
		LastNameField.clear();
		LastNameField.sendKeys(lname);
		Thread.sleep(3000);
	}
	
	public void EmailTexts(String email) throws InterruptedException {
		Email.clear();
		Email.sendKeys(email);
		Thread.sleep(3000);
	}
}
