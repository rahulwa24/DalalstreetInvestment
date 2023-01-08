package ai.ds.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import ai.ds.pageLayer.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	
	public static WebDriver driver;
	public LoginPage login;
	public Logger logger;
	
	@BeforeClass
	public void start()
	{
         logger = Logger.getLogger("Dalal Street");
         
       //PropertyConfigurator.configure("Log4jCode.properties");
         org.apache.log4j.PropertyConfigurator.configure("Log4jCode.properties");
	}
	
	@AfterClass
	public void end()
	{

		 logger.info("framework execution ended");
		
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();*/
		
			String br = "chrome"; //whatever the value of br is given according to that Browser will open
			
			if(br.equalsIgnoreCase("chrome")) {    
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();}
	
			else if(br.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			else if(br.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
	}
			else {
				System.out.println("Enter correct driver name");
			}
		
		driver.get("https://apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//-----------------obj creation
		
		login = new LoginPage();		
		login.enterEmailId();
		login.enterPassword();
		login.clickOnButon();
		Thread.sleep(4000);
	}
@AfterMethod

public void tearDown() {
	
	driver.quit();
}
}
