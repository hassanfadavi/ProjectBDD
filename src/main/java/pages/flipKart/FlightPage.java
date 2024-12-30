package pages.flipKart;

import constansts.xpaths.ApplicationFlightConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightPage {

    public WebDriver driver;
    public WebElement filterBy;



    public FlightPage(WebDriver driver){
        this.driver=driver;
        filterBy=driver.findElement(By.xpath(ApplicationFlightConstants.FILTER_TEXT));

    }


}
