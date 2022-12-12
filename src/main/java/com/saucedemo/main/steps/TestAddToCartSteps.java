package com.saucedemo.main.steps;

import com.saucedemo.main.pages.HomePage;
import com.saucedemo.main.pages.TestAddToCartPage;
import com.saucedemo.main.pages.TestCartPage;
import com.saucedemo.main.util.GeneralUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestAddToCartSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLoginSteps.class);
    @Page
    TestAddToCartPage testAddToCartPage;
    HomePage homePage;
    TestCartPage testCartPage;

    public void EnAddtocartPrimerItem() {
        homePage.addToCartItem();
    }

    /*
    public void segundoItem() {
        homePage.clickSegundoItem();
    }
    */

    public void addToCartSegundoItem() {
        testAddToCartPage.addToCartItem();
    }

    public void clickCarrito() {
        testAddToCartPage.clickCarrito();
    }

    public void removerItem() {
        testCartPage.removerItemDelCarrito();
    }

    public void validarItem(String string) {
        String s = GeneralUtil.formatMessageInformation("validando item agregado");
        LOGGER.info(s);
        MatcherAssert.assertThat("El item se añadio correctamente", string.contains(testCartPage.productoText.getText()));
    }
}
