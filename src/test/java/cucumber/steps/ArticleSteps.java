package cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import screens.ArticleScreens;
import utilities.ThreadLocalDriver;

import java.util.List;
import java.util.Map;

public class ArticleSteps {
    ArticleScreens articleScreens = new ArticleScreens(ThreadLocalDriver.getTLDriver());
    @Then("I verify article include information as table below")
    public void iVerifyArticleIncludeInformationAsTableBelow(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps();
        for(Map row :rows) {
            String nameArticle = (String) row.get("Name article");
            String descriptions = (String) row.get("Description");
            String nameAugh = (String) row.get("Name Aught");
            articleScreens.verifyInformation(nameArticle,descriptions,nameAugh);
        }
    }
}
