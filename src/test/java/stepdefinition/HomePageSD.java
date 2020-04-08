package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import runnerTest.webPages.HomePage;

public class HomePageSD {

    private HomePage homePage=new HomePage();

    @Given("^I am on Darksky Home Page$")
    public void verifyHomePage() throws InterruptedException {
        Assert.assertEquals(homePage.getTitle(), "Dark Sky - Broadway, New York, NY");
    }

    @When("^I entered Fillmore Street, San Francisco, CA in search Box$")
    public void iEnteredCityInSearchBox() throws InterruptedException {

        homePage.selectCity();
        Assert.assertEquals(homePage.getTitle(), "Dark Sky - Fillmore Street, San Francisco, CA");

    }


    @Then("^I verify timeline is displayed with two hours incremented$")
    public void verifyTimelineFormat()  {
        Assert.assertTrue(homePage.verifyHourFormat("America/Los_Angeles"), "Hours not displayed correctly");

    }
    @When("^I expand todays' timeline$")
    public void expandToday() {
        homePage.expandToday();
    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void verifyTempValues(){
        Assert.assertTrue(homePage.verifyMinTemp(), "Minumum Temperature is not matching");
        Assert.assertTrue(homePage.verifyMaxTemp(), "Maximum Temperature is not matching");
    }

}
