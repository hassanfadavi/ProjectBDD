package Utils;

import config.ConfigManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class WaitUtils {

//public static WebDriver driver;


    public static Duration getTimeOut(){

        String  timeOutValue=ConfigManager.getProperty("timeout");
        int timeOutInSecconds =(timeOutValue!=null) ?Integer.parseInt (timeOutValue):10 ;
        return Duration.ofSeconds(timeOutInSecconds);



    }


    public static void applyGlobalWait(){

      boolean enableWait =  Boolean.parseBoolean (ConfigManager.getProperty("EnableWait"));
        System.out.println("is wait enable? "+enableWait);

      int waitInSeconds= Integer.parseInt (ConfigManager.getProperty("WaitInSeconds"));
        System.out.println("wait in seconds for global wait: "+waitInSeconds);


        if(enableWait&&waitInSeconds>0){
            try {
                Thread.sleep(waitInSeconds * 1000L);

            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.err.println("Global wait interrupted. " + e.getMessage() );

            }
        }

    }




  public static   WebDriverWait  wait;

    public static WebElement applyWait(WebDriver driver, WebElement element, WaitStrategy waitStrategy){

     wait=new WebDriverWait(driver,getTimeOut());
      switch (waitStrategy){
          case VISIBLE:
              return wait.until(ExpectedConditions.visibilityOf(element));
          case CLICKABLE:
              return wait.until(ExpectedConditions.elementToBeClickable(element));
          case NONE:
          default:
              return element;

      }
    }

    public static WebElement applyWait(WebDriver driver, WebElement element, WaitStrategy waitStrategy, By webElement){

         wait=new WebDriverWait(driver,getTimeOut());

        switch (waitStrategy){
            case VISIBLE:
                return wait.until(ExpectedConditions.visibilityOf(element));
            case CLICKABLE:
                return wait.until(ExpectedConditions.elementToBeClickable(element));
            case NONE:
            case PRESENCE:
                return wait.until(ExpectedConditions.presenceOfElementLocated(webElement));
            default:
                return element;

        }

    }


//
//    public static void main(String[] args) {
//        applyGlobalWait();
//        System.out.println(ConfigManager.getProperty("timeout"));
//
//    }





}
