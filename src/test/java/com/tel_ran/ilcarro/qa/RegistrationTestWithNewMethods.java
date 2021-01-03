package com.tel_ran.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTestWithNewMethods extends TestBase {


    @Test

    public void testRegistration() {
        String email = "my.email" + System.currentTimeMillis() + "@gmail.com";

        appl.getUser().openRegForm();
        appl.getUser().fillRegistrationForm("Alex", "Wopilowski", email, "Aa1234567");
        appl.getUser().clickCheckBox(By.id("check_policy"));
        appl.getUser().delay(5000);
        // clickButton(By.className("yalla_yalla__1Jxk6"));
        appl.getUser().clickButton(By.cssSelector("[type='submit']"));
        appl.getUser().delay(5000);

    }


}
