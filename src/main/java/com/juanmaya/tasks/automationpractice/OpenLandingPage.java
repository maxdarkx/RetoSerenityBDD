package com.juanmaya.tasks.automationpractice.contactform;


import com.juanmaya.userinterface.automationpractice.ContactUsLandingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenLandingPage implements Task {
    private ContactUsLandingPage landingPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.browserOn(landingPage)
        );
    }

    public static OpenLandingPage openLandingPage()
    {
        return new OpenLandingPage();
    }

}
