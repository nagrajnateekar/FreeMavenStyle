package pompagefactorypage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageClass{
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginbtn;
	
	public LoginPageClass(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void login(String uname,String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbtn.click();
		System.out.println("new addition");
		
	}
	

}
