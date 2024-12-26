package pages.flipKart;

import actions.ActionsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage {

    WebDriver driver;
    ActionsDemo actionsDemo;


    public WebElement addToCartButton;




    public ProductDetailPage(WebDriver driver){
        this.driver=driver;
        this.actionsDemo=new ActionsDemo(driver);

        addToCartButton=driver.findElement(By.cssSelector("button[class='QqFHMw vslbG+ In9uk2']"));

    }

    public void addToCart(){
      actionsDemo.actionMouseClick(addToCartButton);
    }




}
