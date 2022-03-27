package com.juanmaya.userinterface.automationpractice.contactform;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class ContactUsLandingPage extends PageObject
{
    //for general setup
    public static final Target CONTACT_US_LANDING = Target
            .the("Contact us")
            .located(xpath("//*[@id=\"contact-link\"]/a"));


    //for contact us assertions
    public static final Target CONTACT_US_VALIDATION_MESSAGE = Target
            .the("message sent")
            .located(xpath("//*[@id=\"center_column\"]/p"));
}
