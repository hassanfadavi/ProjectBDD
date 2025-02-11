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


    //********************************* mouse actions************************
    public void actionMouseClick(WebElement el){
        this.element=el;
        ac.click(el).perform();
    }
    public void actionMousehoverClick(WebElement el){
        this.element=el;
        ac.moveToElement(el).click().perform();
    }
    public void actionMouseHover(WebElement el){
        this.element=el;
        ac.moveToElement(el).perform();
    }
    public void actionMousedoubleClick(WebElement el){
        this.element=el;
        ac.doubleClick(el).perform();
    }

    public void actionMouseRightClick(WebElement el){
        this.element=el;
        ac.contextClick(el).perform();
    }

    public void actionMouseDragAndDrop(WebElement source,WebElement target){
        ac.dragAndDrop(source,target).perform();
    }






    //*********************************  keyboard actions**********************************
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

    public void tabKeyAction()   {
        ac.keyDown(Keys.TAB).perform();
    }

    public void ctlVKeyAction()   {
        ac.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
    }



    public void ctlAKeyAction()   {
        ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
    }

    public void ctlCKeyAction()   {
        ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
    }







    
    




}
