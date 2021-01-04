package com.tel_ran.ilcarro.qa.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CarCreationTest extends TestBase {
    String address = "Tel Aviv, Ben Gurion st. 3/4, 1234567";
    String addressCss = "[class='address']";
    String country = "Israel ";
    String locationCss = "[class='country']";
    String locator1 = "header [href='/car']";
    String locator2 = "//h3[contains(.,'Let the car work')]";


    @Test
    public void testCarCreation() {
        appl.getCarHelper().initAddingNewCar(locator1);
        //Assert.assertTrue(appl.carHelper.isCreationCarFormPresent(locator2));
        appl.getCarHelper().fillCarForm(country, locationCss, address, addressCss);
    }
}
