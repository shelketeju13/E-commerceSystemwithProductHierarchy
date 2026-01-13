package com.ecommerce.products;

import com.ecommerce.products.Product;

public class ClothingProduct extends Product {

    private String size;

    public ClothingProduct(String id, String name, double price, int stock, String size) {
        super(id, name, price, stock);
        this.size = size;
    }

    @Override
    public double getDiscount() {
        return price * 0.20;
    }

    @Override
    public String getType() {
        return "Clothing";
    }

    @Override
    public void display() {
    	System.out.println("\n👕 CLOTHING:");
        super.display();
        System.out.println("Size: " + size);
    }
}
