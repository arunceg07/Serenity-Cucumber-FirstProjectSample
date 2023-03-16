package uk.gov.tax.testleafnew.pages;

import java.io.IOException;

public class SerenityReportPage {

    public void windowsMavenCmdforSerenityReport(){

        try {
            Runtime.getRuntime().exec("cmd /c mvn serenity:aggregate");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Report Generated");

    }
}
