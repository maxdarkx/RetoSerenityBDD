package com.juanmaya.userinterface.automationpractice;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.By.id;


public class ContactUsLandingPage extends PageObject
{
    //for general setup
    public static final Target CONTACT_US_LANDING = Target
            .the("Contact us")
            .located(xpath("//*[@id=\"contact-link\"]/a"));

    public static final Target SIGN_IN_LANDING = Target
            .the("Sign in")
            .located(xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

    public static final Target EMAIL_REGISTER_ACCOUNT = Target
            .the("Email create")
            .located(id("email_create"));

    public static final Target BUTTON_REGISTER_ACCOUNT = Target
            .the("Create an account")
            .located(xpath("//*[@id=\"SubmitCreate\"]/span/i"));

    //for contact us assertions
    public static final Target CONTACT_US_VALIDATION_MESSAGE = Target
            .the("message sent")
            .located(xpath("//*[@id=\"center_column\"]/p"));
}
