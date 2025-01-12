package pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Amazon_best_seller_page {

    public WebDriver driver;
    public By department;
    public By bestsellerText;



   public Amazon_best_seller_page(WebDriver driver){
        this.driver=driver;
        department=By.xpath("//div[@role='group']//a");
        bestsellerText=By.xpath("//h1[contains(@class,'a-size-large')]");

    }



    public void select_department(String departments){
        List<WebElement> depart=driver.findElements(department);

        for(WebElement d:depart  ){
            if(d.getText().equals(departments)){
                d.click();
                break;
            }
        }


    }



    public String getBestSellerText(){
        return       driver.findElement(bestsellerText).getText();

    }

}
