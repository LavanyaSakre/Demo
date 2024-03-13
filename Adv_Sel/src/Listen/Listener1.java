package Listen;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener
{

	@Override
	public void onTestStart(ITestResult resul) {
		System.out.println("exec started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TC passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TC failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TC skipped");
	}
   
}
