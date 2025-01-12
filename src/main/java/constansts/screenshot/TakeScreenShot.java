package constansts.screenshot;

import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import javax.swing.plaf.PanelUI;
import java.io.ByteArrayInputStream;

public class TakeScreenShot {

    public WebDriver driver;
    public Scenario scenario;

//
//    public TakeScreenShot(WebDriver driver){
//        this.driver=driver;
//
//    }

    public void screenShot(){
            byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Failed Screenshot",new ByteArrayInputStream(screenshot));

    }



}
