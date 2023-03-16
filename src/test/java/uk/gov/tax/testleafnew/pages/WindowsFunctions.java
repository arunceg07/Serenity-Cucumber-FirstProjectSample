package uk.gov.tax.testleafnew.pages;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.gov.tax.testleafnew.framework.TestLeafComonFunctions;

import javax.mail.Folder;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.List;


public class WindowsFunctions {
    TestLeafComonFunctions TestLeafComonFunctions = new TestLeafComonFunctions();

    private static final Logger LOGGER = LoggerFactory.getLogger(WindowsFunctions.class);

    /**
     * Method to Upload a File
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
     * Method to verify a Downloaded File in a windows File path
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
