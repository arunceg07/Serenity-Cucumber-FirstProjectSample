package uk.gov.tax.testleafnew.testrunner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.Runner;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "uk.gov.tax.testleafnew.steps.StepDefinitions",
        features = "src/test/resources/features/RestAssuredXMLTesting.feature",tags="@RegressionXMLTest"
)

//@CucumberOptions(
//        glue = "uk.gov.tax.testleafnew.steps.StepDefinitions",
//        features = "src/test/resources/features/"
//)

public class TestSerRunnerSuite {

}
