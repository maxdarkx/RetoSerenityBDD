package com.juanmaya.runner.automationpractice.login;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(snippets = CucumberOptions.SnippetType.CAMELCASE,
features = {"src/test/resources/features/automationpractice/login.feature"},
glue= {"com.juanmaya.stepdefinitions.automationpractice.login"},
tags={""})

public class LoginFormRunner {
}
