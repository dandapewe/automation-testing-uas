package com.praktikum.testing.automation.tests;

import com.praktikum.testing.automation.base.BaseTest;
import com.praktikum.testing.automation.pages.CartPage;
import com.praktikum.testing.automation.pages.HomePage;
import com.praktikum.testing.automation.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewCartTest extends BaseTest {

    @Test
    public void testViewCart() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        homePage.openProduct("Samsung galaxy s6");
        productPage.addToCart();

        homePage.clickCart();

        Assert.assertTrue(
                cartPage.isProductInCart(),
                "Produk tidak muncul di halaman cart"
        );
    }
}
