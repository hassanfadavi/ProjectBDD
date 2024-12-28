//package pages.practice_BDD;
//
//import io.cucumber.datatable.DataTable;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//
//import java.util.List;
//import java.util.Map;
//
//import static enums.WaitStrategy.VISIBLE;
//
//public class PracticeLoginPage {
//
//
//    WebDriver driver;
//
//    public WebElement email;
//    public WebElement pass;
//    public WebElement loginButton;
//    public WebElement verifyLogin;
//
//
//    public PracticeLoginPage(WebDriver driver){
//        this.driver=driver;
//        email=driver.findElement(By.xpath("//input[@name='username']"));
//        pass=driver.findElement(By.xpath("//input[@id='password']"));
//        loginButton=driver.findElement(By.xpath("//input[@name='login']"));
//
//
//
//    }
//
//
//    public void enterEmail(String emailInput){
//        email.sendKeys(emailInput);
//    }
//
//
//    public void enterpass(String passInput){
//        pass.sendKeys(passInput);
//    }
//
//    public void enterpass1(String passInput){
//        pass.sendKeys("Test@selenium");
//    }
//
//
//   //**************for scenario with Data table************************************
//    public void enterEmailAndPass(DataTable dataTable){
//        List <List<String>> data=dataTable.asLists();
//        email.sendKeys(data.get(0).get(0));
//        pass.sendKeys(data.get(0).get(1));
//    }
////***************************************************************************
//
//
//    //**************for scenario with Data table using header ************************************
//    public void enterEmailAndPassWithHeader(DataTable dataTable){
//        List <Map<String,String>> data=dataTable.asMaps(String.class,String.class);
//        email.sendKeys(data.get(0).get("user"));
//        pass.sendKeys(data.get(0).get("pass"));
//    }
////***************************************************************************
//
//
//    public void clickOnLoginButton(){
//        loginButton.click();
//
//    }
//
//    public WebElement verifyLogin(){
//
//        verifyLogin=driver.findElement(By.xpath("//ul[@class='woocommerce-error']/li/strong"));
//      return   WaitUtils.applyWait(driver,verifyLogin,VISIBLE);
//
//    }
//
//
//
//
//
//
//}
