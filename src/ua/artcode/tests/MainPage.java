package ua.artcode.tests;

import org.openqa.selenium.WebDriver;
import ua.artcode.tests.WebElementsActions;

import java.io.IOException;

/**
 * Created by ViTaLES on 10.10.2015.
 */
public class MainPage {
    WebDriver driver;
    WebElementsActions web;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        web = new WebElementsActions(driver);
        //PageFactory.initElements(driver, this);
        //PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void clickLogo() throws IOException {
        web.clckLink("Logo");
    }

    public void switchToLoginPage() throws IOException {
        web.clckLink("LoginPageLink");

        if (web.isElementPresent("LoginField")) {
            System.out.println("SwitchTo Login Page was correct");
        } else {
            System.out.println("SwitchTo Login Page was Incorrect");
        }
    }

}
