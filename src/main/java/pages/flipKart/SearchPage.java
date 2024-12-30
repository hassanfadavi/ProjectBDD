package pages.flipKart;

import actions.ActionsDemo;
import actions.SelectDemo;
import constansts.xpaths.ApplicationSearchConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class SearchPage {

    WebDriver driver;
    ActionsDemo actionsDemo;
    SelectDemo selectDemo;

    public By categoryBy;
    public By headphoneBy;
    public By dropownMinPriceBy;
    public By dropownMaxPriceBy;
    public By priceLowToHight;
    public By priceHighToLow;
    public By pricesProduct;




    public SearchPage(WebDriver driver){
        this.driver=driver;
        this.actionsDemo=new ActionsDemo(driver);
        this.selectDemo=new SelectDemo();

        this.categoryBy= By.xpath(ApplicationSearchConstants.CATEGORY);
        this.headphoneBy=By.xpath(ApplicationSearchConstants.HEADPHONE);
        dropownMinPriceBy=By.xpath(ApplicationSearchConstants.DROP_DOWN_MIN_PRICE);
        dropownMaxPriceBy=By.xpath(ApplicationSearchConstants.DROP_DOWN_MAX_PRICE);
        priceLowToHight=By.xpath(ApplicationSearchConstants.PRICE_LOW_TO_HIGH);
        priceHighToLow=By.xpath(ApplicationSearchConstants.PRICE_HIGH_TO_LOW);
        pricesProduct=By.xpath(ApplicationSearchConstants.PRICE_PRODUCT);
    }


    public void clickOnHeadPhoneProduct(){
        WebElement  headphoneElement=driver.findElement(headphoneBy);
        actionsDemo.actionMouseClick(headphoneElement);
    }
    public String getCategory(){
        WebElement categories=driver.findElement(categoryBy);
        return categories.getAttribute("title");
    }
    public void selectMinPrice(String minPrices){
        WebElement  dropownMinPrice=driver.findElement(dropownMinPriceBy);
       selectDemo.selecteByValue(dropownMinPrice,minPrices);
    }
    public void selectMaxPrice(String maxPrices){
        WebElement  dropownMaxPrice=driver.findElement(dropownMaxPriceBy);
        selectDemo.selecteByValue(dropownMaxPrice,maxPrices);
    }
    public void clickOnPriceLowToHigh(){
        WebElement lowToHighPrice=driver.findElement(priceLowToHight);
        actionsDemo.actionMouseClick(lowToHighPrice);
    }
    public void clickOnPriceHighToLow(){
        WebElement highToLowPrice=driver.findElement(priceHighToLow);
        actionsDemo.actionMouseClick(highToLowPrice);
    }
    public void pricesLowToHigh(int minPrice){
        List<WebElement> priceList = driver.findElements(pricesProduct);
        WebElement  firstPriceproduct=priceList.get(0);
        WebElement lastPriceproduct=priceList.get(priceList.size()-1);

        int firstprice=Integer.parseInt(firstPriceproduct.getText().replace("₹","").replace(",",""));
        int lastPrice=Integer.parseInt(lastPriceproduct.getText().replace("₹","").replace(",",""));
        if( (firstprice<minPrice || firstprice==minPrice)  && ( lastPrice>firstprice) ){
            System.out.println(firstprice<minPrice);
        }
    }
    public void pricesHighToLow(int maxPrice){
        List<WebElement> priceList = driver.findElements(pricesProduct);
        WebElement  firstPriceproduct=priceList.get(0);
        WebElement lastPriceproduct=priceList.get(priceList.size()-1);
        int firstprice=Integer.parseInt(firstPriceproduct.getText().replace("₹","").replace(",",""));
        int lastPrice=Integer.parseInt(lastPriceproduct.getText().replace("₹","").replace(",",""));
        if( (firstprice<maxPrice || firstprice==maxPrice)  && ( lastPrice>firstprice) ){
            System.out.println(firstprice<maxPrice);
        }
    }











}
