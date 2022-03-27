package com.juanmaya.tasks.automationpractice.registerform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.juanmaya.userinterface.automationpractice.registerform.RegisterLandingPage.*;

public class BrowseToRegisterForm implements Task {
    private String email;

    public BrowseToRegisterForm withEmail(String email) {
        this.email = email;
        return this;
    }

    public static BrowseToRegisterForm browseToRegisterForm()
    {
        return new BrowseToRegisterForm();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SIGN_IN_LANDING),
                Click.on(SIGN_IN_LANDING),
                Scroll.to(EMAIL_REGISTER_ACCOUNT),
                Enter.theValue(email).into(EMAIL_REGISTER_ACCOUNT),
                Scroll.to(BUTTON_REGISTER_ACCOUNT),
                Click.on(BUTTON_REGISTER_ACCOUNT)
        );

    }

}
