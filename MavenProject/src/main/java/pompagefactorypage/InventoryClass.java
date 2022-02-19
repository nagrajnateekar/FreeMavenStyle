package pompagefactorypage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InventoryClass {
	
	@FindBy(id="shopping_cart_container")
	WebElement chartlink;
	
	public InventoryClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addToCart() {
		
		chartlink.click();
	}

}
