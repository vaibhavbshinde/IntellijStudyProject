package com.java.general.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForm {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","E:\\GitRpo\\IntellijStudyProject\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/login.html";
        driver.get(baseUrl);

        //Get WebElement corresponding to the Email Text Box
        //WebElement email = driver.findElement(By.id("email"));
          WebElement email = driver.findElement(By.cssSelector("input#email"));

        //Get WebElement corresponding to the Password
        WebElement pwd = driver.findElement(By.id("passwd"));

        //Type the values to the text boxes
        email.sendKeys("vaibhavshinde.in@gmail.com");
        pwd.sendKeys("1234");


        // Clear the values from the textboxes
        email.clear();
        pwd.clear();


        WebElement login = driver.findElement(By.id("SubmitLogin"));

        //using click method , press the submitlogin button

        email.sendKeys("vishalbshinde.in@gmail.com");
        pwd.sendKeys("123423423");
        login.click();

        //using submit method to submit the form. Submit used on password field
        driver.get(baseUrl);
        driver.findElement(By.id("email")).sendKeys("vaibhavshinde.in@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("1234");
        driver.findElement(By.id("SubmitLogin")).submit();

        driver.close();



    }
}
