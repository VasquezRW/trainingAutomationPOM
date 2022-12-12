package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class TestOrderByPage extends PageObject {
    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElementFacade selectProductsContainer;
    public void filtrarProductos(String value){
        switch (value){
            case "az":
                selectProductsContainer.selectByValue("az");
                break;
            case "za":
                selectProductsContainer.selectByValue("za");
                break;
            case "lowPrice":
                selectProductsContainer.selectByValue("lohi");
                break;
            case "highPrice":
                selectProductsContainer.selectByValue("hilo");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + value);

        }
    }
}
