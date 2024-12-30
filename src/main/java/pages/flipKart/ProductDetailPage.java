package pages.flipKart;

import actions.ActionsDemo;
import constansts.xpaths.ApplicationProductConstants;
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

        this.addToCartButton=driver.findElement(By.cssSelector(ApplicationProductConstants.ADD_TO_CART_BUTTON));
        this.cartCountElement=By.xpath(ApplicationProductConstants.CART_COUNT);

    }

    public void addToCart(){
      actionsDemo.actionMouseClick(addToCartButton);
    }
    public String cartCount(){
      cartCount=driver.findElement(cartCountElement);
      return cartCount.getText();
    }






}
