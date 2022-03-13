/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.thq.main;

import com.thq.connectionsql.ConnectionSQL;
import com.thq.connectionsql.DAO;
import com.thq.product.Product;
import java.sql.Connection;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ProductMana extends javax.swing.JFrame {
    Connection conn = null;
    /**
     * Creates new form Product
     */
    public ProductMana() {
        initComponents();
        DAO Product = new DAO();
        conn = ConnectionSQL.getConnecttionSQL();
        DefaultTableModel defaultTableModel = new DefaultTableModel() ;
        
        productTable.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("ID Sản Phẩm");
        defaultTableModel.addColumn("ID Danh Mục");
        defaultTableModel.addColumn("Tên Sản Phẩm");
        defaultTableModel.addColumn("Danh Mục");
        defaultTableModel.addColumn("Giá");
        defaultTableModel.addColumn("Số Lượng");
        
        List<Product> list = Product.getAllProduct();
        
        for (Product product : list) {
           defaultTableModel.addRow(new Object[]{product.getIdProduct(),product.getIdCategory(),product.getNameProduct(),product.getNameCategory(),product.getPrice(),product.getAmount()});
        }
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnAdd = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnLO = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemAdd = new javax.swing.JMenuItem();
        itemQuit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemDel = new javax.swing.JMenuItem();
        itemUp = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRODUCT");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/product.png"))); // NOI18N
        jLabel1.setText("QUẢN LÍ SẢN PHẨM");

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-2.png"))); // NOI18N
        btnAdd.setText("Add Product");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAdd);

        btnUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/updated.png"))); // NOI18N
        btnUp.setText("Update");
        btnUp.setFocusable(false);
        btnUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUp.setMargin(new java.awt.Insets(2, 25, 2, 25));
        btnUp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });
        jToolBar1.add(btnUp);

        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/del-2.png"))); // NOI18N
        btnDel.setText("Delete");
        btnDel.setFocusable(false);
        btnDel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDel.setMargin(new java.awt.Insets(2, 25, 2, 25));
        btnDel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDel);

        btnLO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout-icon.png"))); // NOI18N
        btnLO.setText("LogOut");
        btnLO.setFocusable(false);
        btnLO.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnLO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLO.setMargin(new java.awt.Insets(2, 25, 2, 25));
        btnLO.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnLO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLOActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLO);

        btnQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Quit.png"))); // NOI18N
        btnQuit.setText("Quit");
        btnQuit.setFocusable(false);
        btnQuit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuit.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnQuit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQuit);

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(productTable);

        jMenuBar1.setMinimumSize(new java.awt.Dimension(119, 30));
        jMenuBar1.setOpaque(true);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(119, 30));
        jMenuBar1.setRequestFocusEnabled(false);

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setMinimumSize(new java.awt.Dimension(60, 31));
        jMenu1.setPreferredSize(new java.awt.Dimension(60, 31));

        itemAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new.png"))); // NOI18N
        itemAdd.setText("Add Product");
        itemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddActionPerformed(evt);
            }
        });
        jMenu1.add(itemAdd);

        itemQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        itemQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        itemQuit.setText("Quit");
        itemQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemQuitActionPerformed(evt);
            }
        });
        jMenu1.add(itemQuit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setPreferredSize(new java.awt.Dimension(60, 22));

        itemDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/del.png"))); // NOI18N
        itemDel.setText("Delete");
        jMenu2.add(itemDel);

        itemUp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update.png"))); // NOI18N
        itemUp.setText("Update");
        jMenu2.add(itemUp);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu3.setName(""); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(70, 31));
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnUpActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        new AddProduct().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void itemQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemQuitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_itemQuitActionPerformed

    private void btnLOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLOActionPerformed
        // TODO add your handling code here:
        new DisplayMain().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLOActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnQuitActionPerformed

    private void itemAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddActionPerformed
        // TODO add your handling code here:
        new AddProduct().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemAddActionPerformed

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
            java.util.logging.Logger.getLogger(ProductMana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductMana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductMana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductMana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductMana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnLO;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnUp;
    private javax.swing.JMenuItem itemAdd;
    private javax.swing.JMenuItem itemDel;
    private javax.swing.JMenuItem itemQuit;
    private javax.swing.JMenuItem itemUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
}
