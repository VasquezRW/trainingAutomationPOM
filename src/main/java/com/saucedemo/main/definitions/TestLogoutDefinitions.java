package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.TestLogoutSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestLogoutDefinitions {
    @Steps
    TestLogoutSteps testLogoutSteps;
    @Given("click menu")
    public void clickMenu() {
        testLogoutSteps.clickMenu();
    }
    @When("click logout")
    public void clickLogout() {
        testLogoutSteps.clickLogout();
    }
    @Then("validamos estar en la pagina de login {string}")
    public void validamosEstarEnLaPaginaDeLogin(String string) {
        testLogoutSteps.validarLogout(string);
    }
}
