
package com.bookstore.model;

import java.sql.Date;

public class BookStoreOrder {
    private int id;
    private int customerId;
    private int bookId;
    private Date orderDate;
    private int quantity;
    private double totalAmount;

    public BookStoreOrder(int id, int customerId, int bookId, Date orderDate, int quantity, double totalAmount) {
        this.id = id;
        this.customerId = customerId;
        this.bookId = bookId;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }

    public int getId() { return id; }
    public int getCustomerId() { return customerId; }
    public int getBookId() { return bookId; }
    public Date getOrderDate() { return orderDate; }
    public int getQuantity() { return quantity; }
    public double getTotalAmount() { return totalAmount; }
}
