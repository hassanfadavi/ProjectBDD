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
//    public WebElement men;
//    public String mens_Value;
    public WebElement searchBar;
    ActionsDemo  actionsDemo;
    SelectDemo  selectDemo;



    public Amazon_LandingPage(WebDriver driver){
        this.driver=driver;
        this.actionsDemo=new ActionsDemo(driver );
       this. selectDemo=new SelectDemo();
        amazon_Logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        allDropDown= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        searchBar=driver.findElement(By.xpath("//input[@name='field-keywords']"));
//         mens_Value="search-alias=fashion-mens";

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






}
