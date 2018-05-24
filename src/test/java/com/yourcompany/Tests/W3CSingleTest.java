package com.yourcompany.Tests;

import com.yourcompany.Pages.GuineaPigPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertFalse;

public class W3CSingleTest {

    public WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        // could also be EdgeOptions or SafariOptions
        MutableCapabilities options = new FirefoxOptions();
        String username = System.getenv("SAUCE_USERNAME");
        String accesskey = System.getenv("SAUCE_ACCESS_KEY");

        options.setCapability("browserVersion", "latest");
        options.setCapability("platformName", "Windows 10");
        MutableCapabilities goog = new MutableCapabilities();

        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("seleniumVersion", "3.11.0");

        sauceOptions.setCapability("name", "W3C Firefox");
        sauceOptions.setCapability("build", "W3C Experiment");

        options.setCapability("sauce:options", sauceOptions);

        driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + "@ondemand.saucelabs.com/wd/hub"), options);
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Test
    public void verifyLinkTest() {
        GuineaPigPage page = GuineaPigPage.visitPage(driver);

        page.followLink();

        assertFalse(page.isOnPage());
    }
}
