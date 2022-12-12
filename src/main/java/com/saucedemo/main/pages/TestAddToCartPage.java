package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class TestAddToCartPage extends PageObject {
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    public WebElementFacade btnProducto;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElementFacade btnCarrito;


    public void addToCartItem() {
        btnProducto.click();
    }

    public void clickCarrito() {
        btnCarrito.click();
    }
}
