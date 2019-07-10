package TestAPIRequestExecution;

import org.testng.annotations.BeforeSuite;
import utilities.ExtentTestManager;
import java.lang.reflect.Method;

public class TestRunClassBeforeSuit {

    @BeforeSuite(alwaysRun = true)
    public void executeBeforeSuit(Method method) {
        ExtentTestManager.startTest(method.getName(),"");
    }
}
