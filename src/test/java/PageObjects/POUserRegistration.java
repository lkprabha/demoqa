package PageObjects;

import PageFactory.PageFactory;
import Utility.CVSFileHandler;
import Utility.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class POUserRegistration{

    public static void UserRegister(){
    try {
        String[] sequence = CVSFileHandler.csvDataRead("C:/Users/Praba/projects/demoqa/src/test/Resources/Data/RegistrationData.csv", 4);
        String UserName =sequence[0];
        System.out.println("User name is :"+ UserName);
        String UserEmail=sequence[1];
        System.out.println("User email is :"+UserEmail);
        String UserCurrentAddress =sequence[2];
        System.out.println("Current Address  is :"+UserCurrentAddress);
        String UserPermenetAddress=sequence[3];
        System.out.println("Permanent Address  is :"+UserPermenetAddress);

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
    WebElement HeaderCaption = PageFactory.wpf.Header_Caption;
//        try {
//            Assert.assertEquals("Text Box", HeaderCaption.getText());
//        }
//        catch(Exception e){}


}
    private  static void CheckUserName(String userName){
        if(WebDriverHelper.getWebDriver().findElement(By.xpath("//p[@id='name']")).getText().contains(userName)){
            System.out.println("User Name is present");
        }else{
            System.out.println("User Name is absent");
        }
    }
    private static void CheckUserEmail(String userEmail) {
        String InParaEmail = WebDriverHelper.getWebDriver().findElement(By.id("email")).getText();
        if(WebDriverHelper.getWebDriver().findElement(By.xpath("//p[@id='email']")).getText().contains(userEmail)){
            System.out.println("User Email is present");
        }else{
            System.out.println("User Email is absent");
        }
    }

    private static void CheckUserCurrentAddress(String userCurrentAddress) {
        if(WebDriverHelper.getWebDriver().findElement(By.xpath("//p[@id='currentAddress']")).getText().contains(userCurrentAddress)){
            System.out.println("User Current Address is present");
        }else{
            System.out.println("User Current address is absent");
        }
    }

    private static void CheckUserPerAddress(String userPerAddress) {
        if(WebDriverHelper.getWebDriver().findElement(By.xpath("//p[@id='permanentAddress']")).getText().contains(userPerAddress)){
            System.out.println("User Permanent Address is present");
        }else{
            System.out.println("User Permanent Address  is absent");
        }
    }
}





