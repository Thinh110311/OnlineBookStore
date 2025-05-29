
package com.bookstore.dao;

import com.bookstore.config.BookStoreDBConnection;
import com.bookstore.model.BookStoreOrder;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookStoreOrdersDAO {

    public List<BookStoreOrder> getAllOrders() {
        List<BookStoreOrder> orders = new ArrayList<>();
        String sql = "SELECT * FROM Orders";

        try (Connection conn = BookStoreDBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                orders.add(new BookStoreOrder(
                    rs.getInt("Order_ID"),
                    rs.getInt("Customer_ID"),
                    rs.getInt("Book_ID"),
                    rs.getDate("Order_Date"),
                    rs.getInt("Quantity"),
                    rs.getDouble("Total_Amount")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orders;
    }
}
