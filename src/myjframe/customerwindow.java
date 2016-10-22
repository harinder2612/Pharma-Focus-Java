package myjframe;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class customerwindow extends javax.swing.JFrame {
   
   Connection conn=null;
   PreparedStatement ps=null;
   ResultSet rs=null;
   
   
   public customerwindow() {
        initComponents();
    }
 
  int items=0;
    String check,srch,pin;
    public customerwindow(String para,int para2) throws SQLException {
        initComponents();
        check=para;
        items=para2;
        lcount.setText("("+Integer.toString(items)+")");
        lwelcome.setText(" Welcome to PHARMA FOCUS, you are logged in as : "+check.toUpperCase());
    conn= new customerimp().connec();
    populate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbmedi = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lwelcome = new javax.swing.JLabel();
        tfsearch = new javax.swing.JTextField();
        chbnear = new javax.swing.JCheckBox();
        lcart = new javax.swing.JLabel();
        baddtocart = new javax.swing.JButton();
        blogout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bupload = new javax.swing.JButton();
        lmessage = new javax.swing.JLabel();
        lcount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lpincode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        tbmedi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medicine_Name", "Price", "Quantity_Available", "Seller_Name", "Pincode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbmedi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbmediMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbmedi);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        lwelcome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lwelcome.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lwelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lwelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        tfsearch.setForeground(new java.awt.Color(102, 102, 102));
        tfsearch.setText("  Search medicines & cosmetic products...");
        tfsearch.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tfsearchAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tfsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfsearchMouseClicked(evt);
            }
        });
        tfsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsearchActionPerformed(evt);
            }
        });
        tfsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfsearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfsearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfsearchKeyTyped(evt);
            }
        });

        chbnear.setBackground(new java.awt.Color(204, 204, 255));
        chbnear.setText("NEAR ME");
        chbnear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbnearActionPerformed(evt);
            }
        });

        lcart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myjframe/cartcust.png"))); // NOI18N
        lcart.setText(" ");
        lcart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lcartMouseClicked(evt);
            }
        });

        baddtocart.setBackground(new java.awt.Color(255, 102, 102));
        baddtocart.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        baddtocart.setForeground(new java.awt.Color(255, 255, 255));
        baddtocart.setText("ADD TO CART");
        baddtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddtocartActionPerformed(evt);
            }
        });

        blogout.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        blogout.setText(" LOGOUT");
        blogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogoutActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myjframe/srch2.png"))); // NOI18N
        jLabel3.setText(" ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myjframe/pf3.png"))); // NOI18N

        bupload.setText("Upload Prescription");
        bupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buploadActionPerformed(evt);
            }
        });

        lmessage.setForeground(new java.awt.Color(255, 0, 0));

        lcount.setBackground(new java.awt.Color(255, 0, 0));
        lcount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lcount.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myjframe/refresh1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        lpincode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lpincode.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 210, Short.MAX_VALUE)
                .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chbnear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lpincode, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(blogout))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lcart, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lcount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bupload)))
                .addGap(63, 63, 63)
                .addComponent(lmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(baddtocart)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(blogout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbnear)
                    .addComponent(lpincode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lcart)
                                .addComponent(baddtocart, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bupload, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lcount, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfsearchMouseClicked
tfsearch.setText("");
    }//GEN-LAST:event_tfsearchMouseClicked


    private void tfsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsearchActionPerformed

    }//GEN-LAST:event_tfsearchActionPerformed

    private void tfsearchAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tfsearchAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsearchAncestorAdded

    private void tfsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfsearchKeyPressed

    }//GEN-LAST:event_tfsearchKeyPressed

    private void tfsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfsearchKeyReleased
        srch=tfsearch.getText();
          try{
            String sql="select * from medi where Medicine_Name like ?";
            ps=conn.prepareStatement(sql);
           ps.setString(1,srch+"%");
            rs=ps.executeQuery();
       tbmedi.setModel(DbUtils.resultSetToTableModel(rs));
          } catch (SQLException ex) {
           System.out.println(ex);
       } 
    }//GEN-LAST:event_tfsearchKeyReleased

    private void tfsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfsearchKeyTyped
  
    }//GEN-LAST:event_tfsearchKeyTyped

    private void chbnearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbnearActionPerformed
     if(chbnear.isSelected())
      {
        customerimp c=new customerimp();
        pin=c.pin(check);
      lpincode.setText("(Pin: "+pin+")");
        try{
            String sql="select * from medi where Pincode=?";
            ps=conn.prepareStatement(sql);
           ps.setString(1,pin);
            rs=ps.executeQuery();
       tbmedi.setModel(DbUtils.resultSetToTableModel(rs));
          } catch (SQLException ex) {
           System.out.println(ex);
       } 
      }else
        {populate();
        lmessage.setText("");
        lpincode.setText("");
        }
    }//GEN-LAST:event_chbnearActionPerformed

    private void blogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogoutActionPerformed
      dispose();
      new first().setVisible(true);
    }//GEN-LAST:event_blogoutActionPerformed

    private void lcartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lcartMouseClicked
     lmessage.setText("");
       try {
           new cart(check).setVisible(true);
       } catch (SQLException ex) {
           System.out.println(ex);
       }
    }//GEN-LAST:event_lcartMouseClicked

    private void buploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buploadActionPerformed
       try {
           new imgupload(check).setVisible(true);
       } catch (SQLException ex) {
           Logger.getLogger(customerwindow.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_buploadActionPerformed

    private void baddtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddtocartActionPerformed
        
        lmessage.setText("");        
        tfsearch.setText(" Search medicines & cosmetic products...");
        if(tbmedi.getSelectedRow()==-1)
       { if(tbmedi.getRowCount()==0)
           lmessage.setText("Table is Empty.");
         else
           lmessage.setText("You must select a row.");
        }else{  cartimp c=new cartimp();
        sellerimp cp=new sellerimp();
                 DefaultTableModel model=(DefaultTableModel) tbmedi.getModel();
            String pname,seller;
          int price,quant;
        pname=model.getValueAt(tbmedi.getSelectedRow(),0).toString();
        price=Integer.parseInt(model.getValueAt(tbmedi.getSelectedRow(),1).toString());
        seller=model.getValueAt(tbmedi.getSelectedRow(),3).toString();
         quant=Integer.parseInt(model.getValueAt(tbmedi.getSelectedRow(),2).toString());        
        if(c.itemexist(check,pname))
            {lmessage.setText("Item already in the cart.");}
            else if(c.alreadyexist(check, pname))
               {lmessage.setText("Item already added to Bill");}
            else{
                 c.addtocart(pname, price, seller,check);
                 cp.updatequant(pname,quant, seller);
                 lmessage.setText("");
                 lcount.setText("("+Integer.toString(c.items(check))+")");
                 items=c.items(check);
                 }
       populate(); 
        }
    }//GEN-LAST:event_baddtocartActionPerformed

    private void tbmediMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbmediMouseClicked
      lmessage.setText("");
    }//GEN-LAST:event_tbmediMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        tfsearch.setText(" Search medicines & cosmetic products...");
        populate();
    }//GEN-LAST:event_formMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        cartimp c=new cartimp();
       lcount.setText("("+Integer.toString(c.items(check))+")");
       items=c.items(check);
       populate();
    }//GEN-LAST:event_jLabel1MouseClicked
 
    public void populate()
    {
    
        try{
            String sql="select * from medi";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
       tbmedi.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           System.out.println(ex);
       }
    }
   
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerwindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baddtocart;
    private javax.swing.JButton blogout;
    private javax.swing.JButton bupload;
    private javax.swing.JCheckBox chbnear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lcart;
    private javax.swing.JLabel lcount;
    private javax.swing.JLabel lmessage;
    private javax.swing.JLabel lpincode;
    private javax.swing.JLabel lwelcome;
    private javax.swing.JTable tbmedi;
    private javax.swing.JTextField tfsearch;
    // End of variables declaration//GEN-END:variables
}
