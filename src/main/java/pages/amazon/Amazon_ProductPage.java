package pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Amazon_ProductPage {

    public WebDriver driver;
    public WebElement resultText;
    public By findBestSeller;
//    public By rank;





    public Amazon_ProductPage(WebDriver driver){
        this.driver=driver;
        resultText=driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        findBestSeller=By.xpath("//div[contains(@class, 's-main-slot')]//span[text()='Best Seller']//ancestor::div[@role='listitem']//img");
//         rank=By.xpath("//span[text()='#1 in ']");

    }


    public String getResultText(){
      return   resultText.getText().replaceAll("\"","");
    }

    public void findBestSeller(){
        List<WebElement> bestLists=driver.findElements(findBestSeller);
        if(bestLists.size() >0){
            System.out.println("Number of 'Best Seller' products found: " + bestLists.size());
//         bestLists.get(0).click();
//         logger.info("Clicked on the first 'Best Seller' product successfully.");
        }else {
            System.out.println("there is no best seller to be selected");
        }
    }

    public void selectFirstBestSeller(){
        List<WebElement> bestLists=driver.findElements(findBestSeller);
        if(bestLists.size() >0){
//            System.out.println("Number of 'Best Seller' products found: " + bestLists.size());
            bestLists.get(0).click();
            System.out.println("Clicked on the first 'Best Seller' product successfully.");
        }else {
            System.out.println("there is no best seller to be selected");
        }
    }

//    public boolean getRank(){
//      return driver.findElement(rank).isDisplayed();
////
//    }








}
