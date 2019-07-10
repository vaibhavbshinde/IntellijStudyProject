package com.java.general.study;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;

public class TestNGAnnotationSequence {
        @Test(groups="testAlpha")
        public void testCase1() {

            System.out.println("testCase1");
        }

        @Test
        public void testCase2() {

            System.out.println("testCase2");
        }

        @BeforeMethod
        public void beforeMethod() {

            System.out.println("beforeMethod");
        }

        @AfterMethod
        public void afterMethod() {

            System.out.println("afterMethod");
        }

        @BeforeClass
        public void beforeClass() {

            System.out.println("beforeClass");
        }

        @AfterClass
        public void afterClass() {

            System.out.println("afterClass");
        }

        @BeforeTest
        public void beforeTest() {

            System.out.println("beforeTest");
        }

        @AfterTest
        public void afterTest() {

            System.out.println("afterTest");
        }

        @BeforeSuite
        public void beforeSuite() {

            System.out.println("beforeSuite");
        }

        @AfterSuite
        public void afterSuite() {

            System.out.println("afterSuite");
        }

        @BeforeGroups
        public void beforeGroups(){
            System.out.println("beforeGroups");
        }

        @AfterGroups
        public void afterGroups(){
            System.out.println("afterGroups");
        }
    }
