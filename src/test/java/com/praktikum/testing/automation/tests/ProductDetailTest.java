package com.praktikum.testing.automation.tests;

import com.praktikum.testing.automation.base.BaseTest;
import com.praktikum.testing.automation.pages.HomePage;
import com.praktikum.testing.automation.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductDetailTest extends BaseTest {

    @Test
    public void testViewProductDetail() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);

        homePage.openProduct("Samsung galaxy s6");

        String productTitle = productPage.getProductTitle();
        Assert.assertTrue(
                productTitle.contains("Samsung"),
                "Detail produk tidak tampil dengan benar"
        );
    }
}
