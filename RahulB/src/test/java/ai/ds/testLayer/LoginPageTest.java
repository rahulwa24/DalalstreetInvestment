
package ai.ds.testLayer;


import org.testng.annotations.Test;

import ai.ds.pageLayer.LoginPage;
import ai.ds.testBase.TestBase;
import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	
	
	@Test
	public void verifyLoginPage() throws InterruptedException {
	
	String expected_url ="https://apps.dalalstreet.ai/dashboard";	

	
	
	/*LoginPage login = new LoginPage();		
	login.enterEmailId();
	login.enterPassword();
	login.clickOnButon();
	Thread.sleep(4000);*/
	
	
	
	
	
	
	String actual_result = login.getCurl();
	System.out.println(actual_result);
	
	Assert.assertEquals(actual_result, expected_url);
	}

}
