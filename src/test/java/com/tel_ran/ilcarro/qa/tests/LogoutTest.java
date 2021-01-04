package com.tel_ran.ilcarro.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {
    String xPath = "//a[contains(.,'logOut')]";

    @BeforeMethod
    public void insurePreconditions() {
        if (!appl.getUser().isUserLoggedIn()) {
            System.out.println("No find Button 'LogOut'");
            appl.getUser().logIn();
        }

    }

    @Test
    public void logOutTest() {
        appl.getUser().delay(10000);
       appl.getUser().clickLogOutButtonOnHeader(appl.xPath);
        appl.getUser().delay(10000);

    }

}
