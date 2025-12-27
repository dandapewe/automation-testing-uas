package com.praktikum.testing.automation.pages;

import com.praktikum.testing.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private By loginModal = By.id("logInModal");
    private By usernameField = By.id("loginusername");
    private By passwordField = By.id("loginpassword");
    private By loginBtn = By.xpath("//button[text()='Log in']");
    private By logoutBtn = By.id("logout2");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField))
                .sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginBtn).click();

        // Tunggu modal login hilang
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loginModal));
    }

    public boolean isLoginSuccess() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(logoutBtn))
                .isDisplayed();
    }
}
