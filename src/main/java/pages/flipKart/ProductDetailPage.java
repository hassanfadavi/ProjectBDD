package pages.flipKart;

import actions.ActionsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage {

    WebDriver driver;
    ActionsDemo actionsDemo;


    public WebElement addToCartButton;
    public By cartCountElement;
    public WebElement cartCount;






    public ProductDetailPage(WebDriver driver){
        this.driver=driver;
        this.actionsDemo=new ActionsDemo(driver);

        this.addToCartButton=driver.findElement(By.cssSelector("button[class='QqFHMw vslbG+ In9uk2']"));
        this.cartCountElement=By.xpath("//div[@class='ZuSA--']");

    }

    public void addToCart(){
      actionsDemo.actionMouseClick(addToCartButton);
    }

    public String cartCount(){
      cartCount=driver.findElement(cartCountElement);
      return cartCount.getText();

    }






}
