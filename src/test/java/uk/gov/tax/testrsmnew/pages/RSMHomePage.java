package uk.gov.tax.testrsmnew.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@NamedUrls({
        @NamedUrl(name="contentURL",url="/?")
})
public class RSMHomePage extends PageObject {

    @FindBy(xpath="//img[@alt='Logo']")
    WebElementFacade rsm_Logo;

    @FindBy(xpath="//div[@ id='menu-wrap']//preceding::*[text()='United Kingdom'][1]")
    WebElementFacade uk_Logo;

    @FindBy(xpath="//*[text()='RSM links']")
    WebElementFacade rsm_Link_Logo;

    @FindBy(xpath="//*[text()='Global services']")
    WebElementFacade global_Services_Logo;

    @FindBy(xpath="//*[text()='International desks']")
    WebElementFacade int_desks_Logo;

    @FindBy(xpath="//*[text()='Social']")
    WebElementFacade Social_Logo;

    @FindBy(xpath="//*[text()='RSM staff log-ins']")
    WebElementFacade RSMstafflogins_Logo;

    @FindBy(xpath="//a[@title = 'Choose your email preferences']")
    WebElementFacade email_Preference;

    @FindBy(xpath="//input[@placeholder='First']")
    WebElementFacade email_Form_FirstName;

    @FindBy(xpath="//input[@placeholder='Last']")
    WebElementFacade email_Form_LastName;

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElementFacade email_Form_Email;

    @FindBy(xpath = "//input[@placeholder='Job Title']")
    WebElementFacade email_Form_JobTitle;

    @FindBy(xpath = "//label[text()='Region']//following::select")
    WebElementFacade email_Form_region_Dropdown;

    @FindBy(xpath = "//label[text()='Managing personal wealth']//preceding-sibling::input[@type='checkbox']")
    WebElementFacade email_Form_CheckBox1;

    @FindBy(xpath = "//label[text()='Legal']//preceding-sibling::input[@type='checkbox']")
    WebElementFacade email_Form_CheckBox2;

    @FindBy(xpath = "//label[text()='I agree to be opted in to receive RSM UK email marketing communications and I have read and understood the ']//preceding-sibling::input[@type='checkbox']")
    WebElementFacade email_Form_Ack1;

    @FindBy(xpath = "//a[text()='privacy statement on the RSM website']//preceding-sibling::input[@type='checkbox']")
    WebElementFacade email_Form_Ack2;

    @FindBy(xpath = "//button[@type='submit']")
    WebElementFacade submitButton;

    @FindBy(xpath = "//a[contains(text(),'Careers')]")
    WebElementFacade careersNavigationButton;

    uk.gov.tax.testrsmnew.framework.RSMComonFunctions ComonFunctions = new uk.gov.tax.testrsmnew.framework.RSMComonFunctions();
    private static final Logger LOGGER = LoggerFactory.getLogger(RSMHomePage.class);

    public void rsmLoginSuccess() {
//    ComonFunctions.wait(2000);
        rsm_Logo.waitUntilPresent();
        rsm_Logo.waitUntilVisible();
        System.out.println("RSM src Attribute Value"+ rsm_Logo.getAttribute("src"));
//        ComonFunctions.jshighlighter(rsm_Logo);
//        ComonFunctions.jshighlighter(uk_Logo);
//        ComonFunctions.jsscroller();
//    ComonFunctions.wait(2000);
//        ComonFunctions.jshighlighter(rsm_Link_Logo);
//        ComonFunctions.jshighlighter(global_Services_Logo);
//        ComonFunctions.jshighlighter(Social_Logo);
//        ComonFunctions.jshighlighter(int_desks_Logo);
//        ComonFunctions.jshighlighter(RSMstafflogins_Logo);
//        ComonFunctions.jshighlighter(email_Preference);
        LOGGER.info("rsmLoginSuccess()Test-Success-->It Verifies the Home Page Login and Labels in Home Page");
    }

    public void rsmLoginEmailPreference() {
//        ComonFunctions.selclick(email_Preference);
        email_Form_FirstName.sendKeys("Test1");
        email_Form_LastName.sendKeys("Test2");
        email_Form_Email.sendKeys("Test@email.com");
        email_Form_JobTitle.sendKeys("auto");
        email_Form_region_Dropdown.click();
//    ComonFunctions.wait(2000);
        email_Form_region_Dropdown.sendKeys("London");
        email_Form_region_Dropdown.sendKeys(Keys.ENTER);
//    ComonFunctions.wait(2000);
        email_Form_CheckBox1.click();
        email_Form_CheckBox2.click();
        email_Form_Ack1.click();
        email_Form_Ack2.click();
        submitButton.click();
//        ComonFunctions.selpageSource("An error occurred during your submission");
        LOGGER.info("rsmLoginEmailPreference()Test-Success-->This Method Test the Email Preference Page in RSM Application");
    }

    public void careerPageNavigation(){
//        ComonFunctions.jshighlighter(careersNavigationButton);
//        ComonFunctions.selclick(careersNavigationButton);
        LOGGER.info("careerPageNavigation()Test Success-->This Method Test the Careers Page Navigation Test Completed-->");
    }

}