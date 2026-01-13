# E-commerceSystemwithProductHierarchy

---

## Project Overview
The **E-Commerce System** is a console-based Java application developed using **Object-Oriented Programming (OOP)** principles.  
It simulates a basic online shopping platform where users can browse products, add them to a shopping cart, and place orders with payment options.

This project demonstrates:
- Inheritance and Polymorphism  
- Abstract classes  
- Package-based code organization  
- Menu-driven user interaction  
- Order and payment flow  

It is designed as an **internship-level project** with clean structure and extensible architecture.

---

## Project Objectives
- To understand and implement OOP concepts in Java  
- To design a product hierarchy using inheritance and polymorphism  
- To implement a shopping cart system  
- To manage orders and payment flow  
- To practice package-based project organization  
- To simulate a real-world e-commerce console application  

---

## Features

### Product Management
- Abstract `Product` class  
- Product hierarchy:
  - Electronics  
  - Clothing  
  - Books  
- Category-based discounts  
- Stock and product details display  

### Shopping Cart
- Add products to cart  
- Update product quantity  
- Remove products  
- Automatic total calculation  

### Order Management
- Order creation with unique Order ID  
- GST (18%) calculation  
- Order summary display  
- Order confirmation with delivery estimate  

### Payment Options
- UPI  
- Card  
- Cash on Delivery (COD)  

### Customer Handling
- Implicit single-customer session  
- Cart and orders belong to the current user session  
- Easily extensible to explicit login system  

---

## Project Structure

```text
E-commerceSystemwithProductHierarchy/
│
├── README.md
│
├── src/
│   └── com/
│       └── ecommerce/
│           ├── products/
│           │   ├── Product.java
│           │   ├── ElectronicsProduct.java
│           │   ├── ClothingProduct.java
│           │   └── BookProduct.java
│           │
│           ├── cart/
│           │   ├── CartItem.java
│           │   └── ShoppingCart.java
│           │
│           ├── orders/
│           │   ├── Order.java
│           │   └── OrderManager.java
│           │
│           └── ECommerceSystem.java
│
├── docs/
│   ├── UML_Diagram.png
│   └── Project_Documentation.md
│
└── data/
    └── products.txt
```

---

## Technologies Used
- Java (Core Java)
- Object-Oriented Programming (OOP)
- Java Collections Framework
- Console-based I/O
- Date and Time API

---

## Setup and Execution

### Prerequisites
- JDK 8
- Java IDE (Spring Tool suite)

### Steps to Run
1. Clone the repository:
2. Open the project in your IDE
3. Navigate to:
   ```src/com/ecommerce/ECommerceSystem.java```
4. Run ECommerceSystem.java

---

## Menu Options

1. View Products

2. Add to Cart

3. View Cart

4. Update Cart

5. Checkout

6. Exit

✔ Displays categorized products  
✔ Adds items to cart  
✔ Calculates GST and final amount  
✔ Confirms order with delivery date  

---

## OOP Concepts Used
- **Abstraction** → Abstract `Product` class  
- **Inheritance** → Electronics, Clothing, Book products  
- **Polymorphism** → Discount calculation  
- **Encapsulation** → Private variables with getters/setters  
- **SRP (Single Responsibility Principle)** → Separate cart, order, and payment logic  

---

## UML Class Diagram

The UML Class Diagram represents the static structure of the E-Commerce System and illustrates the relationships between different classes.

### Key Relationships:
- `Product` is an **abstract class**
- `ElectronicsProduct`, `ClothingProduct`, and `BookProduct` **inherit** from `Product`
- `ShoppingCart` **has-a** relationship with `CartItem`
- `CartItem` **associates** a `Product` with quantity
- `Order` **uses** `ShoppingCart` to generate order details
- `OrderManager` handles order checkout and payment processing
- `ECommerceSystem` acts as the main controller coordinating all operations.

- The UML diagram is available at:
  `docs/UML_Diagram.png`

- This diagram helps in understanding class responsibilities, inheritance, and object interactions clearly.

---

## Product Catalog Data (data/products.txt)

- The `data/products.txt` file stores the **product catalog data** used by the application.
- It represents different product types and their attributes in a structured text format.

### Purpose:
- Separates product data from business logic
- Makes the system extensible and easy to maintain
- Allows future enhancement for file-based or database-driven product loading.

---

## Testing

### Manual Test Cases

| Test Case        | Input                     | Expected Output                    |
|------------------|---------------------------|------------------------------------|
| View Products    | Option 1                  | Product list displayed             |
| Add to Cart      | Product ID + Quantity     | Item added successfully            |
| View Cart        | Option 3                  | Cart summary shown                 |
| Checkout         | Option 5                  | Order and payment confirmation     |
| Invalid Choice   | Wrong menu input          | Error message                      |

✔ All features tested using console input  
✔ No runtime errors during execution  

---

## Conclusion
The **E-Commerce System** successfully demonstrates the use of core Java and OOP concepts to build a structured, menu-driven application.  
It provides a realistic simulation of an online shopping system and serves as a strong foundation for advanced features such as database integration and web development.

---

## Author

**Tejaswini Shelke**



