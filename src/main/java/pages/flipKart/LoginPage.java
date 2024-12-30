package pages.flipKart;

import Utils.WaitUtils;
import actions.ActionsDemo;
import constansts.xpaths.ApplicationLoginConstants;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.plaf.PanelUI;

public class LoginPage {

    WebDriver driver;
    ActionsDemo actionsDemo;


  public  WebElement loginText;
  public WebElement emailAddress;
  public WebElement submitRequestOpt;



    public LoginPage(WebDriver driver){
        this.driver=driver;
        this.actionsDemo=new ActionsDemo(driver);

        loginText=driver.findElement(By.xpath(ApplicationLoginConstants.LOGIN_TEXT));
        emailAddress=driver.findElement(By.xpath(ApplicationLoginConstants.EMAIL_ADDRESS));
        submitRequestOpt=driver.findElement(By.xpath(ApplicationLoginConstants.SUBMIT_REQUEST_OPT));
    }

    public void enterEmail(String email) throws InterruptedException {
       actionsDemo.sendKeyAction(emailAddress,email);
    }

    public void clickOnOptButton(){
        actionsDemo.actionMouseClick(submitRequestOpt);
    }




}
