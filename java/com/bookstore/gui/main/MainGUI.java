package com.bookstore.gui.main;

import javax.swing.*;

public class MainGUI extends JFrame {

    public MainGUI() {
        setTitle("POS System");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuBookstore = new JMenu("Book Store DB");

        JMenuItem bookItem = new JMenuItem("Danh sách Sách");
        JMenuItem customerItem = new JMenuItem("Danh sách Khách hàng");
        JMenuItem orderItem = new JMenuItem("Danh sách Đơn hàng");

        bookItem.addActionListener(e -> new com.bookstore.gui.bd.BookStoreBooksGUI().setVisible(true));
        customerItem.addActionListener(e -> new com.bookstore.gui.bd.BookStoreCustomersGUI().setVisible(true));
        orderItem.addActionListener(e -> new com.bookstore.gui.bd.BookStoreOrdersGUI().setVisible(true));

        menuBookstore.add(bookItem);
        menuBookstore.add(customerItem);
        menuBookstore.add(orderItem);

        menuBar.add(menuBookstore);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainGUI().setVisible(true));
    }
}
