package TestCases;

import PageObjects.PORadioButtons;

import java.io.IOException;

public class TestRadioButtons {
    public static void testCaseNumber3 () throws IOException, InterruptedException {
        PORadioButtons PageObject_CheckBoxSelection = new PORadioButtons();
        PageObject_CheckBoxSelection.PORadioButtonsSelection();
    }
}
