package com.tel_ran.ilcarro.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {

    WebDriver wd;

    @BeforeMethod

    public void setUp() {
        wd = new FirefoxDriver();
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");

    }

    @AfterMethod
    public void tearDown() {


    }

    @Test

    public void testRegistration() {


    }


}
