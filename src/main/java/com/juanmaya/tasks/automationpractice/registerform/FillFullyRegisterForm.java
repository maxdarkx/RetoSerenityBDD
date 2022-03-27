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
import static com.juanmaya.userinterface.automationpractice.contactform.ContactUs.SUBJECT_HEADING_SELECT;
import static com.juanmaya.userinterface.automationpractice.registerform.Register.*;

public class FillFullyRegisterForm implements Task {
    private String firstName;
    private String lastName;
    private String prefix;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String phone;
    private Date birthday;
    private String day;
    private String month;
    private String year;
    private Boolean newsletter;
    private Boolean specialOffers;
    private String company;
    private String email;
    private String zip;
    private String user;
    private String password;
    private String country;
    private String homePhone;
    private String alias;


    public FillFullyRegisterForm withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public FillFullyRegisterForm withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FillFullyRegisterForm withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    public FillFullyRegisterForm withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public FillFullyRegisterForm withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public FillFullyRegisterForm withCity(String city) {
        this.city = city;
        return this;
    }

    public FillFullyRegisterForm withState(String state) {
        this.state = state;
        return this;
    }

    public FillFullyRegisterForm withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public FillFullyRegisterForm withBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public FillFullyRegisterForm withDay(String day) {
        this.day = day;
        return this;
    }

    public FillFullyRegisterForm withMonth(String month) {
        this.month = month;
        return this;
    }

    public FillFullyRegisterForm withYear(String year) {
        this.year = year;
        return this;
    }

    public FillFullyRegisterForm isNewsletter(Boolean newsletter) {
        this.newsletter = newsletter;
        return this;
    }

    public FillFullyRegisterForm isSpecialOffers(Boolean specialOffers) {
        this.specialOffers = specialOffers;
        return this;
    }

    public FillFullyRegisterForm workingCompany(String company) {
        this.company = company;
        return this;
    }

    public FillFullyRegisterForm withEmail(String email) {
        this.email = email;
        return this;
    }

    public FillFullyRegisterForm withZip(String zip) {
        this.zip = zip;
        return this;
    }

    public FillFullyRegisterForm withUser(String user) {
        this.user = user;
        return this;
    }

    public FillFullyRegisterForm withPassword(String password) {
        this.password = password;
        return this;
    }

    public FillFullyRegisterForm withCountry(String country) {
        this.country = country;
        return this;
    }

    public FillFullyRegisterForm withHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public FillFullyRegisterForm andAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public static FillFullyRegisterForm fillFullyRegisterForm()
    {
        return new FillFullyRegisterForm();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        /*actor.attemptsTo(
                Scroll.to(STATE),
                SelectFromOptions.byVisibleText(state).from(STATE)
        );*/
        actor.attemptsTo(
                Check.whether(prefix.equals("1"))
                        .andIfSo(
                            Scroll.to(GENDER_MALE),
                            Click.on(GENDER_MALE)
                        )
                        .otherwise(
                                Scroll.to(GENDER_FEMALE),
                                Click.on(GENDER_FEMALE)
                        ),
                Scroll.to(FIRST_NAME),
                Enter.theValue(firstName).into(FIRST_NAME),

                Scroll.to(LAST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),

                Scroll.to(CONTACT_EMAIL_ADDRESS),
                Enter.theValue(email).into(CONTACT_EMAIL_ADDRESS),

                Scroll.to(PASSWORD),
                Enter.theValue(password).into(PASSWORD),

                Scroll.to(DATE_DAY),
                SelectFromOptions.byValue(day).from(DATE_DAY),

                Scroll.to(DATE_MONTH),
                SelectFromOptions.byValue(month).from(DATE_MONTH),

                Scroll.to(DATE_YEAR),
                SelectFromOptions.byValue(year).from(DATE_YEAR),

                Check.whether(newsletter)
                        .andIfSo(
                                Scroll.to(NEWSLETTER),
                                Click.on(NEWSLETTER)
                        ),
                Check.whether(specialOffers)
                        .andIfSo(
                                Scroll.to(SPECIAL_OFFERS),
                                Click.on(SPECIAL_OFFERS)
                        ),

                Scroll.to(COMPANY),
                Enter.theValue(company).into(COMPANY),

                Scroll.to(ADDRESS_1),
                Enter.theValue(address1).into(ADDRESS_1),
                Scroll.to(ADDRESS_2),
                Enter.theValue(address2).into(ADDRESS_2),

                Scroll.to(CITY),
                Enter.theValue(city).into(CITY),

                Scroll.to(STATE),
                SelectFromOptions.byVisibleText(state).from(STATE),

                Scroll.to(ZIP),
                Enter.theValue(zip).into(ZIP),

                Scroll.to(COUNTRY),
                SelectFromOptions.byVisibleText(country).from(COUNTRY),

                Scroll.to(HOME_PHONE),
                Enter.theValue(homePhone).into(HOME_PHONE),

                Scroll.to(MOBILE_PHONE),
                Enter.theValue(phone).into(MOBILE_PHONE),

                Scroll.to(ADDRESS_ALIAS),
                Enter.theValue(alias).into(ADDRESS_ALIAS),

                Scroll.to(REGISTER_BUTTON),
                Click.on(REGISTER_BUTTON)
        );

    }
}
