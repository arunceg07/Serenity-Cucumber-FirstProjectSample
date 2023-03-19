package uk.gov.tax.testleafnew.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import uk.gov.tax.testleafnew.pages.BulkOperationsPage;

import java.util.List;
import java.util.Map;

public class BulkFilesStepDefinitions {
    BulkOperationsPage bulkOperationsPage;

    @Then("^the user selects small file to import and verify the candidate document section$")
    public void the_user_selects_small_file_to_import_and_verify_the_candidate_document_section(DataTable dt) {
        // Write code here that turns the phrase above into concrete actions
        BulkOperationsPage.documentTitleForBulkUpdate.clear();
        List<Map<String, String>> data = dt.asMaps(String.class, String.class);
        for (int i =0; i< data.size(); i++){
            bulkOperationsPage.ingestDocument(Integer.parseInt(data.get(i).get("noofFiles")), data.get(i).get("fileName"), false);
        }

    }
}
