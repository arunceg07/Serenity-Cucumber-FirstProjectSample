package uk.gov.tax.testleafnew.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import uk.gov.tax.testleafnew.framework.TestLeafComonFunctions;

public class CareersPage extends PageObject {


    TestLeafComonFunctions testLeafComonFunctions;
    WindowsFunctions windowsFunctions;

    @FindBy(xpath="//*[@title='Careers']")
    WebElementFacade RSM_CareersNavigation;
    @FindBy(xpath="//*[text()='Upload Resume/CV']")
    WebElementFacade RSM_resumeButton;
    @FindBy(xpath="//*[contains(text(),'Find a job that counts')]//following::input[1]")
    WebElementFacade RSM_jobSearchInputButton;
    @FindBy(xpath="//*[text()=' Search']")
    WebElementFacade RSM_jobSearchButton;
    @FindBy(xpath="(//*[normalize-space()='Allow'])[1]")
    WebElementFacade RSM_allowPopup;



    public void rsm_Careers(){
        testLeafComonFunctions.javaWait(5000);
        testLeafComonFunctions.javaScriptClick(getDriver(),RSM_CareersNavigation);
        testLeafComonFunctions.javaWait(5000);
//        testLeafComonFunctions.javaScriptClick(getDriver(),RSM_allowPopup);
        testLeafComonFunctions.seleniumClick(RSM_allowPopup);
//        RSM_allowPopup.click();
//        RSM_CareersNavigation.waitUntilClickable();
        testLeafComonFunctions.javaWait(5000);
        RSM_jobSearchInputButton.waitUntilEnabled();
        RSM_jobSearchInputButton.click();
        RSM_jobSearchInputButton.sendKeys("supervisor");
        RSM_jobSearchButton.waitUntilClickable();
        RSM_jobSearchButton.click();
        testLeafComonFunctions.javaWait(9000);
        WebElementFacade jobTitleFirstInstance = $(By.xpath("(//span[text()='Audit Supervisor' ]) [1]"));
//        jobTitleFirstInstance.click();

        testLeafComonFunctions.javaScriptClick(getDriver(),jobTitleFirstInstance);
//        WebElementFacade applyNow = $(By.xpath("(//a[normalize-space()='Apply Now'])[1]"));
//        applyNow.waitUntilClickable();
//        applyNow.click();
//        testLeafComonFunctions.javaScriptClick(getDriver(),applyNow);
        testLeafComonFunctions.javaWait(9000);
        RSM_resumeButton.waitUntilClickable();
        RSM_resumeButton.click();
//        testLeafComonFunctions.javaScriptClick(getDriver(),RSM_resumeButton);
        testLeafComonFunctions.javaWait(5000);
        windowsFunctions.windowsFileuploadRobot();
        testLeafComonFunctions.javascriptScroller("200");
        testLeafComonFunctions.javaWait(9000);
    }
}
