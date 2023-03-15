package uk.gov.tax.testleafnew.steps.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import uk.gov.tax.testleafnew.pages.TestLeafTextBoxPage;
public class TestLeafTextBoxSteps {
    TestLeafTextBoxPage TestLeafTextBoxPage;

    @Given("^User verifies the TextBox Functions of TestLeaf Portal$")
    public void user_verifies_the_TextBox_Functions_of_TestLeaf_Portal() {
        // Write code here that turns the phrase above into concrete actions
        TestLeafTextBoxPage.TLTextBoxChecks();
        System.out.println("User logs in to TestLeaf Portal successfully");
    }

    @Then("^User verifies the Calendar in the TextBox Page$")
    public void user_verifies_the_Calendar_in_the_TextBox_Page() {
        // Write code here that turns the phrase above into concrete actions
        TestLeafTextBoxPage.TLTextBoxCalendar();
    }
}
