package com.juanmaya.stepdefinitions.practiceform;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Setup {
    @Managed
    protected WebDriver browser;

    private void setupBrowser(WebDriver browser)
    {
        browser.manage().deleteAllCookies();
        //browser.manage().window().maximize();

        browser.manage().window().setSize(new Dimension(1200, 1200));

    }
    private void setupUser(String name, WebDriver browser)
    {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(name).can(BrowseTheWeb.with(browser));
    }
    protected void actorSetupTheBrowser(String actorName)
    {
        setupBrowser(browser);
        setupUser(actorName, browser);
    }
}
