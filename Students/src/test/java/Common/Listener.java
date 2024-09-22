package Common;
//6th Class - didn't work so Teacher will try again.

import java.io.IOException;

import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public class Listener extends Reusable implements IListeners{

	@Override
	public Class<? extends ITestNGListener>[] getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValue(Class<? extends ITestNGListener>[] value) {
		// TODO Auto-generated method stub
	}
	
	public void onTestStart(ITestResult result) throws IOException {
		screenshots();
	}

	public void OnTestSuccess(ITestResult result) throws IOException {
		screenshots();
	}
/*
	 	@Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test Failed: " + result.getName());
	        // Add code to take a screenshot, etc.
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Test Skipped: " + result.getName());
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        System.out.println("All tests finished.");
	    }
*/
}
