
package com.bookstore.BUS;

import com.bookstore.dao.BookStoreCustomersDAO;
import com.bookstore.model.BookStoreCustomer;

import java.util.List;

public class BookStoreCustomersBUS {
    private BookStoreCustomersDAO dao = new BookStoreCustomersDAO();

    public List<BookStoreCustomer> getAllCustomers() {
        return dao.getAllCustomers();
    }
}
