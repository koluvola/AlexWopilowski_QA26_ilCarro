package com.tel_ran.ilcarro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    String xPath = "//a[contains(.,'logOut')]";

    public void clickLogInButton() {
        clickByCssSelector("[href=\"/login\"]");
    }

    public void clickLogOutButtonOnHeader(String xPathSelector) {
        clickByXPath(xPathSelector);
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

        return isElementPresent(By.xpath(xPath));
    }

    public void logIn() {
        clickButtonYalla("[href=\"/login\"]");
        typeLoginFields("my.email1608881337043@gmail.com", "Aa1234567");
        delay(5000);
        clickButtonYalla("[value=\"Y'alla!\"]");
        delay(5000);
    }

    protected void clickButtonYalla(String url) {
        clickByCssSelector(url);
    }

    public void typeLoginFields(String email, String password) {
        clickByCssSelector("[name=\"email\"]");
        wd.findElement(By.cssSelector("[name=\"email\"]")).clear();
        wd.findElement(By.cssSelector("[name=\"email\"]")).sendKeys(email);

        clickByCssSelector("[name=\"password\"]");
        wd.findElement(By.cssSelector("[name=\"password\"]")).clear();
        wd.findElement(By.cssSelector("[name=\"password\"]")).sendKeys(password);


    }

    protected void clickByCssSelector(String cssSelector) {
        wd.findElement(By.cssSelector(cssSelector)).click();

    }

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
        delay(10000);
        wd.quit();

    }

    protected void delay(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void clickButton(By locator) {
        WebElement wb = wd.findElement(locator);
        wb.click();
    }

    protected void clickCheckBox(By locator) {
        WebElement we = wd.findElement(locator);
        we.click();
    }

    protected void fillRegistrationForm(String fName, String lName, String email, String password) {
        type(fName, By.id("first_name"));
        type(lName, By.id("second_name"));
        type(email, By.id("email"));
        type(password, By.id("password"));
    }

    private void type(String str, By locator) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(str);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void openRegForm() {

        click(By.cssSelector("[href=\"/signup\"]"));
    }


}
