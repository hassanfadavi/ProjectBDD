package stepdefinations.flipkart;

import Utils.WaitUtils;
import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.flipKart.LoginPage;


public class Enter_valid_email_and_navigate_to_opt_page extends BaseTest {




    LoginPage loginPage;


    @Before
    public void prepareed(){
        setUp();
    }


    @Then("The user is  on flipKart login page")
    public void the_user_is_on_flip_kart_login_page() {


    }
    @And("I enter valid email address {string}")
    public void i_enter_valid_email_adress(String email) throws InterruptedException {
        this.loginPage=new LoginPage(driver);
        WaitUtils.applyGlobalWait();
        loginPage.enterEmail(email);



    }
    @When("I click on RequestOTP button")
    public void i_click_on_request_otp_button() {
        WaitUtils.applyGlobalWait();
        loginPage.clickOnOptButton();


    }

//
//    @Then ("I should see the OTP")
//    public void I_should_see_the_OTP(){
//        loginPage.optText.getText();
////        WaitUtils.applyWait(driver,loginPage.loginText, WaitStrategy.PRESENCE);
//
//        String  actualText=loginPage.optText.getText();
//        String expectedText="Please enter the OTP sent to";
//        Assert.assertEquals(actualText,expectedText,"not match");
//
//    }





    @After
    public void tear(){
        tearDown();
    }





}
