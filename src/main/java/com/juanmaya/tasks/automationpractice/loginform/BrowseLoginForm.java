package com.juanmaya.tasks.automationpractice.loginform;

import com.juanmaya.userinterface.automationpractice.loginform.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.juanmaya.userinterface.automationpractice.loginform.LoginLandingPage.SIGN_IN_LANDING;
import static com.juanmaya.userinterface.automationpractice.loginform.LoginLandingPage.SIGN_IN_LOGOUT;

public class BrowseLoginForm implements Task {

    public static BrowseLoginForm browseToLoginForm()
    {
        return new BrowseLoginForm();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SIGN_IN_LOGOUT),
                Click.on(SIGN_IN_LOGOUT)

                /*Scroll.to(SIGN_IN_LANDING),
                Click.on(SIGN_IN_LANDING)
                */

        );
    }
}
