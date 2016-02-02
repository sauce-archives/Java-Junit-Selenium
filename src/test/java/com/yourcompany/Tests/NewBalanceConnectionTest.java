package com.yourcompany.Tests;

import com.saucelabs.junit.ConcurrentParameterized;
import com.yourcompany.Pages.GuineaPigPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * Created by mehmetgerceker on 2/2/16.
 */
@RunWith(ConcurrentParameterized.class)
public class NewBalanceConnectionTest extends SampleSauceTestBase {

    public NewBalanceConnectionTest(String os,
                                   String version, String browser, String deviceName, String deviceOrientation) {
        super(os, version, browser, deviceName, deviceOrientation);
    }

    @Test
    public void testNewBalanceDevSite()
            throws MalformedURLException, InvalidElementStateException, UnexpectedException, InterruptedException {
        driver.get("http://development-be.newbalance.eu/");
        Thread.sleep(2000);
        assertNotNull(driver.findElement(By.className("share-text")));

        driver.get("http://development-be.newbalance.eu/en/men/footwear/running-1/");
        Thread.sleep(2000);
        assertNotNull(driver.findElement(By.className("sort-selector-title")));

        driver.get("http://development-be.newbalance.eu/en/pd/new-balance-870v4/M870-V4.html?dwvar_M870-V4_color=Blue_with_White");
        Thread.sleep(5000);
        assertNotNull(driver.findElement(By.className("icon-cart")));

    }
}
