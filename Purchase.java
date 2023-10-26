package user;

import dao.PurchaseDao;
import dao.ProductDao;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Purchase extends javax.swing.JFrame {

    PurchaseDao purchaseDao = new PurchaseDao();
    ProductDao productDao = new ProductDao();
    private int quantity = 0;
    private double price = 0.0;
    private double total = 0.0;
    private int pId;
    SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-DD", Locale.ENGLISH);
    DefaultTableModel model;
    int rowIndex;

    public Purchase() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")

    private void init() {
        purchaseId.setText(String.valueOf(purchaseDao.getMaxRow()));
        productsTable();
        purchaseTable();
        pId = purchaseDao.getMaxRow();
    }

    private void productsTable() {
        productDao.getProductsValue(jTable2, "");
        model = (DefaultTableModel) jTable2.getModel();
        jTable2.setRowHeight(30);
        jTable2.setShowGrid(true);
        jTable2.setGridColor(Color.BLACK);
        jTable2.setBackground(Color.WHITE);
        jTable2.setSelectionBackground(Color.lightGray);
    }

    private void purchaseTable() {
        model = (DefaultTableModel) jTable3.getModel();
        jTable3.setRowHeight(30);
        jTable3.setShowGrid(true);
        jTable3.setGridColor(Color.BLACK);
        jTable3.setBackground(Color.WHITE);
        jTable3.setSelectionBackground(Color.lightGray);
    }

    private void clear() {
        purchaseId.setText(String.valueOf(purchaseDao.getMaxRow()));
        qty.setText("0");
        bookName.setText("");
        searchBox.setText("");
        jTable2.clearSelection();
        price = 0.0;
        quantity = 0;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        purchaseId = new javax.swing.JTextField();
        bookName = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        addToCart = new javax.swing.JButton();
        bookNameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        qtyLabel1 = new javax.swing.JLabel();
        placeOrder = new javax.swing.JButton();
        deletecart = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CloseBtn = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        searchBox = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(27, 38, 59));

        purchaseId.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        bookName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        qty.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        qty.setText("0");
        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });
        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyKeyTyped(evt);
            }
        });

        addToCart.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        addToCart.setText("ADD TO CART");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        bookNameLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        bookNameLabel.setForeground(new java.awt.Color(237, 242, 244));
        bookNameLabel.setText("Book Name");

        idLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(237, 242, 244));
        idLabel.setText("Purchase ID");

        qtyLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        qtyLabel1.setForeground(new java.awt.Color(237, 242, 244));
        qtyLabel1.setText("Quantity");

        placeOrder.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        placeOrder.setText("PLACE ORDER");
        placeOrder.setPreferredSize(new java.awt.Dimension(123, 35));
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });

        deletecart.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deletecart.setText("DELETE");
        deletecart.setMaximumSize(new java.awt.Dimension(135, 26));
        deletecart.setMinimumSize(new java.awt.Dimension(135, 26));
        deletecart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletecartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(placeOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qtyLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qty, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(idLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addToCart, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(bookName, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(purchaseId, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(deletecart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(idLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(bookNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(qtyLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletecart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(237, 242, 244));

        CloseBtn.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        CloseBtn.setForeground(new java.awt.Color(43, 45, 66));
        CloseBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseBtn.setText("X");
        CloseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBtnMouseClicked(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Category", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        searchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxActionPerformed(evt);
            }
        });

        searchLabel.setBackground(new java.awt.Color(43, 45, 66));
        searchLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(43, 45, 66));
        searchLabel.setText("SEARCH");

        totalLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(43, 45, 66));
        totalLabel.setText("Total : 0.0");

        jTable3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purchase ID", "Book ID", "Book Name", "Category", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Your Cart");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(searchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalLabel)
                .addGap(242, 242, 242))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalLabel)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtnMouseClicked
       new UserDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CloseBtnMouseClicked

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        if (bookName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Select a Product", "Warning", 2);
        } else if (qty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Quantity is Required", "Warning", 2);
        } else {
            model = (DefaultTableModel) jTable2.getModel();
            int proId = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());
            if (!(quantity <= 0)) {
                int newQty = Integer.parseInt(qty.getText());
                if (newQty != 0) {
                    if (!(newQty > quantity)) {
                        String pname = bookName.getText();
                        String t = String.format("%.2f", price * (double) newQty);
                        Object[] data = {pId, proId, pname, newQty, price, t};
                        model = (DefaultTableModel) jTable3.getModel();
                        model.addRow(data);
                        total += price * (double) newQty;
                        totalLabel.setText(String.format("Total: " + "%.2f", total));
                        pId++;
                        //clear();
                    } else {
                        JOptionPane.showMessageDialog(this, "Not Enough Stock", "Warning", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please Increase the Product Quantity", "Warning", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Stock is Empty", "Warning", 2);
            }
        }
    }//GEN-LAST:event_addToCartActionPerformed


    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyActionPerformed

    private void qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_qtyKeyTyped

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        model = (DefaultTableModel) jTable2.getModel();
        rowIndex = jTable2.getSelectedRow();
        bookName.setText(model.getValueAt(rowIndex, 1).toString());
        String s1 = model.getValueAt(rowIndex, 3).toString();
        String s2 = model.getValueAt(rowIndex, 4).toString();
        quantity = Integer.parseInt(s1);
        price = Double.parseDouble(s2);
    }//GEN-LAST:event_jTable2MouseClicked

    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
        if (bookName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Select a Product", "Warning", 2);
        } else if (qty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Quantity is Required", "Warning", 2);
        } else {
            model = (DefaultTableModel) jTable2.getModel();
            int proId = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());
            if (!(quantity <= 0)) {
                int newQty = Integer.parseInt(qty.getText());
                if (newQty != 0) {
                    if (!(newQty > quantity)) {
                        JOptionPane.showMessageDialog(this, "Successfully Placed Order.\nTotal: Rs." + total + " \nPay On Delivery!", "Order Placed", 2);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Not Enough Stock", "Warning", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please Increase the Product Quantity", "Warning", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Stock is Empty", "Warning", 2);
            }
        }
    }//GEN-LAST:event_placeOrderActionPerformed

    private void deletecartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletecartActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();

        int SelectedrowIndex = jTable3.getSelectedRow();

        if (SelectedrowIndex >= 0) {
            model.removeRow(SelectedrowIndex);
            model = (DefaultTableModel) jTable2.getModel();
            int proId = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());
            if (!(quantity <= 0)) {
                int newQty = Integer.parseInt(qty.getText());
                if (newQty != 0) {
                    if (!(newQty > quantity)) {
                        total -= price * (double) newQty;
                        totalLabel.setText(String.format("Total: " + "%.2f", total));
                       
                    } else {
                        JOptionPane.showMessageDialog(this, "Not Enough Stock", "Warning", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please Increase the Product Quantity", "Warning", 2);
                }
            }

            JOptionPane.showMessageDialog(this, "Product deleted from the cart", "Warning", 2);

        } else {
            JOptionPane.showMessageDialog(this, "Select the product from your cart", "Warning", 2);
        }


    }//GEN-LAST:event_deletecartActionPerformed

    private void searchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JButton addToCart;
    private javax.swing.JTextField bookName;
    private javax.swing.JLabel bookNameLabel;
    private javax.swing.JButton deletecart;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton placeOrder;
    private javax.swing.JTextField purchaseId;
    private javax.swing.JTextField qty;
    private javax.swing.JLabel qtyLabel1;
    private javax.swing.JTextField searchBox;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
