package TestClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import static java.lang.System.out;


public class TestUserRegistration {
    public static WebDriver driver;
    public static void main(String[] args) {
        //   String ProjectPath = System.getProperty("user.dir");
        //   String ProjectPath = System.getProperty("user.dir");
        //   System.setProperty("webdriver.gecko.driver", ProjectPath + "/src/test/Resources/geckodriver.exe");


        System.setProperty("webdriver.gecko.driver", "C:/Users/Praba/projects/demoqa/src/test/Resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/text-box");

        String UserName= "Test01";
        String UserEmail= "userEmailgamil.com";
        String UserCurrentAddress= "testing 123";
        String UserPermenetAddress = "testing123";

        driver.findElement(By.id("userName")).sendKeys(UserName);
        if(!UserEmail.contains("@")){
            driver.findElement(By.id("userEmail")).sendKeys("");
            System.out.println("Email should contains @ sign !");
            driver.quit();
        }
        driver.findElement(By.id("currentAddress")).sendKeys(UserCurrentAddress);
        driver.findElement(By.id("permanentAddress")).sendKeys(UserPermenetAddress);

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Actions actions = new Actions(driver);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,350)", "");
        actions.moveToElement(driver.findElement(By.id("submit"))).click().perform();
        CheckUserName(UserName);
        CheckUserEmail(UserEmail);
        CheckUserCurrentAddress(UserCurrentAddress);
        CheckUserPerAddress(UserPermenetAddress);

    }
    private static void CheckUserName(String userName) {
        if(driver.findElement(By.xpath("//p[@id='name']")).getText().contains(userName)){
            System.out.println("User Name is present");
        }else{
            System.out.println("User Name is absent");
        }
    }
    private static void CheckUserEmail(String userEmail) {
        String InParaEmail = driver.findElement(By.id("email")).getText();
        if(driver.findElement(By.xpath("//p[@id='email']")).getText().contains(userEmail)){
            System.out.println("User Email is present");
        }else{
             System.out.println("User Email is absent");
        }
    }

    private static void CheckUserCurrentAddress(String userCurrentAddress) {
       if(driver.findElement(By.xpath("//p[@id='currentAddress']")).getText().contains(userCurrentAddress)){
            System.out.println("User Current Address is present");
        }else{
            System.out.println("User Current address is absent");
        }
    }

    private static void CheckUserPerAddress(String userPerAddress) {
        if(driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText().contains(userPerAddress)){
            System.out.println("User Permanent Address is present");
        }else{
            System.out.println("User Permanent Address  is absent");
        }
    }

}

