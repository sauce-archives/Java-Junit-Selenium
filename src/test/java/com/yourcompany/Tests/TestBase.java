package com.yourcompany.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

class TestBase  {
    public static final Map<String, String> knownCITools;
    static {
        knownCITools = new HashMap<>();
        knownCITools.put("Jenkins", "BUILD_TAG");
        knownCITools.put("Travis", "TRAVIS_JOB_ID");
        knownCITools.put("Circle", "CIRCLE_JOB");
    }

    private String platform;
    public static String username = System.getenv("SAUCE_USERNAME");
    public static String accesskey = System.getenv("SAUCE_ACCESS_KEY");
    protected WebDriver driver;

    @RegisterExtension
    static SauceTestWatcher testWatcher = new SauceTestWatcher();

    @BeforeEach
    public void setUp(TestInfo testInfo) throws MalformedURLException {
        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("name", testInfo.getDisplayName());
        sauceOptions.setCapability("build", getBuildName());

        MutableCapabilities options = createCapabilities();
        options.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://" + username + ":" + accesskey + "@ondemand.saucelabs.com/wd/hub");

        driver = new RemoteWebDriver(url, options);
        testWatcher.setDriver(driver);
    }

    public MutableCapabilities createCapabilities() {
        MutableCapabilities options = new MutableCapabilities();
        options.setCapability("browserVersion", "latest");

        String platform = (System.getProperty("platform") != null) ? System.getProperty("platform") : "windows_10_edge";

        switch(platform) {
            case "windows_10_edge":
                options.setCapability("platformName", "Windows 10");
                options.setCapability("browserName", "MicrosoftEdge");
                break;
            case "mac_sierra_chrome":
                options.setCapability("platformName", "MacOS 10.12");
                options.setCapability("browserName", "Chrome");
                break;
            case "windows_8_ff":
                options.setCapability("platformName", "Windows 8");
                options.setCapability("browserName", "Firefox");
                break;
            case "windows_8_1_ie":
                options.setCapability("platformName", "Windows 8.1");
                options.setCapability("browserName", "Internet Explorer");
                break;
        }

        return options;
    }

    public String getBuildName() {
        if (System.getenv(knownCITools.get("Jenkins")) != null) {
            return System.getenv("BUILD_NAME") + ": " + System.getenv("BUILD_NUMBER");
        } else if (System.getenv(knownCITools.get("Travis")) != null) {
            return System.getenv("TRAVIS_JOB_NAME") + ": " + System.getenv("TRAVIS_JOB_NUMBER");
        } else if (System.getenv(knownCITools.get("Circle")) != null) {
            return System.getenv("CIRCLE_JOB") + ": " + System.getenv("CIRCLE_BUILD_NUM");
        } else {
            return "Build Time: " + System.currentTimeMillis();
        }
    }
}
