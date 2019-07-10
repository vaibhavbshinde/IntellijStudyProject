package TestAPIRequestExecution;

import com.google.gson.Gson;
import com.restassured.services.RestAssuredAPICalls;
import io.restassured.response.Response;
import objects.Employee;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import configuration.APIHostConfiguration;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import utilities.ExtentTestManager;
import utilities.ObjectConversion;

import static utilities.ExtentTestManager.startTest;
import java.lang.reflect.Method;

public class TestCurrentWeatherData {
    private static Log log = LogFactory.getLog(TestCurrentWeatherData.class);


    @Test(enabled = true, priority = 1)
    public void getCurrentWeatherDataCityNameWIthGiven(Method method) {
        //To Start Extent Report for storing
        ExtentTestManager.startTest(method.getName(), "");

        APIHostConfiguration apihost = null;
        try {
            apihost = new APIHostConfiguration();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String url = apihost.getBaseapiurl() + apihost.getBasepath() + "/weather?q=london,uk&appid=" + apihost.getAppid();
        Response jsonData = RestAssuredAPICalls.getAPIRequestWithGiven(url);
        log.info(jsonData.asString());
        Assert.assertTrue(jsonData.getBody().print().contains("London"), "Failed!!! City London weather details not found..");
        //ExtentTestManager.startTest(method.getName(),"Invalid Login Scenario with empty username and password.");
    }

    @Test(enabled = true, priority = 5)
    public void getCurrentWeatherDataCityNameWIthRequestBuilder(Method method) {
        //To Start Extent Report for storing
        ExtentTestManager.startTest(method.getName(), "");

        APIHostConfiguration apihost = null;
        try {
            apihost = new APIHostConfiguration();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String url = apihost.getBaseapiurl() + apihost.getBasepath() + "/weather?q=London,uk&appid=" + apihost.getAppid();
        Response jsonData = RestAssuredAPICalls.getApiRequestThroughRequstBuilder(url);
        log.info(jsonData.asString());
        Assert.assertTrue(jsonData.getBody().print().contains("London"), "Failed!! City London weather details not found...");
    }

    @Test
    public void getFailedTestResult(Method method) {
        //To Start Extent Report for storing
        ExtentTestManager.startTest(method.getName(), "");

        APIHostConfiguration apihost = null;
        try {
            apihost = new APIHostConfiguration();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String uri = apihost.getBaseapiurl() + apihost.getBasepath() + "/weather?q=London,uk&appid=" + apihost.getAppid();
        Response jsonData = RestAssuredAPICalls.getApiRequestThroughRequstBuilder(uri);
        log.info(jsonData.asString());
        Assert.assertTrue(jsonData.getBody().print().contains("Pune"), "Failed!!! City Pune Wheather details not found..");
    }


    @Test(enabled = true)
    public void getCurrentWeatherDataCityName(Method method) {
        //To Start Extent Report for storing
        ExtentTestManager.startTest(method.getName(), "");

        APIHostConfiguration apihost = null;
        try {
            apihost = new APIHostConfiguration();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String url = apihost.getBaseapiurl() + apihost.getBasepath() + "/weather?q=London,uk&appid=" + apihost.getAppid();
        //String jsonData = RestAssuredAPICalls.getAPIRequest(url);
        Response jsonData = RestAssuredAPICalls.getAPIRequestWithGiven(url);
        Assert.assertTrue(jsonData.asString().contains("London"), "Failed!!! City Details not found...");
    }


    @Test(enabled = true, priority = 3)
    public void getCurrentWeatherDataCityId(Method method) {
        //To Start Extent Report for storing
        ExtentTestManager.startTest(method.getName(), "");

        APIHostConfiguration apihost = null;
        try {
            apihost = new APIHostConfiguration();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String url = apihost.getBaseapiurl() + apihost.getBasepath() + "/weather?q=London,uk&appid=" + apihost.getAppid();
        // String jsonData = RestAssuredAPICalls.getAPIRequest(url);
        Response jsonData = RestAssuredAPICalls.getAPIRequestWithGiven(url);
        Assert.assertTrue(jsonData.asString().contains("London"), "Failed!!! City Details not found...");

       // jsonData.jsonPath();

    }

    @Test(enabled = true)
    public void readWriteJsonUsingJACKSON(Method method) {
        //To Start Extent Report for storing
        ExtentTestManager.startTest(method.getName(), "");

        Employee e1 = new Employee();
        e1.setEmpName("vaibhav");
        e1.setEmpNo(101);
        e1.setSalary(2000);
        ObjectConversion obj = new ObjectConversion();
        String res = obj.convertObjectToString(e1);
        System.out.println(res);

        // Here i have intentionally  passed the "unvaibhav" field as it is not mapped with Employee Class ,so it should be ignored
        // For this we have added JsonIgnoreProperties annotation in the employee class
        String jsonStringRaw = "{\"empName\":\"JsonStringToObjectConversion\",\"empNo\":501,\"salary\":1111.0,\"unvaibhav\":501}";

        Employee e2 = obj.convertStringToObject(jsonStringRaw, Employee.class);
        System.out.println(e2.getEmpNo() + e2.getEmpName() + e2.getSalary());
    }

    @Test(priority = 1)
    public void convertObjectIntoJsonString_JACKSON(Method method) {
        //To Start Extent Report for storing
        ExtentTestManager.startTest(method.getName(), "");

        Employee e1 = new Employee();
        e1.setEmpNo(1111);
        e1.setEmpName("Vishal");
        e1.setSalary(1111.00);
        ObjectConversion obj = new ObjectConversion();
        String jsonStr = obj.convertObjectToString(e1);
        //"{\"empName\":\"GSONvaibhav-5002\",\"empNo\":5002,\"salary\":5002.0}";
        jsonStr = "{\"empName\":\"Vishal\",\"empNo\":1111,\"salary\":1111.0";
        Assert.assertTrue(obj.validateJSONString(jsonStr), "Failed!! Invalid Json String...");
    }

    @Test(enabled = true)
    public void readWriteJsonUsingGSON(Method method) {
        //To Start Extent Report for storing
        ExtentTestManager.startTest(method.getName(), "");

        Employee e3 = new Employee();
        e3.setEmpName("GSONvaibhav-5001");
        e3.setEmpNo(5001);
        e3.setSalary(5001);

        Gson gson = new Gson();
        String jsonConvertedBygson = gson.toJson(e3);
        System.out.println(jsonConvertedBygson);

        String jsonStringRaw = "{\"empName\":\"GSONvaibhav-5002\",\"empNo\":5002,\"salary\":5002.0}";
        Employee e4 = gson.fromJson(jsonStringRaw, Employee.class);
        System.out.println(e4.getEmpNo() + e4.getEmpName() + e4.getSalary());
    }

    @Test(enabled = true, priority = 1)
    public void getPatchAPIMethod(Method method) {
        //To Start Extent Report for storing
        ExtentTestManager.startTest(method.getName(), "");

        Response jsondata = RestAssuredAPICalls.patchAPIRequest();
        log.info(jsondata.asString());

        Response jsonData = RestAssuredAPICalls.getApiRequestThroughRequstBuilder("https://gorest.co.in/public-api/users/2237?access-token=v8f_tj7ve_ozs2Spy6ieXpLYtHunS25tTo2M");
        log.info(jsonData.asString());
    }
}