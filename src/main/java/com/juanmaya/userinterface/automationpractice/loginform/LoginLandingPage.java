package com.juanmaya.userinterface.automationpractice.loginform;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class LoginLandingPage extends PageObject {
    public static final Target SIGN_IN_LANDING = Target
            .the("Sign in")
            .located(xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

    public static final Target SIGN_IN_LOGOUT = Target
            .the("Sign in")
            .located(xpath("//*[@id=\'header\']/div[2]/div/div/nav/div[2]/a"));



}
