import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class choices extends javax.swing.JFrame {
 public static boolean isJavaCompleted = false;       
   
    
    public choices() {
        initComponents();
        updateButtonState();
        
    }
private void updateButtonState() {
        // Unlock the Python button only if the Java task is completed
        if (isJavaCompleted) {
            btnok.setEnabled(true);  // Unlock Python button
        } else {
            btnok.setEnabled(true);  // Keep Python button locked
        }
        
}

    public choices(String name) {
        initComponents();
        jLabel2.setText("HELLO " + name + " ENJOY THE GAME!");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        classic = new javax.swing.JButton();
        c = new javax.swing.JButton();
        btnok = new javax.swing.JButton();
        python = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        classic.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        classic.setForeground(new java.awt.Color(255, 51, 0));
        classic.setText("classic");
        classic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classicMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                classicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                classicMouseExited(evt);
            }
        });
        classic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classicActionPerformed(evt);
            }
        });
        jPanel1.add(classic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        c.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        c.setForeground(new java.awt.Color(255, 0, 0));
        c.setText("c ");
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cMouseExited(evt);
            }
        });
        jPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 90, 20));

        btnok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnok.setForeground(new java.awt.Color(255, 51, 0));
        btnok.setText("JAVA");
        btnok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnokMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnokMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnokMouseExited(evt);
            }
        });
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        jPanel1.add(btnok, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, -1));

        python.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        python.setForeground(new java.awt.Color(255, 0, 0));
        python.setText("PYTHON");
        python.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pythonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pythonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pythonMouseExited(evt);
            }
        });
        jPanel1.add(python, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 212, 90, -1));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose a game mode ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 230, 40));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 230, 20));

        back.setText("back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void backcolor (JButton hover, Color rand){
        hover.setBackground(rand);
    }
    private void classicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classicActionPerformed
        
    }//GEN-LAST:event_classicActionPerformed

    private void classicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classicMouseEntered
        backcolor (classic, new Color(5,10,44));
    }//GEN-LAST:event_classicMouseEntered

    private void classicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classicMouseExited
       backcolor (classic, new Color(255,255,255));
    }//GEN-LAST:event_classicMouseExited

    private void classicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classicMouseClicked
        start5 str = new start5();
        str.show();
        
        dispose();
    }//GEN-LAST:event_classicMouseClicked

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
      
    }//GEN-LAST:event_btnokActionPerformed

    private void btnokMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnokMouseEntered
        backcolor (btnok, new Color(5,10,44));
    }//GEN-LAST:event_btnokMouseEntered

    private void btnokMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnokMouseExited
        backcolor (btnok, new Color(255,255,255));
    }//GEN-LAST:event_btnokMouseExited

    private void btnokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnokMouseClicked
       if (isJavaCompleted) {
            // If Java task is completed, unlock Python
            start2 settingsFrame = new start2();
            settingsFrame.setVisible(true);
        } else {
            // Otherwise, show a message to complete Java first
            JOptionPane.showMessageDialog(this, "You neeed to complete classic mode!", "Access Denied", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnokMouseClicked

    private void cMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseEntered
         backcolor (c, new Color(5,10,44));
    }//GEN-LAST:event_cMouseEntered

    private void cMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseExited
         backcolor (c, new Color(255,255,255));
    }//GEN-LAST:event_cMouseExited

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
       if (isJavaCompleted) {
            // If Java task is completed, unlock Python
             start3 settingsFrame = new start3();
            settingsFrame.setVisible(true);
        } else {
            // Otherwise, show a message to complete Java first
            JOptionPane.showMessageDialog(this, "You need to complete classic mode!", "Access Denied", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_cMouseClicked

    private void pythonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pythonMouseEntered
        backcolor (python, new Color(5,10,44));
    }//GEN-LAST:event_pythonMouseEntered

    private void pythonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pythonMouseExited
       backcolor (python, new Color(255,255,255));
    }//GEN-LAST:event_pythonMouseExited

    private void pythonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pythonMouseClicked
         if (isJavaCompleted) {
            // If Java task is completed, unlock Python
             start4 settingsFrame = new start4();
            settingsFrame.setVisible(true);
        } else {
            // Otherwise, show a message to complete Java first
            JOptionPane.showMessageDialog(this, "You need to Complete classic mode!", "Access Denied", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_pythonMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        backcolor (back, new Color(5,10,44));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        backcolor (back, new Color(255,255,255));
    }//GEN-LAST:event_backMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        menu str=  new menu();
        str.show();
        
        dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(choices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(choices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(choices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(choices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new choices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnok;
    private javax.swing.JButton c;
    private javax.swing.JButton classic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton python;
    // End of variables declaration//GEN-END:variables

}