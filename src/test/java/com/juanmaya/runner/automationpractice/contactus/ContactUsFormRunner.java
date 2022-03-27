package com.juanmaya.runner.automationpractice.contactus;

import io.cucumber.core.backend.Glue;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/automationpractice/contactUs.feature"},
        glue = {"com.juanmaya.stepdefinitions.automationpractice.contactus"},
        tags= {}

)
public class ContactUsFormRunner {
}
