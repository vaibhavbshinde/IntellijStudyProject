package TestAPIRequestExecution;

import com.restassured.services.RestAssuredAPICalls;
import configuration.APIHostConfiguration;
import io.restassured.response.Response;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utilities.ExtentTestManager;
import java.lang.reflect.Method;


public class TestHourlyForeCast {

/*    @BeforeSuite(alwaysRun = true)
    public void executeBeforeSuit(Method method) {
        ExtentTestManager.startTest(method.getName(),"");
    }*/

    @Test
    public void getHourlyCityForeCast(Method method){
        //To Start Extent Report for storing
        ExtentTestManager.startTest(method.getName(),"");

        APIHostConfiguration apihost = null;
        try {
            apihost = new APIHostConfiguration();
        }catch(Exception e){
            e.printStackTrace();
        }
        String url = apihost.getBaseapiurl()+ apihost.getBasepath()+"/history/city?id=2885679&type=hour&appid="+apihost.getAppid();
        Response resp= RestAssuredAPICalls.getApiRequestThroughRequstBuilder(url);
        System.out.println("Response time ="+resp.getTime());

         RestAssuredAPICalls.getAPIRequest(url);

        //System.out.println(resp.getCookies());
        //System.out.println(resp.getHeaders());
        Assert.assertTrue(resp.getBody().print().contains("2885679"),"Failed !! City Id is not found ...");
  }
}
