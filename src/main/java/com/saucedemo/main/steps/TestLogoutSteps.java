package com.saucedemo.main.steps;

import com.saucedemo.main.pages.TestLogoutPage;
import com.saucedemo.main.util.GeneralUtil;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogoutSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLoginSteps.class);
    @Page
    TestLogoutPage testLogoutPage;
    public void clickMenu() {
        testLogoutPage.clickMenu();

    }
    public void clickLogout() {
        testLogoutPage.clickLogout();
    }

    public void validarLogout(String string) {
        String s = GeneralUtil.formatMessageInformation("Saliendo de la aplicacion");
        LOGGER.info(s);
        MatcherAssert.assertThat("se realizo correctamente el logout", string.contains(testLogoutPage.btnLogin.getText()));
    }
}
