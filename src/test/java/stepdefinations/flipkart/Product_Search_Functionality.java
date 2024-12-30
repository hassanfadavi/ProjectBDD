package stepdefinations.flipkart;

import Utils.WaitUtils;
import base.BaseTest;
import config.ConfigManager;
import enums.WaitStrategy;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.flipKart.LandingPage;
import pages.flipKart.SearchPage;

public class Product_Search_Functionality extends BaseTest {



    LandingPage  landingPage;
    SearchPage searchPage;

    @Before
    public void prepareed(){
        setUp();
//        this.landingPage=new LandingPage(driver);
        WaitUtils.applyGlobalWait();

    }


    @When("I enter product_name in search bar {string}")
    public void i_enter_product_name_in_search_bar(String product_name) throws InterruptedException {
        this.landingPage=new LandingPage(driver);
        landingPage.searchInput(product_name);
//        System.out.println(product_name);
        WaitUtils.applyGlobalWait();
//        driver.navigate().to(ConfigManager.getProperty("baseUrl"));


    }


    @And("I click the Search button")
    public void i_click_the_search_button() {
        landingPage.enterKey();

    }

    @Then("I should be navigated to search page")
    public void i_should_be_navigated_to_search_page() {
        WaitUtils.applyGlobalWait();

    }

    @Then("results displayed should be related to the selected category {string}")
    public void results_displayed_should_be_related_to_the_selected_category(String categories) {
        this.searchPage=new SearchPage(driver);
        WaitUtils.applyGlobalWait();
//        WaitUtils.applyWait(driver,searchPage., WaitStrategy.VISIBLE);

      String actualCategory= searchPage.getCategory();
//      String expectedCategory=categories;
        Assert.assertEquals(actualCategory,categories,"results are not matched to the categories");

    }




    @After
    public void tear(){
        tearDown();
    }




}
