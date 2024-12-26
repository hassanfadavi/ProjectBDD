package pages.flipKart;

import Utils.WaitUtils;
import actions.ActionsDemo;
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
//  public WebElement optText;







    public LoginPage(WebDriver driver){

        this.driver=driver;
        this.actionsDemo=new ActionsDemo(driver);

        loginText=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        emailAddress=driver.findElement(By.xpath("//div[@class='I-qZ4M vLRlQb']/input[@type='text']"));
        submitRequestOpt=driver.findElement(By.xpath("//button[text()='Request OTP']"));
//        optText=driver.findElement(By.xpath( "//div[@class='kZYA3m']"));




    }

    public void enterEmail(String email) throws InterruptedException {

       actionsDemo.sendKeyAction(emailAddress,email);
//       emailAddress.sendKeys(email);

    }

    public void clickOnOptButton(){
        actionsDemo.actionMouseClick(submitRequestOpt);

    }



//    public WebElement textOpt(){
////        String  actualText=optText.getText();
////        String expectedText="Please enter the OTP sent to";
//        optText=driver.findElement(By.xpath( "//div[@class='kZYA3m']"));
//        return WaitUtils.applyWait(driver,optText, WaitStrategy.VISIBLE);
//
//
//    }








}
