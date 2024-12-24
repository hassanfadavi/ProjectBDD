package pages.flipKart;

import actions.ActionsDemo;
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

    public void enterEmail(String email){
        emailAddress.sendKeys(email);

    }

    public void clickOnOptButton(){
        actionsDemo.actionClick(submitRequestOpt);

    }








}
