
package com.bookstore.BUS;

import com.bookstore.dao.BookStoreBooksDAO;
import com.bookstore.model.BookStoreBook;

import java.util.List;

public class BookStoreBooksBUS {
    private BookStoreBooksDAO dao = new BookStoreBooksDAO();

    public List<BookStoreBook> getAllBooks() {
        return dao.getAllBooks();
    }
}
