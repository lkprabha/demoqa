package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverHelper {

    static WebDriver driver;

    public static WebDriver startDriver(String browserName, String url) {
        WebDriverManager.chromedriver().setup();
        if (PropertyFileHandler.readProperty(browserName).equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(PropertyFileHandler.readProperty(browserName).equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(PropertyFileHandler.readProperty(url));
        return driver;
    }

    public static WebDriver getWebDriver(){
        return driver;
    }

    public static void closeWebDriver(){
        driver.close();
    }

    public static String getUrl() throws InterruptedException {
        Thread.sleep(4000);
        String url = driver.getCurrentUrl();
        return url;
    }
}
