package ai.ds.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
//-----------------obj repository------------
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_textbox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_textbox;
	
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login_btn;
	
	
//-----------------Action Method----------------
public void enterEmailId () {
	email_textbox.sendKeys("rahulwabale72@gmail.com");

}

public void enterPassword()
{
	password_textbox.sendKeys("Rahul@1234");
}
public void clickOnButon() {
	
	login_btn.click();
}

public String getCurl() {
	
	String url = driver.getCurrentUrl();
	return url;
}


}
