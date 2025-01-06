package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {




    public void selecteByValue(WebElement el,String value){

       Select select=new Select(el);
        select.selectByValue(value);

    }

    public void selecteByVisibleText(WebElement el,String value){

        Select select=new Select(el);
        select.selectByVisibleText(value);

    }




}
