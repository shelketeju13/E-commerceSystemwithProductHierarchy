package com.ecommerce.products;

public class BookProduct extends Product {

    private String author;

    public BookProduct(String id, String name, double price, int stock, String author) {
        super(id, name, price, stock);
        this.author = author;
    }

    @Override
    public double getDiscount() {
        return price * 0.05;
    }

    @Override
    public String getType() {
        return "Book";
    }

    @Override
    public void display() {
    	System.out.println("\n📚 BOOKS:");
        super.display();
        System.out.println("Author: " + author);
    }
}
