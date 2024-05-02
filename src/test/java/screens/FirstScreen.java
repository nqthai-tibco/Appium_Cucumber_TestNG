package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class FirstScreen extends BaseScreen{
    By buttonCancelGoogleLogin = By.xpath("//android.widget.ImageView[@content-desc='Cancel']");
    public FirstScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickToCancelGoogleLogin() {
        if(waitAndFindElements(buttonCancelGoogleLogin).size()!=0) {
            waitAndClick(buttonCancelGoogleLogin);
        }
    }

    public void clickToText(String text) {
        waitAndClick(By.xpath("//*[@text='"+text+"']"));
    }

    public void clickButtonSearch() {
        waitAndClick(By.xpath("//*[@class='btn_control_menu']//*[@class='ic ic-home']"));
    }

    public void inputSearchWithValue(String article) {
        waitAndFindElement(By.xpath("//*[@id='auto_search_textbox']")).sendKeys(article);

    }

    public void clickButtonSearchWeb() {
        waitAndFindElement(By.xpath("//*[@od='auto_search_button']")).click();
    }
}
