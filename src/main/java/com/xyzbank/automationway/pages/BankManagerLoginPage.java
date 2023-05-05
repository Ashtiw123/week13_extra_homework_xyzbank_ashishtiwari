package com.xyzbank.automationway.pages;

import com.xyzbank.automationway.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By addCustomerTab = By.xpath("//button[@ng-click='addCust()']");
    public void clickOnAddCustomerTab() {
        clickOnElement(addCustomerTab);
    }
    By openAccountTab = By.xpath("//button[@ng-click='openAccount()']");

    public void clickOnOpenAccountTab() {
        clickOnElement(openAccountTab);
    }

    By customersTab = By.xpath("//button[@ng-click='showCust()']");

    public void clickOnCustomers() {
        clickOnElement(customersTab);
    }

    public String getPopupMsg() {
        return getTextFromAlert();
    }

    public void clickOKOnPopup() {
        acceptAlert();
    }
}
