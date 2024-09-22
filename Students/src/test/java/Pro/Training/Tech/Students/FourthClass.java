package Pro.Training.Tech.Students;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Common.Reusable;
import Pages.BestSellers;
import Pages.HomePage;
import Pages.KindleStore;
import java.io.IOException;

public class FourthClass extends Reusable {
  @Test
  public void f() throws IOException {
	  HomePage ob = new HomePage (driver);
	  ob.BestSellersClick();
	  
	  BestSellers obj = new BestSellers(driver);
	  obj.ClickKindleStore();
	  
	  KindleStore objct = new KindleStore(driver);
	  String togetthetext = objct.GetTextontop();
	  System.out.println(togetthetext);
	  screenshots();
	  
	  SoftAssert jk = new SoftAssert();
	  jk.assertEquals(togetthetext, "Best Sellers in Kindle Store");
	  System.out.println("This is after assertion");
	  jk.assertAll();
  }
 
}
