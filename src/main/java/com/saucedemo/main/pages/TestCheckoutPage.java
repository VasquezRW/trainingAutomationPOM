package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class TestCheckoutPage extends PageObject {
    @FindBy(xpath = "//input[@id='first-name']")
    public WebElementFacade inputName;
    @FindBy(xpath = "//input[@id='last-name']")
    public WebElementFacade inputLastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    public WebElementFacade inputPostalCode;
    @FindBy(xpath = "//input[@id='continue']")
    public WebElementFacade btnContinue;
    @FindBy(xpath = "//button[@id='finish']")
    public WebElementFacade btnFinish;
    @FindBy(xpath = "//span[@class='title']")
    public WebElementFacade spanCheckoutTitle;
    public void ingresarData(String name, String lastName, String postCode) {
        inputName.sendKeys(name);
        inputLastName.sendKeys(lastName);
        inputPostalCode.sendKeys(postCode);
    }

    public void clickContinue() {
        btnContinue.click();
    }

    public void clickFinish() {
        btnFinish.click();
    }
}
