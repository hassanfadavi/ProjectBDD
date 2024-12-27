package actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionsDemo {

   public WebDriver driver;
   public   WebElement element;


    Actions ac;



    public ActionsDemo(WebDriver driver){
        this.driver=driver;
        ac=new Actions(driver);
    }
    

   //mouse actions
    public void actionMouseClick(WebElement el){
        this.element=el;
        ac.click(el).perform();
    }
    public void actionMousehover(WebElement el){
        this.element=el;
        ac.moveToElement(el).perform();
    }
    public void actionMousedoubleClick(WebElement el){
        this.element=el;
        ac.doubleClick(el).perform();
    }






    //keyboard actions
    public void sendKeyAction(WebElement el,String str) throws InterruptedException {
        this.element=el;
        ac.click(el).perform();
        for ( char character : str.toCharArray() ) {
            ac.sendKeys(String.valueOf(character)).perform();
            Thread.sleep(10);
        }
    }

    public void enterKeyAction()   {
        ac.keyDown(Keys.ENTER).perform();
    }





    
    




}
