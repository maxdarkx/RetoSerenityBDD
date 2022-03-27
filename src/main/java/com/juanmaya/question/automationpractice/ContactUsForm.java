package com.juanmaya.question.automationpractice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.juanmaya.userinterface.automationpractice.ContactUsLandingPage.CONTACT_US_VALIDATION_MESSAGE;

public class ContactUsForm implements Question<Boolean> {
    private static final String validationMessage = "Your message has been successfully sent to our team.";

    /*
    private String email;
    private String message;

    public ContactUsForm wasFilledByEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactUsForm withMessage(String message) {
        this.message = message;
        return this;
    }
*/
    public static ContactUsForm contactUsForm()
    {
        return new ContactUsForm();
    }

    public ContactUsForm is()
    {
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CONTACT_US_VALIDATION_MESSAGE.resolveFor(actor).containsOnlyText(validationMessage);
    }
}
