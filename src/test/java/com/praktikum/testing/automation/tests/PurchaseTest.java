package com.praktikum.testing.automation.tests;

import com.praktikum.testing.automation.base.BaseTest;
import com.praktikum.testing.automation.pages.CartPage;
import com.praktikum.testing.automation.pages.HomePage;
import com.praktikum.testing.automation.pages.OrderPage;
import com.praktikum.testing.automation.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseTest {

    @Test
    public void testSuccessfulPurchase() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        OrderPage orderPage = new OrderPage(driver);

        // Pilih produk
        homePage.openProduct("Samsung galaxy s6");
        productPage.addToCart();

        // Buka cart
        homePage.clickCart();
        Assert.assertTrue(
                cartPage.isProductInCart(),
                "Produk tidak ada di cart"
        );

        // Purchase
        cartPage.clickPlaceOrder();
        orderPage.fillOrderForm();

        Assert.assertTrue(
                orderPage.isPurchaseSuccess(),
                "Pesan konfirmasi purchase tidak muncul"
        );
    }
}
