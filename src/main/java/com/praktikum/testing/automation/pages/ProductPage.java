package com.praktikum.testing.automation.pages;

import com.praktikum.testing.automation.base.BasePage;
import org.openqa.selenium.*;

public class ProductPage extends BasePage {

    private By productTitle = By.className("name");
    private By addToCartBtn = By.linkText("Add to cart");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductTitle() {
        return driver.findElement(productTitle).getText();
    }

    public void addToCart() {
        driver.findElement(addToCartBtn).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
