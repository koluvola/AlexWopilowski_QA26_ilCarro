package com.tel_ran.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTestWithNewMethods extends TestBase {


    @Test

    public void testRegistration() {
        String email = "my.email" + System.currentTimeMillis() + "@gmail.com";

        openRegForm();
        fillRegistrationForm("Alex", "Wopilowski", email, "Aa1234567");
        clickCheckBox(By.id("check_policy"));
        delay(5000);
        // clickButton(By.className("yalla_yalla__1Jxk6"));
        clickButton(By.cssSelector("[type='submit']"));
        delay(5000);

    }


}
