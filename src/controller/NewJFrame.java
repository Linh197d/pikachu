package controller;

import java.io.BufferedReader; // lib file
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; // lib file
import javax.swing.SwingConstants;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        continueDialog = new javax.swing.JDialog();
        continuelbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnContinue = new javax.swing.JButton();
        btnHowToPlay = new javax.swing.JButton();
        btnNewGame = new javax.swing.JButton();
        btnHighScore = new javax.swing.JButton();
        btnAboutUs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        continueDialog.setMinimumSize(new java.awt.Dimension(300, 300));
        continueDialog.setModal(true);
        continueDialog.setUndecorated(true);
        continueDialog.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                continueDialogMouseMoved(evt);
            }
        });
        continueDialog.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                continueDialogComponentShown(evt);
            }
        });

        continuelbl.setText("chua co du lieu game ");

        javax.swing.GroupLayout continueDialogLayout = new javax.swing.GroupLayout(continueDialog.getContentPane());
        continueDialog.getContentPane().setLayout(continueDialogLayout);
        continueDialogLayout.setHorizontalGroup(
            continueDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(continueDialogLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(continuelbl)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        continueDialogLayout.setVerticalGroup(
            continueDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(continueDialogLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(continuelbl)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(690, 610));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnContinue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnContinue.setText("CONTINUE");
        btnContinue.setPreferredSize(new java.awt.Dimension(120, 25));
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 140, 41));

        btnHowToPlay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHowToPlay.setText("HOW TO PLAY");
        btnHowToPlay.setPreferredSize(new java.awt.Dimension(120, 25));
        btnHowToPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHowToPlayActionPerformed(evt);
            }
        });
        jPanel1.add(btnHowToPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 140, 41));

        btnNewGame.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewGame.setText("NEW GAME");
        btnNewGame.setPreferredSize(new java.awt.Dimension(120, 25));
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 140, 41));

        btnHighScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHighScore.setText("HIGH SCORE");
        btnHighScore.setPreferredSize(new java.awt.Dimension(120, 25));
        btnHighScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHighScoreActionPerformed(evt);
            }
        });
        jPanel1.add(btnHighScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 140, 41));

        btnAboutUs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAboutUs.setText("ABOUT US");
        btnAboutUs.setPreferredSize(new java.awt.Dimension(120, 25));
        btnAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsActionPerformed(evt);
            }
        });
        jPanel1.add(btnAboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 140, 41));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POKEMON");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 313, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hinh-nen-ve-pokemon_035416345.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 780, 610));

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        ArrayList<Integer> arr = new ArrayList<>();
//     
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("saveMap.txt");
            FileReader fr = new FileReader(f);
            //Bước 2: Đọc dữ liệu
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                int i = 0;
                String[] result = new String[100];
                result = line.split(" ");
//                System.out.println(result.length);
//  
                while (i < result.length) {
                    arr.add(Integer.parseInt(result[i]));
                    i++;
                }
            }
          
            int time = 0;
            File t = new File("saveTime.txt");
            FileReader rt = new FileReader(t);
            BufferedReader br1 = new BufferedReader(rt);
            String line1;
            while ((line1 = br1.readLine()) != null) {
                time = Integer.parseInt(line1);
                System.out.print("time" + time);

            }

            int score = 0;
            File sc = new File("saveScore.txt");
            FileReader rSc = new FileReader(sc);
            BufferedReader br2 = new BufferedReader(rSc);
            String line2;
            while ((line2 = br2.readLine()) != null) {
                score = Integer.parseInt(line2);
                System.out.print("score" + score);

            }
            int swap = 0;
            File sw = new File("saveSwap.txt");
            FileReader rSw = new FileReader(sw);
            BufferedReader br3 = new BufferedReader(rSw);
            String line3;
            while ((line3 = br3.readLine()) != null) {
                swap = Integer.parseInt(line3);
//                System.out.print("score" + score);

            }
            int level = 0;
            File lv = new File("saveLevel.txt");
            FileReader rLv = new FileReader(lv);
            BufferedReader br4 = new BufferedReader(rLv);
            String line4;
            while ((line4 = br4.readLine()) != null) {
                level = Integer.parseInt(line4);
//                System.out.print("score" + score);

            }
            MainForm1 form = new MainForm1(score, swap, level);
//            form.removeAll();
            form.graphicsPanel.setResume(arr);
            form.time = time;
            form.score = score;
            form.swap = swap;
            form.level = level;
            System.out.println("level:" + level);
            form.graphicsPanel.score = score;
            this.setVisible(false);
            form.setVisible(true);
            new Thread((Runnable) form).start();
            fr.close();
            br.close();
        } catch (Exception ex) {
            continueDialog.setVisible(true);
            System.out.println("Loi doc file: " + ex);
        }

    }//GEN-LAST:event_btnContinueActionPerformed

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        MainForm1 form = new MainForm1();
        form.setVisible(true);
        this.setVisible(false);
        new Thread((Runnable) form).start();

    }//GEN-LAST:event_btnNewGameActionPerformed

    private void btnHowToPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHowToPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHowToPlayActionPerformed

    private void btnHighScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHighScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHighScoreActionPerformed

    private void btnAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAboutUsActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
//        form.graphicsPanel.saveMap();
//        System.out.println("abc");
    }//GEN-LAST:event_formWindowClosing

    private void continueDialogMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continueDialogMouseMoved
        // TODO add your handling code here:
        continueDialog.setLocationRelativeTo(this);
    }//GEN-LAST:event_continueDialogMouseMoved

    private void continueDialogComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_continueDialogComponentShown
        // TODO add your handling code here:
        continueDialog.setLocationRelativeTo(this);
    }//GEN-LAST:event_continueDialogComponentShown

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUs;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnHighScore;
    private javax.swing.JButton btnHowToPlay;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JDialog continueDialog;
    private javax.swing.JLabel continuelbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
