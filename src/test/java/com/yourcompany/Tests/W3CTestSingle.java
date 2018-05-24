package com.yourcompany.Tests;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class W3CTestSingle {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        // could also be EdgeOptions or SafariOptions
        MutableCapabilities options = new FirefoxOptions();
        String username = System.getenv("SAUCE_USERNAME");
        String accesskey = System.getenv("SAUCE_ACCESS_KEY");

        // condition particular capabilities as needed
        options.setCapability("browserVersion", "latest");
        // if Safari then choose OS X 10
        options.setCapability("platformName", "Windows 10");
        MutableCapabilities goog = new MutableCapabilities();
        goog.setCapability("w3c", true);
        options.setCapability("goog:chromeOptions" , goog);

        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("seleniumVersion", "3.11.0");

        sauceOptions.setCapability("name", "W3C Firefox");
        sauceOptions.setCapability("build", "W3C Experiment");

        options.setCapability("sauce:options", sauceOptions);

        driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + "@ondemand.saucelabs.com/wd/hub"), options);
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    @Test
    public void basic() {
        driver.get("http://a.testaddressbook.com/");
        String expected = driver.getTitle();

        Assert.assertTrue(expected.contains("Address Book"));
    }
}
