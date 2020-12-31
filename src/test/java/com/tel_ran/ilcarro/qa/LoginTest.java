package com.tel_ran.ilcarro.qa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    //"Alex", "Wopilowski", "alexw@gmail.com", "12345678A"

    @BeforeMethod
    public void insurePreconditions() {
        if (isUserLogIn()) {
            clickLogOutButtonOnHeader(xPath);
        }

    }

    @Test
    public void testLogin() {


        clickLogInButton();
        typeLoginFields("my.email1608881337043@gmail.com", "Aa1234567");
        delay(5000);
        clickButtonYalla("[value=\"Y'alla!\"]");
        delay(5000);

        Assert.assertTrue(isUserLogIn());

    }

}
