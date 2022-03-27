package com.juanmaya.stepdefinitions.automationpractice.register;

import com.juanmaya.stepdefinitions.automationpractice.Setup;
import com.juanmaya.tasks.practiceform.OpenLandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.juanmaya.question.automationpractice.ContactUsForm.contactUsForm;
import static com.juanmaya.question.automationpractice.RegisterForm.registerForm;
import static com.juanmaya.tasks.automationpractice.OpenLandingPage.openLandingPage;
import static com.juanmaya.tasks.automationpractice.registerform.BrowseToRegisterForm.browseToRegisterForm;
import static com.juanmaya.tasks.automationpractice.registerform.FillFullyRegisterForm.fillFullyRegisterForm;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class RegisterFormStepDefinition extends Setup {
    private static final String ACTOR_NAME = "carlos";
    private final FakeUser fakeUser = new FakeUser();




    @Given("Que el usuario se encuentra ubicado en la pagina inicial")
    public void queElUsuarioSeEncuentraUbicadoEnLaPaginaInicial() {
        actorSetupBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(openLandingPage());
    }

    @When("se desplaza al formulario de registro y llena todos los campos")
    public void seDesplazaAlFormularioDeRegistroYLlenaTodosLosCampos() {
       theActorInTheSpotlight().attemptsTo(
               browseToRegisterForm()
                       .withEmail(fakeUser.getEmail())
       );
       theActorInTheSpotlight().attemptsTo(
               fillFullyRegisterForm()
                       .withPrefix(fakeUser.getPrefix())
                       .withFirstName(fakeUser.getFirstName())
                       .withLastName(fakeUser.getLastName())
                       .withEmail(fakeUser.getEmail())
                       .withPassword(fakeUser.getPassword())
                       .withDay(fakeUser.getDay())
                       .withMonth(fakeUser.getMonth())
                       .withYear(fakeUser.getYear())
                       .isNewsletter(fakeUser.getNewsletter())
                       .isSpecialOffers(fakeUser.getSpecialOffers())
                       .workingCompany(fakeUser.getCompany())
                       .withAddress1(fakeUser.getAddress1())
                       .withAddress2(fakeUser.getAddress2())
                       .withCity(fakeUser.getCity())
                       .withState(fakeUser.getState())
                       .withZip(fakeUser.getZip())
                       .withCountry(fakeUser.getCountry())
                       .withHomePhone(fakeUser.getHomePhone())
                       .withPhone(fakeUser.getPhone())
                       .andAlias(fakeUser.getAlias())
       );
    }

    @Then("se crea una cuenta y se muestra un mensaje de bienvenida")
    public void seCreaUnaCuentaYSeMuestraUnMensajeDeBienvenida() {
        System.out.println("test");
        theActorInTheSpotlight().should(
                seeThat(
                        registerForm().is(), equalTo(true)
                )
        );

    }

}
