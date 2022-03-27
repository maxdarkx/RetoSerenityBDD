package com.juanmaya.tasks.automationpractice.loginform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.juanmaya.userinterface.automationpractice.loginform.Login.*;

public class FillLoginForm implements Task {
    private String user;
    private String password;

    public FillLoginForm withUser(String user) {
        this.user = user;
        return this;
    }

    public FillLoginForm andPassword(String password) {
        this.password = password;
        return this;
    }

    public static FillLoginForm fillTheLoginForm()
    {
        return new FillLoginForm();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(USER_LOGIN),
                Enter.theValue(user).into(USER_LOGIN),
                Scroll.to(PASSWORD_LOGIN),
                Enter.theValue(password).into(PASSWORD_LOGIN),
                Scroll.to(SUBMIT_LOGIN),
                Click.on(SUBMIT_LOGIN)
        );
    }

}
