package com.juanmaya.question.automationpractice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.juanmaya.userinterface.automationpractice.loginform.Login.LOGIN_ERROR_MESSAGE;
import static com.juanmaya.userinterface.automationpractice.registerform.Register.WELCOME_TO_YOUR_ACCOUNT_MESSAGE;

public class LoginFormError implements Question<Boolean> {
    private static final String accountErrorMessage = "Authentication failed.";

    public static LoginFormError loginFormError()
    {
        return new LoginFormError();
    }

    public LoginFormError is()
    {
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LOGIN_ERROR_MESSAGE.resolveFor(actor).containsOnlyText(accountErrorMessage);
    }
}
