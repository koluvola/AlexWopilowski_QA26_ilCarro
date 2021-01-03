package com.tel_ran.ilcarro.qa;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected  ApplicationManager appl = new ApplicationManager();

    @BeforeMethod
    public void setUp() {
        appl.init();
    }

    @AfterMethod
    public void tearDown() {
        appl.stopTesting();

    }


}
