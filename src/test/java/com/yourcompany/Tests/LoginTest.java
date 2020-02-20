package com.yourcompany.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginTest extends TestBase {

    @Test
    public void invalidCredentials() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("bad");
        driver.findElement(By.id("password")).sendKeys("bad");
        driver.findElement(By.className("btn_action")).click();

        Assertions.assertTrue(driver.findElements(By.className("error-button")).size() > 0);
    }

    @Test
    public void blankCredentials() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.className("btn_action")).click();

        Assertions.assertTrue(driver.findElements(By.className("error-button")).size() > 0);
    }

    @Test
    public void validCredentials() {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();

        Assertions.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }
}
