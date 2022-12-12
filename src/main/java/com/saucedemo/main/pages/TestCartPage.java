package com.saucedemo.main.pages;

import com.saucedemo.main.util.GeneralUtil;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class TestCartPage extends PageObject {
    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
    public WebElementFacade btnProducto;
    @FindBy(xpath = "//button[@id='checkout']")
    public WebElementFacade btnCheckout;
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public WebElementFacade productoText;

    public void removerItemDelCarrito() {
        btnProducto.click();
    }

    public void clickCheckout() {
        btnCheckout.click();
    }
}
