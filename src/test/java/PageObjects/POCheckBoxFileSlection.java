package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

import static PageFactory.PageFactory.wpf;

public class POCheckBoxFileSlection {
    public static void CheckBoxSelection() {
        try {
            Assert.assertEquals("Check Box", (wpf.CheckBox_Header.getText()));
            String PrintText = "";
            String TestText= "Desktop Notes Commands Documents WorkSpace React Angular Veu Office Public Private Classified General Downloads Word File.doc Excel File.doc";
            if (wpf.Button_Expand_All.isDisplayed()) {
                if (wpf.Button_Expand_All.isEnabled()) {
                    wpf.Button_Expand_All.click();
                    if (wpf.ExpandAll.isDisplayed() && wpf.ExpandAll.isEnabled()) {
                        wpf.ExpandAll.click();
                      //  List<WebElement> TitleListNamesParent = wpf.TitleList;
                        List<WebElement> TitleNamesRoot = wpf.TitleList;
                        for (int i = 1; i <= (TitleNamesRoot.size())-1; i++) {  // Desktop root level
                                PrintText = PrintText + " " +(TitleNamesRoot.get(i).getText().toString());
                        }
                        if(!(PrintText).isEmpty()  && (PrintText.contains(TestText))){
                            System.out.println("Final Out :" + PrintText);
                        }
 //
                    }
                }
            }
        }
         catch (Throwable e) {

        }
    }
}
