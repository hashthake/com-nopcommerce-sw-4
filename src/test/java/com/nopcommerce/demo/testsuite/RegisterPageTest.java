package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegistrationPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class RegisterPageTest extends TestBase {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully () throws InterruptedException {



    //Find registration tab on the homepage and click it
    homePage.clickOnRegistrationTab();

    //Verify the text ‘Register’
    String expectedMessage = "Register";
    String actualMessage = registrationPage.getRegisterText();
    Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    //Gender
    registrationPage.clickMaleGender();
    Thread.sleep(1000);
    //First name:
    registrationPage.setFirstName("Carl");
    Thread.sleep(1000);
    //Last name
    registrationPage.setLastName("Barby");
    Thread.sleep(1000);
    //Date of birth:
    registrationPage.dateOfBirthDay("8");
    registrationPage.dateOfBirthMonth("February");
    registrationPage.dateOfBirthYear("1982");
    Thread.sleep(1000);
    //Email:
    registrationPage.addEmail("123@gmail.com");
    Thread.sleep(1000);
    //Password:
    registrationPage.setPassword("ABC1234");
    //Confirm password
    registrationPage.setConfirmPassword("ABC1234");
    Thread.sleep(1000);

//        2.21 Click on “REGISTER” Button
    registrationPage.clickRegisterButton();
    Thread.sleep(1000);

    //        2.22 Verify the message “Your registration completed”
    String expectedMessage9 = "Your registration completed";
    String actualMessage9 = registrationPage.getRegistrationText();
    org.junit.Assert.assertEquals(actualMessage9, expectedMessage9);
    Thread.sleep(1000);

//        2.23 Click on “CONTINUE” tab
    registrationPage.clickContinue();


}
}
