package uk.gov.tax.testrsmnew.testrunner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.Runner;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "uk.gov.tax.testrsmnew.steps.StepDefinitions",
        features = "src/test/resources/features",tags="@RegressionRSM"
)

public class TestSerRunnerSuite {

}
