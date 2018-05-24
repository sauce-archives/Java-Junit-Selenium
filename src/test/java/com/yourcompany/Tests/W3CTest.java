package com.yourcompany.Tests;

import com.saucelabs.junit.Parallelized;
import com.yourcompany.Pages.GuineaPigPage;
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
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertFalse;

@RunWith(Parallelized.class)
public class W3CTest {

    private WebDriver driver;

    /**
     * Collection of data parametrizes tests, in this case
     * using W3C compliant browsers (does not include Chrome here)
     * @return
     */
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
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
        options.setCapability("browserVersion", "latest");
        if (options instanceof SafariOptions){
            options.setCapability("platformName", "OS X 10.12");
        } else if (options instanceof InternetExplorerOptions) {
            options.setCapability("platformName", "Windows 7");
        } else {
            options.setCapability("platformName", "Windows 10");
        }

        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("seleniumVersion", "3.11.0");
        sauceOptions.setCapability("name", "W3C");
        sauceOptions.setCapability("build", "JUnit Case - Follow Link Test");

        options.setCapability("sauce:options", sauceOptions);

        driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + "@ondemand.saucelabs.com/wd/hub"), options);

    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Test
    public void followLinkTest(){
        GuineaPigPage page = GuineaPigPage.visitPage(driver);

        page.followLink();

        assertFalse(page.isOnPage());
    }
}
