
package com.bookstore.dao;

import com.bookstore.config.BookStoreDBConnection;
import com.bookstore.model.BookStoreBook;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookStoreBooksDAO {

    public List<BookStoreBook> getAllBooks() {
        List<BookStoreBook> books = new ArrayList<>();
        String sql = "SELECT * FROM Books";

        try (Connection conn = BookStoreDBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                books.add(new BookStoreBook(
                    rs.getInt("Book_ID"),
                    rs.getString("Title"),
                    rs.getString("Author"),
                    rs.getString("Genre"),
                    rs.getInt("Published_Year"),
                    rs.getDouble("Price"),
                    rs.getInt("Stock")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }
}
