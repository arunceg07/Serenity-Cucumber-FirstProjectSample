package uk.gov.tax.testrsmnew.steps.StepDefinitions;


import cucumber.api.java.en.Given;
import uk.gov.tax.testrsmnew.pages.TestLeafTablePage;

public class TestLeafTablePageSteps {
    TestLeafTablePage TestLeafTablePage;
    @Given("^User navigates to Table Page$")
    public void user_navigates_to_Table_Page() {
        // Write code here that turns the phrase above into concrete actions
        TestLeafTablePage.TL_tableChecks();
    }

}
