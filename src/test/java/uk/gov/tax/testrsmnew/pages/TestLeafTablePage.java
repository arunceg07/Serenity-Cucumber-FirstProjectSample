package uk.gov.tax.testrsmnew.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import uk.gov.tax.testrsmnew.framework.TestLeafComonFunctions;

import java.util.List;

public class TestLeafTablePage extends PageObject {
    TestLeafComonFunctions TestLeafComonFunctions = new TestLeafComonFunctions();
    @FindBy(xpath = "(//span[text()='Table'])[1]//preceding-sibling::*")
    WebElementFacade TL_tableIcon;
    @FindBy(xpath = "(//span[text()='Table'])[2]")
    WebElementFacade TL_tablePage;

    public void TL_tableChecks() {

        int m;

        TestLeafComonFunctions.javaWait(2000);
        TL_tableIcon.click();
        TestLeafComonFunctions.javaWait(2000);
        TL_tablePage.click();
        TestLeafComonFunctions.javaWait(9000);

//        String docTitlePath = "table>tbody>tr>td:nth-child(1)";
//        List<WebElementFacade> docTitlePathList = $$(By.cssSelector(docTitlePath));
//
//        String docCountryPath = "table>tbody>tr>td:nth-child(2)";
//        List<WebElementFacade> docCountryPathList = $$(By.cssSelector(docCountryPath));
//
//        String docRepresntativePath = "table>tbody>tr>td:nth-child(3)";
//        List<WebElementFacade> docRepresntativePathList = $$(By.cssSelector(docRepresntativePath));
//
//        String docJoinDatePath = "table>tbody>tr>td:nth-child(4)";
//        List<WebElementFacade> docJoinDatePathList = $$(By.cssSelector(docJoinDatePath));
//
//        String docStatusPath = "table>tbody>tr>td:nth-child(5)";
//        List<WebElementFacade> docStatusPathList = $$(By.cssSelector(docStatusPath));

//        for (int i = 0; i <= docTitlePathList.size() - 1; i++) {
//            System.out.println("docTitlePathList.get(i).getText()-->" + i + docTitlePathList.get(i).getText());
//
//        }
        List<WebElementFacade> noofpages = $$(By.xpath("//span[@class='ui-paginator-pages']//child::a"));
        for (int i = 0; i <= noofpages.size() - 1; i++) {
            String docTitlePath = "table>tbody>tr>td:nth-child(1)";
            List<WebElementFacade> docTitlePathList = $$(By.cssSelector(docTitlePath));

            String docCountryPath = "table>tbody>tr>td:nth-child(2)";
            List<WebElementFacade> docCountryPathList = $$(By.cssSelector(docCountryPath));

            String docRepresntativePath = "table>tbody>tr>td:nth-child(3)";
            List<WebElementFacade> docRepresntativePathList = $$(By.cssSelector(docRepresntativePath));

            String docJoinDatePath = "table>tbody>tr>td:nth-child(4)";
            List<WebElementFacade> docJoinDatePathList = $$(By.cssSelector(docJoinDatePath));

            String docStatusPath = "table>tbody>tr>td:nth-child(5)";
            List<WebElementFacade> docStatusPathList = $$(By.cssSelector(docStatusPath));
            for (int j = 0; j <= docCountryPathList.size() - 1; j++) {
//                System.out.println("docTitlePathList.get(i).getText()-->" + j + docCountryPathList.get(j).getText());

                if (docCountryPathList.get(j).getText().equalsIgnoreCase("India")) {
                    System.out.println("Name: -->" + j + docTitlePathList.get(j).getText());
                    System.out.println("Country: -->" + j + docCountryPathList.get(j).getText());
                    System.out.println("Representative: -->" + j + docRepresntativePathList.get(j).getText());
                    System.out.println("Join Date: -->" + j + docJoinDatePathList.get(j).getText());
                    System.out.println("Status: -->" + j + docStatusPathList.get(j).getText());
                    break;
                }
            }
            $("//*[@aria-label='Next Page']").click();
            m = $$("//*[@class = 'ui-paginator-next ui-state-default ui-corner-all ui-state-disabled']").size();
            System.out.println("value of m pagination: -->" + m);
            if(m>0){
                break;
            }
        }

    }
}

