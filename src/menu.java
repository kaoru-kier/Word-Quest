
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.sound.sampled.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.io.IOException;
import javax.swing.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class menu extends javax.swing.JFrame {

   public static Clip clip;
   public static boolean isMuted = false;
   
    public menu() {
        initComponents();
        if (!isMuted) {
            playMusic("C:/Users/user/Downloads/bgm.wav");
        }
    }

    private void playMusic(String filePath) {
        try {
            if (clip == null || !clip.isOpen()) {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(filePath));
                clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                
            }
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.err.println("Error playing music"+ e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        maximize = new javax.swing.JPanel();
        max = new javax.swing.JLabel();
        closebtn = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        playbtn = new javax.swing.JButton();
        settingbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        baba = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconfolder/logout (1).png"))); // NOI18N

        header.setBackground(new java.awt.Color(51, 51, 51));
        header.setPreferredSize(new java.awt.Dimension(820, 35));
        header.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        maximize.setBackground(new java.awt.Color(51, 51, 51));
        maximize.setName(""); // NOI18N
        maximize.setPreferredSize(new java.awt.Dimension(50, 35));
        maximize.setLayout(new java.awt.BorderLayout());

        max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconfolder/maximize (2) (1).png"))); // NOI18N
        max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maxMouseExited(evt);
            }
        });
        maximize.add(max, java.awt.BorderLayout.CENTER);

        jPanel1.add(maximize, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        closebtn.setBackground(new java.awt.Color(51, 51, 51));
        closebtn.setName(""); // NOI18N
        closebtn.setPreferredSize(new java.awt.Dimension(50, 35));
        closebtn.setLayout(new java.awt.BorderLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconfolder/close (1).png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        closebtn.add(close, java.awt.BorderLayout.CENTER);

        jPanel1.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        header.add(jPanel1, java.awt.BorderLayout.LINE_END);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playbtn.setBackground(new java.awt.Color(0, 153, 255));
        playbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconfolder/play (2).png"))); // NOI18N
        playbtn.setPreferredSize(new java.awt.Dimension(70, 55));
        playbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playbtnMouseExited(evt);
            }
        });
        playbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playbtnActionPerformed(evt);
            }
        });
        jPanel2.add(playbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 70, 60));

        settingbtn.setBackground(new java.awt.Color(0, 153, 255));
        settingbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconfolder/setting (2) (1).png"))); // NOI18N
        settingbtn.setPreferredSize(new java.awt.Dimension(70, 55));
        settingbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingbtnMouseExited(evt);
            }
        });
        settingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingbtnActionPerformed(evt);
            }
        });
        jPanel2.add(settingbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 70, 60));

        exitbtn.setBackground(new java.awt.Color(0, 153, 255));
        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconfolder/logout (1).png"))); // NOI18N
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitbtnMouseExited(evt);
            }
        });
        jPanel2.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 70, 60));

        baba.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        baba.setForeground(new java.awt.Color(51, 51, 255));
        jPanel2.add(baba, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconfolder/user (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconfolder/mainmenu (2).jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 830, 400));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void changecolor (JLabel hover, Color rand){
        hover.setBackground(rand);
    }
    
    
    private void maxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseEntered
       changecolor(max, new Color(5,10,45));
    }//GEN-LAST:event_maxMouseEntered

    private void maxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseExited
        changecolor(max, new Color(255,51,0));
    }//GEN-LAST:event_maxMouseExited

    private void maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseClicked
       if (this.getExtendedState() != loading.MAXIMIZED_BOTH){
            this.setExtendedState(loading.MAXIMIZED_BOTH);
    }                                
        else{
            this.setExtendedState(loading.NORMAL);
        }
    
    }//GEN-LAST:event_maxMouseClicked

    private void playbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playbtnActionPerformed

    private void settingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settingbtnActionPerformed

    public void backcolor (JButton hover, Color rand){
        hover.setBackground(rand);
    }

    
    private void playbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playbtnMouseEntered
        backcolor (playbtn, new Color(5,10,44));
    }//GEN-LAST:event_playbtnMouseEntered

    private void playbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playbtnMouseExited
        backcolor(playbtn, new Color(0,153,255));
    }//GEN-LAST:event_playbtnMouseExited

    private void playbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playbtnMouseClicked
       choices strt = new choices();
       strt.show();
       
       
    }//GEN-LAST:event_playbtnMouseClicked

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        changecolor(close, new Color(255,51,0));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        changecolor(close, new Color(5,10,44));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void settingbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingbtnMouseEntered
        backcolor (settingbtn, new Color(5,10,44));
    }//GEN-LAST:event_settingbtnMouseEntered

    private void settingbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingbtnMouseExited
        backcolor(settingbtn, new Color(0,153,255));
    }//GEN-LAST:event_settingbtnMouseExited

    private void settingbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingbtnMouseClicked
        settings sett = new settings();
        sett.show();
        
        dispose();
    }//GEN-LAST:event_settingbtnMouseClicked

    private void exitbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseEntered
        backcolor (exitbtn, new Color(5,10,44));
    }//GEN-LAST:event_exitbtnMouseEntered

    private void exitbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseExited
        backcolor(exitbtn, new Color(0,153,255));
    }//GEN-LAST:event_exitbtnMouseExited

    private void exitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseClicked
        exit st = new exit();
        st.show();
        
    }//GEN-LAST:event_exitbtnMouseClicked

   public void setLabelText(String text) {
       baba.setText(text);
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baba;
    private javax.swing.JLabel close;
    private javax.swing.JPanel closebtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel max;
    private javax.swing.JPanel maximize;
    private javax.swing.JButton playbtn;
    private javax.swing.JButton settingbtn;
    // End of variables declaration//GEN-END:variables
}
