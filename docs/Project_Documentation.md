# E-Commerce System – Project Documentation  
*(Java Console-Based OOP Application)*

---

## 1. Project Overview

The **E-Commerce System** is a console-based Java application developed using **Object-Oriented Programming (OOP)** principles.  
It simulates a real-world online shopping platform where users can browse products, add them to a shopping cart, and place orders with payment options.

This project demonstrates:
- Inheritance and Polymorphism  
- Abstract classes  
- Package-based code organization  
- Menu-driven user interaction  
- Order and payment flow  

It is designed as an **internship-level project** with clean structure and extensible architecture.

---

## 2. Project Objectives

- To understand and implement OOP concepts in Java  
- To design a product hierarchy using inheritance and polymorphism  
- To implement a shopping cart system  
- To manage orders and payment flow  
- To practice package-based project organization  
- To simulate a real-world e-commerce console application  

---

## 3. Technologies Used

- **Java (Core Java)**
- **Object-Oriented Programming (OOP)**
- **Java Collections Framework (ArrayList)**
- **Console-based I/O (Scanner)**
- **Date and Time API (java.util.Date)**

---

## 4. System Requirements

### Software Requirements
- JDK 8   
- Java IDE (Spring Tool Suite)  
- Operating System: Windows 

---

## 5. System Architecture

The application follows a **layered architecture**:

### Architecture Layers
- **Presentation Layer**
  - `ECommerceSystem.java` (Menu-driven user interface)
- **Business Logic Layer**
  - Product handling  
  - Cart management  
  - Order and payment processing
- **Data Layer**
  - In-memory objects  
  - Product catalog stored in `data/products.txt`

This architecture improves **modularity, maintainability, and scalability**.

---

## 6. Code Structure Explanation

```text
E-commerceSystemwithProductHierarchy/
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
│   └── products.txt
```
---

## Package Responsibilities

### products
- Defines the abstract `Product` class  
- Implements the product hierarchy using inheritance  
- Handles category-specific attributes and discount logic  

### cart
- Manages cart items  
- Handles quantity updates and removals  
- Calculates cart total dynamically  

### orders
- Handles order creation  
- Calculates GST (18%)  
- Manages payment processing and order confirmation  

### ECommerceSystem
- Acts as the main controller  
- Provides menu-driven user interface  
- Coordinates interactions between products, cart, and orders  

---

## 7. UML Class Diagram

The UML Class Diagram represents:
- Product inheritance hierarchy  
- Relationships between cart, products, and orders  
- System-level design and class responsibilities  

 **Diagram Location:**  
 `docs/UML_Diagram.png`
 
---

## 8. OOP Concepts Used

- **Abstraction** → Abstract `Product` class  
- **Inheritance** → Electronics, Clothing, and Book product classes  
- **Polymorphism** → Runtime discount calculation  
- **Encapsulation** → Private variables with public getter/setter methods  
- **SRP (Single Responsibility Principle)** → Separate cart, order, and payment logic  

---

## 9. Product Catalog Data (`data/products.txt`)

The `products.txt` file stores product information separately from the source code.

### Purpose
- Separates data from business logic  
- Improves maintainability  
- Supports future file-based or database loading  

---

## 10. Setup and Installation Instructions

### Prerequisites
- JDK 8 or higher  
- Java IDE (Spring Tool Suite recommended)  

### Steps to Run
1. Clone the repository  
2. Open the project in your IDE  
3. Navigate to:
   src/com/ecommerce/ECommerceSystem.java
4. Run `ECommerceSystem.java`

---

## 11. User Manual

### Menu Options
```text
1. View Products
2. Add to Cart
3. View Cart
4. Update Cart
5. Checkout
6. Exit
```
## User Flow

- View available products  
- Add selected products to cart  
- Update or remove items  
- Proceed to checkout  
- Select payment method  
- Receive order confirmation  

✔ Menu-driven and user-friendly  
✔ Real-time cart updates  

---

## 12. Technical Requirements Fulfilled

- Object-oriented design using Java  
- Proper use of inheritance and polymorphism  
- Modular package structure  
- Console-based user interaction  
- Payment simulation  
- GST calculation (18%)  
- Unique order ID generation  

---

## 13. Testing

### Manual Test Cases

| Test Case        | Input                  | Expected Output              |
|------------------|------------------------|------------------------------|
| View Products    | Option 1               | Product list displayed       |
| Add to Cart      | Product ID + Quantity  | Item added successfully      |
| View Cart        | Option 3               | Cart summary shown           |
| Checkout         | Option 5               | Order & payment confirmation |
| Invalid Choice   | Wrong input            | Error message                |

✔ All features tested using console input  
✔ No runtime errors during execution  

---

## 14. Conclusion

The **E-Commerce System** successfully demonstrates the use of core Java and OOP concepts to build a structured, menu-driven application.  
It provides a realistic simulation of an online shopping system and serves as a strong foundation for advanced features such as database integration and web development.

This project fully meets **internship documentation and evaluation standards**.

---

## 15. Author

**Tejaswini Shelke**
  
