package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Listener implements ITestListener{
	ExtentReports e;
	ExtentTest t;
	ScreenshotUtility s;
	public void onTestStart(ITestResult result) {
		System.out.println("TestNG started");	
		t.log(LogStatus.INFO,result.getMethod().getMethodName()+"Has started");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case success");	
		try {
		t.log(LogStatus.PASS,"Screenshot"+t.addScreenCapture(s.takeScreenshot()));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case Failed");	
		t.log(LogStatus.FAIL,result.getMethod().getMethodName()+"Has Failed");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped");
		t.log(LogStatus.SKIP,result.getMethod().getMethodName()+"Has Skipped");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//System.out.println("Test case skipped");	
	}
	public void onStart(ITestContext context) {
		s= new ScreenshotUtility();
		System.out.println("TestNG Started");	
		e=new ExtentReports("test-output\\MyReport1.html");
		t=e.startTest("LoginTest has started");
		e.addSystemInfo("Browser","Chrome");
		e.addSystemInfo("Build","smoke testing");
		
	}
	public void onFinish(ITestContext context) {
		System.out.println("TestNG Finished");	
		e.endTest(t);
		e.flush();
	}

}
