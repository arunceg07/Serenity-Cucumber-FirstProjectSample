package uk.gov.tax.testleafnew;

import net.thucydides.core.webdriver.SupportedWebDriver;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class ChromeGridwithExtension {

    public void instantiateDriver()  {
        WebDriver webDriver;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        HashMap<String, String> prefs = new HashMap<>();
        prefs.put("intl.accept_languages","en-gb");
        options.setExperimentalOption("prefs",prefs);
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

        try {
            webDriver = new RemoteWebDriver(new URL("http://10.179.16.14.3333/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}