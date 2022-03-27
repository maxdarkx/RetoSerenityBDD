package com.juanmaya.userinterface.automationpractice;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.By.id;

public class ContactUs extends PageObject {
    public static final Target SUBJECT_HEADING_SELECT = Target
            .the("Subject Heading")
            .located(id("id_contact"));

    public static final Target SUBJECT_HEADING_OPTION_CUSTOMER_SERVICE = Target
            .the("Option Customer Service")
            .located(xpath("//*[@id=\"id_contact\"]/option[2]"));

    public static final Target SUBJECT_HEADING_OPTION_WEBMASTER= Target
            .the("Option Webmaster")
            .located(xpath("//*[@id=\"id_contact\"]/option[3]"));

    public static final Target CONTACT_EMAIL_ADDRESS = Target
            .the("from")
            .located(id("email"));

    public static final Target ORDER_REFERENCE = Target
            .the("id_order")
            .located(id("id_order"));

    public static final Target ATTACH_FILE = Target
            .the("choose file")
            .located(xpath("/html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/p[5]/div/input"));

    public static final Target MESSAGE = Target
            .the("message")
            .located(id("message"));

    public static final Target SUBMIT_MESSAGE = Target
            .the("submit message")
            .located(id("submitMessage"));

}
