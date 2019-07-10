package com.selenium.newtours.actionables;

import com.selenium.newtours.pageobjects.LandingPageObjects;
import com.selenium.newtours.utils.Utils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LandingPageUsingActionActionsClasses {

 public static void typeUserNameUsingActions(){
     Actions builder =  new Actions(Utils.driver);
     Action seriesOfActions = builder.moveToElement(LandingPageObjects.getUserNameTextBox(Utils.driver))
                                     .keyDown(LandingPageObjects.getUserNameTextBox(Utils.driver),Keys.SHIFT)  //it will consider as is shiftkey is pressed
                                     .sendKeys(LandingPageObjects.getUserNameTextBox(Utils.driver),"testuser") // so "testuser" will type in uppercase letter
                                     .keyUp(LandingPageObjects.getUserNameTextBox(Utils.driver),Keys.SHIFT)    // it will release the shift key
                                     .doubleClick()        // it will highlight the text "testuser"
                                     .contextClick()       // this will bring up the context menu
                                     .build();
     seriesOfActions.perform();

 }

}
