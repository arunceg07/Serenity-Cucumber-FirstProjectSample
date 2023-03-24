package uk.gov.tax.testleafnew.steps.StepDefinitions;

import cucumber.api.java.en.Given;
import uk.gov.tax.testleafnew.pages.CareersPage;

public class CareerPageStepDefinitions {

    CareersPage careersPage;

    @Given("^User navigates to careerpage from HomePage$")
    public void user_navigates_to_careerpage_from_HomePage() {
        // Write code here that turns the phrase above into concrete actions
        careersPage.rsm_Careers();
    }

}
