package PageObjects;

import org.junit.Assert;

import static PageFactory.PageFactory.wpf;

public class PORadioButtons {
    public static void PORadioButtonsSelection(){
        try{
            Assert.assertEquals("Radio Button", (wpf.RadioButtonHeader.getText()));
            System.out.println(wpf.RadioButtonHeader.getText());
        //    Thread.sleep(3000);
            boolean SelectYesRadioButton = wpf.RadioButtonY.isEnabled();
            boolean SelectImpressiveRadioButton = wpf.RadioButtonI.isEnabled();
            boolean SelectNoRadioButton = wpf.RadioButtonN.isDisplayed();
            String OutString="";

            System.out.println(SelectYesRadioButton);
            System.out.println(SelectImpressiveRadioButton);
            System.out.println(SelectNoRadioButton);

             if (SelectYesRadioButton == true) {
                 Thread.sleep(3000);
                 wpf.RadioButtonY.click();
                 OutString= wpf.OutPutString.getText().toString();
                 System.out.println( OutString );
             }
             Thread.sleep(5000);
             wpf.RadioButtonY.click();
             if (SelectImpressiveRadioButton == true) {
                wpf.RadioButtonI.click();
                OutString= wpf.OutPutString.getText().toString();
                System.out.println( OutString );
            }
            wpf.RadioButtonI.click();
            if (SelectNoRadioButton == true) {
                OutString= wpf.OutPutString.getText().toString();
                System.out.println( OutString );
             }
}
        catch (Throwable e){
            System.out.println(e);

        }

    }
}
