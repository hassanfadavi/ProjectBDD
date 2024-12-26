package pages.flipKart;

import actions.ActionsDemo;
import actions.SelectDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.PanelUI;

public class SearchPage {

    WebDriver driver;
    ActionsDemo actionsDemo;
    SelectDemo selectDemo;



    public By categoryBy;
//    public WebElement categories;

    public By headphoneBy;
//    public WebElement headphoneElement;

//    public WebElement dropownMinPrice;
//    public WebElement dropownMaxPrice;

    public By dropownMinPriceBy;
    public By dropownMaxPriceBy;







    public SearchPage(WebDriver driver){
        this.driver=driver;
        this.actionsDemo=new ActionsDemo(driver);
        this.selectDemo=new SelectDemo();



//        categories=driver.findElement(By.xpath("//a[@class='hEjLuS WyLc0s']"));
        this.categoryBy= By.xpath("//a[@class='hEjLuS WyLc0s']");


//        headphoneElement=driver.findElement(By.xpath("//a[contains(text(),'zippyque Headphone')]"));
        this.headphoneBy=By.xpath("//a[contains(text(),'zippyque Headphone')]");


//        dropownMinPrice=driver.findElement(By.xpath("//div[@class='suthUA']//select[@class='Gn+jFg']"));
//
//        dropownMaxPrice=driver.findElement(By.xpath("//div[@class='tKgS7w']//select[@class='Gn+jFg']"));


        dropownMinPriceBy=By.xpath("//div[@class='suthUA']//select[@class='Gn+jFg']");

        dropownMaxPriceBy=By.xpath("//div[@class='tKgS7w']//select[@class='Gn+jFg']");




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
//        this.Price=new Select(dropownMinPrice);
//        Price.selectByValue(minPrices);
        WebElement  dropownMinPrice=driver.findElement(dropownMinPriceBy);
       selectDemo.selecteByValue(dropownMinPrice,minPrices);

    }

    public void selectMaxPrice(String maxPrices){
//        this.Price=new Select(dropownMaxPrice);
//        Price.selectByValue(maxPrices);
        WebElement  dropownMaxPrice=driver.findElement(dropownMaxPriceBy);
        selectDemo.selecteByValue(dropownMaxPrice,maxPrices);

    }









}
