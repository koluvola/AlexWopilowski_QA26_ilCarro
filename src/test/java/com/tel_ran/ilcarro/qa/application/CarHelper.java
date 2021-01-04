package com.tel_ran.ilcarro.qa.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarHelper extends  HelperBase{


    public CarHelper(WebDriver wd) {
        super(wd);
    }

    public  void initAddingNewCar(String locator){
        click(By.cssSelector(locator));
    }

    public void fillCarForm(String location, String locationCss){

        type(location, By.cssSelector(locationCss));


    }

    public boolean isCreationCarFormPresent(String locator) {

        return isElementPresent(By.xpath(locator));
    }
}
