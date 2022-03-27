package com.juanmaya.tasks.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;

import static com.juanmaya.userinterface.practiceform.practiceForm.*;
import static com.juanmaya.util.Gender.FEMALE;
import static com.juanmaya.util.Gender.MALE;

public class FillPracticeForm implements Task {

    private String firstName;
    private String lastName;
    private String gender;
    private String mobile;

    public FillPracticeForm usingTheFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public FillPracticeForm usingTheLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FillPracticeForm usingTheGender(String gender) {
        this.gender = gender;
        return this;
    }

    public FillPracticeForm andUsingMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(FIRST_NAME),
                Enter.theValue(firstName).into(FIRST_NAME),

                Scroll.to(LAST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),

                Check.whether(MALE.getValue().equals(gender))
                        .andIfSo(
                                Scroll.to(GENDER_MALE),
                                Click.on(GENDER_MALE)
                        ).otherwise(
                                Check.whether(FEMALE.getValue().equals(gender))
                                        .andIfSo(
                                                Scroll.to(GENDER_FEMALE),
                                                Click.on(GENDER_FEMALE)
                                        ).otherwise(
                                                  Scroll.to(GENDER_OTHER),
                                                  Click.on(GENDER_OTHER)
                                        )
                        ),

                Scroll.to(MOBILE),
                Enter.theValue(mobile).into(MOBILE),

                Scroll.to(SUBMIT),
                Click.on(SUBMIT)

        );
    }

    public static FillPracticeForm fillPracticeForm()
    {
        return new FillPracticeForm();
    }
}
