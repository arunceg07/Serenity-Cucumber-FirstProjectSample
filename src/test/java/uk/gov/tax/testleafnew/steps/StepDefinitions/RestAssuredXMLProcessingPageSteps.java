package uk.gov.tax.testleafnew.steps.StepDefinitions;

import cucumber.api.java.en.Given;
import org.apache.juneau.serializer.SerializeException;
import uk.gov.tax.testleafnew.pages.RestAssuredXMLProcessingPage;

import java.io.IOException;

public class RestAssuredXMLProcessingPageSteps {

    RestAssuredXMLProcessingPage restAssuredXMLProcessingPage = new RestAssuredXMLProcessingPage();

    @Given("^User launch the XML through REST Service and verifies the BDD POST method$")
    public void user_launch_the_XML_through_REST_Service_and_verifies_the_BDD_POST_method() throws SerializeException, IOException {
        // Write code here that turns the phrase above into concrete actions
        restAssuredXMLProcessingPage.BDDPostXMLRequest();
    }

    @Given("^User launch the document builder generated XML through REST Service and verifies the BDD POST method$")
    public void user_launch_the_document_builder_generated_XML_through_REST_Service_and_verifies_the_BDD_POST_method() {
        // Write code here that turns the phrase above into concrete actions
        restAssuredXMLProcessingPage.RESTASSUREDDocBuildUpdatePostRequest();
    }
}
