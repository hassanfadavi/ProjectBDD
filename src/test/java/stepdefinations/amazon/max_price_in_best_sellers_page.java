package stepdefinations.amazon;

import Utils.WaitUtils;
import base.BaseTest;
import constansts.screenshot.TakeScreenShot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.testng.Assert;
import pages.amazon.Amazon_LandingPage;
import pages.amazon.Amazon_best_seller_departments;
import pages.amazon.Amazon_best_seller_page;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class max_price_in_best_sellers_page extends BaseTest {


    Amazon_LandingPage  amazon_LandingPage;
    Amazon_best_seller_page  amazon_best_seller_page;
    Amazon_best_seller_departments amazon_best_seller_departments;
//    TakeScreenShot  takeScreenShot;




    @Before
    public void prepared() {
        setUp();

    }


    @When("the user clicks on Best sellers link")
    public void the_user_clicks_on_best_sellers_link() {

        this.amazon_LandingPage=new Amazon_LandingPage(driver);
        amazon_LandingPage.click_on_best_seller();
        WaitUtils.applyGlobalWait();

    }


    @Then("the user will be navigated to Amazon Best seller")
    public void the_user_will_be_navigated_to_amazon_best_seller() {
       String actualText=amazon_LandingPage.get_best_seller_text();
       String expectedText="Amazon Best Sellers";
        Assert.assertEquals(actualText,expectedText,"best seller text is not match");
        WaitUtils.applyGlobalWait();

    }



    @Then("the user selects the specific department from the left side bar {string}")
    public void the_user_selects_the_specific_department_from_the_left_side_bar(String department) {
        this.amazon_best_seller_page=new Amazon_best_seller_page(driver);
        amazon_best_seller_page.select_department(department);
        WaitUtils.applyGlobalWait();


    }




    @Then("the user will be navigated to Best Sellers in specific department {string}")
    public void the_user_will_be_navigated_to_best_sellers_in_specific_department(String department) {
     String  actualText= amazon_best_seller_page.getBestSellerText();
        String expectedText = "Best Sellers in " + department;
        Assert.assertEquals(actualText,expectedText,"best sellere in department is not match ");


    }

    @Then("the user extracts the prices of all best-selling items in two pages")
    public void the_user_extracts_the_prices_of_all_best_selling_items_in_pages( ) throws InterruptedException {
        this.amazon_best_seller_departments=new Amazon_best_seller_departments(driver);
        double max_price_in_page_1=amazon_best_seller_departments.max_price_best_seller(); //%.2f ensures the value is formatted to 2 decimal places.
        System.out.println("max_price_in_page_1: "+ String.format("%.2f", max_price_in_page_1));
        WaitUtils.applyGlobalWait();
        amazon_best_seller_departments.clickOnPageTwo();
        double max_price_in_page_2=amazon_best_seller_departments.max_price_best_seller();
        System.out.println("max_price_in_page_2: "+ String.format("%.2f", max_price_in_page_2));
        WaitUtils.applyGlobalWait();

    }






    @Then("the user clicks on the product corresponding to the maximum price")
    public void the_user_clicks_on_the_product_corresponding_to_the_maximum_price() throws InterruptedException {

        double max_price_in_page_1=amazon_best_seller_departments.max_price_best_seller(); //%.2f ensures the value is formatted to 2 decimal places.
        double max_price_in_page_2=amazon_best_seller_departments.max_price_best_seller();
        String two_decimallformatted_page_1=String.format("%.2f", max_price_in_page_1);
        String two_decimallformatted_page_2=String.format("%.2f", max_price_in_page_2);
        double max_price_in_page_1_formated= Double.parseDouble(two_decimallformatted_page_1);
        double max_price_in_page_2_formated= Double.parseDouble(two_decimallformatted_page_2);

        if(max_price_in_page_1_formated>max_price_in_page_2_formated){
            driver.navigate().back();
            amazon_best_seller_departments.clickOnMax_best_seller_price(max_price_in_page_1_formated);
        }else  {
            amazon_best_seller_departments.clickOnMax_best_seller_price(max_price_in_page_2_formated);}



    }

    @After
    public void tear(Scenario scenario){
//        takeScreenShot=new TakeScreenShot();
        if (scenario.isFailed()) {
            byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Failed Screenshot",new ByteArrayInputStream(screenshot));
        }


        tearDown();

    }




}
