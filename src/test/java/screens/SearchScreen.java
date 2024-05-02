package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SearchScreen extends BaseScreen{
    public SearchScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void inputSearchWithValue(String nameCourse) {
        sendKey(By.xpath("//*[@class='android.widget.EditText']"),nameCourse);

    }

    public void clickToText(String text) {
        waitAndClick(By.xpath("//android.view.View[contains(@content-desc,'"+text.toLowerCase()+"')]"));
    }

    public void clickToCourse(String nameCourse) {
        waitAndClick(By.xpath("//android.widget.TextView[@text='"+nameCourse+"']"));
    }

    public void clickToTextContains(String article) {
        waitAndClick(By.xpath("//*[contains(text(),'"+article+"')]"));

    }
}
