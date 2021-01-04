package com.tel_ran.ilcarro.qa.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {

    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void clickLogInButton() {
        clickByCssSelector("[href=\"/login\"]");



    }


    public void clickLogOutButtonOnHeader(String xPathSelector) {
        clickByXPath(xPathSelector);
    }


    public boolean isUserLoggedIn() {
        return isElementPresent(By.xpath("//a[contains(., 'logOut')]"));
    }


    public void logIn() {
        clickButtonYalla("[href=\"/login\"]");
        typeLoginFields("my.email1608881337043@gmail.com", "Aa1234567");
        delay(5000);
        clickButtonYalla("[value=\"Y'alla!\"]");
        delay(5000);
    }

    public void typeLoginFields(String email, String password) {
        clickByCssSelector("[name=\"email\"]");
        wd.findElement(By.cssSelector("[name=\"email\"]")).clear();
        wd.findElement(By.cssSelector("[name=\"email\"]")).sendKeys(email);

        clickByCssSelector("[name=\"password\"]");
        wd.findElement(By.cssSelector("[name=\"password\"]")).clear();
        wd.findElement(By.cssSelector("[name=\"password\"]")).sendKeys(password);

    }


    public void fillRegistrationForm(String fName, String lName, String email, String password) {
        type(fName, By.id("first_name"));
        type(lName, By.id("second_name"));
        type(email, By.id("email"));
        type(password, By.id("password"));
    }

    public void openRegForm() {
        clickByPosition(By.cssSelector("[href='/signup']"));

    }


}
