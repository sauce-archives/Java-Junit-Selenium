package com.yourcompany.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class InvalidLoginTest extends TestBase {

    public InvalidLoginTest(String os,
                          String version, String browser, String deviceName, String deviceOrientation) {
        super(os, version, browser, deviceName, deviceOrientation);
    }

    @Test
    public void standardUser(){
        driver.get("http://www.saucedemo.com");

        driver.findElement(By.id("user-name")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.cssSelector(".btn_action")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector(".error-button")).isDisplayed());
    }
}
