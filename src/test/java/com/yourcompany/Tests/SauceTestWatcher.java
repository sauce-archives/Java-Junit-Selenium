package com.yourcompany.Tests;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SauceTestWatcher implements TestWatcher {
    private WebDriver driver;

    private JavascriptExecutor getJSExecutor() {
        return (JavascriptExecutor) driver;
    }

    public void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    @Override
    public void testFailed(ExtensionContext extensionContext, Throwable throwable) {
        getJSExecutor().executeScript("sauce:job-result=failed");
        driver.quit();
    }

    @Override
    public void testSuccessful(ExtensionContext extensionContext) {
        getJSExecutor().executeScript("sauce:job-result=passed");
        driver.quit();
    }
}