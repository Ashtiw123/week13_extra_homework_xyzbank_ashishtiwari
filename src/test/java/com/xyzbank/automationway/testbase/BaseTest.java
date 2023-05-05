package com.xyzbank.automationway.testbase;


import com.xyzbank.automationway.propertyreader.PropertyReader;
import com.xyzbank.automationway.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }
    private void selectBrowser(String browser) {
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
    private void closeBrowser() {
    }
}
