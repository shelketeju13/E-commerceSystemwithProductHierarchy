package com.ecommerce.cart;

import java.util.*;
import com.ecommerce.products.Product;

public class ShoppingCart {

    private List<CartItem> items;
    private double totalAmount;

    public ShoppingCart() {
        items = new ArrayList<>();
        totalAmount = 0;
    }

    public void addItem(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getId().equals(product.getId())) {
                item.setQuantity(item.getQuantity() + quantity);
                calculateTotal();
                return;
            }
        }
        items.add(new CartItem(product, quantity));
        calculateTotal();
    }

    public void removeItem(String productId) {
        items.removeIf(item -> item.getProduct().getId().equals(productId));
        calculateTotal();
    }

    public void updateQuantity(String productId, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getId().equals(productId)) {
                item.setQuantity(quantity);
                calculateTotal();
                return;
            }
        }
    }

    private void calculateTotal() {
        totalAmount = 0;
        for (CartItem item : items) {
            totalAmount += item.getItemTotal();
        }
    }

    public void displayCart() {
        System.out.println("\n=== SHOPPING CART ===");
        if (items.isEmpty()) {
            System.out.println("Your cart is empty!");
            return;
        }

        System.out.printf("%-15s %-20s %-10s %-10s %-12s\n",
                "Product ID", "Name", "Price", "Qty", "Total");
        System.out.println("-".repeat(70));

        for (CartItem item : items) {
            Product p = item.getProduct();
            System.out.printf("%-15s %-20s ₹%-9.2f %-10d ₹%-11.2f\n",
                    p.getId(), p.getName(), p.getFinalPrice(),
                    item.getQuantity(), item.getItemTotal());
        }

        System.out.println("-".repeat(70));
        System.out.printf("Total Amount: ₹%.2f\n", totalAmount);
    }

    public double getTotalAmount() { 
    	return totalAmount; 
    }
    public List<CartItem> getItems() {
    	return items; 
    }
}
