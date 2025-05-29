
package com.bookstore.gui.bd;

import javax.swing.*;
import java.awt.*;

public class BookStoreMainGUI extends JFrame {

    public BookStoreMainGUI() {
        setTitle("Quản lý Book Store DB");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1, 10, 10));

        JButton booksBtn = new JButton("📚 Danh sách Sách");
        JButton customersBtn = new JButton("👤 Danh sách Khách hàng");
        JButton ordersBtn = new JButton("🧾 Danh sách Đơn hàng");

        booksBtn.addActionListener(e -> new BookStoreBooksGUI().setVisible(true));
        customersBtn.addActionListener(e -> new BookStoreCustomersGUI().setVisible(true));
        ordersBtn.addActionListener(e -> new BookStoreOrdersGUI().setVisible(true));

        add(booksBtn);
        add(customersBtn);
        add(ordersBtn);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BookStoreMainGUI().setVisible(true));
    }
}
