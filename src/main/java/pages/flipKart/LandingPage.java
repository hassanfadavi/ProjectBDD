package pages.flipKart;

import Utils.WaitUtils;
import actions.ActionsDemo;
import constansts.xpaths.ApplicationLandingConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {


      WebDriver driver;
      ActionsDemo actionsDemo;


    public  WebElement loginButton;
    public WebElement searchInput;
    public WebElement flightsButton;




    public LandingPage(WebDriver driver){
         this.driver=driver;
         this.actionsDemo=new ActionsDemo(driver);


        loginButton=driver.findElement(By.xpath(ApplicationLandingConstants.LOGIN_BUTTON));
        searchInput=driver.findElement(By.xpath(ApplicationLandingConstants.SEARCH_INPUT));
        flightsButton=driver.findElement(By.xpath(ApplicationLandingConstants.FLIGHT_BUTTON));
    }


    public void clickOnLoginButton(){
       actionsDemo.actionMouseClick(loginButton);
    }

    public void searchInput(String srt) throws InterruptedException {
//        searchInput.sendKeys(srt);
        actionsDemo.sendKeyAction(searchInput,srt);
        WaitUtils.applyGlobalWait();
    }
    public void enterKey(){
        actionsDemo.enterKeyAction();
    }
    public void clickOnFlightButton(){
        actionsDemo.actionMouseClick(flightsButton);
    }










}
