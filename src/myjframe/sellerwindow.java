package myjframe;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class sellerwindow extends javax.swing.JFrame {
   Connection conn=null;
   PreparedStatement ps=null;
   ResultSet rs=null;
   
    public sellerwindow()  {
        initComponents();
        }

   
    String check,omedin;
  
    public sellerwindow(String para) throws SQLException
    {initComponents();
    check=para;
   lwelcome.setText(" Welcome "+ check.toUpperCase()+" to pharma focus.");
    conn=new sellerimp().connec();
   populate(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbmedi = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lwelcome = new javax.swing.JLabel();
        bback = new javax.swing.JButton();
        badd = new javax.swing.JButton();
        bremove = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfmedi = new javax.swing.JTextField();
        tfprice = new javax.swing.JTextField();
        tfquant = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lmessage = new javax.swing.JLabel();
        bprescription = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbmedi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbmedi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Medicine_Name ", "Price", "Quantity_Available "
            }
        ));
        tbmedi.setToolTipText("");
        tbmedi.setGridColor(new java.awt.Color(51, 51, 51));
        tbmedi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbmediMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbmedi);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lwelcome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lwelcome.setForeground(new java.awt.Color(51, 51, 255));

        bback.setBackground(new java.awt.Color(255, 102, 102));
        bback.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        bback.setText("LOGOUT");
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
                .addComponent(lwelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bback))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lwelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bback)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        badd.setText("ADD");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });

        bremove.setText("REMOVE");
        bremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bremoveActionPerformed(evt);
            }
        });

        bupdate.setText("UPDATE");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText(" Medicine Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Price:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText(" Quantity Available:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myjframe/cart5.png"))); // NOI18N
        jLabel4.setText(" ");

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ORDERS RECIEVED");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lmessage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lmessage.setForeground(new java.awt.Color(255, 0, 0));
        lmessage.setText(" ");

        bprescription.setBackground(new java.awt.Color(204, 0, 204));
        bprescription.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        bprescription.setForeground(new java.awt.Color(255, 255, 255));
        bprescription.setText("Prescriptions");
        bprescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprescriptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfquant, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(140, 140, 140)
                        .addComponent(tfmedi, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(218, 218, 218)
                        .addComponent(tfprice, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lmessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(badd)
                        .addGap(104, 104, 104)
                        .addComponent(bremove)
                        .addGap(126, 126, 126)
                        .addComponent(bupdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bprescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(bprescription))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfmedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(lmessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bremove)
                            .addComponent(bupdate)
                            .addComponent(badd))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbackActionPerformed
        dispose();
        new first().setVisible(true);
    }//GEN-LAST:event_bbackActionPerformed

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
DefaultTableModel model=(DefaultTableModel) tbmedi.getModel();
if(tfmedi.getText().trim().equals("")||tfprice.getText().equals("")||tfquant.getText().equals(""))
 {
     lmessage.setText(" Textfield cant be empty");
    }else
      {
       model.addRow(new Object[]{tfmedi.getText(),tfprice.getText(),tfquant.getText()});
     lmessage.setText("");
     medicineimp med=new medicineimp();
     sellerimp s=new sellerimp();
     med.add(tfmedi.getText(),Integer.parseInt(tfprice.getText()),Integer.parseInt(tfquant.getText()), check,s.getpincode(check));
      }
    }//GEN-LAST:event_baddActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
       lmessage.setText("");
        DefaultTableModel model=(DefaultTableModel) tbmedi.getModel();
       if(tbmedi.getSelectedRow()==-1)
       { if(tbmedi.getRowCount()==0)
           lmessage.setText("Table is Empty.");
         else
           lmessage.setText("You must select a row.");
        }else
       {
       model.setValueAt(tfmedi.getText(),tbmedi.getSelectedRow(),0);
       model.setValueAt(tfprice.getText(),tbmedi.getSelectedRow(),1);
       model.setValueAt(tfquant.getText(),tbmedi.getSelectedRow(),2);
      medicineimp med=new medicineimp();
           System.out.println(omedin); 
      sellerimp s=new sellerimp();
           med.update(tfmedi.getText(),Integer.parseInt(tfprice.getText()),Integer.parseInt(tfquant.getText()),omedin, s.getpincode(check));
       }
    }//GEN-LAST:event_bupdateActionPerformed

    private void tbmediMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbmediMouseClicked
 DefaultTableModel model=(DefaultTableModel) tbmedi.getModel();
 omedin=model.getValueAt(tbmedi.getSelectedRow(),0).toString();
 tfmedi.setText(omedin);
 tfprice.setText(model.getValueAt(tbmedi.getSelectedRow(),1).toString());
 tfquant.setText(model.getValueAt(tbmedi.getSelectedRow(),2).toString());
    }//GEN-LAST:event_tbmediMouseClicked

    private void bremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bremoveActionPerformed
DefaultTableModel model=(DefaultTableModel) tbmedi.getModel();
if(tbmedi.getSelectedRow()==-1)
       { if(tbmedi.getRowCount()==0)
           lmessage.setText("Table is Empty.");
         else
           lmessage.setText("You must select a row.");
        }else
       {
           model.removeRow(tbmedi.getSelectedRow());
          medicineimp med=new medicineimp();
          med.remove(omedin);
           tfmedi.setText("");
 tfprice.setText("");
 tfquant.setText("");
       }
    }//GEN-LAST:event_bremoveActionPerformed

    private void bprescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprescriptionActionPerformed
       try {
           new sellerprescription(check).setVisible(true);
       } catch (SQLException ex) {
           Logger.getLogger(sellerwindow.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_bprescriptionActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try {
           new orderswindow(check).setVisible(true);
       } catch (SQLException ex) {
           System.out.println(ex);
       }
    }//GEN-LAST:event_jButton4ActionPerformed

   
    public void populate()
    {
    
        try{
            String sql="select Medicine_Name,Price,Quantity_Available from medi where Seller_Name=?";
            ps=conn.prepareStatement(sql);
          ps.setString(1,check);
            rs=ps.executeQuery();
           
       tbmedi.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           System.out.println(ex);
       }
    }
    
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
            java.util.logging.Logger.getLogger(sellerwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sellerwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sellerwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sellerwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sellerwindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton badd;
    private javax.swing.JButton bback;
    private javax.swing.JButton bprescription;
    private javax.swing.JButton bremove;
    private javax.swing.JButton bupdate;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lmessage;
    private javax.swing.JLabel lwelcome;
    private javax.swing.JTable tbmedi;
    private javax.swing.JTextField tfmedi;
    private javax.swing.JTextField tfprice;
    private javax.swing.JTextField tfquant;
    // End of variables declaration//GEN-END:variables
}
