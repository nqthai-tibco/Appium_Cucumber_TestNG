import io.cucumber.java.en.And;
import screens.FirstScreen;
import utilities.ThreadLocalDriver;

public class FirstSteps {
    FirstScreen firstScreen = new FirstScreen(ThreadLocalDriver.getTLDriver());

}
