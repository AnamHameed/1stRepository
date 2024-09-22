package Pro.Training.Tech.Students;

import org.testng.annotations.Test;

import Common.Reusable;
import Pages.Contact;

import org.testng.annotations.DataProvider;

public class ContactUsForm extends Reusable {
  @Test(dataProvider = "dp")
  public void f(String n, String s, String k) throws InterruptedException {
	  Contact ob = new Contact (driver); //to get the data 
/*	  
 	  ob.FirstNameTexts("Anam"); //one way to add data is by hardcoring it in here by putting it like this "Anam"
	  ob.LastNameTexts("Hameed");
	  ob.EmailTexts("anam@yahoo.com"); //hardcore is not efficient or professional so we will use data provider
*/
	  ob.FirstNameTexts(n);
	  ob.LastNameTexts(s);
	  ob.EmailTexts(k);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Anam", "Hameed", "anam@yahoo.com" },
      new Object[] { "Hamza", "Hamid", "hamza@yahoo.com" },
      new Object[] { "Amna", "Hamid", "amna@yahoo.com" }
    };
  }
}
