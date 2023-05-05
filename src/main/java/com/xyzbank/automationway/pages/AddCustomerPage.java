package com.xyzbank.automationway.pages;

import com.xyzbank.automationway.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    public void enterFirstName(String text) {
        sendTextToElement(firstNameField, text);
    }
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    public void enterLastName(String text) {
        sendTextToElement(lastNameField, text);
    }
    By postcodeField = By.xpath("//input[@placeholder='Post Code']");

    public void enterPostcode(String text) {
        sendTextToElement(postcodeField, text);
    }
    By addCustomerButton = By.xpath("//button[@class='btn btn-default']");
    public void clickOnAddCustomerButton() {
        clickOnElement(addCustomerButton);
    }


}
