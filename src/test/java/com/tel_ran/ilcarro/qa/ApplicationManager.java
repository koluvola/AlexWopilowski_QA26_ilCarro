package com.tel_ran.ilcarro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    UserHelper user;
    WebDriver wd;
    String xPath = "//a[contains(.,'logOut')]";
   // By.xpath("//a[contains(., 'logOut')]")



    protected void init() {

        wd = new FirefoxDriver();
        wd.navigate().to("https://ilcarro-dev-v1.firebaseapp.com/");
        //open window of site to full size
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        user = new UserHelper(wd);
    }

    protected void stopTesting() {
        user.delay(1000);
        wd.quit();
    }

    public UserHelper getUser() {
        return user;
    }
}
