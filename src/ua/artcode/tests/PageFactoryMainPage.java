package ua.artcode.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ua.artcode.tests.WebElementsActions;

/**
 * Created by ViTaLES on 10.10.2015.
 */
public class PageFactoryMainPage {

    WebDriver driver;
    WebElementsActions web;

    @FindBy(css = ".ellos.active")
    WebElement logo;

    @FindBy(css = "#showlogin>span")
    WebElement loginPageLink;

    @FindBy(css = "#ctl00_ctl00_conMain_conMain_LoginControl_LoginUsername")
    WebElement loginField;

    public PageFactoryMainPage(WebDriver driver) {
        this.driver = driver;
        web = new WebElementsActions(driver);
        PageFactory.initElements(driver, this);
        //PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void clickLogo() {
        logo.click();
    }

    public void switchToLoginPage() {
        loginPageLink.click();

        if (loginField.isDisplayed()) {
            System.out.println("SwitchTo Login Page was correct");
        } else {
            System.out.println("SwitchTo Login Page was Incorrect");
        }
    }


}
