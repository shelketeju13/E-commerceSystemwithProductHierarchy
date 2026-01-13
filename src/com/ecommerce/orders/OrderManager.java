package com.ecommerce.orders;

import com.ecommerce.cart.ShoppingCart;

public class OrderManager {

    public static void checkout(ShoppingCart cart, int paymentOption) {
        Order order = new Order(cart);
        order.processPayment(paymentOption);
        order.placeOrder();
        order.confirmOrder();
    }
}
