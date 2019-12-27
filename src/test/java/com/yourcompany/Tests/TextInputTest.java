package com.yourcompany.Tests;

import com.yourcompany.Pages.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.containsString;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

import static org.junit.Assert.*;

public class TextInputTest extends TestBase {

    public TextInputTest(String os,
                         String version, String browser, String deviceName, String deviceOrientation) {
            super(os, version, browser, deviceName, deviceOrientation);
    }

    /**
     * Runs a simple test verifying if the comment input is functional.
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyCommentInputTest() throws InvalidElementStateException {
        String commentInputText = "This is a comment";
        SandboxPage page = new SandboxPage(driver);

        page.visitPage();
        page.submitComment(commentInputText);

        assertThat(page.getSubmittedCommentText(), containsString(commentInputText));
    }

    @Test
    public void simpleRemoteChromeTest() throws MalformedURLException {
        URL gridUrl = new URL("http://localhost:4444/wd/hub");
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver webDriver = new RemoteWebDriver(gridUrl, chromeOptions);
        webDriver.get("http://www.google.com/ncr");
        webDriver.findElement(By.name("q")).sendKeys("webdriver", Keys.RETURN);
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 5);
        webDriverWait.until(ExpectedConditions.titleContains("webdriver"));
        webDriver.quit();
    }
}