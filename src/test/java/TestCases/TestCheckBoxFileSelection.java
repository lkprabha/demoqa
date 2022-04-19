package TestCases;

import PageObjects.POCheckBoxFileSlection ;

import java.io.IOException;

public class TestCheckBoxFileSelection {
    public static void testCaseNumber2 () throws IOException, InterruptedException {
        POCheckBoxFileSlection PageObject_CheckBoxSelection = new POCheckBoxFileSlection();
        PageObject_CheckBoxSelection.CheckBoxSelection();
    }
}
