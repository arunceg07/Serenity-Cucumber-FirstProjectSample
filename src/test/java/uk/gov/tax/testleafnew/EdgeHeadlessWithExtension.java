package uk.gov.tax.testleafnew;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EdgeHeadlessWithExtension implements DriverSource {
    @Override
    public WebDriver newDriver() {
        EdgeOptions edgeOptions = new EdgeOptions();
       List<String> args = Arrays.asList("disable-infobars", "headless","disable-gpu","window-size=1920,1080", "--lang=en-GB","disable-infobars","ignore-certificate-errors", "allow-insecure-localhost", "aggressive-cache-discard","disable-cache", "disable-application-cache", "disable-offline-load-stale-cache", "disk-cache-size=0", "silent", "disable-browser-side-navigation");
        Map<String, Object> map = new HashMap<>();
        map.put("args", args);
        edgeOptions.setCapability("ms:edgeOptions", map);

        EdgeDriver edgeDriver = null;
        boolean driverstarted = false;

        if(!driverstarted){
            System.setProperty("webdriver.edge.driver","C:\\Users\\Arun Kumar Devarajan\\IdeaProjects\\Serenity-Cucumber-FirstVersion\\msedgedriver.exe");
            edgeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            edgeOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//            edgeDriver = new EdgeDriver(edgeOptions);
            driverstarted = true;
        }

        return new EdgeDriver(edgeOptions);
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
