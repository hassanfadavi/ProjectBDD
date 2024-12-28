//package stepdefinations.Practice;
//
//import base.BaseTest;
//import config.DriverFactory;
//import enums.WaitStrategy;
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import org.testng.Assert;
//import pages.practice_BDD.PracticeAccountPage;
//import pages.practice_BDD.PracticeLandingPage;
//import pages.practice_BDD.PracticeLoginPage;
//import utils.WaitUtils;
//
//import java.util.List;
//
//import static enums.WaitStrategy.VISIBLE;
//
//public class NavigateToAccountPageStep extends BaseTest {
//
//    PracticeLandingPage practiceLandingPage;
//    PracticeLoginPage practiceLoginPage; ;
//    PracticeAccountPage practiceAccountPage;
//
//
//   @Before
//   public void Setup(){
//       setup();
//       this.practiceLandingPage=new PracticeLandingPage(DriverFactory.getDriver());
//   }
//
//    @Given ("The user is on homePage")
//    public void The_user_is_on_homePage(){
//
//
//    }
//
//    @And("I click on log in")
//    public void i_click_on_log_in() {
//
//        practiceLandingPage.clickOnLogin();
//        WaitUtils.applyGlobalWait();
//
//    }
//
//
//
//    @And("I enter email {string}")
//    public void I_enter_email(String inputType) {
//        this.practiceLoginPage=new PracticeLoginPage(DriverFactory.getDriver()) ;
//        practiceLoginPage.enterEmail(inputType);
//
//    }
//
//    //just for scenario1
//    @And ("I enter password1")
//    public void I_enter_password1() {
//        practiceLoginPage.enterpass1("Test@selenium");
//    }
//
//    @And ("I enter password {string}")
//    public void I_enter_password(String inputPass) {
//        practiceLoginPage.enterpass(inputPass);
//    }
//
//
//
//    //*********************for Data table scenario****************************************
//    @And("I enter email and password4")
//    public void i_enter_email_and_password(DataTable dataTable) {
//       this.practiceLoginPage=new PracticeLoginPage(DriverFactory.getDriver()) ;
//       practiceLoginPage.enterEmailAndPass(dataTable);
//    }
////***************************************************************************************
//
//
//    //*********************for Data table scenario with header****************************************
//    @And("I enter email and password5")
//    public void i_enter_email_and_password5(DataTable dataTable) {
//        this.practiceLoginPage=new PracticeLoginPage(DriverFactory.getDriver()) ;
//        practiceLoginPage.enterEmailAndPassWithHeader(dataTable);
//    }
////*******************************************************************************
//
//
//
//    @And("I click on login button")
//    public void i_click_on_login_button() {
//       practiceLoginPage.clickOnLoginButton();
//       WaitUtils.applyGlobalWait();
//    }
//
//
//
//    //*********************for invalid scenario****************************************
//    @Then ("verify login")
//    public void verify_login(){
//      String actualText=practiceLoginPage.verifyLogin().getText();
//      WaitUtils.applyGlobalWait();
//      String expectedText="Error:";
//         Assert.assertEquals(actualText,expectedText,"invalid user");
//    }
////*****************************************************************************************
//
//
//
////
//    @Then("user must successfully login to the webPage")
//    public void user_must_successfully_login_to_the_web_page() {
//     this.practiceAccountPage =new PracticeAccountPage(DriverFactory.getDriver());
//        String actualText= practiceAccountPage.validateMyAccount.getText();
//        String expectedText="hassan1";
//        try {
//            Assert.assertEquals(actualText,expectedText,"not  match");
//        }catch (Exception e) {
//            logger.info("check verification");
//        }
//
//    }
//
//
//    @Then ("I click on logout")
//    public void  I_click_on_logout(){
//       practiceAccountPage.clickOnLogOut();
//
//    }
//
//    @After
//    public void tear(){
//       tearDown();
//    }
//
//
//}
