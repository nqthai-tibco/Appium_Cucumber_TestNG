package cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class JobsDetailsSteps extends BaseSteps {

//    @Before
//    public void setupLoginSteps() {
//        setupScreens(ThreadLocalDriver.getTLDriver());
//    }

    @Given("Candidate is on the jobs listing screen")
    public void candidateIsOnTheJobsListingScreen() {
        splashScreen.skipSplashScreen();
        selectionScreen.clickIamSearchingJob();
    }

    @When("Candidate opens a job which has index of {int}")

    @Then("Candidate should see the jobs details")
    public void candidateShouldSeeTheJobsDetails() {
        jobScreen.assertToolBarTitleIsExpected();
    }




}
