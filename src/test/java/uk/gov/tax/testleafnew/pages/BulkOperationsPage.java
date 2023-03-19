package uk.gov.tax.testleafnew.pages;

import java.util.ArrayList;

public class BulkOperationsPage {

    public static ArrayList<String> documentTitleForBulkUpdate = new ArrayList<>();

    public void ingestDocument(int numFiles, String filePath, boolean uploadnewVersion) {

//        CFSDCTMTEST = new CFSDCTMTEST;
//        setImplicitTimeout (10, SECONDS);
//        String workingDirectory = System.getProperty("user.dir");
//        System.out.println("workingDirectory"+ workingDirectory);
//        String filename = workingDirectory+"src\\test\\resources\\testdata\\ingestionDocuments"+filePath;
//        for (int i =0; i< numFiles; i++){
//            CFSDCTMTest.wait(1000);
//            if(!uploadnewVersion) {
//                CFSDCTMTEST.actionclick(getDriver(), $(("//span[@class]")[1]);
//            }
//                else{
//                    CFSDCTMTEST.actionclick(getDriver(), $(("//span[@class]")[2]);
//                }
//            CFSDCTMTest.wait(1000);
//                uploadwithrobot(filename);
//            CFSDCTMTest.wait(1000);
            documentTitleForBulkUpdate.add(filePath);
//            }

    }

}

