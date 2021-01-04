package com.tel_ran.ilcarro.qa.tests;

import com.tel_ran.ilcarro.qa.application.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public ApplicationManager appl = new ApplicationManager();

    @BeforeMethod
    public void setUp() {
        appl.init();
    }

    @AfterMethod
    public void tearDown() {
        appl.stopTesting();

    }


}
