package utilities;

/**
 * This class is created for understanding the convert the JSON string to java object
 * Java Object to JSON string.
 * Using Jackson API
 * Jackson API
 * ===========
 * Provide 1 java class which has 2 methods
 * ObjectMapper -->writeValueAsString() --> used to convert java object into json
 * -->readValue() --> used to convert JSON into java object
 * <p>
 * Maven Dependency
 * <p>
 * <dependency>
 * <groupId>com.fasterxml.jackson.core</groupId>
 * <artifactId>jackson-core</artifactId>
 * <version>2.9.7</version>
 * </dependency>
 */


import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.JsonGenerationException;
import org.json.simple.JSONObject;


import java.io.IOException;


public class ObjectConversion {

    ObjectMapper mapper = null;

    public ObjectConversion() {
        mapper = new ObjectMapper();
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,false);
    }


    /**
     * This is the method for convert javaobject into json string
     * @param obj
     * @return
     */
    public String convertObjectToString(Object obj) {
        String strResult = null;
        try {
            strResult = mapper.writeValueAsString(obj);
        }
        catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();        }
        catch (Exception e) {
            e.printStackTrace();        }

        return strResult;
            }

    /**
     * This the method for convert jsonstring to Java Object
     * @param jsonString
     * @param cls
     * @param <T>
     * @return
     */
     public <T> T convertStringToObject(String jsonString, Class<T> cls){
        T result =  null;
        try {
            result = mapper.readValue(jsonString, cls);
        }
        catch(JsonParseException e){
            e.printStackTrace();
        }
        catch(JsonGenerationException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
     }


    /**
     * This is validate the JSONString which is get as parameter
     * @param
     * @return
     */
     public boolean validateJSONString(String jsonInString) {
         boolean validJSON = false;
         try {
             mapper.readTree(jsonInString);
             validJSON = true;
         } catch (IOException e) {
             e.printStackTrace();
         }
         return validJSON;
     }



  }
