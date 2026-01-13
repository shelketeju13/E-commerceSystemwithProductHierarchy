package com.ecommerce;

import java.util.*;
import com.ecommerce.products.*;
import com.ecommerce.cart.*;
import com.ecommerce.orders.*;

public class ECommerceSystem {

    static Scanner sc = new Scanner(System.in);
    static ShoppingCart cart = new ShoppingCart();
    static List<Product> products = new ArrayList<>();
    static List<Product> wishlist = new ArrayList<>();

    public static void main(String[] args) {

        loadProducts();

        while (true) {
            System.out.println("\n=== E-COMMERCE SYSTEM ===");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Update Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> viewProducts();
                case 2 -> addToCart();
                case 3 -> cart.displayCart();
                case 4 -> updateCart();
                case 5 -> checkout();
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void loadProducts() {
        products.add(new ElectronicsProduct("E001","Smartphone X",50000,10,"TechBrand",24));
        products.add(new ClothingProduct("C001","T-Shirt",1200,20,"M"));
        products.add(new BookProduct("B001","Java Basics",800,30,"James Gosling"));
    }

    static void viewProducts() {
        for (Product p : products) {
            System.out.println("-------------------");
            p.display();
        }
    }

    static void addToCart() {
        System.out.print("Enter Product ID: ");
        String id = sc.next();
        System.out.print("Quantity: ");
        int qty = sc.nextInt();

        for (Product p : products) {
            if (p.getId().equalsIgnoreCase(id)) {
                cart.addItem(p, qty);
                System.out.println("✅ " + p.getName() + " added to cart!");
                //System.out.println("Added to cart");
                return;
            }
        }
        System.out.println("Product not found");
    }

    static void updateCart() {
        System.out.print("Enter Product ID: ");
        String id = sc.next();
        System.out.print("New Quantity: ");
        int qty = sc.nextInt();
        cart.updateQuantity(id, qty);
    }

    static void checkout() {
    	Order order = new Order(cart);
        order.displayOrder();

        System.out.println("\nSelect Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Cash on Delivery");
        int option = sc.nextInt();
        OrderManager.checkout(cart, option);
    }
}
