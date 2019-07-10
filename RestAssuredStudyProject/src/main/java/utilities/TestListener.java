package utilities;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {


    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }


    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("I am in onTestSuccess method " +  getTestMethodName(result) + " succeed");
        //Extentreports log operation for passed tests.
        ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("I am in onTestFailure method " +  getTestMethodName(result) + " failed");
    //    Object testClass = result.getInstance();

    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("I am in onTestSkipped method "+  getTestMethodName(result) + " skipped");
        ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("I am in onTestFailure method " +  getTestMethodName(result) + " failed");
    }

    public void onTestStart(ITestContext iTestContext) {
        System.out.println("I am in onTestStart method " + iTestContext.getName());
    }
    public void onStart(ITestContext iTestContext) {
        System.out.println("I am in onStart method " + iTestContext.getName());
    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("I am in onFinish method " + iTestContext.getName());
        ExtentTestManager.endTest();
        ExtentManager.getReporter().flush();
    }
}
