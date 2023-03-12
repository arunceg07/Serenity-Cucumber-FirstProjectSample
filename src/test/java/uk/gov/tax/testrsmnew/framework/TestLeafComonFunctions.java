package uk.gov.tax.testrsmnew.framework;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestLeafComonFunctions extends PageObject {
    public void javascriptHighligther(WebElement webElement){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        for (int i=0; i<2;i++){
            jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", webElement);
        }
    }

    public void javascriptScroller(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,1000)");
    }

    public void seleniumClick(WebElement webElement){
        webElement.click();
    }

    public void seleniumPagesrc(String messageTobeVerified){
        getDriver().getPageSource().contains(messageTobeVerified);
    }

    public void  seleniumAlert(){
        Alert A1 = getDriver().switchTo().alert();
        System.out.println("Alertmessage:-->" +A1.getText());
        A1.accept();
    }

    public void seleniumSelectbyString(WebElement webElement){
        Select S1 = new Select(webElement);
//        S1.selectByValue(text);
        S1.selectByIndex(2);
    }

    public void javaWait(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void seleniumActions(WebElement webElement){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(webElement).click();
        actions.release().perform();
    }
}
