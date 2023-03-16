package uk.gov.tax.testleafnew.steps.StepDefinitions;

import cucumber.api.java.en.Then;
import uk.gov.tax.testleafnew.pages.JersyAPITextProcessingPage;

public class JersyAPITextProcessingSteps {

    JersyAPITextProcessingPage jersyAPITextProcessingPage = new JersyAPITextProcessingPage();

    @Then("^the user drop the Text message through REST API$")
    public void the_user_drop_the_Text_message_through_REST_API() {
        // Write code here that turns the phrase above into concrete actions
        jersyAPITextProcessingPage.sampleTextPostRequest();
    }

}
