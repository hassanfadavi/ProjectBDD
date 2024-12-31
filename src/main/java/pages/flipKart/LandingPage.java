package pages.flipKart;

import Utils.WaitUtils;
import actions.ActionsDemo;
import constansts.xpaths.ApplicationLandingConstants;
import constansts.xpaths.ApplicationProductConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {


      WebDriver driver;
      ActionsDemo actionsDemo;


    public  WebElement loginButton;
    public WebElement searchInput;
    public WebElement flightsButton;
    public WebElement fashionHover;
    public By mensFootWearBy;
    public By mensSportShoesBy;


    public LandingPage(WebDriver driver){
         this.driver=driver;
         this.actionsDemo=new ActionsDemo(driver);

        loginButton=driver.findElement(By.xpath(ApplicationLandingConstants.LOGIN_BUTTON));
        searchInput=driver.findElement(By.xpath(ApplicationLandingConstants.SEARCH_INPUT));
        flightsButton=driver.findElement(By.xpath(ApplicationLandingConstants.FLIGHT_BUTTON));
        fashionHover=driver.findElement(By.xpath(ApplicationProductConstants.FASHION_HOVER));
        mensFootWearBy=By.xpath(   ApplicationProductConstants.MENS_FOOT_WEAR);
        mensSportShoesBy=By.xpath( ApplicationProductConstants.MENS_SPORT_SHOES);

    }


    public void clickOnLoginButton(){
       actionsDemo.actionMouseClick(loginButton);
    }
    public void searchInput(String srt) throws InterruptedException {
        actionsDemo.sendKeyAction(searchInput,srt);
        WaitUtils.applyGlobalWait();
    }
    public void enterKey(){
        actionsDemo.enterKeyAction();
    }
    public void clickOnFlightButton(){
        actionsDemo.actionMouseClick(flightsButton);
    }
    public void mouseHoverOnFashion(){
        actionsDemo.actionMouseHover(fashionHover);
    }
    public void mouseHoverOnMensFootWear(){
        WebElement mensFootWear=driver.findElement(mensFootWearBy);
        actionsDemo.actionMouseHover(mensFootWear);
    }
    public void clickOnMensSportShoes(){
        WebElement mensSportShoes=driver.findElement(mensSportShoesBy);
        actionsDemo.actionMousehoverClick(mensSportShoes);
    }










}
