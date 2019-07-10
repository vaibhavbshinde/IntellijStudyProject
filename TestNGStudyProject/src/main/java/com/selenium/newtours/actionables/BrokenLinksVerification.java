package com.selenium.newtours.actionables;

import com.selenium.newtours.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class BrokenLinksVerification extends Utils{


    public static void findBroken_links(){
        String url = "";
        HttpURLConnection huc = null;
        int respcode =200;

        LandingPageActions.clickOn_HomeLink();
        List<WebElement> links= driver.findElements(By.tagName("a"));
        Iterator<WebElement> itr = links.iterator();
        while(itr.hasNext()){
            url=itr.next().getAttribute("href");
            //System.out.println(url);

            if(url == null || url.isEmpty()){
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            try{
                huc = (HttpURLConnection)(new URL(url).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                respcode = huc.getResponseCode();
                if(respcode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }
            }catch(java.net.MalformedURLException e){
                e.printStackTrace();
            }catch(java.io.IOException e){
                e.printStackTrace();
            }
        }
         driver.quit();
    }


}
