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


    ///*******************************************************************************************/
    @FindBy(how =How.XPATH,using="//div[@class='main-header']")
    public WebElement CheckBox_Header;

    @FindBy(how = How.XPATH ,using = "//button[@class='rct-collapse rct-collapse-btn']")
    public WebElement Button_Expand_All;

    //

    @FindBy(how = How.XPATH ,using = "//button[@class='rct-collapse rct-collapse-btn']")
    public List<WebElement> Button_Expand_All_List;

    @FindBy(how = How.XPATH ,using = "//span[@class='rct-title']")
    public List<WebElement> TitleList;

    @FindBy(how = How.XPATH ,using = "//button[@class='rct-option rct-option-expand-all']")
    public WebElement ExpandAll;

    ///*******************************************************************************************/


//    /*  Check Box page elements  */
//
//    @FindBy(how =How.XPATH,using="//div[@class='main-header']")
//    public WebElement CheckBox_Header;
//
//    @FindBy(how = How.XPATH ,using = "//button[@class='rct-collapse rct-collapse-btn']")
//    public WebElement Button_Expand_All;
//
//    @FindBy(how = How.XPATH ,using = "//button[@class='rct-collapse rct-collapse-btn']")
//    public List<WebElement> Button_Expand_All_List;
//
//    @FindBy(how =How.XPATH,using = "//li[@class='rct-node rct-node-parent rct-node-collapsed']")
//    public List<WebElement> Colapsed_SubRoots;
////
////    @FindBy(how = How.XPATH ,using = "//button[@class='rct-node rct-node-parent rct-node-expanded']")
////    public List<WebElement>  Expanded_SubRoots;
////
////
//    @FindBy(how = How.XPATH ,using = "//li[@class='rct-title']")
//    public List<WebElement>  Expanded_SubRootsNames;
//
//
//    @FindBy(how = How.XPATH ,using = "//span[@class='rct-title']")
//    public List<WebElement> Colapsed_SubRoots_Child;
//
//    @FindBy(how = How.XPATH,using ="//span[@class='tree-node-react']")
//    public List<WebElement> TreeNodeReact;
//
//    @FindBy(how = How.XPATH,using ="//li[@class='rct-node rct-node-leaf']")
//    public List<WebElement> LeafNodes;
//
//    @FindBy(how = How.XPATH,using ="//li[@class='rct-node rct-node-parent rct-node-collapsed']")
//    public List<WebElement> LeafExpandableNodes;
//
////    @FindBy(how = How.XPATH,using ="//li[@class='rct-node rct-node-parent rct-node-collapsed']")
////    public List<WebElement> CollapsedParentNodes;
//
//    @FindBy(how = How.XPATH,using ="//button[@class='rct-collapse rct-collapse-btn']")
//    public List<WebElement> CollapsedParentNodes;
//
////
////    @FindBy(how = How.XPATH,using ="//li[@class='rct-node rct-node-parent rct-node-expanded']")
////    public WebElement ExpandedParentName;
////
////    @FindBy(how = How.XPATH,using ="//li[@class='rct-node rct-node-parent rct-node-collapsed']")
////    public List<WebElement> CollapsedParentNodesNames;
//
//
//    @FindBy(how = How.XPATH,using ="//span[@class='rct-checkbox']")
//    public List<WebElement> AllCheckBoxes;
//
//    @FindBy(how = How.XPATH,using = "//span[@class='rct-title']")
//    public List<WebElement> AllNames;
//
//    @FindBy(how = How.XPATH,using = "//button[@class=rct-collapse rct-collapse-btn']")
//    public List<WebElement> ClickableDownButtons;
}