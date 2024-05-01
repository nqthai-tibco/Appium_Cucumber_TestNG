package cucumber.tests;

import io.appium.java_client.android.AndroidDriver;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utilities.DesiredCapabilitiesUtil;
import utilities.ThreadLocalDriver;

public class BaseTest {
    private final DesiredCapabilitiesUtil desiredCapabilitiesUtil = new DesiredCapabilitiesUtil();

//    @BeforeMethod
//    @Parameters({ "udid" })
    public void setup(String udid,String port, String appPackage,String appActivity) throws IOException {
        DesiredCapabilities caps = desiredCapabilitiesUtil.getDesiredCapabilities(udid,appPackage,appActivity);
        ThreadLocalDriver.setTLDriver(new AndroidDriver<>(new URL("http://127.0.0.1:"+port+"/wd/hub"), caps));

    }

//    @AfterMethod
    public synchronized void teardown() {
        ThreadLocalDriver.getTLDriver().quit();
    }
}
