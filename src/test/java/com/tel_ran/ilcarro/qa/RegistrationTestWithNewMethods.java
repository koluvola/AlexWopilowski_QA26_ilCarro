package com.tel_ran.ilcarro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTestWithNewMethods {


    WebDriver wd;

    @BeforeMethod

    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");

    }

    @AfterMethod
    public void tearDown() {
        wd.close();
        wd.quit();

    }

    @Test

    public void testRegistration() {

        openRegForm();
        fillRegistrationForm("Alex", "Wopilowski", "alexw@gmail.com", "12345678A");
        clickCheckBox(By.id("check_policy"));
        delay(5000);
        clickButton(By.className("yalla_yalla__1Jxk6"));
        delay(5000);

    }

    private void clickButton(By locator) {
        WebElement wb = wd.findElement(locator);
        wb.click();
    }

    private void clickCheckBox(By locator) {
        WebElement we = wd.findElement(locator);
        we.click();
    }

    private void fillRegistrationForm(String fName, String lName, String email, String password) {
        type(fName, By.id("first_name"));
        type(lName, By.id("second_name"));
        type(email, By.id("email"));
        type(password, By.id("password"));
    }

    private void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void openRegForm() {
        click(By.cssSelector("[href=\"/signup\"]"));
    }

    private void type(String str, By locator) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(str);
    }

    private void click(By locator) {
        wd.findElement(locator).click();
    }

}
