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

public class cart extends javax.swing.JFrame {

     Connection conn=null;
   PreparedStatement ps=null;
   ResultSet rs=null;
 
   public cart(){
        initComponents();
    }
   
   String check;
   
    public cart(String para) throws SQLException {
        initComponents();
    check=para;
        conn= new cartimp().custconnec();
    populate();
    populate2();
    cartimp c=new cartimp();
    ltotal.setText(" "+Integer.toString(c.total(check)));
    }
    
    public void populate()
    {
    
        try{
            String sql="select Product_Name,Price,Seller_Name from cart where Customer_Name=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,check);
            rs=ps.executeQuery();
       tbcart.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           System.out.println(ex);
       }
    }
public void populate2()
    {
    
        try{
            String sql="select Product_Name,Quantity,Price from orders where Customer=? and Delivery=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,check);
            ps.setString(2,"none");
            rs=ps.executeQuery();
       tbbill.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           System.out.println(ex);
       }
    }
    
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbcart = new javax.swing.JTable();
        bplaceorder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lprice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfpname = new javax.swing.JTextField();
        tfprice = new javax.swing.JTextField();
        tfsname = new javax.swing.JTextField();
        qmeter = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        bremove = new javax.swing.JButton();
        lmessage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bback = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbbill = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ltotal = new javax.swing.JLabel();
        bupdate = new javax.swing.JButton();
        bremove2 = new javax.swing.JButton();
        lupdate = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbcart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbcart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbcart);

        bplaceorder.setText("Place order");
        bplaceorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplaceorderActionPerformed(evt);
            }
        });

        jLabel1.setText("Product Name:");

        lprice.setText("Price per Unit:");

        jLabel3.setText("Seller Name:");

        qmeter.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Quantity:");

        bremove.setText("Remove");
        bremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bremoveActionPerformed(evt);
            }
        });

        lmessage.setForeground(new java.awt.Color(255, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));

        bback.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        bback.setText("BACK");
        bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CART");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bback))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bback)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText(" Items in Cart");

        tbbill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Quantity", "Price"
            }
        ));
        tbbill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbbillMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbbill);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText(" Billing");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Total =");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myjframe/rupeesymbol.png"))); // NOI18N
        jLabel9.setText(" ");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ltotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ltotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(ltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bupdate.setText("Update ");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });

        bremove2.setText("Remove");
        bremove2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bremove2ActionPerformed(evt);
            }
        });

        lupdate.setForeground(new java.awt.Color(255, 0, 0));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myjframe/semifinalcart.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("CHECKOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bremove2)
                                    .addComponent(bupdate))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 264, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qmeter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bplaceorder))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(lprice))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfpname)
                                    .addComponent(tfsname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(tfprice, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(188, 188, 188)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bremove)
                                .addGap(18, 18, 18)
                                .addComponent(lmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(55, 55, 55))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lprice)
                            .addComponent(tfprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(qmeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addComponent(bplaceorder))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bremove)
                            .addComponent(lmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bupdate)
                        .addGap(18, 18, 18)
                        .addComponent(bremove2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)))
                .addGap(18, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jButton1)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbackActionPerformed
      dispose();
    }//GEN-LAST:event_bbackActionPerformed

    private void bplaceorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplaceorderActionPerformed
      cartimp c=new cartimp();
     
      String pname,seller,delivery;
     int quantity,price;
     pname=tfpname.getText();
     seller=tfsname.getText();
     delivery="none";
     quantity=(int) qmeter.getValue();
     price=quantity*Integer.parseInt(tfprice.getText());
      
     c.placeorder(pname,quantity,price,seller,check,delivery,"In process...");
      c.refreshcart(check,tfpname.getText());
      populate();
      populate2();
      ltotal.setText(" "+Integer.toString(c.total(check)));
       tfpname.setText("");
        tfprice.setText("");
       tfsname.setText("");    
       qmeter.setValue(1);
       lupdate.setText("");
    }//GEN-LAST:event_bplaceorderActionPerformed

    private void tbcartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcartMouseClicked
        DefaultTableModel model=(DefaultTableModel) tbcart.getModel();
 
 tfpname.setText(model.getValueAt(tbcart.getSelectedRow(),0).toString());
 tfprice.setText(model.getValueAt(tbcart.getSelectedRow(),1).toString());
 tfsname.setText(model.getValueAt(tbcart.getSelectedRow(),2).toString());
    }//GEN-LAST:event_tbcartMouseClicked

    private void bremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bremoveActionPerformed
     DefaultTableModel model=(DefaultTableModel) tbcart.getModel();
if(tbcart.getSelectedRow()==-1)
       { if(tbcart.getRowCount()==0)
           lmessage.setText("Table is Empty.");
         else
           lmessage.setText("You must select a row.");
        }else
       { 
           cartimp c=new cartimp();
          sellerimp cp=new sellerimp();
           c.remove(model.getValueAt(tbcart.getSelectedRow(),0).toString(),check);
           cp.updatequant2(model.getValueAt(tbcart.getSelectedRow(),0).toString(),model.getValueAt(tbcart.getSelectedRow(),2).toString());
           model.removeRow(tbcart.getSelectedRow());
          tfpname.setText("");
          tfprice.setText("");
          tfsname.setText("");
       }

    }//GEN-LAST:event_bremoveActionPerformed

    private void tbbillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbbillMouseClicked
       lmessage.setText("");
        DefaultTableModel model=(DefaultTableModel) tbbill.getModel();
 qmeter.setValue(model.getValueAt(tbbill.getSelectedRow(),1));
 tfpname.setText(model.getValueAt(tbbill.getSelectedRow(),0).toString());
 tfprice.setText(Integer.toString((int) model.getValueAt(tbbill.getSelectedRow(),2)/(int) model.getValueAt(tbbill.getSelectedRow(),1)));
cartimp c=new cartimp();
 tfsname.setText(c.seller(check,model.getValueAt(tbbill.getSelectedRow(),0).toString()));
    }//GEN-LAST:event_tbbillMouseClicked

    private void bremove2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bremove2ActionPerformed
        DefaultTableModel model=(DefaultTableModel) tbbill.getModel();
if(tbbill.getSelectedRow()==-1)
       { if(tbbill.getRowCount()==0)
           lmessage.setText("Table is Empty.");
         else
           lmessage.setText("You must select a row.");
        }else
       { 
           cartimp c=new cartimp();
          c.remove2(check,model.getValueAt(tbbill.getSelectedRow(),0).toString());
          model.removeRow(tbbill.getSelectedRow());
          tfpname.setText("");
          tfprice.setText("");
          tfsname.setText("");
          qmeter.setValue(1);
          ltotal.setText(" "+Integer.toString(c.total(check)));
       }
    }//GEN-LAST:event_bremove2ActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
      DefaultTableModel model=(DefaultTableModel) tbbill.getModel();
if(tbbill.getSelectedRow()==-1)
       { if(tbbill.getRowCount()==0)
           lmessage.setText("Table is Empty.");
         else
           lmessage.setText("You must select a row.");
        }else
       { lupdate.setText("<= Update Quantity");
           cartimp c=new cartimp();
          c.remove2(check,model.getValueAt(tbbill.getSelectedRow(),0).toString());
          model.removeRow(tbbill.getSelectedRow());
          ltotal.setText(" "+Integer.toString(c.total(check)));
       }
    }//GEN-LAST:event_bupdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {cartimp c=new cartimp();
         populate2();
         ltotal.setText("");
             new orderconfirm(check,c.total(check)).setVisible(true);
             populate2();
         } catch (SQLException ex) {
             System.out.println(ex);
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                    new cart().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bback;
    private javax.swing.JButton bplaceorder;
    private javax.swing.JButton bremove;
    private javax.swing.JButton bremove2;
    private javax.swing.JButton bupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lmessage;
    private javax.swing.JLabel lprice;
    private javax.swing.JLabel ltotal;
    private javax.swing.JLabel lupdate;
    private javax.swing.JSpinner qmeter;
    private javax.swing.JTable tbbill;
    private javax.swing.JTable tbcart;
    private javax.swing.JTextField tfpname;
    private javax.swing.JTextField tfprice;
    private javax.swing.JTextField tfsname;
    // End of variables declaration//GEN-END:variables
}
