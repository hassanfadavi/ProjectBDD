package pages.flipKart;

import actions.ActionsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LandingPage {


      WebDriver driver;

    WebElement loginButton;
//    Actions  ac;
     ActionsDemo actionsDemo;



    public LandingPage(WebDriver driver){

         this.driver=driver;
         this.actionsDemo=new ActionsDemo(driver);

        loginButton=driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']//a[@title='Login']"));


    }


    public void clickOnLoginButton(){
//
       actionsDemo.actionClick(loginButton);
//      actionsDemo.actionhover(loginButton);
//        actionsDemo.actiondoubleClick(loginButton);

    }






}
