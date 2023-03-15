package uk.gov.tax.testleafnew.pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import uk.gov.tax.testleafnew.framework.TestLeafComonFunctions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


@NamedUrls({
        @NamedUrl(name="contentURL",url="/?")
})
public class TestLeafHomePage extends PageObject {
    TestLeafComonFunctions TestLeafComonFunctions;
    @FindBy(xpath="//a[@class='logo']")
    WebElementFacade TL_logo;


    public void TestLeafLoginSuccess() {
        TL_logo.isPresent();
        TestLeafComonFunctions.javascriptHighligther(TL_logo);
        System.out.println("TestLeafLoginSuccess -->");
    }
}
