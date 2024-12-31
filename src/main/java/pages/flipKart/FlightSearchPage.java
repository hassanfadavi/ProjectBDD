package pages.flipKart;

import Utils.WaitUtils;
import actions.ActionsDemo;
import constansts.xpaths.ApplicationFlightConstants;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FlightSearchPage {

    WebDriver driver;
    ActionsDemo actionsDemo;

    WebElement departureCity;
    WebElement destinationCity;
    WebElement searchButton;
    WebElement departureDateDropDown;
    WebElement returnDateDropDown;

    By monthYearBy;
    By nextPageBy;
    By departureCitiesBy;
    By destinationCitiesBy;
    By daysBy;



    public FlightSearchPage(WebDriver driver){
        this.driver=driver;
        this.actionsDemo=new ActionsDemo(driver);

        departureCity=driver.findElement(By.xpath(ApplicationFlightConstants.DEPARTURE_CITY));
        destinationCity=driver.findElement(By.xpath(ApplicationFlightConstants.DESTINATION_CITY));
        searchButton=driver.findElement(By.cssSelector(ApplicationFlightConstants.SEARCH_BUTTON));
        departureDateDropDown = driver.findElement(By.xpath(ApplicationFlightConstants.DEPARTURE_DATE_DROPDOWN));
        returnDateDropDown = driver.findElement(By.xpath(ApplicationFlightConstants.RETURN_DATE_DROPDOWN));
        monthYearBy = By.xpath(ApplicationFlightConstants.MONTH_YEAR);
        nextPageBy= By.xpath(ApplicationFlightConstants.NEXT_PAGE);
        departureCitiesBy  =By.xpath(ApplicationFlightConstants.DEPARTURE_CITIES);
        destinationCitiesBy=By.xpath(ApplicationFlightConstants.DESTINATION_CITIES);
        daysBy=By.xpath(ApplicationFlightConstants.DAYS);
    }


    public void departureDate(String departure_date){
        String[] part = departure_date.split(",");
        WaitUtils.applyWait(driver,departureDateDropDown, WaitStrategy.CLICKABLE);
        actionsDemo.actionMouseClick(departureDateDropDown);
        date(part[0],part[1]);
    }
    public void returnDate(String return_date){
        String[] part = return_date.split(",");
        actionsDemo.actionMouseClick(returnDateDropDown);
        date(part[0],part[1]);
    }
    public void date(String monthYears,String dayss){
        while (true) {
            WebElement monthYear = driver.findElement(monthYearBy);
            if (monthYear.getText().equals(monthYears)) {
                break;
            } else {
                WebElement nextPage=driver.findElement(nextPageBy);
                nextPage.click();
            }
        }
        List <WebElement>days=driver.findElements(daysBy);
        System.out.println(days.size());
        for(   WebElement   day:days     ){
            if(day.getText().equals(dayss)){
                actionsDemo.actionMousehoverClick(day);
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
        List<WebElement> departureCities = driver.findElements(departureCitiesBy);
        for (WebElement departcity : departureCities) {
            if (departcity.getText().equals(cityName)) {
                actionsDemo.actionMouseClick(departcity);
                break;
            }
        }
    }

    public void citydest(String cityName){
        List<WebElement> destinationCities = driver.findElements(destinationCitiesBy);
        for (WebElement desttcity : destinationCities) {

            if (desttcity.getText().equals(cityName)) {
                actionsDemo.actionMouseClick(desttcity);
                break;
            }
        }
    }
    public void clickOnSearchButton(){
        WaitUtils.applyWait(driver,searchButton,WaitStrategy.CLICKABLE);
        actionsDemo.actionMousedoubleClick(searchButton);
    }







}
