package com.tel_ran.ilcarro.qa.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarHelper extends HelperBase {


    public CarHelper(WebDriver wd) {
        super(wd);
    }

    public void fillCarForm(String country, String locationCss, String address, String addressCss) {

        type(country, By.cssSelector(locationCss));
        delay(3000);
        type(address, By.cssSelector(addressCss));

       /* wd.findElement(By.cssSelector(locationCss)).click();
        wd.findElement(By.cssSelector(locationCss)).clear();
        wd.findElement(By.cssSelector(locationCss)).sendKeys(country);

        wd.findElement(By.cssSelector(addressCss)).click();
        wd.findElement(By.cssSelector(addressCss)).clear();
        wd.findElement(By.cssSelector(addressCss)).sendKeys(address);*/


    }

    public void initAddingNewCar(String locator) {
        clickByPosition(By.cssSelector(locator));
    }

    public boolean isCreationCarFormPresent(String locator) {

        return isElementPresent(By.xpath(locator));
    }
}
