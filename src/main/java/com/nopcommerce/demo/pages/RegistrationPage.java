package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegistrationPage extends Utility {

    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By registerTab = By.linkText("Register");
    By genderMale = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");

    By addEmail = By.id("Email");
    By addPassword = By.id("Password");
    By addConfirmPassword = By.id("ConfirmPassword");
    By registerbutton = By.id("register-button");
    By registrationText = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continuebutton = By.xpath("/a[contains(text(),'Continue')]");
    By Dob =By.name("DateOfBirthDay");
    By birthMonth= By.name("DateOfBirthMonth");
    By year = By.name("DateOfBirthYear");






    public String getRegisterText() {
        return getTextFromElement(registerText);
    }

    public void clickOnRegisterTab() {
        clickOnElement(registerTab);
    }

    public void clickMaleGender() {
        clickOnElement(genderMale);
    }

    public void setFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    public void setLastName(String name) {
        sendTextToElement(lastName, name);
    }



//    //select Date Of Birth Day
//    selectByValueFromDropDown(By.name("DateOfBirthDay"),"28");
//        Thread.sleep(100);
//
//    //select Month
//    selectByVisibleFromDropDown(By.name("DateOfBirthMonth"),"November");
////        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
////        selectMonth.selectByVisibleText("November");
//
//        Thread.sleep(100);
//
//    //select Year
//    selectByValueFromDropDown(By.name("DateOfBirthYear"),"1993");
//        Thread.sleep(100);
//

    public void addEmail(String email) {
        sendTextToElement(addEmail, email);
    }

    public void setPassword(String password) {
        sendTextToElement(addPassword, password);
    }

    public void setConfirmPassword(String ConfirmPassword) {
        sendTextToElement(addConfirmPassword, ConfirmPassword);

    }

    public void clickRegisterButton(){
        clickOnElement(registerbutton);
    }
    public String getRegistrationText(){
        return getTextFromElement(registrationText);
    }

    public void clickContinue(){
        clickOnElement(continuebutton);
    }

    //select Date Of Birth Day

    public void dateOfBirthDay (String value){
        selectByValueFromDropDown(Dob,value);
    }
    //    select Month

    public void dateOfBirthMonth(String value){
        selectByVisibleTextFromDropDown(birthMonth,value);
    }
    //    select Year
    public void dateOfBirthYear (String value){
        selectByValueFromDropDown(year,value);
    }

        }


