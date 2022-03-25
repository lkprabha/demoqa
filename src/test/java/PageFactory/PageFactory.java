package PageFactory;

import Utility.WebDriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactory {
    public static PageFactory wpf = org.openqa.selenium.support.PageFactory.initElements(WebDriverHelper.getWebDriver(),
            PageFactory.class);

    /*  User Sign In page elements  */
   @FindBy(how = How.XPATH ,using = "//div[@class='main-header']")
   public WebElement Header_Caption;

   @FindBy(how = How.XPATH,using = "//input[@id='userName']")
   public WebElement UserName_TextBox;


    @FindBy(how = How.XPATH,using = "//input[@id='userEmail']")
    public  WebElement UserEmail_TextBox;

    @FindBy(how = How.XPATH ,using = "//textarea[@id='currentAddress']")
    public WebElement CurrentAddress_Placeholder;

    @FindBy(how = How.XPATH,using = "//textarea[@id='permanentAddress']")
    public  WebElement CurrentAddress_Textarea;

    @FindBy(how = How.ID,using = "submit")
    public  WebElement Submit_Button;


}