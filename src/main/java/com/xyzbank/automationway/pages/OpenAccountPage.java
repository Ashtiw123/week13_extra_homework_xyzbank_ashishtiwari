package com.xyzbank.automationway.pages;

import com.xyzbank.automationway.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By customerDropdown = By.id("userSelect");
    public void searchAndSelectCreatedCustomer() {
        selectByVisibleTextFromDropDown(customerDropdown, "JainaA Patel");
    }
    By currencyDropdown = By.id("currency");
    public void selectPoundInCurrency() {
        selectByVisibleTextFromDropDown(currencyDropdown, "Pound");
    }
    By processButton = By.xpath("//button[contains(text(),'Process')]");
    public void clickOnProcessButton() {
        clickOnElement(processButton);
    }
}
