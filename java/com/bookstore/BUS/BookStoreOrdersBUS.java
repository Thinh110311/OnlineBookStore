
package com.bookstore.BUS;

import com.bookstore.dao.BookStoreOrdersDAO;
import com.bookstore.model.BookStoreOrder;

import java.util.List;

public class BookStoreOrdersBUS {
    private BookStoreOrdersDAO dao = new BookStoreOrdersDAO();

    public List<BookStoreOrder> getAllOrders() {
        return dao.getAllOrders();
    }
}
