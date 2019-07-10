package com.restassured.services;

import com.mongodb.util.JSON;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class RestAssuredAPICalls {

    /**
     * This is the request created for to call GET API request
     */
    public static String getAPIRequest(String url) {
       Response resp = null;
       //resp = RestAssured.get(url);
       resp = RestAssured.head(url);
       int statuscode = resp.getStatusCode();
       // System.out.println("My return Response code is : "+statuscode);
       if(statuscode!=200){
           return null;
       }
       return resp.asString();
    }

    /**
     * This is the request created for to call GET API request
     */
    public static Response getAPIRequestWithGiven(String url) {
        Response resp = null;
        try {
            resp = given()
                   .get(url);
        }
        catch(Exception e){
              e.printStackTrace();
        }
        return resp;
    }

    public static Response getApiRequestThroughRequstBuilder(String url){
        Response resp = null;
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.addHeader("Accept","application/json");
        RequestSpecification requestspec = builder.build();
        resp = given()
               .config(RestAssuredConfig.config().sslConfig(new SSLConfig().allowAllHostnames()))
               .spec(requestspec).when().get(url);
        return resp;
    }


    /**
     *  This is the request created for post request
     */
    public int postAPIRequest(String url){
        RequestSpecification request = given();
        request.header("Content-type","application/json");
        JSONObject json =  new JSONObject();
        json.put("id","25");
        json.put("title","seleniumwebdriver");
        request.body(json.toJSONString());
        Response response = request.post(url);
        int code = response.getStatusCode();
        return code;
    }

    /**
     *  This is the request created for put request
     */
    public static int putAPIRequest(String url){
        RequestSpecification request = given();
        request.header("Content-type","application/json");
        JSONObject json =  new JSONObject();
        json.put("id","25");
        json.put("title","seleniumwebdriver");
        request.body(json.toJSONString());
        Response response = request.post(url);
        int code = response.getStatusCode();
        return code;
    }

    /**
     *  This is the request created for deleted request
     */
    public static int deleteAPIRequest(String url){
        RequestSpecification request = given();
        request.header("Content-type","application/json");
        Response response = request.delete(url);
        int code = response.getStatusCode();
        return code;
    }

    public static Response patchAPIRequest(){
        Response resp = null;
        RequestSpecBuilder builder = new RequestSpecBuilder();
        //builder.setContentType("application-json");
         String jsonStr = "{\"first_name\":\"999999\",\"last_name\":\"999999\",\"status\":\"active\"}";
        builder.setBody(jsonStr);
        builder.addHeader("Content-type","application/json");
        builder.addHeader("Accept","application/json");
        RequestSpecification requestspec = builder.build();
        resp = given().spec(requestspec).when().patch("https://gorest.co.in/public-api/users/2237?access-token=v8f_tj7ve_ozs2Spy6ieXpLYtHunS25tTo2M");
        return resp;
    }

}
