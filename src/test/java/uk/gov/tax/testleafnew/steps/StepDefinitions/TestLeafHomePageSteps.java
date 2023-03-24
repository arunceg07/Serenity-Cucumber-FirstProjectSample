package uk.gov.tax.testleafnew.steps.StepDefinitions;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.And;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import uk.gov.tax.testleafnew.pages.TestLeafHomePage;

import static net.serenitybdd.core.pages.PageObject.withParameters;

public class TestLeafHomePageSteps {

    TestLeafHomePage TestLeafHomePage;

    @Given("^User launch the TestLeaf Portal$")
    public void user_launch_the_TestLeaf_Portal() {
        // Write code here that turns the phrase above into concrete actions
        TestLeafHomePage.open("contentURL",withParameters(""));
        System.out.println("homePage.open()--> This Lanuches the ChromeDriver and Website");
    }

    @Given("^User verifies the HomePage of TestLeaf Portal$")
    public void user_verifies_the_HomePage_of_TestLeaf_Portal() {
        // Write code here that turns the phrase above into concrete actions
        TestLeafHomePage.TestLeafLoginSuccess();
        System.out.println("User logs in to TestLeaf Portal successfully");
    }


}
