package stepdefinations.flipkart;

import Utils.WaitUtils;
import base.BaseTest;
import config.ConfigManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import pages.flipKart.LandingPage;
import pages.flipKart.ProductDetailPage;
import pages.flipKart.SearchPage;

import java.util.ArrayList;
import java.util.List;

public class Add_to_Cart_Functionality extends BaseTest {


    LandingPage landingPage;
    SearchPage searchPage;
    ProductDetailPage productDetailPage;

    @Before
    public void prepareed(){
        setUp();
//        this.landingPage=new LandingPage(driver);
        WaitUtils.applyGlobalWait();

    }



    @When("I enter product name in the search bar {string}")
    public void i_enter_productname_in_the_search_bar(String product_name) throws InterruptedException {
        this.landingPage=new LandingPage(driver);
        landingPage.searchInput(product_name);
        WaitUtils.applyGlobalWait();

    }
    @When("I will click the Search button")
    public void i_will_click_the_search_button() {
        landingPage.enterKey();

    }
    @Then("I would be navigated to search page")
    public void i_would_be_navigated_to_search_page() {
        WaitUtils.applyGlobalWait();

    }


    @When("I will click on my product")
    public void i_will_click_on_my_product() {
        this.searchPage=new SearchPage(driver);
        searchPage.clickOnHeadPhoneProduct();
//        searchPage.clickOnkettobyProduct();


    }
    @Then("I should be navigated to product's detail page")
    public void i_should_be_navigated_to_product_s_detail_page() {
        List<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

    }


    @When("I click the Add to Cart button")
    public void I_click_the_Add_to_Cart_button() {
        this.productDetailPage=new ProductDetailPage(driver);
        productDetailPage.addToCart();
        WaitUtils.applyGlobalWait();



    }


    @Then("the product should be added to the cart")
    public void the_product_should_be_added_to_the_cart() {
        driver.navigate().back();
        WaitUtils.applyGlobalWait();






    }
    @Then("the cart count should update accordingly")
    public void the_cart_count_should_update_accordingly() {
//
//        driver.findElement(By.xpath("//a[@class='_3CowY2']//span")).getText();
        System.out.println(driver.findElement(By.xpath("//a[@class='ZuSA--")).getText());

    }



    @After
    public void tear(){
        tearDown();
    }




}
