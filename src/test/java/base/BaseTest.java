package base;

import config.ConfigManager;
import config.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    protected WebDriver driver;

    protected static final Logger logger= LogManager.getLogger();


    @BeforeMethod
    public void setUp() {

            this.driver = DriverFactory.getDriver();
            driver.get(ConfigManager.getProperty("baseUrl"));
            logger.info("start the test with the :{  " + ConfigManager.getProperty("baseUrl") + "  }");


    }






    @AfterMethod
    public void tearDown(){
//        DriverFactory.quitDriver();
//        logger.info("Driver instance is quit after the test");
    }




//    public static void main(String[] args) {
//
//        BaseTest obj=new BaseTest();
//        obj.setUp();
////       obj.tearDown();
//
//    }



}
