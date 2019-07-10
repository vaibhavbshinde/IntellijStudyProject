package com.selenium.newtours.actionables;

import com.selenium.newtours.pageobjects.SignOnPageObjects;
import com.selenium.newtours.utils.Utils;

public class SignOnPageActions {

    public static void typeOn_userNameText(){
        SignOnPageObjects.getUserNameTextBox(Utils.driver).sendKeys("ABCDE");
    }

    public static void typeOn_PasswordText(){
        SignOnPageObjects.getPasswordTextBox(Utils.driver).sendKeys("1234");
    }

    public static void clickOn_SubmitButton(){
        SignOnPageObjects.getSubmitButton(Utils.driver).submit();
    }
}
