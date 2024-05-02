import cucumber.steps.BaseSteps;
import io.cucumber.java.en.And;
import screens.FirstScreen;
import screens.SearchScreen;
import screens.SecondScreen;
import utilities.ThreadLocalDriver;

public class SearchSteps extends BaseSteps {
    FirstScreen firstScreen = new FirstScreen(ThreadLocalDriver.getTLDriver());
    SecondScreen secondScreen = new SecondScreen(ThreadLocalDriver.getTLDriver());
    SearchScreen searchScreen = new SearchScreen(ThreadLocalDriver.getTLDriver());
    @And("I search courser name {string}")
    public void iSearchCourserName(String nameCourse) {
        firstScreen.clickToCancelGoogleLogin();
        firstScreen.clickToText("Sign Up Later");
        secondScreen.clickToText("Search");
        searchScreen.inputSearchWithValue(nameCourse);
        searchScreen.clickToText(nameCourse);
        searchScreen.clickToCourse(nameCourse);

        }
}
