package com.praktikum.testing.automation.tests;

import com.praktikum.testing.automation.base.BaseTest;
import com.praktikum.testing.automation.pages.HomePage;
import com.praktikum.testing.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginWithValidCredentials() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickLogin();
        loginPage.login("danda123", "Test@123");

        Assert.assertTrue(
                loginPage.isLoginSuccess(),
                "Login gagal, tombol logout tidak muncul"
        );
    }
}
