package com.praktikum.testing.automation.tests;

import com.praktikum.testing.automation.base.BaseTest;
import com.praktikum.testing.automation.pages.HomePage;
import com.praktikum.testing.automation.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void testAddProductToCart() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);

        homePage.openProduct("Samsung galaxy s6");
        productPage.addToCart();

        String productTitle = productPage.getProductTitle();
        Assert.assertTrue(
                productTitle.contains("Samsung"),
                "Produk gagal ditambahkan ke cart"
        );
    }
}
