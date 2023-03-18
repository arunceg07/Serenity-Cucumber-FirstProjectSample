package uk.gov.tax.testleafnew.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.gov.tax.testleafnew.framework.TestLeafComonFunctions;

import javax.mail.Folder;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.support.Color;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class WindowsFunctions extends PageObject {
    TestLeafComonFunctions TestLeafComonFunctions = new TestLeafComonFunctions();
    private static final Logger LOGGER = LoggerFactory.getLogger(WindowsFunctions.class);
    public static List FirstList = new ArrayList<Object>();
    public static List secondList = new ArrayList<Object>();

    /**
     * Method to Upload a File using Robot Class
     */

    public void windowsFileuploadRobot()  {
        String textFilePath = "C:\\Users\\Arun Kumar Devarajan\\IdeaProjects\\Serenity-Cucumber-FirstVersion\\src\\test\\resources\\testdata\\ingestionDocuments\\New_Text_Document.txt";
        String docFilePath  = "C:\\Users\\Arun Kumar Devarajan\\IdeaProjects\\Serenity-Cucumber-FirstVersion\\src\\test\\resources\\testdata\\ingestionDocuments\\file-sample_100kB.doc";
        String docxFilePath  = "C:\\Users\\Arun Kumar Devarajan\\IdeaProjects\\Serenity-Cucumber-FirstVersion\\src\\test\\resources\\testdata\\ingestionDocuments\\file-sample_100kB.docx";
        String XSLFilePath  = "C:\\Users\\Arun Kumar Devarajan\\IdeaProjects\\Serenity-Cucumber-FirstVersion\\src\\test\\resources\\testdata\\ingestionDocuments\\file_example_XLS_10.xls";
        String XSLxFilePath  = "C:\\Users\\Arun Kumar Devarajan\\IdeaProjects\\Serenity-Cucumber-FirstVersion\\src\\test\\resources\\testdata\\ingestionDocuments\\file_example_XLSX_100.xlsx";

        StringSelection stringSelection = new StringSelection(textFilePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        try {
            Robot robot = new Robot();
            TestLeafComonFunctions.javaWait(3000);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            TestLeafComonFunctions.javaWait(3000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method to find a postion of a coloumn in a webtable
     * @param columnName
     * @return
     */

    public int homePageColoumHeaderPosition(String columnName) {

//        CFDCTMTEST = new CFSDCTMTest();
        int position =0;
//        ArrayList<String> columns = new ArrayList<>();
//        for (int i=0; i< $$("//div[@class='x-column-header-text']//span").size(); i++){
//            if($$("//div[@role='columnheader']").get(i).getAttribute("aria-hidden").equals("false")) {
//                columns.add($$("//div[@role='columnheader']").get(i).gettext());
//            }
//            position = columns.indexOf(columnName);
//        }
//
        return position+1;
    }
    /**
     * Method to verify a Downloaded File (Multiple file names passed in input and verified, hashmap datatable and list conecpt) in a windows File path
     */
    public void windowsFileDownloadVerify(List<String> data){

       File folder = new File("C:\\Users\\Arun Kumar Devarajan\\Downloads");
       boolean found = false;
        File[] listofFiles = folder.listFiles();
        int noofFiles = listofFiles.length;
        for (File listofFile : listofFiles) {

            if (listofFile.isFile()){
                String fileName = listofFile.getName();
                for (int j=0; j<data.size(); j++){

                    if (fileName.contains(data.get(j))){
                        found = true;
                    }

                }
            }
        }

    }

    /**
     * Method to open the copied url in new window
     * @throws IOException
     * @throws UnsupportedFlavorException
     */
    public void opensCopiedUrlInNewWindow() throws IOException, UnsupportedFlavorException{
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String actualCopiedText = (String) clipboard.getData(DataFlavor.stringFlavor);
        System.out.println("url from Clipboard:"+ actualCopiedText);
//        dcmLoginPage.openUrl("http://10.179.24.230:8080/Casefow");
    }

    /**
     * Method to find a search document exist in the page, no result found xpath is key here
     * @param deleteFlag
     */
    public void checkdeleteddocumentfoundornot(boolean deleteFlag) {
//        String documentTitle = DataIngestionPage.newDocumentTitleValue;
//        CFSDCTMTest.wait(4000);
//        CFSDCTMTest.movetowebelement(getDriver(), navSearch);
//        navSearch.waituntilClickable();
//        CFSDCTMTest.javaScriptClick(getDriver(), navSearch);
//        CFSDCTMTest.wait(2000);
//        if(deleteFlag){
//            Assert.assertTrue($$("//div[text()='No results found.']]").isDisplayed());
//        }

        }

    /**
     * compare no of documents in source and destination
     * @param documentTitle
     * @throws Throwable
     */
    public void verifyViewVersionDestFiles(String documentTitle) throws Throwable {

//        setImplicitTimeout(20,SECONDS);
//        CFSDCTMTest.wait(2000);
        WebElementFacade fileNameValue = $(By.xpath("//font[text()='"+documentTitle+"']"));
        String viewVersionCol = "table>tbody>tr:nth-child(1)>td:nth-child(1)>div";
        List<WebElementFacade> viewVersionCollist = $$(By.cssSelector(viewVersionCol));
        fileNameValue.isDisplayed();

        Assert.assertTrue(fileNameValue.getText().trim().equalsIgnoreCase(documentTitle));
        //source Folder Documents
        for(int i=0; i< viewVersionCollist.size(); i++){

            secondList.add(viewVersionCollist.get(i).getText());

        }
       //Destination folder documents
        for(int i=0; i< viewVersionCollist.size(); i++){

            FirstList.add(viewVersionCollist.get(i).getText());

        }

        Assert.assertTrue(FirstList.size()==secondList.size() && FirstList.containsAll(secondList) && secondList.containsAll(FirstList));

        resetImplicitTimeout();
    }

    /**
     * Method to validate highligted serached text in a page by using CSS properties and selenium color import class
     * @param doctTitle
     */
    public void highlightSearchText(String doctTitle) {

//        CFSDCTMTest = new CFSDCTMTest();
//        setImplicitTimeout(10, SECONDS);
//        navsearch.waituntilvisible();
//        CFSDCTMTest.movetowebelement(getDriver(), navsearch);
//        CFSDCTMTest.javascriptclick(getDriver(), navsearch);
//        documentTitleInput.waituntilvisible();
//        CFSDCTMTest.javascriptclick(getDriver(), documentTitleInput);
//        documentTitleInput.clear();
//        documentTitleInput.sendKeys(doctTitle);
//        CFSDCTMTest.wait(2000);
//        CFSDCTMTest.movetowebelement(getDriver(), navsearch);
//        CFSDCTMTest.javascriptclick(getDriver(), navsearch);
//        CFSDCTMTest.wait(4000);

        List<WebElementFacade> searchListText = $$(By.xpath("//span[@class='xcp_grid_matchingterms-cls'][text()]"));
        LOGGER.info("searchlistsize"+ searchListText.size() );
        for (int i =0; i<searchListText.size(); i++){
            LOGGER.info("searchListTextList.get(i).getText():"+i+"-->"+searchListText.get(i).getText());
            String CssRbgValue = searchListText.get(i).getCssValue("background-color");
            String CSSToHex = Color.fromString(CssRbgValue).asHex();
            Assert.assertTrue(CSSToHex.equalsIgnoreCase("#ffffaa"));
        }
    }


    /**
     * Method to read a String in a file
     */

    public void readStringinFile(String docFileName){

        File folder = new File("C:\\Users\\Arun Kumar Devarajan\\Downloads");
        boolean found = false;
        String fileName = null;
        String fileTobeRead = null;
        String fileExtension = null;
        File[] listofFiles = folder.listFiles();
        int noofFiles = listofFiles.length;
        for (File listofFile : listofFiles) {

            if (listofFile.isFile()){
                 fileName = listofFile.getName();

                    if (fileName.contains(docFileName)){
                        found = true;
                        fileExtension = fileName.substring(fileName.lastIndexOf(".")+1);
                        LOGGER.info("fileExtension-->"+fileExtension);
                }
            }
        }

        Assert.assertTrue(found);
        fileTobeRead = folder+"\\"+docFileName+"."+fileExtension;
        LOGGER.info("fileTobeRead-->"+fileTobeRead);
        if (fileExtension.contains("txt")){
            try {
                BufferedReader readAppendStr = new BufferedReader(new FileReader(fileTobeRead));
                String Line = readAppendStr.readLine();
                while(Line!=null){
                    Line = readAppendStr.readLine();
                    if (Line.equals("readtext")){
                        LOGGER.info("\n"+"fileContentPresent");
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (fileExtension.contains("docx")){
            try {
                XWPFDocument doc = new XWPFDocument(new FileInputStream(fileTobeRead));
                List<XWPFParagraph> list = doc.getParagraphs();
                for (XWPFParagraph paragraph: list) {
                    if(paragraph.getText().contains("readtext")){
                        LOGGER.info("\n"+"fileContentPresent");
                    }

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i=0;i< listofFiles.length;i++){
            listofFiles[i]=null;
            folder.listFiles()[i]=null;
        }
    }

   }
