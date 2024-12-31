package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/feature/flipKart",         //accept either class or package
        glue = "stepdefinations/flipkart",  //just accept the package
        plugin = {
                "pretty",
                "html:test-output",
                "json:json_output/cucumber.json",
                "junit:junit_xml_output/cucumber_cucumber.xml"},
        dryRun = false,
        monochrome = true,
          tags="@navigate_to_login_page"
//      tags="@navigate_to_opt_page"
//         tags ="@Product_Search"
//        tags = "@add_product_to_cart"
//        tags ="@Price_Range"
//        tags ="@Flight_Search"
//          tags = "@Discount_filter"

)

public class TestRunner extends  AbstractTestNGCucumberTests {


}
