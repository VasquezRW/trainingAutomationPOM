package com.saucedemo.main.steps;

import com.saucedemo.main.pages.TestCartPage;
import com.saucedemo.main.pages.TestCheckoutPage;
import com.saucedemo.main.util.GeneralUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class TestCheckoutSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLoginSteps.class);
    @Page
    TestCartPage testCartPage;

    @Page
    TestCheckoutPage testCheckoutPage;
    public void clickCheckout() {
        testCartPage.clickCheckout();
    }

    public void enterData(String name, String lastName, String postCode) {
        testCheckoutPage.ingresarData(name, lastName, postCode);
    }

    public void clickContinue() {
        testCheckoutPage.clickContinue();
    }

    public void clickFinish() {
        testCheckoutPage.clickFinish();
    }

    public void validarCheckout(String string) {
        String s = GeneralUtil.formatMessageInformation("validando checkout");
        LOGGER.info(s);
        MatcherAssert.assertThat("El checkout se realizo correctamente", string.contains(testCheckoutPage.spanCheckoutTitle.getText()));
    }
}
