
package com.bookstore.gui.bd;

import com.bookstore.BUS.BookStoreCustomersBUS;
import com.bookstore.model.BookStoreCustomer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class BookStoreCustomersGUI extends JFrame {

    private JTable table;
    private BookStoreCustomersBUS bus = new BookStoreCustomersBUS();

    public BookStoreCustomersGUI() {
        setTitle("Danh sách Khách hàng (book_store_db)");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        String[] columnNames = {"ID", "Tên", "Email", "SĐT", "Thành phố", "Quốc gia"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);

        List<BookStoreCustomer> customers = bus.getAllCustomers();
        for (BookStoreCustomer c : customers) {
            model.addRow(new Object[]{
                c.getId(), c.getName(), c.getEmail(), c.getPhone(), c.getCity(), c.getCountry()
            });
        }

        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BookStoreCustomersGUI().setVisible(true));
    }
}
