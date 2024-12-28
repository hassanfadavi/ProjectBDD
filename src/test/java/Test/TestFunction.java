package Test;

import Utils.WaitUtils;
import actions.ActionsDemo;
import base.BaseTest;
import config.ConfigManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.flipKart.LandingPage;
import pages.flipKart.LoginPage;
import pages.flipKart.ProductDetailPage;
import pages.flipKart.SearchPage;

import javax.sql.rowset.BaseRowSet;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class TestFunction extends BaseTest {



    LandingPage landingPage;
    //    LoginPage logingPage;
    SearchPage searchPage;
    //    ProductDetailPage productDetailPage;
    ActionsDemo actionsDemo;

//        @Test
//    public void tes_navigate_to_login_page() throws InterruptedException {
//
//        this.landingPage = new LandingPage(driver);
//        landingPage.clickOnLoginButton();
//        WaitUtils.applyGlobalWait();
//
//        this.logingPage = new LoginPage(driver);
//        logingPage.enterEmail("s.hasan@gmail.com");
//        logingPage.clickOnOptButton();
//    }


//    @Test
//    public void test_product_search() throws InterruptedException {
//        this.landingPage = new LandingPage(driver);
//        WaitUtils.applyGlobalWait();
//        landingPage.searchInput("phone");
//        landingPage.enterKey();
//
//        this.searchPage=new SearchPage(driver);
//        searchPage.getCategories();
//
//    }

//    @Test
//    public void test_add_product_to_cart() throws InterruptedException {
//        this.landingPage = new LandingPage(driver);
//        WaitUtils.applyGlobalWait();
//        landingPage.searchInput("zippyque Headphone design winter");
//        landingPage.enterKey();
//
//        this.searchPage=new SearchPage(driver);
//        searchPage.clickOnHeadPhoneProduct();
//        WaitUtils.applyGlobalWait();
//
//        List<String> tabs=new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//
//        this.productDetailPage=new ProductDetailPage(driver);
//        WaitUtils.applyWait(driver,productDetailPage.addToCartButton,WaitStrategy.CLICKABLE);
//        productDetailPage.addToCart();
//        WaitUtils.applyGlobalWait();
//        driver.navigate().back();
//        WaitUtils.applyGlobalWait();
//
//        String n=productDetailPage.cartCount();
//        System.out.println(n);
//
//
//    }


//
//    @Test
//    public void test_Max_Min_price() throws InterruptedException {
//
//        this.landingPage = new LandingPage(driver);
//        WaitUtils.applyGlobalWait();
//        landingPage.searchInput("Washing Machine");
//        landingPage.enterKey();
//
//        WaitUtils.applyGlobalWait();
//
//        this.searchPage=new SearchPage(driver);
//        searchPage.selectMaxPrice("25000");
//        WaitUtils.applyGlobalWait();
//
//        searchPage.selectMinPrice("15000");
//        WaitUtils.applyGlobalWait();
//        searchPage.clickOnPriceLowToHigh();
//        WaitUtils.applyGlobalWait();
//        searchPage.pricesLowToHigh(15000);
//        WaitUtils.applyGlobalWait();
//        searchPage.pricesHighToLow(25000);
//
//
//        }


    Actions actions;

    @Test
    public void Flight_Search() throws InterruptedException {
        this.landingPage = new LandingPage(driver);
        this.actions = new Actions(driver);
        landingPage.clickOnFlightButton();


        WaitUtils.applyGlobalWait();


        WebElement departureDateDropDown = driver.findElement(By.xpath("//input[@name='0-datefrom']"));
        WaitUtils.applyWait(driver,departureDateDropDown,WaitStrategy.CLICKABLE);
        actions.click(departureDateDropDown).perform();
        date("April 2025","10");


        WaitUtils.applyGlobalWait();

        WebElement destinationDateDropDown = driver.findElement(By.xpath("//input[@name='0-dateto']"));
        actions.click(destinationDateDropDown).perform();
        date("May 2025","20");

        WaitUtils.applyGlobalWait();

        WebElement departure=driver.findElement(By.xpath("//input[@name='0-departcity']"));
        WaitUtils.applyWait(driver,departure,WaitStrategy.CLICKABLE);
        actions.click(departure).perform();
        WaitUtils.applyGlobalWait();
        citydep("BOM");

        WaitUtils.applyGlobalWait();


        //
        WebElement destination=driver.findElement(By.xpath("//input[@name='0-arrivalcity']"));
        WaitUtils.applyWait(driver,destination,WaitStrategy.CLICKABLE);
        actions.click(destination).perform();
        WaitUtils.applyGlobalWait();
        citydest("BKK");


    }


    public void citydep(String cityName){

        List<WebElement> departureCities = driver.findElements(By.xpath("//div[@class='zeQVwu']//div[@class='V4BMfY'][1]//div[@class='_1wlldp']"));
        for (WebElement departcity : departureCities) {

            if (departcity.getText().equals(cityName)) {
                actions.moveToElement(departcity).click().perform();
                break;
            }
        }
    }


    public void citydest(String cityName){

        List<WebElement> destinationCities = driver.findElements(By.xpath("//div[@class='zeQVwu']//div[@class='V4BMfY'][2]//div[@class='_1wlldp']"));
        for (WebElement destcity : destinationCities) {

            if (destcity.getText().equals(cityName)) {
                actions.moveToElement(destcity).click().perform();
                break;
            }
        }
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
                actions.moveToElement(day).click().perform();
                break;
            }
        }

    }




}








