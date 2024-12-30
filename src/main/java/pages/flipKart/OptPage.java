package pages.flipKart;

import constansts.xpaths.ApplicationLoginConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OptPage {

    public WebDriver driver;
    public WebElement optText;


    public OptPage(WebDriver driver){
        this.driver=driver;
        optText=driver.findElement(By.xpath(ApplicationLoginConstants.OPT_TEXT));
    }


}
