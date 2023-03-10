package uk.gov.tax.testrsmnew.steps.StepDefinitions;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import uk.gov.tax.testrsmnew.pages.RSMHomePage;

import static net.serenitybdd.core.pages.PageObject.withParameters;

public class MyStepdefs {

    RSMHomePage homePage;

        @Given("^User logs in to RSM UK Portal$")
    public void user_logs_in_to_RSM_UK_Portal() {
        homePage.open("contentURL",withParameters(""));
        System.out.println("homePage.open()--> This Lanuches the ChromeDriver and Website");
    }

    @Given("^User verifies the RSM Home Page Details$")
    public void user_veifies_the_RSM_Home_Page_Details() {
        // Write code here that turns the phrase above into concrete actions

            System.out.println("Hello world!");
        homePage.rsmLoginSuccess();
    }

    @And("^User verifies the RSM email preference page details$")
    public void user_verifies_the_RSM_email_preference_page_details() {
        // Write code here that turns the phrase above into concrete actions
        homePage.rsmLoginEmailPreference();
    }

    @Given("^User navigates to career page from home page$")
    public void user_navigates_to_career_page_from_home_page() {
        homePage.careerPageNavigation();
    }

    @Given("User logs in to RSMNew UK Portal")
    public void user_logs_in_to_rsm_new_uk_portal() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^User verifies the print statement$")
    public void userVerifiesThePrintStatement() {
        System.out.println("Print statement Test for linking feature to step definition");
    }
}
