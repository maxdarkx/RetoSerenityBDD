package com.juanmaya.userinterface.automationpractice.registerform;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class Register extends PageObject {

    public static final Target GENDER_MALE = Target
            .the("gender male")
            .located(id("id_gender1"));

    public static final Target GENDER_FEMALE = Target
            .the("gender female")
            .located(id("id_gender2"));

    public static final Target FIRST_NAME = Target
            .the("customer_firstname")
            .located(id("customer_firstname"));

    public static final Target LAST_NAME = Target
            .the("customer_lastname")
            .located(id("customer_lastname"));

    public static final Target PASSWORD = Target
            .the("passwd")
            .located(id("passwd"));

    public static final Target DATE_DAY = Target
            .the("days")
            .located(id("days"));

    public static final Target DATE_MONTH = Target
            .the("months")
            .located(id("months"));

    public static final Target DATE_YEAR = Target
            .the("years")
            .located(id("years"));

    public static final Target NEWSLETTER = Target
            .the("newsletter")
            .located(id("newsletter"));

    public static final Target SPECIAL_OFFERS = Target
            .the("optin")
            .located(id("optin"));

    public static final Target COMPANY = Target
            .the("company")
            .located(id("company"));

    public static final Target ADDRESS_1 = Target
            .the("address1")
            .located(id("address1"));

    public static final Target ADDRESS_2 = Target
            .the("address2")
            .located(id("address2"));

    public static final Target CITY = Target
            .the("city")
            .located(id("city"));

    public static final Target STATE = Target
            .the("id_state")
            .located(id("id_state"));

    public static final Target ZIP = Target
            .the("postcode")
            .located(id("postcode"));

    public static final Target COUNTRY = Target
            .the("id_country")
            .located(id("id_country"));

    public static final Target ADDITIONAL_INFORMATION = Target
            .the("other")
            .located(id("other"));

    public static final Target HOME_PHONE  = Target
            .the("phone")
            .located(id("phone"));

    public static final Target  MOBILE_PHONE= Target
            .the("phone_mobile")
            .located(id("phone_mobile"));

    public static final Target  ADDRESS_ALIAS= Target
            .the("alias")
            .located(id("alias"));

    public static final Target REGISTER_BUTTON = Target
            .the("submitAccount")
            .located(id("submitAccount"));

    //for assertion
    public static final Target WELCOME_TO_YOUR_ACCOUNT_MESSAGE  = Target
            .the("")
            .located(xpath("//*[@id=\'center_column\']/p"));

}
