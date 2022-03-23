package PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Utility.WebDriverHelper;

public class WebPageFactory {
    public static WebPageFactory wpf= PageFactory.initElements(WebDriverHelper.getWebDriver(),WebPageFactory.class);
