package myjframe;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class loginframe extends javax.swing.JFrame {
    public loginframe() {
        initComponents();
    }

    String check;
    
    public loginframe(String para)
{
initComponents();
check=para;
lmessage.setText("");
}
String chec;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        tfusername = new javax.swing.JTextField();
        pfpassword = new javax.swing.JPasswordField();
        chbremember = new javax.swing.JCheckBox();
        blogin = new javax.swing.JButton();
        breset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lloginmodule = new javax.swing.JLabel();
        bback = new javax.swing.JButton();
        bnewuser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lmessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 760, 478));

        jLabel3.setText("Password:");

        pfpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfpasswordActionPerformed(evt);
            }
        });
        pfpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfpasswordKeyPressed(evt);
            }
        });

        chbremember.setText("Remember");
        chbremember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbrememberActionPerformed(evt);
            }
        });

        blogin.setText("LOGIN");
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });

        breset.setText("RESET");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        jLabel1.setText("Username:");

        jPanel1.setBackground(new java.awt.Color(0, 255, 51));

        lloginmodule.setBackground(new java.awt.Color(255, 255, 255));
        lloginmodule.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lloginmodule.setForeground(new java.awt.Color(255, 255, 255));
        lloginmodule.setText("LOGIN MODULE");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(bback)
                .addGap(333, 333, 333)
                .addComponent(lloginmodule, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(372, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lloginmodule, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bback)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bnewuser.setBackground(new java.awt.Color(153, 255, 153));
        bnewuser.setText("NEW USER");
        bnewuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnewuserActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myjframe/p4.png"))); // NOI18N

        lmessage.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(139, 139, 139)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bnewuser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbremember)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(blogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(breset))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pfpassword)
                            .addComponent(tfusername, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(lmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(chbremember))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blogin)
                            .addComponent(breset))
                        .addGap(18, 18, 18)
                        .addComponent(bnewuser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(100, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
      boolean flag=false;
        if(check.equals("CUSTOMER"))
      {customerimp cu=new customerimp();
       flag=cu.get(tfusername.getText(),pfpassword.getText());
         if(flag)
          {
           lmessage.setText("");
           chec=tfusername.getText();
           dispose();
          try {cartimp c=new cartimp();
              new customerwindow(chec,c.items(chec)).setVisible(true);
          } catch (SQLException ex) {
              System.out.println(ex);
          }
          }
          else
          { lmessage.setText("Wrong username or password.");
           }
      }
      else if(check.equals("SELLER"))
           {sellerimp s=new sellerimp();
        flag=s.get(tfusername.getText(),pfpassword.getText());
       if(flag)
        {
        lmessage.setText("");
        chec=tfusername.getText();
        dispose();
               try {
                   new sellerwindow(chec).setVisible(true);
               } catch (SQLException ex) {
                   System.out.println(ex);
               }
         }
        else
         {lmessage.setText("Wrong username or password.");
         }
       }
    else //here admin option will come and copy code from above for successful login.
      {adminimp c=new adminimp();
      flag=c.get(tfusername.getText(),pfpassword.getText());
     if(flag)
        {
        lmessage.setText("");
        chec=tfusername.getText();
        dispose();
        new adminwindow(chec).setVisible(true);
         }
        else
         {lmessage.setText("Wrong username or password.");
         }
      }
         
    }//GEN-LAST:event_bloginActionPerformed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        tfusername.setText("");
        pfpassword.setText("");
        chbremember.setSelected(false);
        
       lmessage.setText("");
    }//GEN-LAST:event_bresetActionPerformed

    private void bbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbackActionPerformed
        dispose();
        new first().setVisible(true);
    }//GEN-LAST:event_bbackActionPerformed

    private void bnewuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnewuserActionPerformed
        if(check.equals("CUSTOMER"))
           {dispose();
           new customerlogin().setVisible(true);
           }
        else if(check.equals("SELLER"))
           {dispose();
           new sellerlogin().setVisible(true);
           }
        else
        {}      
    }//GEN-LAST:event_bnewuserActionPerformed

    private void pfpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfpasswordKeyPressed
         boolean flag=false;
        if(check.equals("CUSTOMER"))
      {customerimp cu=new customerimp();
       flag=cu.get(tfusername.getText(),pfpassword.getText());
         if(flag)
          {
           
           chec=tfusername.getText();
           dispose();
          try {cartimp c=new cartimp();
              new customerwindow(chec,c.items(chec)).setVisible(true);
          } catch (SQLException ex) {
              System.out.println(ex);
          }
          }
          else
          {
           }
      }
      else if(check.equals("SELLER"))
           {sellerimp s=new sellerimp();
        flag=s.get(tfusername.getText(),pfpassword.getText());
       if(flag)
        {
         
        chec=tfusername.getText();
        dispose();
               try {
                   new sellerwindow(chec).setVisible(true);
               } catch (SQLException ex) {
                   System.out.println(ex);
               }
         }
        else
         {
         }
       }
    else //here admin option will come and copy code from above for successful login.
      {{adminimp c=new adminimp();
      flag=c.get(tfusername.getText(),pfpassword.getText());
     if(flag)
        {
        lmessage.setText("");
        chec=tfusername.getText();
        dispose();
        new adminwindow(chec).setVisible(true);
         }
        else
         {
         }
      }
      }
     
    }//GEN-LAST:event_pfpasswordKeyPressed

    private void chbrememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbrememberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbrememberActionPerformed

    private void pfpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfpasswordActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bback;
    private javax.swing.JButton blogin;
    private javax.swing.JButton bnewuser;
    private javax.swing.JButton breset;
    private javax.swing.JCheckBox chbremember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lloginmodule;
    private javax.swing.JLabel lmessage;
    private javax.swing.JPasswordField pfpassword;
    private javax.swing.JTextField tfusername;
    // End of variables declaration//GEN-END:variables
}
