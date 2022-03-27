package com.juanmaya.question.automationpractice;

import com.juanmaya.userinterface.automationpractice.loginform.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.juanmaya.userinterface.automationpractice.registerform.Register.WELCOME_TO_YOUR_ACCOUNT_MESSAGE;

public class LoginForm implements Question<Boolean> {
    private static final String accountCorrectValidationMessage = "Welcome to your account. Here you can manage all of your personal information and orders.";

    public static LoginForm loginForm()
    {
        return new LoginForm();
    }

    public LoginForm is()
    {
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return WELCOME_TO_YOUR_ACCOUNT_MESSAGE.resolveFor(actor).containsOnlyText(accountCorrectValidationMessage);
    }
}
