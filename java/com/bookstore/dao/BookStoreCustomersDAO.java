
package com.bookstore.dao;

import com.bookstore.config.BookStoreDBConnection;
import com.bookstore.model.BookStoreCustomer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookStoreCustomersDAO {

    public List<BookStoreCustomer> getAllCustomers() {
        List<BookStoreCustomer> customers = new ArrayList<>();
        String sql = "SELECT * FROM Customers";

        try (Connection conn = BookStoreDBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                customers.add(new BookStoreCustomer(
                    rs.getInt("Customer_ID"),
                    rs.getString("Name"),
                    rs.getString("Email"),
                    rs.getString("Phone"),
                    rs.getString("City"),
                    rs.getString("Country")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customers;
    }
}
