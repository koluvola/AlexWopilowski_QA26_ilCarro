package com.tel_ran.ilcarro.qa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {

    @BeforeMethod
    public void insurePreconditions() {
        if (!isUserLogIn()) {
            logIn();
        }
    }


    @Test
    public void logOutTest() {
        clickLogOutButtonOnHeader(xPath);

    }

}
