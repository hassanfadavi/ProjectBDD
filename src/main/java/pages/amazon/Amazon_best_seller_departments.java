package pages.amazon;

import Utils.WaitUtils;
import constansts.JavaScript.JavaScriptDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Amazon_best_seller_departments {

    public WebDriver driver;
    JavaScriptDemo  javaScriptDemo ;
    public By best_sellers_prices;
    public By pageTwo;



    public Amazon_best_seller_departments(WebDriver driver){

        this.driver=driver;
        this.javaScriptDemo =new JavaScriptDemo(driver);
        best_sellers_prices=By.xpath("//span[@class='_cDEzb_p13n-sc-price_3mJ9Z']");
        pageTwo=By.xpath("//a[text()='2']");

    }


    public double max_price_best_seller() throws InterruptedException {
        javaScriptDemo.scrollDown_slow();
        WaitUtils.applyGlobalWait();
    List<WebElement> prices=driver.findElements(best_sellers_prices);
    List<Double> listOfItemPrices = new ArrayList<>();

      for( WebElement price:prices  ) {
        String strPrices = price.getText().replace("$", "");
        double doubPrices = Double.parseDouble(strPrices);
        listOfItemPrices.add(doubPrices);
    }

    return Collections.max(listOfItemPrices);
    }

    public void clickOnMax_best_seller_price(double max ) throws InterruptedException {
        javaScriptDemo.scrollDown_slow();
        WaitUtils.applyGlobalWait();
        List<WebElement> prices=driver.findElements(best_sellers_prices);
        System.out.println(String.valueOf("$"+max));


         String s=String.format("$%.2f", max);
        for( WebElement price:prices  ) {
            String strPrices = price.getText();
          if(strPrices.equals(String.format("$%.2f", max)) ){

              driver.findElement(By.xpath("//span[text()='"+s+"']")).click();
              return; //exit
          }
        }
        System.out.println("Could not click on the product with price: $" + max);


    }

    public void clickOnPageTwo(){
        WebElement page2=driver.findElement(pageTwo);
        page2.click();
    }




}
