package cucumber.steps;

import cucumber.tests.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Parameters;
import utilities.ThreadLocalDriver;

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
        candidateMainScreen.allowNotification();
    }

    @When("Candidate opens a job which has index of {int}")
    public void candidateOpensTheIndexOfJobScreen(int index) {
        candidateMainScreen.clickToJob(index);
    }

    @Then("Candidate should see the jobs details")
    public void candidateShouldSeeTheJobsDetails() {
        jobScreen.assertToolBarTitleIsExpected();
    }

    @Given("I start app {string}")
    public void iStartApp(String app) throws IOException {
        BaseTest baseTest= new BaseTest();
        if(app.contains("Co"))
        {

            baseTest.setup("emulator-5554","4723","fr.playsoft.vnexpress","fr.playsoft.vnexpress.ActivityMain");
            System.out.println("app:Co done");
        }
        else {

            baseTest.setup("emulator-5556","4728","org.coursera.android","org.coursera.android.MainActivity");
            System.out.println("app:Ex done");
        }

    }
}
