package pompagefactorypage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartClass {
	
	@FindBy(xpath="//div[text()='DESCRIPTION']")
	WebElement desc;
	
	public CartClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void descrition() {
		desc.click();
	}

}
