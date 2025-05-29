
package com.bookstore.gui.bd;

import com.bookstore.BUS.BookStoreBooksBUS;
import com.bookstore.model.BookStoreBook;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class BookStoreBooksGUI extends JFrame {

    private JTable table;
    private BookStoreBooksBUS bus = new BookStoreBooksBUS();

    public BookStoreBooksGUI() {
        setTitle("Danh sách Sách (book_store_db)");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        initUI();
    }

    private void initUI() {
        String[] columnNames = {"ID", "Tiêu đề", "Tác giả", "Thể loại", "Năm XB", "Giá", "Tồn kho"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);

        List<BookStoreBook> books = bus.getAllBooks();
        for (BookStoreBook book : books) {
            model.addRow(new Object[]{
                book.getId(), book.getTitle(), book.getAuthor(), book.getGenre(),
                book.getPublishedYear(), book.getPrice(), book.getStock()
            });
        }

        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BookStoreBooksGUI().setVisible(true));
    }
}
