package pages.flipKart;

import actions.ActionsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    WebDriver driver;
    ActionsDemo actionsDemo;


    public WebElement categories;
    public WebElement headphoneElement;
//    public WebElement kettobyElement;



    public SearchPage(WebDriver driver){
        this.driver=driver;
        this.actionsDemo=new ActionsDemo(driver);


        categories=driver.findElement(By.xpath("//a[@class='hEjLuS WyLc0s']"));
        headphoneElement=driver.findElement(By.xpath("//a[contains(text(),'zippyque Headphone')]"));




    }

//    public void getCategories(){
//        System.out.println(categories.getAttribute("title"));
//    }

    public void clickOnHeadPhoneProduct(){
//        headphoneElement=driver.findElement(By.xpath("//a[contains(text(),'zippyque Headphone')]"));
        actionsDemo.actionMouseClick(headphoneElement);
    }

//    public void clickOnkettobyProduct(){
//        actionsDemo.actionMouseClick(kettobyElement);
//    }


}
