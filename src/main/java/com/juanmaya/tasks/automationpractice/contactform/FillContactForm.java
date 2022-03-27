package com.juanmaya.tasks.automationpractice.contactform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;


import static com.juanmaya.userinterface.automationpractice.ContactUs.*;

public class FillContactForm implements Task {
private String emailAdress;
private String message;

    public FillContactForm withEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
        return this;
    }

    public FillContactForm andMessage(String message) {
        this.message = message;
        return this;
    }

    public static FillContactForm fillContactForm(){
        return new FillContactForm();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(CONTACT_EMAIL_ADDRESS),
                Enter.theValue(emailAdress).into(CONTACT_EMAIL_ADDRESS),
                Scroll.to(MESSAGE),
                Enter.theValue("Test message, do not answer").into(MESSAGE),
                SelectFromOptions.byValue("2").from(SUBJECT_HEADING_SELECT),
                Scroll.to(SUBMIT_MESSAGE),
                Click.on(SUBMIT_MESSAGE)
        );

    }
}

