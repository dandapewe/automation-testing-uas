package com.praktikum.testing.automation.pages;

import com.praktikum.testing.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private By productRow = By.xpath("//tr[@class='success']");
    private By placeOrderBtn = By.xpath("//button[text()='Place Order']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductInCart() {
        return driver.findElements(productRow).size() > 0;
    }

    public void clickPlaceOrder() {
        driver.findElement(placeOrderBtn).click();
    }
}
