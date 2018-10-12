package framework;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WebDriverManager {

    IOSDriver<IOSElement> driver = null;

    @BeforeMethod
    public void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("bundleId", "com.apple.mobilecal");
        capabilities.setCapability("testName", "Appium Test");
        capabilities.setCapability("automationName", "XCUITest");

        //Update the iOS Version Eg. iPhone X
        capabilities.setCapability("deviceName", "iPhone X");

        //Update the iOS PhoneID Eg. 162725BD-9B7A-442B-98CA-0DD20EF38FD9
        capabilities.setCapability(MobileCapabilityType.UDID, "162725BD-9B7A-442B-98CA-0DD20EF38FD9");


        try {
            driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            selectToday();
            selectToday();
            selectToday();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) driver.quit();
    }

    private void selectToday() {
        WebElement today = new WebDriverWait(driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("Today")));
        today.click();
    }
}
