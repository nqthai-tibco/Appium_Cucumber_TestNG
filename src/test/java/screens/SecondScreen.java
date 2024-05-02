package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SecondScreen extends BaseScreen {
    public SecondScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickToText(String text) {
        waitAndClick(By.xpath("//*[@text='"+text+"']"));
    }
}
