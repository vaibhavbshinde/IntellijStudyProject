package com.selenium.newtours.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Utils {
    final public static String baseUrl = "http://demo.guru99.com/test/newtours/index.php";
    public static  WebDriver driver = null;

    /**
     * method to load the chrome driver with baseurl
     * @author : vaibhav shinde
     * @date : 22-May-2019
     */
    public static void loadWebApp() {
        System.setProperty("webdriver.chrome.driver", "E:\\GitRpo\\IntellijStudyProject\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }



    public static void loadWebAppWithSSL(String browser) throws Exception {
        if (browser.equalsIgnoreCase("firefox")) {
            // In case of Firefox we have set the profile and then same profile needs to be passed to firefox driver
            ProfilesIni prof = new ProfilesIni();
            FirefoxProfile ffprofile = prof.getProfile("myprofile");
            ffprofile.setAcceptUntrustedCertificates(true);
            ffprofile.setAssumeUntrustedCertificateIssuer(false);

            System.setProperty("webdriver.firefox.marionette", ".\\geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("chrome")) {

            /** DesiredCapabilites for Chrome is depricated now need to use ChromeOptions*/
            // DesiredCapabilities handlSSLErr = new DesiredCapabilities.chrome();
            // handlSSLErr.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);


            ChromeOptions options = new ChromeOptions();
            options.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("IE")) {
            InternetExplorerOptions options = new InternetExplorerOptions();
            options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            driver = new InternetExplorerDriver(options);

        } else {
            //if browser is not passed then throw exception
            throw new Exception("Browser is not correct");
        }

    }
}
