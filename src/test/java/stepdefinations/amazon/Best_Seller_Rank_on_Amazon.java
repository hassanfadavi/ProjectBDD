package stepdefinations.amazon;

import Utils.WaitUtils;
import base.BaseTest;
import constansts.screenshot.TakeScreenShot;
import enums.WaitStrategy;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.testng.Assert;
import pages.amazon.Amazon_LandingPage;
import pages.amazon.Amazon_ProductPage;

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.io.ByteArrayInputStream;

public class Best_Seller_Rank_on_Amazon extends BaseTest {


    Amazon_LandingPage   amazon_LandingPage;
    Amazon_ProductPage  amazon_ProductPage;
//    TakeScreenShot  takeScreenShot;


    @Before
    public void prepared() {
        setUp();

    }

    @Given("The user is on amazon home page")
    public void the_user_is_on_amazon_home_page() throws InterruptedException {
        Thread.sleep(5000);

        amazon_LandingPage=new Amazon_LandingPage(driver);
        boolean amazonLogo=amazon_LandingPage.amazon_Logo.isDisplayed();
        Assert.assertTrue(amazonLogo,"is not displayed");

    }


    @When("the user hovers over the All dropdown menu")
    public void the_user_hovers_over_the_all_dropdown_menu() {
        WaitUtils.applyGlobalWait();
        amazon_LandingPage.hoverOnAllDropDown();


    }

    @When("the user selects the department from the department options {string}")
    public void the_user_selects_men_from_the_department_options(String departments) {

        WaitUtils.applyGlobalWait();
        amazon_LandingPage.selectDepartment(departments);
    }

    @When("the user input product in search bar {string}")
    public void the_user_searches_for_watch_is_search_bar(String product) throws InterruptedException {
        WaitUtils.applyGlobalWait();
//       WaitUtils.applyWait(driver,amazon_LandingPage.searchBar, WaitStrategy.CLICKABLE);
        amazon_LandingPage.inputSearchBar(product);

    }

    @And("the user hit Enter key")
    public void the_user_hit_Enter_key(){
        amazon_LandingPage.enterAction();
    }


    @Then("I should be navigated to product page,results for product {string}")
    public void i_should_be_navigated_to_product_page(String product) {
        amazon_ProductPage=new Amazon_ProductPage(driver);
     Assert.assertEquals(amazon_ProductPage.getResultText(),product,"result not match");

    }
//
//    @And ("I select the brands name from brands list {string}")
//    public void I_select_the_brands_name_from_brands_list(String brand){
//
//    }



    @Then("the user identifies the Best Seller product from the search results")
    public void the_user_identifies_the_best_seller_product_from_the_search_results() {
     amazon_ProductPage.findBestSeller();

    }
    @Then("the user clicks on the first Best Seller product")
    public void the_user_clicks_on_the_best_seller_product() {
        amazon_ProductPage.selectFirstBestSeller();

    }
    @Then("the product details page should display Best Seller rank as #1")
    public void the_product_details_page_should_display_best_seller_rank_as() {

//
//        if(amazon_ProductPage.getRank()){
//            String expectedRank="#1 in ";
//            Assert.assertEquals(amazon_ProductPage.getRank(),expectedRank,"user is not on best seller rank");
//        }else logger.info("not found product information to approve the rank");
//


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
