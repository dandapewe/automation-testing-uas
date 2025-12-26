package com.praktikum.testing.automation.pages;

import com.praktikum.testing.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By loginBtn = By.id("login2");
    private By cartBtn = By.id("cartur");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public void clickCart() {
        driver.findElement(cartBtn).click();
    }

    public void openProduct(String productName) {
        driver.findElement(By.linkText(productName)).click();
    }
}
