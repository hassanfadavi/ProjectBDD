package pages.flipKart;

import Utils.WaitUtils;
import actions.ActionsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FlightSearchPage {

    WebDriver driver;
    ActionsDemo actionsDemo;
    WebElement departureCity;
    WebElement destinationCity;




    public FlightSearchPage(WebDriver driver){
        this.driver=driver;
        this.actionsDemo=new ActionsDemo(driver);

        departureCity=driver.findElement(By.xpath("//input[@name='0-departcity']"));
        destinationCity=driver.findElement(By.xpath("//input[@name='0-arrivalcity']"));

    }






    public void departureCity(String city){

        actionsDemo.actionMouseClick(departureCity);
        WaitUtils.applyGlobalWait();
        city(city);
        WaitUtils.applyGlobalWait();
        actionsDemo.actionMouseClick(departureCity);
    }
    public void destinationCity(String city){

        actionsDemo.actionMouseClick(destinationCity);
        WaitUtils.applyGlobalWait();
        city(city);
        WaitUtils.applyGlobalWait();
        actionsDemo.actionMouseClick(destinationCity);
    }
    public void city(String cityName){
        List<WebElement> Cities = driver.findElements(By.xpath("//div[@class='_1wlldp']"));
        for (WebElement city : Cities) {
            if (city.getText().equals(cityName)) {
                actionsDemo.actionMouseClick(city);
                break;
            }
        }
    }







}
