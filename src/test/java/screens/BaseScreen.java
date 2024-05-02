package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseScreen {
    public AndroidDriver<MobileElement> driver;
    public WebDriverWait                wait;

    public BaseScreen(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void waitAndClick(By by) { wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click(); }

    public void click(By by) {
        driver.findElement(by).click();
    }

    public void hideKeyboard() { driver.navigate().back(); }

    public List<MobileElement> waitAndFindElements(By by) {
        return driver.findElements(by);
    }

    public WebElement waitAndFindElement(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public String getText(By by) {
        return waitAndFindElement(by).getText();
    }

    public void sendKey(By by, String text) {
        waitAndFindElement(by).sendKeys(text);
    }
}
