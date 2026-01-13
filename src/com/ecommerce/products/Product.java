package com.ecommerce.products;

public abstract class Product {

    protected String id;
    protected String name;
    protected double price;
    protected int stock;

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public abstract double getDiscount();
    
    public abstract String getType();

    public double getFinalPrice() {
        return price - getDiscount();
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Price: ₹%.2f\n", price);
        System.out.printf("Discount: ₹%.2f\n", getDiscount());
        System.out.printf("Final Price: ₹%.2f\n", getFinalPrice());
        System.out.println("Stock: " + stock);
        System.out.println("Type: " + getType());
    }

    public String getId() { 
    	return id; 
    }
    
    public String getName() { 
    	return name; 
    }
}