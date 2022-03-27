package com.juanmaya.tasks.automationpractice.registerform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.Date;

import static com.juanmaya.userinterface.automationpractice.contactform.ContactUs.CONTACT_EMAIL_ADDRESS;
import static com.juanmaya.userinterface.automationpractice.registerform.Register.*;

public class FillRequiredFieldsOnlyRegisterForm implements Task {
    private String firstName;
    private String lastName;
    private String address1;
    private String city;
    private String state;
    private String phone;
    private String email;
    private String zip;
    private String password;
    private String country;

    public FillRequiredFieldsOnlyRegisterForm withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public FillRequiredFieldsOnlyRegisterForm withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }


    public FillRequiredFieldsOnlyRegisterForm withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public FillRequiredFieldsOnlyRegisterForm withCity(String city) {
        this.city = city;
        return this;
    }

    public FillRequiredFieldsOnlyRegisterForm withState(String state) {
        this.state = state;
        return this;
    }

    public FillRequiredFieldsOnlyRegisterForm andPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public FillRequiredFieldsOnlyRegisterForm withEmail(String email) {
        this.email = email;
        return this;
    }

    public FillRequiredFieldsOnlyRegisterForm withZip(String zip) {
        this.zip = zip;
        return this;
    }

    public FillRequiredFieldsOnlyRegisterForm withPassword(String password) {
        this.password = password;
        return this;
    }

    public FillRequiredFieldsOnlyRegisterForm withCountry(String country) {
        this.country = country;
        return this;
    }

    public static FillRequiredFieldsOnlyRegisterForm fillRequiredFieldsOnlyRegisterForm()
    {
        return new FillRequiredFieldsOnlyRegisterForm();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(

                 Scroll.to(ADDRESS_ALIAS),

                 Scroll.to(FIRST_NAME),
                 Enter.theValue(firstName).into(FIRST_NAME),

                 Scroll.to(LAST_NAME),
                 Enter.theValue(lastName).into(LAST_NAME),

                 Scroll.to(CONTACT_EMAIL_ADDRESS),
                 Enter.theValue(email).into(CONTACT_EMAIL_ADDRESS),

                 Scroll.to(PASSWORD),
                 Enter.theValue(password).into(PASSWORD),

                 Scroll.to(ADDRESS_1),
                 Enter.theValue(address1).into(ADDRESS_1),

                 Scroll.to(CITY),
                 Enter.theValue(city).into(CITY),

                 Scroll.to(STATE),
                 SelectFromOptions.byVisibleText(state).from(STATE),

                 Scroll.to(ZIP),
                 Enter.theValue(zip).into(ZIP),

                 Scroll.to(COUNTRY),
                 SelectFromOptions.byVisibleText(country).from(COUNTRY),

                 Scroll.to(MOBILE_PHONE),
                 Enter.theValue(phone).into(MOBILE_PHONE),

                 Scroll.to(REGISTER_BUTTON),
                 Click.on(REGISTER_BUTTON)
        );

    }
}
