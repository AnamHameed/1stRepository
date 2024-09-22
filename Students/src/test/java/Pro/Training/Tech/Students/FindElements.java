package Pro.Training.Tech.Students;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common.Reusable;

public class FindElements extends Reusable {
  @Test
  public void f() {
	  List<WebElement> links = driver.findElements(By.tagName("a")); //this will collect all the tags on that link which match with a
	  int size = links.size();
	  //data type is list and links is the name of a variable
	  System.out.println(size);
  }
}
