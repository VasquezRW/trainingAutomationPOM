package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {
    @FindBy(xpath = "//span[@class='title']")
    public WebElementFacade spanHome;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElementFacade producto1;
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public WebElementFacade producto2Text;
    public void addToCartItem() {
        producto1.click();
    }
    public void clickSegundoItem() {
        producto2Text.click();
    }
}
