package TestCases;
import PageObjects.POUserRegistration;

import java.io.IOException;


public class TestUserRegistration {
        public static void testCaseNumber1 () throws IOException, InterruptedException {
            POUserRegistration PageObject_UserRegistration = new POUserRegistration();
            PageObject_UserRegistration.UserRegister();
        }
}

