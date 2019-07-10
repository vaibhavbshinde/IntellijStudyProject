package com.cucumber.newtours.runner;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="E://GitRpo//IntellijStudyProject//CucumberStudyProject//src//test//java//com//cucumber//newtours//feature"
        //features="E://GitRpo//IntellijStudyProject//CucumberStudyProject//src//main//java//com//cucumber//newtours//feature"
        ,glue={"com.cucumber.newtours.stepdefs"}
        ,tags = {"@done3"}
        ,format = {"pretty", "html:target/Destination"})
        //,format={"json:target/Destination/cucumber.json"} )
       // , plugin={"pretty:target/cucumber-htmlreport.html", "json:target/cucmber-report.json"})
public class TestFilghtRunner {
}
