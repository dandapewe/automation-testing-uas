package com.praktikum.testing.automation.pages;

import com.praktikum.testing.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage extends BasePage {

    private By name = By.id("name");
    private By country = By.id("country");
    private By city = By.id("city");
    private By card = By.id("card");
    private By month = By.id("month");
    private By year = By.id("year");
    private By purchaseBtn = By.xpath("//button[text()='Purchase']");
    private By successMsg = By.xpath("//h2[text()='Thank you for your purchase!']");

    public OrderPage(WebDriver driver) {
        super(driver);
    }

    public void fillOrderForm() {
        driver.findElement(name).sendKeys("Danda");
        driver.findElement(country).sendKeys("Indonesia");
        driver.findElement(city).sendKeys("Cilacap");
        driver.findElement(card).sendKeys("1234567890123456");
        driver.findElement(month).sendKeys("10");
        driver.findElement(year).sendKeys("2025");
        driver.findElement(purchaseBtn).click();
    }

    public boolean isPurchaseSuccess() {
        return driver.findElement(successMsg).isDisplayed();
    }
}
