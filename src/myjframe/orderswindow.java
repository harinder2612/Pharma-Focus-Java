package myjframe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class orderswindow extends javax.swing.JFrame {

     Connection conn=null;
   PreparedStatement ps=null;
   ResultSet rs=null;
   
    public orderswindow() {
        initComponents();
    }

    
    String check,customer;
     public orderswindow(String para) throws SQLException {
        initComponents();
        check=para;
        conn= new cartimp().custconnec();
        populate();
    }
     
     
     public void populate()
    {
    
        try{
            String sql="select Product_Name,Quantity,Price,Customer,Delivery,Status from orders where Seller=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,check);
            rs=ps.executeQuery();
       tborders.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           System.out.println(ex);
       }
    }
     
      public void populate2()
    {
    
        try{
            String sql="select Product_Name,Quantity,Price,Customer,Delivery,Status from orders where Seller=? order by Delivery";
            ps=conn.prepareStatement(sql);
            ps.setString(1,check);
            rs=ps.executeQuery();
       tborders.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           System.out.println(ex);
       }
    }
     
      
      public void populate3(String para)
    {
    
        try{
            String sql="select Product_Name,Quantity,Price,Customer,Delivery,Status from orders where Seller=? order by Customer=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,check);
            ps.setString(2,para);
            rs=ps.executeQuery();
       tborders.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           System.out.println(ex);
       }
    }
      
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tborders = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tfstatus = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfpname = new javax.swing.JTextField();
        tfcustomer = new javax.swing.JTextField();
        tfquant = new javax.swing.JTextField();
        tfprice = new javax.swing.JTextField();
        tfdelivery = new javax.swing.JTextField();
        bdispatch = new javax.swing.JButton();
        rbdelivery = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        rbcustomer = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Orders Received!!");

        bback.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        bback.setText("BACK");
        bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(372, 372, 372)
                .addComponent(bback))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bback)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tborders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tborders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbordersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tborders);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Status :");

        tfstatus.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Product Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Quantity:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Total Price:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Customer Name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText(" Delivery Type:");

        bdispatch.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        bdispatch.setForeground(new java.awt.Color(0, 153, 255));
        bdispatch.setText("Ready to Dispatch");
        bdispatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdispatchActionPerformed(evt);
            }
        });

        rbdelivery.setText("Delivery Type");
        rbdelivery.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbdeliveryStateChanged(evt);
            }
        });
        rbdelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdeliveryActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Arrange By:");

        rbcustomer.setText("Customer ");
        rbcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcustomerActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 204, 204));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myjframe/thirdparty.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfprice)
                                    .addComponent(tfpname)
                                    .addComponent(tfcustomer)
                                    .addComponent(tfquant)
                                    .addComponent(tfdelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                            .addComponent(bdispatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(99, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbcustomer)
                            .addComponent(jLabel8)
                            .addComponent(rbdelivery))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tfpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(tfcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tfquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tfprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(tfdelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(bdispatch))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(64, 64, 64)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(rbdelivery)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbcustomer)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbackActionPerformed
dispose();
    }//GEN-LAST:event_bbackActionPerformed

    private void tbordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbordersMouseClicked
         DefaultTableModel model=(DefaultTableModel) tborders.getModel();
 
 tfpname.setText(model.getValueAt(tborders.getSelectedRow(),0).toString());
 tfprice.setText(model.getValueAt(tborders.getSelectedRow(),2).toString());
 tfquant.setText(model.getValueAt(tborders.getSelectedRow(),1).toString());
  tfcustomer.setText(model.getValueAt(tborders.getSelectedRow(),3).toString());
   tfdelivery.setText(model.getValueAt(tborders.getSelectedRow(),4).toString());
tfstatus.setText(model.getValueAt(tborders.getSelectedRow(),5).toString());
    }//GEN-LAST:event_tbordersMouseClicked

    private void rbdeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdeliveryActionPerformed
       populate2();
    }//GEN-LAST:event_rbdeliveryActionPerformed

    private void rbdeliveryStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbdeliveryStateChanged
    
    }//GEN-LAST:event_rbdeliveryStateChanged

    private void rbcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcustomerActionPerformed
        JOptionPane.showInputDialog(customer,"Enter customer name.");
        populate3(customer);
    }//GEN-LAST:event_rbcustomerActionPerformed

    private void bdispatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdispatchActionPerformed
        customerimp c=new customerimp();
        c.status(tfcustomer.getText(),check,tfpname.getText());
      if(rbdelivery.isSelected())
      {populate2();}
      else if(rbcustomer.isSelected())
      {populate3(customer);}
      else
      {populate();}
    }//GEN-LAST:event_bdispatchActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new thirdparty().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderswindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bback;
    private javax.swing.JButton bdispatch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbcustomer;
    private javax.swing.JRadioButton rbdelivery;
    private javax.swing.JTable tborders;
    private javax.swing.JTextField tfcustomer;
    private javax.swing.JTextField tfdelivery;
    private javax.swing.JTextField tfpname;
    private javax.swing.JTextField tfprice;
    private javax.swing.JTextField tfquant;
    private javax.swing.JTextField tfstatus;
    // End of variables declaration//GEN-END:variables
}
