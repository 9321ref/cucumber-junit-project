package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user searches for {word}")
    public void user_Searches_For_Apple(String word) {

        googleSearchPage.acceptierenBox.click();
        BrowserUtils.sleep(2);
        googleSearchPage.searchBox.sendKeys(word + Keys.ENTER);

    }

    @Then("user should see {word} in the title")
    public void user_Should_See_Apple_In_The_Title(String word) {
        BrowserUtils.verifyTitle(word+" - Google Suche");
    }


//    @And("user sees {int} apples")
//    public void userSeesApples(int arg0) {
//    }


    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {

        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle,expectedTitle);

        Driver.closeDriver();
    }



}
