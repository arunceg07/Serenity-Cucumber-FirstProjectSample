package uk.gov.tax.testleafnew.steps.StepDefinitions;

import cucumber.api.java.en.Given;
import uk.gov.tax.testleafnew.pages.SerenityReportPage;

public class SerenityReportSteps {

    SerenityReportPage serenityReportPage = new SerenityReportPage();
    @Given("^User generates maven aggregate report for Serenity Framework$")
    public void user_generates_maven_aggregate_report_for_Serenity_Framework() {
        // Write code here that turns the phrase above into concrete actions
        serenityReportPage.windowsMavenCmdforSerenityReport();
    }

}
