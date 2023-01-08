package ai.ds.testLayer;

import org.testng.annotations.Test;

import ai.ds.pageLayer.Dashboard;
import ai.ds.pageLayer.Exchange;
import ai.ds.pageLayer.LoginPage;
import ai.ds.testBase.TestBase;
import junit.framework.Assert;

public class VerifyByFunctionality extends TestBase {

	@Test
	
	public void ByFuctionality() throws InterruptedException{
		String expected_op = "Order Created successful";
		//LoginPage login = new LoginPage();
		Dashboard dash = new Dashboard();
		Exchange exchange = new Exchange();
		
		
		/*login.enterEmailId();
		login.enterPassword();
		login.clickOnButon();
		
		Thread.sleep(4000);*/
		
		// login completed now select company trade for that import dashboard method
		
		dash.enterCompanyName("Wipro");
		Thread.sleep(2000);
		dash.selectOption();
		
		//Enter Qty
		Thread.sleep(4000);
		exchange.ClickOnBuyBtn1();
		exchange.EnterQty();
		exchange.ClickOnBuyBtn2();
		Thread.sleep(4000);
		Assert.assertEquals(exchange.getStatus(),expected_op );
		
		
		
		
		
 }
	}
