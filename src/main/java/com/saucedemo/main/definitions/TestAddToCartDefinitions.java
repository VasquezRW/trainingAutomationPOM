package com.saucedemo.main.definitions;

import com.saucedemo.main.pages.HomePage;
import com.saucedemo.main.pages.TestAddToCartPage;
import com.saucedemo.main.steps.TestAddToCartSteps;
import com.saucedemo.main.util.GeneralUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;

public class TestAddToCartDefinitions {
    @Steps
    TestAddToCartSteps testAddToCartSteps;
    @Given("Click en addtocart del primer item")
    public void clickEnAddtocartDelPrimerItem() {
        testAddToCartSteps.EnAddtocartPrimerItem();
    }
    @When("click en el nombre del segundo item")
    public void clickEnElNombreDelSegundoItem() {
        //testAddToCartSteps.segundoItem();
        testAddToCartSteps.addToCartSegundoItem();
    }
    /*
    @When("click en addtocart")
    public void clickEnAddtocart() {
        //testAddToCartSteps.addToCartSegundoItem();
    }
    */
    @When("click en carrito")
    public void clickEnCarrito() {
        testAddToCartSteps.clickCarrito();
    }
    @When("click remove al segundo item")
    public void clickRemoveAlSegundoItem() {
        testAddToCartSteps.removerItem();
    }
    @Then("validamos que se encuentre el item {string}")
    public void validamosQueSeEncuentreElItem(String string) {
        testAddToCartSteps.validarItem(string);
    }
}
