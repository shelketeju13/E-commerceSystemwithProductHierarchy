package com.ecommerce.orders;

import java.util.Date;
import com.ecommerce.cart.ShoppingCart;

public class Order {

    private static int orderCounter = 1000;

    private String orderId;
    private Date orderDate;
    private ShoppingCart cart;
    private double finalAmount;
    private boolean paymentDone;
    private String paymentMethod;

    public Order(ShoppingCart cart) {
        this.orderId = "ORD" + (orderCounter++);
        this.orderDate = new Date();
        this.cart = cart;
        this.finalAmount = calculateFinalAmount();
    }

    private double calculateFinalAmount() {
        return cart.getTotalAmount() * 1.18; // 18% GST
    }

    public void processPayment(int choice) {
        switch (choice) {
            case 1 -> paymentMethod = "UPI";
            case 2 -> paymentMethod = "Card";
            case 3 -> paymentMethod = "Cash on Delivery";
            default -> {
                System.out.println("Invalid payment option");
                return;
            }
        }

        System.out.println("Processing payment via " + paymentMethod + "...");
        paymentDone = true;
        System.out.println("Payment Successful!");
        System.out.println("Transaction ID: TXN" + orderId.substring(3));
    }

    public void placeOrder() {
        if (!paymentDone) {
            System.out.println("Payment not completed.");
            return;
        }
    }

    public void displayOrder() {
        System.out.println("\n=== ORDER DETAILS ===");
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);

        cart.displayCart();
    }
    
    public void confirmOrder() {
    	System.out.println("\nOrder Summary:");
        System.out.printf("Subtotal: ₹%.2f\n", cart.getTotalAmount());
        System.out.printf("GST (18%%): ₹%.2f\n", cart.getTotalAmount() * 0.18);
        System.out.printf("Final Amount: ₹%.2f\n", finalAmount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Order Status: CONFIRMED");
        System.out.println("Thank you for your order!");
        
        System.out.println("\n🎉 ORDER CONFIRMED!");
        System.out.println("Order ID: " + orderId);
        System.out.println("Status: Processing");
        System.out.println("Estimated Delivery: 2024-01-22");
        System.out.println("You will receive email confirmation shortly.");
    }
}
