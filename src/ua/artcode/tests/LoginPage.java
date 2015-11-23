package ua.artcode.tests;

import org.openqa.selenium.WebDriver;
import ua.artcode.tests.WebElementsActions;

/**
 * Created by noel on 13/10/15.
 */
public class LoginPage {
    WebDriver driver;
    WebElementsActions web;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        web = new WebElementsActions(driver);
        //PageFactory.initElements(driver, this);
        //PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void positiveLogin() {
        web.fillLoginFields();


    }

    public void incorrectLogin(){
        web.incorrectLoginField();
    }


    public void incorrectPass () {
        web.incorrectPassField();
    }



}
