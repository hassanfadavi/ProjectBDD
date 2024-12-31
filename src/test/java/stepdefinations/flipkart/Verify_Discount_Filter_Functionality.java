package stepdefinations.flipkart;

import Utils.WaitUtils;
import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.ElementNotInteractableException;
import org.testng.Assert;
import pages.flipKart.LandingPage;
import pages.flipKart.ProductDetailPage;

import javax.swing.plaf.PanelUI;

public class Verify_Discount_Filter_Functionality extends BaseTest {

    LandingPage  landingPage;
    ProductDetailPage productDetailPage;

    @Before
    public void prepareed(){
        setUp();

    }


    @When("I hover over the Fashion category in the navigation bar")
    public void i_hover_over_the_category_in_the_navigation_bar() {
        this.landingPage=new LandingPage(driver);
        landingPage.mouseHoverOnFashion();
        WaitUtils.applyGlobalWait();



    }
    @When("I navigate to Men_Footwear and then Men’s Sports Shoes")
    public void i_navigate_to_men_footware_and_then_men_s_sports_shoes() {
        landingPage.mouseHoverOnMensFootWear();
        WaitUtils.applyGlobalWait();
        landingPage.clickOnMensSportShoes();
        WaitUtils.applyGlobalWait();

    }
    @Then("I will be navigated to product's detail page")
    public void i_will_be_navigated_to_product_s_detail_page() {
        this.productDetailPage=new ProductDetailPage(driver);
       String actualText=productDetailPage.getmensSportTex();
        Assert.assertEquals(actualText,"Men’s Sports Shoes","not match");
        WaitUtils.applyGlobalWait();

    }

    @Then ("I hover over the Discount filter on the left-hand side of the page")
    public void I_hover_over_the_Discount_filter_on_the_left_hand_side_of_the_pag(){
     try {
         if(productDetailPage.discountOptionsVisibles().isDisplayed()){
             logger.info("Discount options are already open. No need to click");
         } else productDetailPage.clickOnDiscountDropDown();

     }catch (ElementNotInteractableException e){
         logger.error("failed to open Discount options"+e);
         throw  new RuntimeException("Discount options failed");
     }
    }


    @When("I select a discount filter {string}")
    public void i_select_a_discount_filter_of_discount_percentage_from_left_hand_side_of_the_page(String discount) {
        WaitUtils.applyGlobalWait();
        productDetailPage.selectPercentages(discount);
        logger.info(discount+" is selected");
        WaitUtils.applyGlobalWait();

    }
//    @Then("All products in the listing should have a valid discount of percentages or more {string}")
//    public void all_products_in_the_listing_should_have_a_discount_of_percentages_or_more(String percentage) {
//        productDetailPage.percentage(percentage);
//
//    }


//    @After
//    public void tear(){
//        tearDown();
//    }


}

