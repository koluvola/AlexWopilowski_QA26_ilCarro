package com.tel_ran.ilcarro.qa.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void type(String str, By locator) {
        clickByPosition(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(str);
    }

    public void clickByPosition(By locator) {
        wd.findElement(locator).click();
    }

    public void delay(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickButton(By locator) {
        WebElement wb = wd.findElement(locator);
        wb.click();
    }

    public void clickCheckBox(By locator) {
        WebElement we = wd.findElement(locator);
        we.click();
    }

    public void clickButtonYalla(String url) {
        clickByCssSelector(url);
    }

    public void clickByCssSelector(String cssSelector) {
        wd.findElement(By.cssSelector(cssSelector)).click();

    }
    public void clickByXPath(String xPathSelector) {
        wd.findElement(By.xpath(xPathSelector)).click();
    }

    public boolean isRegistrationFormPresent() {
        return isElementPresent(By.xpath("//h2[contains(.,'Registration')]"));
    }


    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;
    }

    public boolean isUserLogIn() {

        return isElementPresent(By.xpath("//a[contains(., 'logOut')]"));
    }
}
