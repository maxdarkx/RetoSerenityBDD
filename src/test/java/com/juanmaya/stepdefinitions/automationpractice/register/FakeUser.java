package com.juanmaya.stepdefinitions.automationpractice.register;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FakeUser {
    private String firstName;
    private Calendar calendar;
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

    public FakeUser()
    {
        Faker faker = new Faker(new Locale("en-US"));
        prefix = String.valueOf(faker.number().numberBetween(1,2));
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        email = faker.internet().emailAddress();
        password = faker.internet().password();
        birthday = faker.date().birthday(15,79);

        calendar = Calendar.getInstance();
        calendar.setTime(birthday);

        day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        month = String.valueOf(calendar.get(Calendar.MONTH));
        year = String.valueOf(calendar.get(Calendar.YEAR));

        newsletter = true;
        specialOffers = true;
        company = faker.company().name();

        address1 = faker.address().streetAddress();
        address2 = faker.address().secondaryAddress();

        city = faker.address().city();
        state = faker.address().state();
        homePhone= faker.numerify("#######");
        phone = "301"+ faker.numerify("#######");
        country = "United States";
        zip = faker.numerify("#####");
        user= firstName+".maya";
        alias = "home";
    }

    public String getFirstName() {
        return firstName;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPhone() {
        return phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public Boolean getNewsletter() {
        return newsletter;
    }

    public Boolean getSpecialOffers() {
        return specialOffers;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public String getZip() {
        return zip;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getCountry() {
        return country;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getAlias() {
        return alias;
    }
}
