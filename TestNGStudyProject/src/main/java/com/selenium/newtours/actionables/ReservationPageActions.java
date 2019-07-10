package com.selenium.newtours.actionables;

import com.selenium.newtours.pageobjects.RegisterUserPageObjects;
import com.selenium.newtours.pageobjects.ReservationPageObjects;
import com.selenium.newtours.utils.Utils;

public class ReservationPageActions {

     public static void clickOn_OnewayRoundTrip(){
         ReservationPageObjects.getTypeOneWayTrip(Utils.driver).click();
         if(ReservationPageObjects.getTypeOneWayTrip(Utils.driver).isSelected()){
             System.out.println("OneWay RoundTrip is selected");
         }

     }

     public static void clickOn_ServiceClassBusiness(){
         ReservationPageObjects.getServiceClassBusiness(Utils.driver).click();
         if(ReservationPageObjects.getServiceClassBusiness(Utils.driver).isSelected()){
             System.out.println("Business Service class is selected");
         }

     }

    public static class RegisterUserActions {

        public static void select_CountryValue(String countryName){
            RegisterUserPageObjects.getCountryDropdown(Utils.driver).selectByVisibleText(countryName);
        }


        public static boolean select_CountryValuePresent(String countryName){
            boolean isfound=false;
            if(RegisterUserPageObjects.getCountryDropdown(Utils.driver).getOptions().contains(countryName)){
                System.out.println("Yes... selected country is present in the dropdown");
                isfound= true;
            }else{
                System.out.println("No... selected country is not present ");
            }
            return isfound;
        }

    }
}
