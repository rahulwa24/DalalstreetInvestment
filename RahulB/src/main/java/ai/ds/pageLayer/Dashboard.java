package ai.ds.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class Dashboard extends TestBase {
	
	public Dashboard() {
		
		PageFactory.initElements(driver, this);
	}
//------------obj repo--------
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement searchBox;
	
	@FindBy(xpath="(//div[@class= 'm-4 card'])[2]")
	private WebElement option;
	
	
//------------Action method------

	public void enterCompanyName(String company_name) {
		searchBox.sendKeys(company_name);
	}
	
	public void selectOption() {
		
		option.click();	}
}
