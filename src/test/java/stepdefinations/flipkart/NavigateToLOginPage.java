package stepdefinations.flipkart;

import Utils.WaitUtils;
import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.flipKart.LandingPage;
import pages.flipKart.LoginPage;


public class NavigateToLOginPage extends BaseTest {


    LandingPage landingPage;
    LoginPage loginPage;


    @Before
    public void prepareed(){
        setUp();

    }

    @Given("The user is on flipKart home page")
    public void the_user_is_on_flip_kart_home_page() {

    }

    @When("I double click on login button")
    public void i_double_click_on_login_button() throws InterruptedException {
        this.landingPage=new LandingPage(driver);

     WaitUtils.applyGlobalWait();
        landingPage.clickOnLoginButton();

    }
    @Then("I should see Login text")
    public void i_should_see_login_text() {
       this. loginPage=new LoginPage(driver);

     String  actualText=loginPage.loginText.getText();
     String expectedText="Login";
     Assert.assertEquals(actualText,expectedText,"not match");


    }





    @After
    public void tear(){
        tearDown();
    }


}
