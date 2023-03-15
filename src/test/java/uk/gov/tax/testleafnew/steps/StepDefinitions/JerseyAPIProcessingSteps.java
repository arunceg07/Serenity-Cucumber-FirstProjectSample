package uk.gov.tax.testleafnew.steps.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import uk.gov.tax.testleafnew.pages.JerseyAPIProcessingPage;

public class JerseyAPIProcessingSteps {
    JerseyAPIProcessingPage JerseyAPIProcessingPage = new JerseyAPIProcessingPage();

    @Given("^User launch the API and verifies the GET method for Jersey API$")
    public void user_launch_the_API_and_verifies_the_GET_method_for_Jersey_API() {
        // Write code here that turns the phrase above into concrete actions
        JerseyAPIProcessingPage.regResinGetRequest();
    }
    @Given("^User launch the API and verifies the POST method for Jersey API$")
    public void user_launch_the_API_and_verifies_the_POST_method_for_Jersey_API() {
        // Write code here that turns the phrase above into concrete actions
        JerseyAPIProcessingPage.regResinPostRequest();
    }

    @And("^User launch the API and verifies the update values in input file and POST method for Jersey API$")
    public void user_launch_the_API_and_verifies_the_update_values_in_input_file_and_POST_method_for_Jersey_API() {
        // Write code here that turns the phrase above into concrete actions
        JerseyAPIProcessingPage.regResinUpdatePostRequest();
    }

}
