package uk.gov.tax.testleafnew.steps.DBStepDefinitions;

import cucumber.api.java.en.Given;
import uk.gov.tax.testleafnew.framework.TestLeafDBTest;

public class TestLeafDBTestSteps {
    TestLeafDBTest testLeafDBTest = new TestLeafDBTest();

    @Given("^User launch the jdbc DB connection and display the results$")
    public void user_launch_the_jdbc_DB_connection_and_display_the_results() {
        // Write code here that turns the phrase above into concrete actions
        testLeafDBTest.DBFirstTest();
    }

}
