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

public class adminwindow extends javax.swing.JFrame {

    
     Connection conn=null;
   PreparedStatement ps=null;
   ResultSet rs=null;
    
    public adminwindow() {
        initComponents();
    }
    
     String check;
             
     public adminwindow(String para) {
        initComponents();
        check=para;
          ltitle.setText("Table :");
    }

      public void populate() throws SQLException
    {
    
        try{conn= new cartimp().custconnec();
            String sql="select * from orders";
            ps=conn.prepareStatement(sql);
            
            rs=ps.executeQuery();
       tball.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           System.out.println(ex);
       }
    }
      
       public void populate2() throws SQLException
    {
    
        try{conn= new cartimp().custconnec();
            String sql="select * from cust";
            ps=conn.prepareStatement(sql);
            
            rs=ps.executeQuery();
       tball.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           System.out.println(ex);
       }
    }

 public void populate3() throws SQLException
    {
    
        try{conn= new customerimp().connec();
            String sql="select * from sellerinfo";
            ps=conn.prepareStatement(sql);
            
            rs=ps.executeQuery();
       tball.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           System.out.println(ex);
       }
    }
 
 public void populate4() throws SQLException
    {
    
        try{conn= new customerimp().connec();
            String sql="select * from medi";
            ps=conn.prepareStatement(sql);
            
            rs=ps.executeQuery();
       tball.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           System.out.println(ex);
       }
    }
 
 public void populate5() throws SQLException
    {
    
        try{conn= new cartimp().custconnec();
            String sql="select * from interact";
            ps=conn.prepareStatement(sql);
            
            rs=ps.executeQuery();
       tball.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           System.out.println(ex);
       }
    }
 
 public void populate6() throws SQLException
    {
    
        try{conn= new cartimp().custconnec();
            String sql="select * from cart";
            ps=conn.prepareStatement(sql);
            
            rs=ps.executeQuery();
       tball.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           System.out.println(ex);
       }
    }
 
 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tball = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        borders = new javax.swing.JButton();
        ltitle = new javax.swing.JLabel();
        bcustomer = new javax.swing.JButton();
        bseller = new javax.swing.JButton();
        bpre = new javax.swing.JButton();
        bcart = new javax.swing.JButton();
        bmedi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("ADMIN:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290)
                .addComponent(jButton1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)))
        );

        tball.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tball);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myjframe/pharmladmin.png"))); // NOI18N

        borders.setText("ORDERS");
        borders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bordersActionPerformed(evt);
            }
        });

        ltitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ltitle.setForeground(new java.awt.Color(255, 255, 255));

        bcustomer.setText("Customer Information");
        bcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcustomerActionPerformed(evt);
            }
        });

        bseller.setText("Seller Information");
        bseller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsellerActionPerformed(evt);
            }
        });

        bpre.setText("Prescriptions");
        bpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpreActionPerformed(evt);
            }
        });

        bcart.setText("All Cart");
        bcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcartActionPerformed(evt);
            }
        });

        bmedi.setText("Medicines");
        bmedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmediActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bmedi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bcart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bpre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bseller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bcustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(borders, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(ltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(borders)
                        .addGap(47, 47, 47)
                        .addComponent(bcustomer)
                        .addGap(56, 56, 56)
                        .addComponent(bseller)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bmedi)
                        .addGap(57, 57, 57)
                        .addComponent(bpre)
                        .addGap(41, 41, 41)
                        .addComponent(bcart)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new first().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bordersActionPerformed
        ltitle.setText("Orders :");
         try {
             populate();
         } catch (SQLException ex) {
             Logger.getLogger(adminwindow.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_bordersActionPerformed

    private void bcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcustomerActionPerformed
         ltitle.setText("Customer Information :");
         try {
             populate2();
         } catch (SQLException ex) {
             Logger.getLogger(adminwindow.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_bcustomerActionPerformed

    private void bsellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsellerActionPerformed
          ltitle.setText("Seller Information :");
         try {
             populate3();
         } catch (SQLException ex) {
             Logger.getLogger(adminwindow.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_bsellerActionPerformed

    private void bmediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmediActionPerformed
          ltitle.setText("Medicines Information :");
         try {
             populate4();
         } catch (SQLException ex) {
             Logger.getLogger(adminwindow.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_bmediActionPerformed

    private void bpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpreActionPerformed
         ltitle.setText("Prescription and Notes :");
         try {
             populate5();
         } catch (SQLException ex) {
             Logger.getLogger(adminwindow.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_bpreActionPerformed

    private void bcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcartActionPerformed
          ltitle.setText("Cart :");
         try {
             populate6();
         } catch (SQLException ex) {
             Logger.getLogger(adminwindow.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_bcartActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminwindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcart;
    private javax.swing.JButton bcustomer;
    private javax.swing.JButton bmedi;
    private javax.swing.JButton borders;
    private javax.swing.JButton bpre;
    private javax.swing.JButton bseller;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ltitle;
    private javax.swing.JTable tball;
    // End of variables declaration//GEN-END:variables
}
