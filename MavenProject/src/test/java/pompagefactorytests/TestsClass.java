package pompagefactorytests;

import org.testng.annotations.Test;

import pompagefactorybase.BaseClass;
import pompagefactorypage.CartClass;
import pompagefactorypage.InventoryClass;
import pompagefactorypage.LoginPageClass;



public class TestsClass extends BaseClass{
	
	@Test(priority=1)
	public void loginTest() {
		LoginPageClass lpc=new LoginPageClass(driver);
		lpc.login("standard_user","secret_sauce");
	}
	@Test(priority=2)
	public void addToCartTest() {
		
		InventoryClass ic=new InventoryClass(driver);
		ic.addToCart();
	}
	@Test(priority=3)
	public void descriptionTest() {
		CartClass cc=new CartClass(driver);
		cc.descrition();
	}

}
