package TestAPIRequestExecution;

import com.restassured.services.RestAssuredAPICalls;
import configuration.APIHostConfiguration;
import org.testng.annotations.Test;

public class TestVisitorRecordService {

    @Test
    public void getVisitorRecordDetails(){
       String vid = "10312310178917396127";
       String url = "http://tbdocker1.qa1.iad2.xaxis.net:8092/visitorrecord/"+vid;
       String visitorDetails = RestAssuredAPICalls.getAPIRequest(url);
       if(visitorDetails!=null){
           System.out.println(visitorDetails);
       } else{
           System.out.println("record not present");
       }
    }

    @Test
    public void deleteVisitorRecord(){
        String vid = "10312310178917396127";
        String url = "http://tbdocker1.qa1.iad2.xaxis.net:8092/visitorrecord/"+vid;
        int visitorDetails = RestAssuredAPICalls.deleteAPIRequest(url);
        if(visitorDetails==200){
            System.out.println("record deleted successfully");
        } else{
            System.out.println("record not present");
        }
    }


}
