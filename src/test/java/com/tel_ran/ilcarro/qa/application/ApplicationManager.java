package com.tel_ran.ilcarro.qa.application;

import com.tel_ran.ilcarro.qa.tests.LoginTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    public CarHelper carHelper;
    public UserHelper user;
    public WebDriver wd;
    public String xPath = "//a[contains(.,'logOut')]";
    // By.xpath("//a[contains(., 'logOut')]")

    public UserHelper getUser() {
        return user;
    }

    public CarHelper getCarHelper() {
        return carHelper;
    }


    public void init() {

        wd = new FirefoxDriver();
        wd.navigate().to("https://ilcarro-dev-v1.firebaseapp.com/");
        //open window of site to full size
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        user = new UserHelper(wd);
        carHelper = new CarHelper(wd);
    }

    public void stopTesting() {
        user.delay(10000);
        wd.quit();
    }
}
