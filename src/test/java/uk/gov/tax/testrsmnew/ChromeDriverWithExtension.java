package uk.gov.tax.testrsmnew;


//import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverWithExtension implements DriverSource {
    @Override
    public WebDriver newDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized","disable-popup-blocking");
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        capabilities.setCapability(ChromeOptions.CAPABILITY, true);
        return new ChromeDriver(options);
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
