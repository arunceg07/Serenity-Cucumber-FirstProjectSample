package uk.gov.tax.testleafnew.pages;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import uk.gov.tax.testleafnew.framework.TestLeafComonFunctions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;


public class TestLeafTextBoxPage extends PageObject {
    TestLeafComonFunctions TestLeafComonFunctions;

    @FindBy(xpath="//span[text()='Element']//ancestor::li[@class='ui-menuitem-submenu']")
    WebElementFacade TL_menu;
    @FindBy(xpath="//span[text()='Text Box']")
    WebElementFacade TL_textBoxPage;
    @FindBy(xpath="//h5[text()='Type your name']//following::input[1]")
    WebElementFacade TL_typeurname;
    @FindBy(xpath="//h5[text()='Append Country to this City.']//following::input[1]")
    WebElementFacade TL_city;
    @FindBy(xpath="//h5[text()='Verify if text box is disabled']//following::input[1]")
    WebElementFacade TL_disableTextBox;
    @FindBy(xpath="(//*[@class='ql-italic'])[1]")
    WebElementFacade TL_TextEditorItalic;
    @FindBy(xpath="(//div[@class='ql-container ql-snow'])[1]")
    WebElementFacade TL_TextEditormessage;
    @FindBy(xpath="//h5[text()='Text Editor']")
    WebElementFacade TL_TextEditorlabel;

    @FindBy(xpath="(//div[@class='ui-editor-toolbar ql-toolbar ql-snow']//following::*[name()='svg'])[1]")
    WebElementFacade TL_TextEditorFontSize;

    @FindBy(xpath="(//div[@class='ui-editor-toolbar ql-toolbar ql-snow']//following::*[name()='svg'])[1]//following::*[@data-value='huge'][1]")
    WebElementFacade TL_TextEditorFontSizeVal;
    @FindBy(xpath="//button[@aria-label='Show Options']")
    WebElementFacade TL_dropDown;

    @FindBy(xpath="//*[@role='listbox']//following::li")
    WebElementFacade TL_dropDownlist;

    @FindBy(xpath="//button[@aria-label='Show Calendar']")
    WebElementFacade TL_calendarIcon;

    @FindBy(xpath="//a[@class='ui-datepicker-next ui-corner-all']")
    WebElementFacade TL_calendarNextButton;

    @FindBy(xpath="//h5[text()='Type your DOB (mm/dd/yyyy) and confirm date chosen ']//following::input[1]")
    WebElementFacade TL_calendarDateTextBox;

    public void TLTextBoxChecks() {
        TL_menu.isPresent();
        TestLeafComonFunctions.javascriptHighligther(TL_menu);
        TL_menu.isVisible();
        TL_menu.click();
        TL_textBoxPage.isPresent();
        TL_textBoxPage.click();
        TestLeafComonFunctions.javaWait(4000);
        TL_typeurname.isPresent();
        TL_typeurname.sendKeys("Arun Kumar Devarajan");
        TL_city.clear();
        TL_city.sendKeys("Coimbatore");
        Assert.assertTrue(TL_disableTextBox.isDisabled());
        TestLeafComonFunctions.javascriptScroller("1000");
        TestLeafComonFunctions.javaWait(2000);
        TestLeafComonFunctions.javascriptHighligther(TL_TextEditorlabel);
        System.out.println("Test1");
        TestLeafComonFunctions.seleniumActions(TL_TextEditorFontSize);
        TestLeafComonFunctions.javaWait(2000);
        TestLeafComonFunctions.seleniumActions(TL_TextEditorFontSizeVal);
        TestLeafComonFunctions.javaWait(2000);
        TestLeafComonFunctions.seleniumActions(TL_TextEditorItalic);
        TestLeafComonFunctions.javaWait(2000);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(TL_TextEditormessage).click().sendKeys("Arun Kumar Devarajan in Huge and Italics");
        actions.release().perform();
        TestLeafComonFunctions.javaWait(2000);
        TestLeafComonFunctions.seleniumActions(TL_dropDown);
        TestLeafComonFunctions.javaWait(5000);
//        TestLeafComonFunctions.seleniumSelectbyString(TL_dropDownlist);
        List<WebElement> roleList = getDriver().findElements(By.xpath("//*[@role='listbox']//following::li"));
        for (WebElement role:roleList) {
            role.getText();
            System.out.println("role.getText()-->"+role.getText());
            if(role.getText().equalsIgnoreCase("3")){
                role.click();
            }
        }
//        TL_dropDown.click();
//        TL_dropDown.send
        TestLeafComonFunctions.javaWait(4000);
//        TL_dropDown.sendKeys(Keys.ENTER);
//        TestLeafComonFunctions.javaWait(2000);
    }

    public void TLTextBoxCalendar(){

            TL_calendarIcon.isEnabled();
            TL_calendarIcon.click();
            TestLeafComonFunctions.javaWait(5000);
//            WebElement E1 = getDriver().findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']//following::span[1]"));
//            WebElement E2 = getDriver().findElement(By.xpath("//a[@class=' ui-state-default' and text()='10']"));
            String month;
            for (int i=0; i<12; i++){
                WebElement E1 = getDriver().findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']//following::span[1]"));
                WebElement E2 = getDriver().findElement(By.xpath("//a[@class=' ui-state-default' and text()='10']"));
//                TestLeafComonFunctions.javaWait(2000);
                 month = E1.getText();
                System.out.println("month:-->"+i+E1.getText());
                if (month.equalsIgnoreCase("May")){
                    E2.click();
//                    TestLeafComonFunctions.javaWait(2000);
                    break;
                }
                TL_calendarNextButton.click();
            }
//            TestLeafComonFunctions.javaWait(5000);
            System.out.println("Calendar Confirmation-->"+TL_calendarDateTextBox.getText());

    }
}
