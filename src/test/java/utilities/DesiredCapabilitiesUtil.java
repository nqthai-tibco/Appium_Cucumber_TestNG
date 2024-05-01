package utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesUtil {
    public DesiredCapabilities getDesiredCapabilities(String udid, String appPackage,String appActivity) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("udid", udid);
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", appPackage);
        desiredCapabilities.setCapability("appActivity", appActivity);
        desiredCapabilities.setCapability("skipUnlock", "true");
        desiredCapabilities.setCapability("noReset", "false");
        return desiredCapabilities;
    }
    public DesiredCapabilities getDesiredCapabilities2(String udid) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("udid", udid);
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "fr.playsoft.vnexpress");
        desiredCapabilities.setCapability("appActivity", "fr.playsoft.vnexpress.ActivityMain");
        desiredCapabilities.setCapability("skipUnlock", "true");
        desiredCapabilities.setCapability("noReset", "false");
        return desiredCapabilities;
    }
}
