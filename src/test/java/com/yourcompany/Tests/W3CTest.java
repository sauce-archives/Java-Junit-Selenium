package com.yourcompany.Tests;

import com.saucelabs.junit.Parallelized;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parallelized.class)
public class W3CTest {

    private WebDriver driver;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new ChromeOptions()},
                {new FirefoxOptions()},
                {new EdgeOptions()},
                {new SafariOptions()}
        });
    }

    @Parameter
    public MutableCapabilities options;

    @Before
    public void setup() throws MalformedURLException {
        String username = System.getenv("SAUCE_USERNAME");
        String accesskey = System.getenv("SAUCE_ACCESS_KEY");

        // condition particular capabilities as needed
        if (options instanceof SafariOptions){
            options.setCapability("platform", "OS X 10.12");
        } else {
            options.setCapability("platform", "Windows 10");
        }

        options.setCapability("version", "latest");
        options.setCapability("seleniumVersion", "3.11.0");

        //MutableCapabilities sauceCaps = new MutableCapabilities();
        options.setCapability("name", "W3CTest - basic");
        options.setCapability("build", "W3C Experiment");

        driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + "@ondemand.saucelabs.com/wd/hub"), options);
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Test
    public void basic(){
        driver.get("http://a.testaddressbook.com/");
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("sign-in"))));
        driver.findElement(By.id("sign-in")).click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("clearance"))));
        String expected = driver.findElement(By.id("clearance")).getText();

        Assert.assertTrue(expected.contains("Sign"));
    }
}
