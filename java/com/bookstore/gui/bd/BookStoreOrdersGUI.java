
package com.bookstore.gui.bd;

import com.bookstore.BUS.BookStoreOrdersBUS;
import com.bookstore.model.BookStoreOrder;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class BookStoreOrdersGUI extends JFrame {

    private JTable table;
    private BookStoreOrdersBUS bus = new BookStoreOrdersBUS();

    public BookStoreOrdersGUI() {
        setTitle("Danh sách Đơn hàng (book_store_db)");
        setSize(850, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        String[] columnNames = {"ID", "ID KH", "ID Sách", "Ngày đặt", "Số lượng", "Tổng tiền"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);

        List<BookStoreOrder> orders = bus.getAllOrders();
        for (BookStoreOrder o : orders) {
            model.addRow(new Object[]{
                o.getId(), o.getCustomerId(), o.getBookId(),
                o.getOrderDate(), o.getQuantity(), o.getTotalAmount()
            });
        }

        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BookStoreOrdersGUI().setVisible(true));
    }
}
