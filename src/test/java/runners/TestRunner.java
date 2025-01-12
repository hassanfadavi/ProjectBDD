package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(

        features = "src/test/resources/feature/flipKart",         //accept either class or package
//        features = "src/test/resources/feature.amazon",         //accept either class or package

        glue = "stepdefinations/flipkart",  //just accept the package
//        glue = "stepdefinations/amazon",  //just accept the package
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "html:test-output",
                "json:json_output/cucumber.json",
                "junit:junit_xml_output/test.xml"},
        dryRun = false,
        monochrome = true,
        //***************** https://www.amazon.com/**************************
//        tags="@Best_Seller_Rank"
//        tags="@max_price_in_best_seller_pag"



  //***************** https://www.flipkart.com/**************************
//          tags="@navigate_to_login_page"
//      tags="@navigate_to_opt_page"
//         tags ="@Product_Search"
//        tags = "@add_product_to_cart"
//        tags ="@Price_Range"
//        tags ="@Flight_Search"
          tags = "@Discount_filter"

)

public class TestRunner extends  AbstractTestNGCucumberTests {


}
