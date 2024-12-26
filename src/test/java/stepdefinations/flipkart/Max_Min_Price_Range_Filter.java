package stepdefinations.flipkart;

import Utils.WaitUtils;
import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.flipKart.LandingPage;
import pages.flipKart.SearchPage;

public class Max_Min_Price_Range_Filter extends BaseTest {




    LandingPage landingPage;
    SearchPage searchPage;

    @Before
    public void prepareed(){
        setUp();

        WaitUtils.applyGlobalWait();

    }




    @When("I enter productname in search bar {string}")
    public void i_enter_productname_in_search_bar(String product_name) throws InterruptedException  {
        this.landingPage=new LandingPage(driver);
        landingPage.searchInput(product_name);
        WaitUtils.applyGlobalWait();

    }

    @When("I click Search button")
    public void i_click_search_button() {
        landingPage.enterKey();
    }

    @Then("I must be navigated to search page")
    public void i_must_be_navigated_to_search_page() {
        WaitUtils.applyGlobalWait();
    }

    @When("the user sets the minimum price filter to {string}")
    public void the_user_sets_the_minimum_price_filter_to(String min_price) {
        this.searchPage=new SearchPage(driver);
        WaitUtils.applyGlobalWait();
        searchPage.selectMinPrice(min_price);


    }

    @When("sets the maximum price filter to {string}")
    public void sets_the_maximum_price_filter_to(String max_price) {
        WaitUtils.applyGlobalWait();
//        this.searchPage=new SearchPage(driver);
        searchPage.selectMaxPrice(max_price);

    }


    @When("the user selects the {string} sorting option")
    public void the_user_selects_the_sorting_option(String string) {

    }

    @Then("the products displayed should have prices greater than or equal to {string}")
    public void the_products_displayed_should_have_prices_greater_than_or_equal_to(String string) {

    }


    @Then("no product outside this price range should appear in the filtered results.")
    public void no_product_outside_this_price_range_should_appear_in_the_filtered_results() {

    }



    @After
    public void tear(){
        tearDown();
    }



}
