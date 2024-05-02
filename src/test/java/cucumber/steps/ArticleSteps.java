package cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class ArticleSteps {
    @Then("I verify article include information as table below")
    public void iVerifyArticleIncludeInformationAsTableBelow(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps();
        for(Map row :rows)
        {
            System.out.println(row.get(""));
        }

    }
}
