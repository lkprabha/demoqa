package PageFactory;

import Utility.WebDriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PageFactory {
 public static PageFactory wpf = org.openqa.selenium.support.PageFactory.initElements(WebDriverHelper.getWebDriver(),
         PageFactory.class);

 /*  User Sign In page elements  */

 @FindBy(how = How.XPATH, using = "//div[@class='main-header']")
 public WebElement Header_Caption;

 @FindBy(how = How.XPATH, using = "//input[@id='userName']")
 public WebElement UserName_TextBox;


 @FindBy(how = How.XPATH, using = "//input[@id='userEmail']")
 public WebElement UserEmail_TextBox;

 @FindBy(how = How.XPATH, using = "//textarea[@id='currentAddress']")
 public WebElement CurrentAddress_Placeholder;

 @FindBy(how = How.XPATH, using = "//textarea[@id='permanentAddress']")
 public WebElement CurrentAddress_Textarea;

 @FindBy(how = How.ID, using = "submit")
 public WebElement Submit_Button;


 ///********************* Check Box ***************************/
 @FindBy(how = How.XPATH, using = "//div[@class='main-header']")
 public WebElement CheckBox_Header;

 @FindBy(how = How.XPATH, using = "//button[@class='rct-collapse rct-collapse-btn']")
 public WebElement Button_Expand_All;

 @FindBy(how = How.XPATH, using = "//span[@class='rct-title']")
 public List<WebElement> TitleList;

 @FindBy(how = How.XPATH, using = "//button[@class='rct-option rct-option-expand-all']")
 public WebElement ExpandAll;

 ///********************* Radio Buttons ***************************/

 @FindBy(how = How.XPATH, using = "//div[@class='main-header']")
 public WebElement RadioButtonHeader;

 @FindBy(how = How.XPATH, using = "//label[@class='custom-control-label' and @for='yesRadio']")
 public WebElement RadioButtonY;

 @FindBy(how = How.XPATH, using = "//label[@class='custom-control-label' and @for='impressiveRadio']")
 public WebElement RadioButtonI;

 @FindBy(how = How.XPATH, using = "//div[@class='custom-control disabled custom-radio custom-control-inline']")
 public WebElement RadioButtonN;

 @FindBy(how = How.XPATH, using ="//p[@class='mt-3']")
 public WebElement OutPutString;

}
