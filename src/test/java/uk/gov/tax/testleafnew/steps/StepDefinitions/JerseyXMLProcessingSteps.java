package uk.gov.tax.testleafnew.steps.StepDefinitions;

import cucumber.api.java.en.Given;
import uk.gov.tax.testleafnew.pages.JerseyXMLProcessingPage;

public class JerseyXMLProcessingSteps {
    JerseyXMLProcessingPage jerseyXMLProcessingPage = new JerseyXMLProcessingPage();
    @Given("^User launch the XML through jersey and verifies the update values in input file and POST method for Jersey API$")
    public void user_launch_the_XML_through_jersey_and_verifies_the_update_values_in_input_file_and_POST_method_for_Jersey_API() {
        // Write code here that turns the phrase above into concrete actions
        jerseyXMLProcessingPage.regResinUpdatePostRequest();
    }
}
