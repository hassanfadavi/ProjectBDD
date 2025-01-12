package pages.amazon;

import actions.ActionsDemo;
import actions.SelectDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_LandingPage {

    public WebDriver driver;
    public WebElement amazon_Logo;
    public WebElement allDropDown;
    public WebElement searchBar;
    public WebElement best_seller;
    public By best_seller_text;
    ActionsDemo  actionsDemo;
    SelectDemo  selectDemo;



    public Amazon_LandingPage(WebDriver driver){
        this.driver=driver;
        this.actionsDemo=new ActionsDemo(driver );
       this. selectDemo=new SelectDemo();
        amazon_Logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        allDropDown= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        searchBar=driver.findElement(By.xpath("//input[@name='field-keywords']"));
        best_seller=driver.findElement(By.xpath("//a[text()='Best Sellers' and @class='nav-a  ']"));
        best_seller_text=By.xpath("//span[@id='zg_banner_text']");
    }


    public void hoverOnAllDropDown(){
        actionsDemo.actionMouseHover(allDropDown);
    }

    public void selectDepartment(String departments){

        selectDemo.selecteByVisibleText(allDropDown,departments);
    }

    public void inputSearchBar(String str) throws InterruptedException {
        actionsDemo.sendKeyAction(searchBar,str);
    }

    public void enterAction(){
        actionsDemo.enterKeyAction();
    }

    public void click_on_best_seller(){
        actionsDemo.actionMouseClick(best_seller);
//        best_seller.click();
    }

    public String get_best_seller_text(){
     return   driver.findElement(best_seller_text).getText();
//      return  best.getText();
    }






}
