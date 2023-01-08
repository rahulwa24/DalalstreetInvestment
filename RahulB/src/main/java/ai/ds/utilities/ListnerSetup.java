package ai.ds.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerSetup implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	    System.out.println("Test execution started :-" +result.getMethod());	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	    System.out.println("Test execution success :-" +result.getMethod());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	    System.out.println("Test execution failed :-" +result.getMethod());
        Screenshot.Takess(result.getName());
	    System.out.println("Screenshot" +result.getMethod());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	    System.out.println("Test execution skipped :-" +result.getMethod());
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	

}
