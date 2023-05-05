package com.xyzbank.automationway.pages;

import com.xyzbank.automationway.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By bankManagerLoginTab = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    public void clickOnBankManagerLoginTab() {
        clickOnElement(bankManagerLoginTab);
    }
    By customerLoginTab = By.xpath("//button[@ng-click='customer()']");
    public void clickOnCustomerLoginTab() {
        clickOnElement(customerLoginTab);
    }
}
