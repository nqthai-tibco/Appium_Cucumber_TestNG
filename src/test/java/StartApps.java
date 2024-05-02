import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.DesiredCapabilitiesUtil;
import utilities.ThreadLocalDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class StartApps {
    @Given("I start app Courses on devices {string}")
    public void iStartAppCoursesOnDevices(String emulator) throws MalformedURLException {
        DesiredCapabilitiesUtil desiredCapabilitiesUtil = new DesiredCapabilitiesUtil();
        DesiredCapabilities capabilities=desiredCapabilitiesUtil.getDesCapAppCours(emulator);
        ThreadLocalDriver.setTLDriver(new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities));
    }



}
