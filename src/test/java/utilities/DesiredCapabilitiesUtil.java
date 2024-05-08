package utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesUtil {
    public DesiredCapabilities getDesCapBrowser(String udid) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("udid", udid);
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("browserName", "Chrome");
//        desiredCapabilities.setCapability("chromedriverExecutable",System.getProperty("user.dir")+"\\src\\driver\\chromedriver124.exe");
        return desiredCapabilities;
    }


    public DesiredCapabilities getDesCapAppCours(String emulator) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("udid", emulator);
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "org.coursera.android");
        desiredCapabilities.setCapability("appActivity", "org.coursera.android.MainActivity");
        desiredCapabilities.setCapability("skipUnlock", "true");
        desiredCapabilities.setCapability("noReset", "false");
        return desiredCapabilities;

    }
}
