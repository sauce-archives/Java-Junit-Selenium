package com.yourcompany.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class RemoveItemsTest extends TestBase {

    @Test
    public void removeOneItemFromCart(){
        driver.get("https://www.saucedemo.com/inventory.html");
        driver.findElement(By.className("btn_primary")).click();
        driver.findElement(By.className("btn_primary")).click();
        driver.findElement(By.className("btn_secondary")).click();

        Assertions.assertEquals("1", driver.findElement(By.className("shopping_cart_badge")).getText());

        driver.get("http://www.saucedemo.com/cart.html");
        Assertions.assertEquals(1, driver.findElements(By.className("inventory_item_name")).size());
    }
}
