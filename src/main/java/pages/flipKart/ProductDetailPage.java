package pages.flipKart;

import Utils.WaitUtils;
import actions.ActionsDemo;
import com.google.common.annotations.VisibleForTesting;
import constansts.xpaths.ApplicationProductConstants;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductDetailPage {

    WebDriver driver;
    ActionsDemo actionsDemo;


    public By addToCartButtonBy;
    public By cartCountElement;
    public WebElement cartCount;
    public By mensSportTextBy;
    public By discountDropDownBy;
    public By discountOptionsBy;
    public By thirtyPercentBy;
    public By fourtyPercentBy;
    public By fiftyPercentBy;
    public By sixtyPercentBy;
    public By seventyPercentBy;
    public By discountListBy;


    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
        this.actionsDemo = new ActionsDemo(driver);

        this.addToCartButtonBy = By.cssSelector(ApplicationProductConstants.ADD_TO_CART_BUTTON);
        this.cartCountElement = By.xpath(ApplicationProductConstants.CART_COUNT);
        this.mensSportTextBy = By.xpath(ApplicationProductConstants.MENS_SPORT_TEXT);
        this.discountDropDownBy = By.xpath(ApplicationProductConstants.DISCOUNTDROPDOWN);
        this.discountOptionsBy = By.xpath(ApplicationProductConstants.DISCOUNTOPTIONS);
        this.thirtyPercentBy=By.xpath(ApplicationProductConstants.THIRTYPERCENTAGE);
        this.fourtyPercentBy=By.xpath(ApplicationProductConstants.FOURTYPERCENTAGE);
        this.fiftyPercentBy=By.xpath(ApplicationProductConstants.FIFTYPERCENTAGE);
        this.sixtyPercentBy=By.xpath(ApplicationProductConstants.SIXTYPERCENTAGE);
        this.seventyPercentBy=By.xpath(ApplicationProductConstants.SEVENTYPERCENTAGE);
        this.discountListBy=By.xpath(ApplicationProductConstants.DISCOUNTLIST);

    }

    public void addToCart() {
        WebElement addToCartButton = driver.findElement(addToCartButtonBy);
        actionsDemo.actionMouseClick(addToCartButton);
    }

    public String cartCount() {
        cartCount = driver.findElement(cartCountElement);
        return cartCount.getText();
    }

    public String getmensSportTex() {
        WebElement mensSportTex = driver.findElement(mensSportTextBy);
        return mensSportTex.getText();
    }

    public void clickOnDiscountDropDown() {
        WebElement discountDrop = driver.findElement(discountDropDownBy);
        actionsDemo.actionMousehoverClick(discountDrop);
    }

    public WebElement discountOptionsVisibles() {
        return driver.findElement(discountOptionsBy);
    }


    public void selectPercentages(String percentages) {
        List<WebElement> discountList = driver.findElements(discountListBy);
        for (WebElement dis : discountList) {
            String perc = dis.getAttribute("title");
            perc = percentages;
            if (perc.equals("30% or more")) {
               WebElement thirty=driver.findElement(thirtyPercentBy);
                WaitUtils.applyWait(driver,thirty, WaitStrategy.CLICKABLE);
               actionsDemo.actionMouseClick(thirty);
            }   if (perc.equals("40% or more")) {
                WebElement fourty = driver.findElement(fourtyPercentBy);
                WaitUtils.applyWait(driver, fourty, WaitStrategy.CLICKABLE);
                actionsDemo.actionMouseClick(fourty);

            }   if (perc.equals("50% or more")) {
                WebElement fifty=driver.findElement(fiftyPercentBy);
                WaitUtils.applyWait(driver,fifty, WaitStrategy.CLICKABLE);
                actionsDemo.actionMouseClick(fifty);
            }   if (perc.equals("60% or more")) {
                WebElement sixty=driver.findElement(sixtyPercentBy);
                WaitUtils.applyWait(driver,sixty, WaitStrategy.CLICKABLE);
                actionsDemo.actionMouseClick(sixty);
            }   if (perc.equals("70% or more")) {
                WebElement seventy=driver.findElement(seventyPercentBy);
                WaitUtils.applyWait(driver,seventy, WaitStrategy.CLICKABLE);
                actionsDemo.actionMouseClick(seventy);
            } else System.out.println("is out of boundry");
            break;
        }

    }


//    public  void percentage(String percentages){
//        List<WebElement> percentageList = driver.findElements(By.xpath("//div[@class='UkUFwK']//span"));
//
//        WebElement  firtProduct=percentageList.get(0);
//        int firstpercent=Integer.parseInt(firtProduct.getText().replaceAll("% off",""));
//        int minConvertPer= Integer.parseInt(percentages.replaceAll("% or more",""));
//        if( (firstpercent>minConvertPer || firstpercent==minConvertPer) ){
//            System.out.println("ok");
//        }else System.out.println("not ok");
//
//    }







}
