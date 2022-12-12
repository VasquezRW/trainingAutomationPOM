package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/")
public class TestLoginPage extends PageObject {
    @FindBy(xpath = "//input[@id='user-name']")
    public WebElementFacade inputUserName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElementFacade inputPassword;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElementFacade btnLogin;

    public void ingresarCredencialesLogin(String username, String password) {
        inputUserName.sendKeys(username);
        inputPassword.sendKeys(password);

    }

    public void darClickBtnLogin() {
        btnLogin.click();
    }
}
