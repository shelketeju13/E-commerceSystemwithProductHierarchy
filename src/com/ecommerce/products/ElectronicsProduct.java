package com.ecommerce.products;

public class ElectronicsProduct extends Product {

    private String brand;
    private int warranty;

    public ElectronicsProduct(String id, String name, double price, int stock,
                              String brand, int warranty) {
        super(id, name, price, stock);
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public double getDiscount() {
        return price * 0.10;
    }

    @Override
    public String getType() {
        return "Electronics";
    }

    @Override
    public void display() {
    	System.out.println("\n📱 ELECTRONICS:");
        super.display();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty + " months");
    }
}
