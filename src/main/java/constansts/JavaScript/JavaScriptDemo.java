package constansts.JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptDemo {


    public WebDriver driver;
    JavascriptExecutor js;
    long pageHeight ;

    public JavaScriptDemo(WebDriver driver){
        this.driver=driver;
        this.js=(JavascriptExecutor) driver;
        this.pageHeight = (long) js.executeScript("return document.body.scrollHeight");
    }

    public void scrollDown_slow() throws InterruptedException {
        //Scroll slow
        for (int i = 0; i < pageHeight; i += 100) {
            js.executeScript("window.scrollBy(0, 100);");
            Thread.sleep(100); // Wait 100 milliseconds between scrolls
        }

    }



}
