package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class InformationCoursesScreen extends BaseScreen{
    public InformationCoursesScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void verifyCourserFullName(String fullName) {
        waitAndFindElement(By.xpath("//*[@text='"+fullName+"']"));
    }
}
