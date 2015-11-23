package ua.artcode.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

/**
 * Created by ViTaLES on 11.10.2015.
 */
public class LoginTest extends TestBase{


    @Test
    public void test1() throws IOException {
        driver.get("http://ellos.se");

        mainPage.switchToLoginPage();
        loginPage.incorrectLogin();


        Assert.assertFalse("Incorrect work login form", web.isElementPresent(".ellos.active"));

    }


    @Test
    public void test2() throws IOException {
        driver.get("http://ellos.se");

        mainPage.switchToLoginPage();
        loginPage.incorrectPass();

        Assert.assertFalse("Incorrect work login form", web.isElementPresent(".ellos.active"));

    }


    @Test
    public void test3() throws IOException {

        driver.get("http://ellos.se");

        mainPage.switchToLoginPage();
        loginPage.positiveLogin();

        Assert.assertTrue("Incorrect work login form", driver.findElement(By.cssSelector(".ellos.active")).isDisplayed());
        System.out.println("FirstTest.test1");
    }


}
