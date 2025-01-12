package stepdefinations.flipkart;

import Utils.WaitUtils;
import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import pages.flipKart.LandingPage;
import pages.flipKart.LoginPage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;


public class NavigateToLOginPage extends BaseTest {


    LandingPage landingPage;
    LoginPage loginPage;


    @Before
    public void prepareed(){
            setUp();

    }

    @Given("The user is on flipKart home page")
    public void the_user_is_on_flip_kart_home_page() throws InterruptedException {


        try {

            if(driver.findElements(By.xpath("//div[@class='JFPqaw']//span")).size() > 0) {
                driver.findElement(By.xpath("//div[@class='JFPqaw']//span")).click();
                logger.info("pou up windows is closed ");
            }else {
            logger.info("there is no pop up to be closed");            }
        }catch (ElementNotInteractableException e){
            Thread.sleep(8000);
            logger.error("failed to close the pop_up windows"+e);
            throw  new RuntimeException("flipKart home page failed");
        }
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
    public void tear(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Failed Screenshot",new ByteArrayInputStream(screenshot));
        }
        tearDown();

    }


}
