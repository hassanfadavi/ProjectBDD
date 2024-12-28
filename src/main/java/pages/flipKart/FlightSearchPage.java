package pages.flipKart;

import Utils.WaitUtils;
import actions.ActionsDemo;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.plaf.PanelUI;
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




    public void departureDate(String departure_date){
        String[] part = departure_date.split(",");
//        System.out.println(part[0]);

        WebElement departureDateDropDown = driver.findElement(By.xpath("//input[@name='0-datefrom']"));
        WaitUtils.applyWait(driver,departureDateDropDown, WaitStrategy.CLICKABLE);
        actionsDemo.actionMouseClick(departureDateDropDown);
        date(part[0],part[1]);

    }


    public void returnDate(String return_date){
        String[] part = return_date.split(",");

        WebElement returnDateDropDown = driver.findElement(By.xpath("//input[@name='0-dateto']"));
        actionsDemo.actionMouseClick(returnDateDropDown);
        date(part[0],part[1]);
    }







    public void date(String monthYears,String dayss){
        while (true) {
            WebElement monthYear = driver.findElement(By.xpath("//div[@class='_1w7bXX']"));
            if (monthYear.getText().equals(monthYears)) {
                break;
            } else {
                WebElement nextPage=driver.findElement(By.xpath("//div[@class='au1mSN']//button[@class='R0r93E']"));
                nextPage.click();
            }
        }
        List <WebElement>days=driver.findElements(By.xpath("//button[@class='pl8ttv']"));
        System.out.println(days.size());
        for(   WebElement   day:days     ){
            if(day.getText().equals(dayss)){
                actionsDemo.actionMousehover(day);
                break;
            }
        }

    }










    public void departureCity(String city){

        actionsDemo.actionMouseClick(departureCity);
        WaitUtils.applyGlobalWait();
        citydep(city);
        WaitUtils.applyGlobalWait();
        actionsDemo.actionMouseClick(departureCity);
    }
    public void destinationCity(String city){

        actionsDemo.actionMouseClick(destinationCity);
        WaitUtils.applyGlobalWait();
        citydest(city);
        WaitUtils.applyGlobalWait();
        actionsDemo.actionMouseClick(destinationCity);
    }



    public void citydep(String cityName){

        List<WebElement> departureCities = driver.findElements(By.xpath("//div[@class='zeQVwu']//div[@class='V4BMfY'][1]//div[@class='_1wlldp']"));
        for (WebElement departcity : departureCities) {

            if (departcity.getText().equals(cityName)) {
                actionsDemo.actionMouseClick(departcity);
                break;
            }
        }
    }

    public void citydest(String cityName){

        List<WebElement> destinationCities = driver.findElements(By.xpath("//div[@class='zeQVwu']//div[@class='V4BMfY'][2]//div[@class='_1wlldp']"));
        for (WebElement desttcity : destinationCities) {

            if (desttcity.getText().equals(cityName)) {
                actionsDemo.actionMouseClick(desttcity);
                break;
            }
        }
    }







}
