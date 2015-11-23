package ua.artcode.tests;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by ViTaLES on 03.10.2015.
 * cntr alt v
 */
public class FirstTests {

    private static WebDriver driver;
    private static String baseUrl;
    static WebElementsActions web;

    @BeforeClass
    public static void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://ellos.se";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        web = new WebElementsActions(driver);
    }

    @Test
    public void test1() throws Exception {
        driver.get(baseUrl);

        driver.findElement(By.cssSelector("a.ellos.active")).click(); //Logo
        driver.findElement(By.cssSelector("#showlogin>span")).click(); //login link

        driver.findElement(By.cssSelector("#ctl00_ctl00_conMain_conMain_LoginControl_LoginButton")).click(); //login button
    }

    @Test
    public void test2() throws Exception {

        driver.findElement(By.cssSelector("")).click(); //your locators
        driver.findElement(By.cssSelector("")).click();

    }


    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }

}

