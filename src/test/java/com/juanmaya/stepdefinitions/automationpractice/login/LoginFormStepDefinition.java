package com.juanmaya.stepdefinitions.automationpractice.login;

import com.juanmaya.stepdefinitions.automationpractice.Setup;
import com.juanmaya.stepdefinitions.automationpractice.register.FakeUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.juanmaya.question.automationpractice.LoginForm.loginForm;
import static com.juanmaya.question.automationpractice.LoginFormError.loginFormError;
import static com.juanmaya.tasks.automationpractice.OpenLandingPage.openLandingPage;
import static com.juanmaya.tasks.automationpractice.loginform.BrowseLoginForm.browseToLoginForm;
import static com.juanmaya.tasks.automationpractice.loginform.FillLoginForm.fillTheLoginForm;
import static com.juanmaya.tasks.automationpractice.registerform.BrowseToRegisterForm.browseToRegisterForm;
import static com.juanmaya.tasks.automationpractice.registerform.FillRequiredFieldsOnlyRegisterForm.fillRequiredFieldsOnlyRegisterForm;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginFormStepDefinition extends Setup {
    //todo: arreglar el log4j
    private static final String ACTOR_NAME = "max";
    private final FakeUser fakeUser = new FakeUser();


    @Given("Que el usuario se encuentra ubicado en la pagina inicial")
    public void queElUsuarioSeEncuentraUbicadoEnLaPaginaInicial() {
        actorSetupBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                browseToRegisterForm()
                        .withEmail(fakeUser.getEmail()),
                fillRequiredFieldsOnlyRegisterForm()
                        .withFirstName(fakeUser.getFirstName())
                        .withLastName(fakeUser.getLastName())
                        .withEmail(fakeUser.getEmail())
                        .withPassword(fakeUser.getPassword())
                        .withAddress1(fakeUser.getAddress1())
                        .withCity(fakeUser.getCity())
                        .withState(fakeUser.getState())
                        .withZip(fakeUser.getZip())
                        .withCountry(fakeUser.getCountry())
                        .andPhone(fakeUser.getPhone())

        );
    }

    @When("se desplaza al formulario de login y llena todos los campos")
    public void seDesplazaAlFormularioDeLoginYLlenaTodosLosCampos() {

        theActorInTheSpotlight().attemptsTo(
                browseToLoginForm()
        );

        theActorInTheSpotlight().attemptsTo(
                fillTheLoginForm()
                        .withUser(fakeUser.getEmail())
                        .andPassword(fakeUser.getPassword())
        );
    }

    @Then("se activa su cuenta y se muestra un mensaje de bienvenida")
    public void seActivaSuCuentaYSeMuestraUnMensajeDeBienvenida() {
        theActorInTheSpotlight().should(
                seeThat(
                        loginForm().is(), equalTo(true)
                )
        );

    }

    @When("se desplaza al formulario de login y llena su usuario pero se equivoca en la contrasena")
    public void seDesplazaAlFormularioDeLoginYLlenaSuUsuarioPeroSeEquivocaEnLaContrasena() {
        theActorInTheSpotlight().attemptsTo(
                browseToLoginForm()
        );

        theActorInTheSpotlight().attemptsTo(
                fillTheLoginForm()
                        .withUser(fakeUser.getEmail())
                        .andPassword(fakeUser.getPassword()+"12")
        );

    }

    @Then("se muestra un mensaje indicando error en el password")
    public void seMuestraUnMensajeIndicandoErrorEnElPassword() {
        theActorInTheSpotlight().should(
                seeThat(
                        loginFormError().is(), equalTo(true)
                )
        );
    }
}
