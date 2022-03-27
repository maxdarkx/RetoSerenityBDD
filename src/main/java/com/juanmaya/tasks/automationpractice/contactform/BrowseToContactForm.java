package com.juanmaya.tasks.automationpractice.contactform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.juanmaya.userinterface.automationpractice.contactform.ContactUsLandingPage.CONTACT_US_LANDING;

public class BrowseToContactForm implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CONTACT_US_LANDING),
                Click.on(CONTACT_US_LANDING)
        );
    }
    public static BrowseToContactForm browseToContactForm()
    {
        return new BrowseToContactForm();
    }
}
