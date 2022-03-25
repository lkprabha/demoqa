package Runner;


import TestCases.TestUserRegistration;
import Utility.PropertyFileHandler;
import Utility.WebDriverHelper;

import java.io.FileNotFoundException;
import java.io.IOException;


public class RunnerClass {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException{       //Pre-requisites
        PropertyFileHandler.getPropertyFileHandler();
        PropertyFileHandler.loadPropertyFile("C:/Users/Praba/projects/demoqa/src/test/Resources/Data/DriverProperties.properties");
        WebDriverHelper.startDriver("browser", "url");

        //TestCases

        TestUserRegistration.testCaseNumber1();

        //TearDown
        System.out.println("Test Suite Complete!!");
        Thread.sleep(4000);
        WebDriverHelper.closeWebDriver();

    }
}
