package com.juanmaya.runner.practiceform;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/practiceform/practiceForm.feature"},
        glue={"com.juanmaya.stepdefinitions.practiceform"},
        tags={""}
)

public class PracticeFormRunner {
}
