package com.xyzbank.automationway.pages;

import com.xyzbank.automationway.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By loginButton = By.xpath("//button[contains(text(),'Login')]");
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
    By logoutText = By.xpath("//button[contains(text(),'Logout')]");
    public String getLogoutText() {
        return getTextFromElement(logoutText);
    }
    By logoutButton = By.xpath("//button[contains(text(),'Logout')]");
    public void clickOnLogoutButton() {
        clickOnElement(logoutButton);
    }
    By yourNameTextAfterLogout = By.xpath("//label[contains(text(),'Your Name :')]");
    public String getNameTextAfterLogout() {
        return getTextFromElement(yourNameTextAfterLogout);
    }
}
