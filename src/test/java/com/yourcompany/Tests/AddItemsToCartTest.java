package com.yourcompany.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class AddItemsToCartTest extends TestBase {

    public AddItemsToCartTest(String os,
                          String version, String browser, String deviceName, String deviceOrientation) {
        super(os, version, browser, deviceName, deviceOrientation);
    }

    @Test
    public void addOneItem(){
        driver.get("http://www.saucedemo.com/inventory.html");
        driver.findElement(By.className("btn_primary")).click();

        Assert.assertEquals(driver.findElement(By.className("shopping_cart_badge")).getText(), "1");

        driver.get("http://www.saucedemo.com/cart.html");
        long expected = driver.findElements(By.className("inventory_item_name")).size();

        Assert.assertEquals(expected, 1);

    }

    @Test
    public void addTwoItems(){
        driver.get("http://www.saucedemo.com/inventory.html");
        driver.findElement(By.className("btn_primary")).click();
        driver.findElement(By.className("btn_primary")).click();

        Assert.assertEquals(driver.findElement(By.className("shopping_cart_badge")).getText(), "2");

        driver.get("http://www.saucedemo.com/cart.html");
        long expected = driver.findElements(By.className("inventory_item_name")).size();

        Assert.assertEquals(expected, 2);
    }
}
