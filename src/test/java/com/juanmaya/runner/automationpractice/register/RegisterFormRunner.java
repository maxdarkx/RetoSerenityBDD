package com.juanmaya.runner.automationpractice.register;

import com.juanmaya.stepdefinitions.automationpractice.register.RegisterFormStepDefinition;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(snippets = CucumberOptions.SnippetType.CAMELCASE,
                    features = {"src/test/resources/features/automationpractice/register.feature"},
                    glue = {"com.juanmaya.stepdefinitions.automationpractice.register"},
                    tags={}
)
public class RegisterFormRunner {
}
