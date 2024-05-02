package cucumber.steps;

import io.cucumber.java.en.Then;
import screens.InformationCoursesScreen;
import utilities.ThreadLocalDriver;

public class InformationCoursesSteps {
    InformationCoursesScreen informationCoursesScreen = new InformationCoursesScreen(ThreadLocalDriver.getTLDriver());
    @Then("I verify  courser full name {string}")
    public void iVerifyCourserFullName(String fullName) {
        informationCoursesScreen.verifyCourserFullName(fullName);
    }
}
