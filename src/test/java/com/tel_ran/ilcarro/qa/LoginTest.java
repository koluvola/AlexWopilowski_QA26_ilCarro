package com.tel_ran.ilcarro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    //"Alex", "Wopilowski", "alexw@gmail.com", "12345678A"
    WebDriver wd;


    @BeforeMethod

    public void setUp() {
        wd = new FirefoxDriver();
        wd.navigate().to("https://ilcarro-dev-v1.firebaseapp.com/");
        //open window of site to full size
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();

    }

    @Test
    public void testLogin() {

        clickByCssSelector("[href=\"/login\"]");
        typeLoginFields("alexw@gmail.com", "12345678A");
        delay(5000);
        clickButtonYalla("[value=\"Y'alla!\"]");
        delay(5000);


    }

    private void clickByCssSelector(String cssSelector) {
        wd.findElement(By.cssSelector(cssSelector)).click();
    }

    public void typeLoginFields(String email, String password) {
        clickByCssSelector("[name=\"email\"]");
        wd.findElement(By.cssSelector("[name=\"email\"]")).clear();
        wd.findElement(By.cssSelector("[name=\"email\"]")).sendKeys(email);

        clickByCssSelector("[name=\"password\"]");
        wd.findElement(By.cssSelector("[name=\"password\"]")).clear();
        wd.findElement(By.cssSelector("[name=\"password\"]")).sendKeys(password);


    }

    private void delay(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void clickButtonYalla(String url) {
        clickByCssSelector(url);
    }

    private void clickByXPath(String xPathSelector) {
        wd.findElement(By.xpath(xPathSelector)).click();
    }
}
