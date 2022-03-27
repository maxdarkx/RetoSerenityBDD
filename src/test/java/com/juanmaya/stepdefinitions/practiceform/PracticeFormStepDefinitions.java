package com.juanmaya.stepdefinitions.practiceform;

import com.juanmaya.exceptions.ValidationTextDoNotMatch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import static com.juanmaya.exceptions.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;
import static com.juanmaya.question.practiceform.PracticeForm.practiceForm;
import static com.juanmaya.tasks.practiceform.BrowseToPracticeForm.browseToPracticeForm;
import static com.juanmaya.tasks.practiceform.FillPracticeForm.fillPracticeForm;
import static com.juanmaya.tasks.practiceform.OpenLandingPage.openLandingPage;
import static com.juanmaya.userinterface.practiceform.practiceForm.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class PracticeFormStepDefinitions extends Setup{
    private static final String ACTOR_NAME = "Student";
    private DataTable dataToValidate;

    @Given("The student is located on the landing page of Tools AQ")
    public void theStudentIsLocatedOnTheLandingPageOfToolsAQ() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(openLandingPage());
    }

    @When("he browse to registration form")
    public void heBrowseToRegistrationForm() {
        theActorInTheSpotlight().attemptsTo(
                browseToPracticeForm()
        );
    }

    @When("he has filled it and submitted")
    public void heHasFilledItAndSubmitted(DataTable dataTable) {
        dataToValidate = dataTable;
        theActorInTheSpotlight().attemptsTo(
                fillPracticeForm()
                        .usingTheFirstName(dataTable.row(0).get(1))
                        .usingTheLastName(dataTable.row(1).get(1))
                        .usingTheGender(dataTable.row(2).get(1))
                        .andUsingMobile(dataTable.row(3).get(1))
        );
    }

    @Then("the student will see a registration information")
    public void theStudentWillSeeARegistrationInformation() {
        theActorInTheSpotlight().should(
            seeThat(
                    practiceForm()
                            .wasFilledWithFirstName(dataToValidate.row(0).get(1))
                            .andWithLastName(dataToValidate.row(1).get(1))
                            .andWithGender(dataToValidate.row(2).get(1))
                            .andWithMobile(dataToValidate.row(3).get(1))
                            .is(),equalTo(true)
            )
                    .orComplainWith(ValidationTextDoNotMatch.class, String.format(VALIDATION_DO_NOT_MATCH, compareInWithSystemOutcome()))
        );
    }

    private String compareInWithSystemOutcome(){
        return "\n" + "Data for test : System outcome"
                + "\n" + dataToValidate.row(0).get(1) + " " + dataToValidate.row(1).get(1) + " : " + STUDENT_NAME_VALIDATION.resolveFor(theActorInTheSpotlight()).getText()
                + "\n" + dataToValidate.row(2).get(1) + " : " + GENDER_VALIDATION.resolveFor(theActorInTheSpotlight()).getText()
                + "\n" + dataToValidate.row(3).get(1) + " : " + MOBILE_VALIDATION.resolveFor(theActorInTheSpotlight()).getText()
                ;
    }
}
