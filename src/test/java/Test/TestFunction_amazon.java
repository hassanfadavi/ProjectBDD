package Test;

import Utils.WaitUtils;
import actions.ActionsDemo;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class TestFunction_amazon extends BaseTest {


    ActionsDemo   actionsDemo;

    @Test
    public void bestSeller(){
        WebElement allDropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        actionsDemo=new ActionsDemo(driver);
//        Select select=new Select(allDropDown);
//        select.selectByValue("search-alias=fashion-mens");
//        select.selectByVisibleText("Men");


//            select.selectByVisibleText("Appliances");

//          List<WebElement> option= select.getOptions();
//          for(WebElement op:option){
//
//              System.out.println(op.getText());
//          }

       List <WebElement>bestLists=driver.findElements(By.xpath("//div[contains(@class, 's-main-slot')]//span[text()='Best Seller']//ancestor::div[@role='listitem']//h2"));

     if(bestLists.size() >0){

         logger.info("Number of 'Best Seller' products found: " + bestLists.size());
//         bestLists.get(0).click();
//         logger.info("Clicked on the first 'Best Seller' product successfully.");
     }else {
         logger.info("there is no best seller to be selected");
     }



//       for(  int i=0;i<bestLists.size()-1;i++     ){
//
//           if(bestLists.size() >0){
//               bestLists.get(i).click();
//           }else System.out.println("there is no best seller to be selected");
//
////           bestLists.get(i).click();
////           WaitUtils.applyGlobalWait();
//       }












//String t="Midea";

//       WebElement ke=driver.findElement(By.xpath("//a[@aria-label='Apply Midea filter to narrow results']//input[@type='checkbox']"));
//        actionsDemo.actionMouseClick(ke);
//




//       String brand="Bosch";
//        WebElement checkBox=driver.findElement(By.xpath("//span[text()='"+brand+"']/ancestor::div[@id='brandsRefinements']//input[@type='checkbox']"));
//        actionsDemo.actionMouseClick(checkBox);
//



//        List  <WebElement> chekboxes =driver.findElements(By.xpath("//div[@id='brandsRefinements']//input[@type='checkbox']"));
//        System.out.println(chekboxes.size());//
//
//        List  <WebElement> brandsList =driver.findElements(By.xpath("//div[@id='brandsRefinements']//span[@class='a-size-base a-color-base']"));
//        System.out.println(brandsList.size());//
//
//
//        List  <WebElement> kenmore =driver.findElements(By.xpath("//div[@id='brandsRefinements']//span[text()='Kenmore']"));
//        System.out.println(kenmore.size());//

//
//            for(   WebElement brands:kenmore   ) {
//
//                System.out.println(brands.getText());
//                }
//              break;
//
//
//            }


//
//        List  <WebElement> checkBoxList=driver.findElements(By.xpath("//div[@id='brandsRefinements']//input[@type='checkbox']"));
//
//
////            checkBoxList.get(0).click();
//        for(   WebElement che:checkBoxList    ) {
//
//            if(brands.getText().equals("Belkin")){
//                actionsDemo.actionMouseClick(che);
//            }
//
//        }




    }






}
