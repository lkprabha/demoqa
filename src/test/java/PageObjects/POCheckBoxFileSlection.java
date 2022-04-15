package PageObjects;

import PageFactory.PageFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class POCheckBoxFileSlection {
 public static void CheckBoxSelection() throws IOException {
  try{
   Assert.assertEquals("Check Box", (PageFactory.wpf.CheckBox_Header.getText()));
   if (PageFactory.wpf.Button_Expand_All.isDisplayed()) {
    if (PageFactory.wpf.Button_Expand_All.isEnabled()) {
     List<WebElement> roots = PageFactory.wpf.Button_Expand_All_List;
     System.out.println("Root Count = " + roots.size());
     PageFactory.wpf.Button_Expand_All.click();
     try {
      Thread.sleep(3000);
     } catch (InterruptedException e) {
      e.printStackTrace();
     }
     List<WebElement> ColapseSubRoots = PageFactory.wpf.Colapsed_SubRoots;
     Integer SizeOfColapseSubRoots = ColapseSubRoots.size();
     System.out.println("Colapsed Subroots Count  = " + ColapseSubRoots.size());
     String PrintText = "";
     for (int i = 0; i <= (ColapseSubRoots.size()); i++) {
      PageFactory.wpf.Expanded_SubRootsNames.get(i).click();
      PrintText = PrintText + " " + (PageFactory.wpf.Expanded_SubRootsNames.get(i).getText().toString());
      int LeafNodeSize = PageFactory.wpf.LeafNodes.size();
      if (LeafNodeSize > 0) {
       for (int n = 0; n <= LeafNodeSize; n++) {
        PageFactory.wpf.LeafNodes.get(n).click();
        PrintText = PrintText + " " + (PageFactory.wpf.LeafNodes.get(n).getText().toString());
       }
      }
    }
   }

  catch(Throwable e){

  }
 }
}