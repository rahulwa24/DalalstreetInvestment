package ai.ds.utilities;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class Screenshot extends TestBase {
	
	public Screenshot() {
		PageFactory.initElements(driver, this);
	}
public static void Takess (String filename){
	String path = "C:\\Users\\Rahul\\eclipse-workspace\\RahulB\\SS\\";
	
	try {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
	
		File des = new File(path+filename+".png");
		FileHandler.copy(src, des);
	} 
	
	catch (IOException e) {
		e.printStackTrace();
		System.out.println("Provide correct path");
	}
	
}
}
