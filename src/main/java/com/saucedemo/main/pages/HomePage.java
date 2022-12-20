package com.saucedemo.main.pages;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends PageObject {
    @FindBy(xpath = "//span[@class='title']")
    public WebElementFacade spanHome;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElementFacade producto1;
    @FindBy(xpath = "//a[@id='item_0_title_link']")
    public WebElementFacade producto2Text;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElementFacade btnOrdenar;
    @FindBy(xpath = "//option[@value='lohi']")
    public WebElementFacade btnLow_High;
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    public List<WebElementFacade> items;
    public void addToCartItem() {
        producto1.click();
    }
    public void clickSegundoItem() {
        producto2Text.click();
    }
    public void clickEnOrdenarItems() {
        btnOrdenar.click();
    }
    public void clickEnPriceLowHigh() {
        btnLow_High.click();
    }
    public Double[] preciosProducts;
    public boolean validarLowHigh() {
        preciosProducts=new Double[items.size()];
        for (int i = 0; i <items.size(); i++){
            double precios=Double.parseDouble(items.get(i).getText().replace("$",""));
            preciosProducts[i]=precios;
        }
        for (int i = 0; i <items.size()-1; i++) {
            if(preciosProducts[i]>preciosProducts[i+1]){
                return false;
            }
        }
        return true;
    }
}