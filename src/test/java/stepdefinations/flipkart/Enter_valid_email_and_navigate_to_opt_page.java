package stepdefinations.flipkart;

import Utils.WaitUtils;
import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import pages.flipKart.LoginPage;
import pages.flipKart.OptPage;

import java.io.ByteArrayInputStream;


public class Enter_valid_email_and_navigate_to_opt_page extends BaseTest {




    LoginPage loginPage;
    OptPage optPage;


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


    @Then ("I should see the OTP message")
    public void I_should_see_the_OTP(){
        WaitUtils.applyGlobalWait();
//        loginPage.optText.getText();
//        WaitUtils.applyWait(driver,loginPage.loginText, WaitStrategy.PRESENCE);
//       WebElement ac=driver.findElement(By.xpath("//div[@class='r6+Mxy']//div[text()='Please enter the OTP sent to']"));
        this.optPage=new OptPage(driver);

        String actualText=optPage.optText.getText();
        String expectedText="Please enter the OTP sent to";
        Assert.assertEquals("not match", expectedText,actualText);

    }





    @After
    public void tear(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Failed Screenshot",new ByteArrayInputStream(screenshot));
        }
        tearDown();

    }





}
