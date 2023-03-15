package uk.gov.tax.testleafnew.steps.StepDefinitions;

import cucumber.api.java.en.Given;
import uk.gov.tax.testleafnew.pages.RESTASSUREDAPIProcessingPage;

public class RESTASSUREDAPIProcessingSteps {
    RESTASSUREDAPIProcessingPage RESTASSUREDAPIProcessingPage = new RESTASSUREDAPIProcessingPage();
    @Given("^User launch the API and verifies the GET method$")
    public void user_launch_the_API_and_verifies_the_GET_method() {
        // Write code here that turns the phrase above into concrete actions
        RESTASSUREDAPIProcessingPage.regResinGetRequest();
    }

    @Given("^User launch the API and verifies the BDD GET method$")
    public void user_launch_the_API_and_verifies_the_BDD_GET_method() {
        // Write code here that turns the phrase above into concrete actions
        RESTASSUREDAPIProcessingPage.regResinBDDGetRequest();
    }

}
