package com.saucedemo.main.definitions;

import com.saucedemo.main.pages.TestCartPage;
import com.saucedemo.main.steps.TestCheckoutSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestCheckoutDefinitions {
    @Steps
    TestCheckoutSteps testCheckoutSteps;
    @Given("En el carrito click en checkout")
    public void enElCarritoClickEnCheckout() {
        testCheckoutSteps.clickCheckout();
    }
    @When("ingresamos los datos {string} {string} {string}")
    public void ingresamosLosDatos(String name, String lastName, String postCode) {
        testCheckoutSteps.enterData(name, lastName, postCode);
    }
    @When("click continue")
    public void clickContinue() {
        testCheckoutSteps.clickContinue();
    }
    @When("click finish")
    public void clickFinish() {
        testCheckoutSteps.clickFinish();
    }
    @Then("validamos estar en la pagina de checkout {string}")
    public void validamosEstarEnLaPaginaDeCheckout(String string) {
        testCheckoutSteps.validarCheckout(string);
    }
}
