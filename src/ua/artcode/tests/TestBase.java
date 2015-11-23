package ua.artcode.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ua.artcode.tests.WebElementsActions;
import ua.artcode.tests.LoginPage;
import ua.artcode.tests.MainPage;

/**
 * Created by ViTaLES on 11.10.2015.
 */
public class TestBase {

    public static WebDriver driver;
    public static MainPage mainPage;
    public static LoginPage loginPage;
    public static WebElementsActions web;

    @BeforeClass
    public static void login() {
        System.out.println("Start test");
        driver = new FirefoxDriver();
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        web = new WebElementsActions(driver);

    }

    @AfterClass
    public static void logout() {
        System.out.println("Finish test");

        driver.quit();
    }
}
