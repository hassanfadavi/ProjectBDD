package config;

import enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {


  public static   ChromeOptions  chromeOption;
 public static    EdgeOptions  edgeOptions;
 public static    FirefoxOptions firefoxOptions;


    public static final ThreadLocal<WebDriver>driver=new ThreadLocal<>(); //multiple browser is being opened


    public static WebDriver getDriver(){
        if(driver.get()==null){

            initializeWebDriver();
        }
        return driver.get();
    }



    public static void initializeWebDriver(){
         WebDriver webdriver;
        boolean isHeadless=Boolean.parseBoolean ( ConfigManager.getProperty("isHeadless"));
        if(isHeadless){
            System.out.println("headless: "+isHeadless+" (the browser operates in the background") ;
        }else {
            System.out.println("headless: "+isHeadless+" (The browser runs with a visible GUI") ;
        }



        Browser  browser=Browser.valueOf( ConfigManager.getProperty("browser").toUpperCase());
        System.out.println("Browser: "+browser    );
        ConfigManager.logger.info("Configuration loaded for { "+browser+" } browser: ");


        switch (browser){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                chromeOption =new ChromeOptions();
             if(isHeadless){
                 chromeOption.addArguments("--headless");
             }
                webdriver=new ChromeDriver(chromeOption);
             break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                edgeOptions=new EdgeOptions();
                if(isHeadless){
                    edgeOptions.addArguments("--headless");
                }
                webdriver=new EdgeDriver(edgeOptions);
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                firefoxOptions=new FirefoxOptions();
                if(isHeadless){
                    firefoxOptions.addArguments("--headless");
                }
                webdriver=new FirefoxDriver(firefoxOptions);
                break;
            case SAFARI:
                WebDriverManager.safaridriver().setup();
                webdriver = new SafariDriver();
                break;
            default:
                throw new IllegalArgumentException("browser is out of list" +browser);

        }


        webdriver.manage().window().maximize();
        driver.set(webdriver);


    }

//
//    public static void main(String[] args) {
//        initializeWebDriver();
//       webdriver.get(ConfigManager.getProperty("baseUrl"));
//    }

    public static void quitDriver(){

        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();

        }

    }


}

