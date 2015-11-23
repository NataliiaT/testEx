package ua.artcode.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by ViTaLES on 10.10.2015.
 */
public class PageFactoryTest {

    static WebDriver driver;
    PageFactoryMainPage pageFactoryMainPage;

    @BeforeClass
    public static void setUp(){
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.ellos.se/");
        System.out.println("Start tests");
    }

    @Test
    public void test1() throws IOException {
        pageFactoryMainPage = new PageFactoryMainPage(driver);

        pageFactoryMainPage.clickLogo();
        pageFactoryMainPage.switchToLoginPage();

        System.out.println("End test1");
    }

    @AfterClass
    public static void down() {
        driver.quit();
    }

}
