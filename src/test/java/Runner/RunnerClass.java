package Runner;


import TestCases.TestCheckBoxFileSelection;
import Utility.PropertyFileHandler;
import Utility.WebDriverHelper;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.io.FileNotFoundException;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"})

public class RunnerClass {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException{       //Pre-requisites
        PropertyFileHandler.getPropertyFileHandler();
        PropertyFileHandler.loadPropertyFile("C:/Users/Praba/projects/demoqa/src/test/Resources/Data/DriverProperties.properties");
        //WebDriverHelper.startDriver("browser", "url");
        WebDriverHelper.startDriver("browser", "url_CheckBoxPage");
        //TestCases

        // TestUserRegistration.testCaseNumber1();
         TestCheckBoxFileSelection.testCaseNumber2();

        //TearDown
        System.out.println("Test Suite Complete!!");
        Thread.sleep(4000);
        WebDriverHelper.closeWebDriver();

    }
}
