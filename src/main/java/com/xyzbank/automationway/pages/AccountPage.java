package com.xyzbank.automationway.pages;

import com.xyzbank.automationway.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By depositTab = By.xpath("//button[@ng-click='deposit()']");
    public void clickOnDepositTab() {
        clickOnElement(depositTab);
    }
    By amountField = By.xpath("//input[@ng-model='amount']");
    public void enterAmountToDeposit(String text) {
        sendTextToElement(amountField, text);
    }
    By depositButton = By.xpath("//button[text()='Deposit']");
    public void clickOnDepositButton() {
        clickOnElement(depositButton);
    }
    By depositMsg = By.xpath("//span[text()='Deposit Successful']");
    public String getDepositMsg() {
        return getTextFromElement(depositMsg);
    }
    By withdrawTab = By.xpath("//button[@ng-click='withdrawl()']");
    public void clickOnWithdrawTab() {
        clickOnElement(withdrawTab);
    }
    By withdrawButton = By.xpath("//button[text()='Withdraw']");
    public void enterAmountToWithdraw(String text) {
        sendTextToElement(amountField, text);
    }
    By withdrawMsg = By.xpath("//span[text()='Transaction Successful']");

    public void clickOnWithdrawButton() {
        clickOnElement(withdrawButton);
    }

    public String getWithdrawMsg() {
        return getTextFromElement(withdrawMsg);
    }
}
