package configuration;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.BeforeSuite;
import utilities.ExtentTestManager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author :
 * Description : This class is for loading the baseapiurl and appid and other required
 */

public class APIHostConfiguration {
    protected Properties configVo = null;

    public APIHostConfiguration() throws Exception{
        configVo= new Properties();
        configVo=loadConfiguration("config.properties");

        /**If we put the cofiguration file in some other folder maven will not pickup, so need to copy config explicitly into
         * target speficied folder, to try this i have created config1.properties file into configuration folder instead of resources
         * folder ,so i copied the file to target folder i set the path all below to picked up the file like this way
         */
        //String rpath = "configuration/config1.properties";
        //configVo=loadConfiguration(rpath);

    }

    /**
     * TO Load the Property file
     * @param resourcepath
     * @return
     * @throws Exception
     */
    public Properties loadConfiguration(String resourcepath) throws Exception{
        Properties propVo = new Properties();
        try {
            if(StringUtils.isNotEmpty(resourcepath)) {
                propVo.load(APIHostConfiguration.class.getClassLoader().getResourceAsStream(resourcepath));
            } else {
                throw new Exception("Resource path is empty!!");
            }
        }catch (FileNotFoundException e ){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }catch (IOException ioe){
            ioe.printStackTrace();
            throw new Exception(ioe.getMessage());
        }
        return propVo;
    }

    public String getAppid() {
        return configVo.getProperty("appid");
    }

    public String getBaseapiurl() {
        return configVo.getProperty("baseapiurl");
    }

    public String getBasepath(){
        return configVo.getProperty("basepath");
    }

    public String getKey(String key){
        if(StringUtils.isNotEmpty(key)&&!(configVo.isEmpty())&&configVo.containsKey(key))
           return configVo.getProperty(key);
        else
            return null;
    }

   /*
    public static void main(String args[]) throws Exception{
    APIHostConfiguration a1 = new APIHostConfiguration();
    System.out.println(a1.getBasepath());
    }*/

   @BeforeSuite(alwaysRun = true)
    public void configure(){
     //   RestAssured.baseURI =baseapiurl;
        //RestAssured.port=8080;
        //RestAssured.basePath="";

    }
}
