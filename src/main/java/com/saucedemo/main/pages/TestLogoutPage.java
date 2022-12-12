package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class TestLogoutPage extends PageObject {

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    public WebElementFacade btnMenu;
    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    public WebElementFacade btnLogout;
    @FindBy(xpath = "//input[@id='login-button']")
    public WebElementFacade btnLogin;
    public void clickMenu() {
        btnMenu.click();
    }

    public void clickLogout() {
        btnLogout.click();
    }
}
