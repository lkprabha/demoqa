package PageObjects;

import PageFactory.PageFactory;
import Utility.CVSFileHandler;
import Utility.WebDriverHelper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class POUserRegistration{

    public static void UserRegister(){
    try {
        Assert.assertEquals("Text Box",(PageFactory.wpf.Header_Caption.getText()));
        String[] sequence = CVSFileHandler.csvDataRead("C:/Users/Praba/projects/demoqa/src/test/Resources/Data/RegistrationData.csv", 4);
        String UserName =sequence[0];
        String UserEmail=sequence[1];
        String UserCurrentAddress =sequence[2];
        String UserPermenetAddress=sequence[3];

        PageFactory.wpf.UserName_TextBox.sendKeys(UserName);

        if(!sequence[2].contains("@")) {
            System.out.println("Email should contains @ sign !");
        }
        else{
            PageFactory.wpf.UserEmail_TextBox.sendKeys(UserEmail);
        }
        PageFactory.wpf.CurrentAddress_Placeholder.sendKeys(UserCurrentAddress);
        PageFactory.wpf.CurrentAddress_Textarea.sendKeys( UserPermenetAddress);

        WebDriverHelper.getWebDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Actions actions = new Actions(WebDriverHelper.getWebDriver());
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) (WebDriverHelper.getWebDriver());
        javascriptExecutor.executeScript("window.scrollBy(0,350)", "");
        actions.moveToElement(WebDriverHelper.getWebDriver().findElement(By.id("submit"))).click().perform();

        PageFactory.wpf.Submit_Button.click();
        if((PageFactory.wpf.Submit_Button.isSelected())){
            CheckUserName(UserName);
            CheckUserEmail(UserEmail);
            CheckUserCurrentAddress(UserCurrentAddress);
            CheckUserPerAddress(UserPermenetAddress);
            WebDriverHelper.closeWebDriver();
        }


    } catch (IOException e) {
        e.printStackTrace();
    }
  }
    private  static void CheckUserName(String userName){
        if(PageFactory.wpf.UserName_TextBox.getText().contains(userName)){
            System.out.println("User Name is present");
        }else{
            System.out.println("User Name is absent");
        }
    }
    private static void CheckUserEmail(String userEmail) {
        if(PageFactory.wpf.UserEmail_TextBox.getText().contains(userEmail)){
            System.out.println("User Email is present");
        }else{
            System.out.println("User Email is absent");
        }
    }

    private static void CheckUserCurrentAddress(String userCurrentAddress) {
        if(PageFactory.wpf.CurrentAddress_Placeholder.getText().contains(userCurrentAddress)){
            System.out.println("User Current Address is present");
        }else{
            System.out.println("User Current address is absent");
        }
    }

    private static void CheckUserPerAddress(String userPerAddress) {
        if(PageFactory.wpf.CurrentAddress_Textarea.getText().contains(userPerAddress)){
            System.out.println("User Permanent Address is present");
        }else{
            System.out.println("User Permanent Address  is absent");
        }
    }
}





