package pages.flipKart;

import Utils.WaitUtils;
import actions.ActionsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.ThreadLocalRandom;

public class LandingPage {


      WebDriver driver;
    ActionsDemo actionsDemo;


    WebElement loginButton;
    public WebElement searcInput;



    public LandingPage(WebDriver driver){

         this.driver=driver;
         this.actionsDemo=new ActionsDemo(driver);

        loginButton=driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']//a[@title='Login']"));
        searcInput=driver.findElement(By.xpath("//input[@type='text']"));


    }


    public void clickOnLoginButton(){
       actionsDemo.actionMouseClick(loginButton);
    }

    public void searchInput(String srt) throws InterruptedException {
//        searcInput.clear();
        actionsDemo.sendKeyAction(searcInput,srt);
        Thread.sleep(2000);
//        actionsDemo.enterKeyAction();
    }

    public void enterKey(){
        actionsDemo.enterKeyAction();
    }










}
