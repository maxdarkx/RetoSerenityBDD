package com.juanmaya.userinterface.automationpractice.loginform;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class Login extends PageObject {
    public static final Target USER_LOGIN = Target
            .the("email")
            .located(id("email"));

    public static final Target PASSWORD_LOGIN = Target
            .the("passwd")
            .located(id("passwd"));

    public static final Target SUBMIT_LOGIN = Target
            .the("sign in")
            .located(xpath("//*[@id=\'SubmitLogin\']/span/i"));

    public static final Target LOGIN_ERROR_MESSAGE = Target
            .the("login error")
            .located(xpath("//*[@id='center_column']/div[1]/ol/li"));

}
