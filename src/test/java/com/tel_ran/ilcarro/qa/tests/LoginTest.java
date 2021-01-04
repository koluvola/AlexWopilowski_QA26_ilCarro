package com.tel_ran.ilcarro.qa.tests;

import com.tel_ran.ilcarro.qa.application.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    //"Alex", "Wopilowski", "alexw@gmail.com", "12345678A"
   // String xPath = "//a[contains(.,'logOut')]";

    @BeforeMethod
    public void insurePreconditions() {
        if (appl.getUser().isUserLogIn()) {
            appl.getUser().clickLogOutButtonOnHeader(appl.xPath);
        }

    }

    @Test
    public void testLogin() {
        appl.getUser().clickLogInButton();
        appl.getUser().typeLoginFields("my.email1608881337043@gmail.com", "Aa1234567");
        appl.getUser().delay(5000);
        appl.getUser().clickButtonYalla("[value=\"Y'alla!\"]");
        appl.getUser().delay(5000);

        Assert.assertTrue(appl.getUser().isUserLogIn());

    }

}
