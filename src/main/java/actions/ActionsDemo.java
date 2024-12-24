package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

   public WebDriver driver;
  public   WebElement element;


    Actions ac;


    public ActionsDemo(WebDriver driver){
        this.driver=driver;
        ac=new Actions(driver);

    }
    

    public void actionClick(WebElement el){
        this.element=el;
        ac.click(el).perform();
    }

    public void actionhover(WebElement el){
        this.element=el;
        ac.moveToElement(el).perform();
    }


    public void actiondoubleClick(WebElement el){
        this.element=el;
        ac.doubleClick(el).perform();
    }
    
    




}
