package com.saucedemo.main.steps;

import com.saucedemo.main.pages.HomePage;
import com.saucedemo.main.pages.TestLoginPage;
import com.saucedemo.main.util.GeneralUtil;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLoginSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLoginSteps.class);
    @Page
    TestLoginPage testLoginPage;
    HomePage homePage;

    public void openWeb() {
        testLoginPage.open();
    }

    public void ingresarCredenciales(String username, String password) {
        testLoginPage.ingresarCredencialesLogin(username, password);
    }

    public void darClickEnElBotonDeLogin() {
        testLoginPage.darClickBtnLogin();
    }

    public void validarLogin(String value) {
        String s = GeneralUtil.formatMessageInformation("validando el login de la aplicacion");
        LOGGER.info(s);
        MatcherAssert.assertThat("se realizo correctamente el login", value.contains(homePage.spanHome.getText()));
    }
}
