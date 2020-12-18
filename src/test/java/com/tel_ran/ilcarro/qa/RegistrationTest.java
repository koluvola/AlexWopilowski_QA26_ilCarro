package com.tel_ran.ilcarro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {

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
        //open reg form
        wd.findElement(By.cssSelector("[href=\"/signup\"]")).click();

        //wd.findElement(By.cssSelector("[href=\"/car\"]")).click();
        //wd.findElement(By.name("address")).click();

        //fill registration
        //fill first name field
        wd.findElement(By.id("first_name")).click();
        wd.findElement(By.id("first_name")).clear();
        wd.findElement(By.id("first_name")).sendKeys("Alex");

        //fill last name field
        wd.findElement(By.id("second_name")).click();
        wd.findElement(By.id("second_name")).clear();
        wd.findElement(By.id("second_name")).clear();
        wd.findElement(By.id("second_name")).sendKeys("Wopilowski");

        //fill email field
        wd.findElement(By.id("email")).click();
        wd.findElement(By.id("email")).clear();
        wd.findElement(By.id("email")).sendKeys("alexw@gmail.com");

        //fill password field
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("12345678A");


        //wd.findElement(By.name("address")).click();

        //select check box

        WebElement we = wd.findElement(By.id("check_policy"));
        we.click();

        //delay 10 sek
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //click Yalla button
        WebElement wb = wd.findElement(By.className("yalla_yalla__1Jxk6"));
        wb.click();

        //delay 10 sek
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
