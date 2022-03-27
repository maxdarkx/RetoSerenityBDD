package com.juanmaya.tasks.automationpractice.contactform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import static com.juanmaya.userinterface.automationpractice.contactform.ContactUs.*;

public class FillFullyContactForm implements Task {
    private String emailAdress;
    private String message;
    private Path filePath;
    private String orderReference;


    public FillFullyContactForm withEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
        return this;
    }

    public FillFullyContactForm withMessage(String message) {
        this.message = message;
        return this;
    }
    public FillFullyContactForm andFileToUpload(String filePath) {
        this.filePath =Paths.get(filePath);
        return this;
    }

    public FillFullyContactForm withOrderReference(String orderReference) {
        this.orderReference = orderReference;
        return this;
    }


    public static FillFullyContactForm fillFullyContactForm(){
        return new FillFullyContactForm();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(ORDER_REFERENCE),
                Enter.theValue(orderReference).into(ORDER_REFERENCE)
        );
        actor.attemptsTo(
                Upload.theFile(filePath).to(ATTACH_FILE),
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

