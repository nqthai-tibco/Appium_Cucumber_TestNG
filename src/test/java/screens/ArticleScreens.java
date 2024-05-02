package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ArticleScreens extends BaseScreen {
    public ArticleScreens(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void verifyInformation(String nameArticle, String descriptions, String nameAugh) {
    }
}
