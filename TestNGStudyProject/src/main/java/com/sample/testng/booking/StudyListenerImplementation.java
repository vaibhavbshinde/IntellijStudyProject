package com.sample.testng.booking;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class StudyListenerImplementation implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test case passed"+result.getTestClass()+"-->"+result.getTestName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test case failed"+result.getTestClass()+"-->"+result.getTestName());
        System.out.println(result.getThrowable().getStackTrace());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
