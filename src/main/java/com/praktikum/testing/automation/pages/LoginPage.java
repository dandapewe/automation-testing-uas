package com.praktikum.testing.automation.pages;

import com.praktikum.testing.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By usernameField = By.id("loginusername");
    private By passwordField = By.id("loginpassword");
    private By loginBtn = By.xpath("//button[text()='Log in']");
    private By welcomeText = By.id("nameofuser");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginBtn).click();
    }

    public boolean isLoginSuccess(String username) {
        return driver.findElement(welcomeText).getText().contains(username);
    }
}
