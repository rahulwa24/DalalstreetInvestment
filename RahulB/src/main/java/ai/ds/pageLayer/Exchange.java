package ai.ds.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class Exchange extends TestBase {
	
	public Exchange() {
		
	PageFactory.initElements(driver, this);
	}

//----------obj repository------
	
	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_btn1;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement txt_box;
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_btn2;
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement status;
	
	
	
//---------Action class----------
	
	public void ClickOnBuyBtn1(){
		buy_btn1.click();	
	}

public void EnterQty() {
	txt_box.click();
	txt_box.sendKeys("2");
}

public void ClickOnBuyBtn2(){
	buy_btn2.click();	
	}
public String getStatus() {
	String st = status.getText();
	return st;
}
}
