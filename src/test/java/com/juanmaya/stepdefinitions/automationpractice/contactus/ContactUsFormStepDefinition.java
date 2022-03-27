package com.juanmaya.stepdefinitions.automationpractice.contactus;

import com.juanmaya.question.automationpractice.ContactUsForm;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.juanmaya.question.automationpractice.ContactUsForm.contactUsForm;
import static com.juanmaya.tasks.automationpractice.contactform.FillContactForm.fillContactForm;
import static com.juanmaya.tasks.automationpractice.contactform.FillFullyContactForm.fillFullyContactForm;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.juanmaya.stepdefinitions.automationpractice.Setup;
import static com.juanmaya.tasks.automationpractice.contactform.OpenLandingPage.openLandingPage;
import static com.juanmaya.tasks.automationpractice.contactform.BrowseToContactForm.browseToContactForm;
import static org.hamcrest.Matchers.equalTo;

public class ContactUsFormStepDefinition extends Setup {
    private static final String ACTOR_NAME = "juan";
    private static final String email = "max_darkoriginal@hotmail.com";
    private static final String testMessage = "Test message, do not answer";
    private static final String fileToUpload = "/home/juan/Escritorio/QASofkaWorkspace/RetoSerenityScreenplay/icon_test.png";
    private static final String orderReference = "00510";




    @Given("Que el usuario se encuentra ubicado en la pagina inicial")
    public void queElUsuarioSeEncuentraUbicadoEnLaPaginaInicial() {
        actorSetupBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo( openLandingPage());
    }

    @When("El se desplaza al formulario de soporte y llena los datos requeridos")
    public void elSeDesplazaAlFormularioDeSoporteYLlenaLosDatosRequeridos() {
        theActorInTheSpotlight().attemptsTo(
                browseToContactForm()
        );

        theActorInTheSpotlight().attemptsTo(
                fillContactForm()
                        .withEmailAdress(email)
                        .andMessage(testMessage)
        );
    }

    @Then("Se envia un mensaje al area de soporte para verificar la funcionalidad")
    public void seEnviaUnMensajeAlAreaDeSoporteParaVerificarLaFuncionalidad() {
        theActorInTheSpotlight().should(
                seeThat(
                        contactUsForm().is(), equalTo(true)
                )
        );
    }


    @When("El se desplaza al formulario de soporte y llena todos los campos")
    public void elSeDesplazaAlFormularioDeSoporteYLlenaTodosLosCampos() {
        theActorInTheSpotlight().attemptsTo(
                browseToContactForm()
        );

        theActorInTheSpotlight().attemptsTo(
                fillFullyContactForm()
                        .withOrderReference(orderReference)
                        .withEmailAdress(email)
                        .withMessage(testMessage)
                        .andFileToUpload(fileToUpload)
        );
    }
}
