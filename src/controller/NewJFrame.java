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
        jLabel13 = new javax.swing.JLabel();
        dialogHowtoplay = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        aboutUsDialog = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNewGame = new javax.swing.JLabel();
        btnContinue = new javax.swing.JLabel();
        btnHowtoplay = new javax.swing.JLabel();
        btnAboutUs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        continueDialog.setMinimumSize(new java.awt.Dimension(430, 350));
        continueDialog.setModal(true);
        continueDialog.setPreferredSize(new java.awt.Dimension(800, 600));
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
        continueDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nodata.png"))); // NOI18N
        continueDialog.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 600, 300));

        dialogHowtoplay.setTitle("How to play");
        dialogHowtoplay.setBackground(new java.awt.Color(255, 102, 0));
        dialogHowtoplay.setMinimumSize(new java.awt.Dimension(690, 400));
        dialogHowtoplay.setModal(true);
        dialogHowtoplay.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minhhoa1.jpg"))); // NOI18N
        dialogHowtoplay.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 220, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minhhoa2.jpg"))); // NOI18N
        dialogHowtoplay.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 220, -1, 83));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minhhoa3.jpg"))); // NOI18N
        dialogHowtoplay.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 220, -1, 83));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minhhoa4.jpg"))); // NOI18N
        dialogHowtoplay.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, 83));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minhha5.jpg"))); // NOI18N
        dialogHowtoplay.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 220, -1, 83));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("1. T??m v?? b???m v??o 2 h??nh gi???ng h???t nhau");
        dialogHowtoplay.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 26, 662, 41));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("2. B???n kh??ng th??? t???o qu?? 3 ???????ng k???t n???i gi???a ch??ng nh?? h??nh  ");
        dialogHowtoplay.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 85, 662, 42));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("   minh h???a:");
        dialogHowtoplay.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 145, 662, 43));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backgroundhtp.jpg"))); // NOI18N
        dialogHowtoplay.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 400));

        aboutUsDialog.setTitle("About Us");
        aboutUsDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ABOUT US (7).gif"))); // NOI18N
        jLabel11.setText("jLabel11");
        aboutUsDialog.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -100, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POKEMON GAME");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnNewgame.png"))); // NOI18N
        btnNewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewGameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewGameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewGameMouseExited(evt);
            }
        });
        jPanel1.add(btnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 200, 60));

        btnContinue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnContinue.png"))); // NOI18N
        btnContinue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContinueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContinueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnContinueMouseExited(evt);
            }
        });
        jPanel1.add(btnContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 190, 60));

        btnHowtoplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnHowtoplay.png"))); // NOI18N
        btnHowtoplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHowtoplayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHowtoplayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHowtoplayMouseExited(evt);
            }
        });
        jPanel1.add(btnHowtoplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 190, 60));

        btnAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnAboutus.png"))); // NOI18N
        btnAboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAboutUsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAboutUsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAboutUsMouseExited(evt);
            }
        });
        jPanel1.add(btnAboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 200, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POKEMON");
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentMoved(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 313, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hinh-nen-ve-pokemon_035416345.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 780, 610));

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnNewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseClicked
        // TODO add your handling code here:
        MainForm1 form = new MainForm1();
            form.setVisible(true);
            this.setVisible(false);
            new Thread((Runnable) form).start();
    }//GEN-LAST:event_btnNewGameMouseClicked

    private void btnContinueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinueMouseClicked
        // TODO add your handling code here:
ArrayList<Integer> arr = new ArrayList<>();
//     
        try {
            //B?????c 1: T???o ?????i t?????ng lu???ng v?? li??n k???t ngu???n d??? li???u
            File f = new File("saveMap.txt");
            FileReader fr = new FileReader(f);
            //B?????c 2: ?????c d??? li???u
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
            form.graphicsPanel.algorithm.listIcon.clear();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) != 0) {
                    form.graphicsPanel.algorithm.listIcon.add(arr.get(i));
                }
            }
            System.out.print("listIcon:");
            for (int i = 0; i < form.graphicsPanel.algorithm.listIcon.size(); i++) {

                System.out.print(form.graphicsPanel.algorithm.listIcon.get(i) + "  ");
            }
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
    }//GEN-LAST:event_btnContinueMouseClicked

    private void btnNewGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseEntered
        // TODO add your handling code here:
btnNewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnNewgame1.png")));
    }//GEN-LAST:event_btnNewGameMouseEntered

    private void btnNewGameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGameMouseExited
        // TODO add your handling code here:
btnNewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnNewgame.png")));
    }//GEN-LAST:event_btnNewGameMouseExited

    private void btnContinueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinueMouseEntered
        // TODO add your handling code here:
btnContinue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnContinue1.png")));
    }//GEN-LAST:event_btnContinueMouseEntered

    private void btnContinueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinueMouseExited
        // TODO add your handling code here:
btnContinue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnContinue.png")));
    }//GEN-LAST:event_btnContinueMouseExited

    private void btnHowtoplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHowtoplayMouseClicked
        // TODO add your handling code here:
dialogHowtoplay.setVisible(true);
dialogHowtoplay.setLocationRelativeTo(jPanel1);
    }//GEN-LAST:event_btnHowtoplayMouseClicked

    private void btnHowtoplayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHowtoplayMouseEntered
        // TODO add your handling code here:
btnHowtoplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnHowtoplay1.png")));
    }//GEN-LAST:event_btnHowtoplayMouseEntered

    private void btnHowtoplayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHowtoplayMouseExited
        // TODO add your handling code here:
btnHowtoplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnHowtoplay.png")));
    }//GEN-LAST:event_btnHowtoplayMouseExited

    private void btnAboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutUsMouseClicked
        // TODO add your handling code here:
        aboutUsDialog.setVisible(true);
        aboutUsDialog.setSize(600,600);
        aboutUsDialog.setLocationRelativeTo(null);
                
    }//GEN-LAST:event_btnAboutUsMouseClicked

    private void btnAboutUsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutUsMouseEntered
        // TODO add your handling code here:
btnAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnAboutus1.png")));
    }//GEN-LAST:event_btnAboutUsMouseEntered

    private void btnAboutUsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutUsMouseExited
        // TODO add your handling code here:
btnAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnAboutus.png")));
    }//GEN-LAST:event_btnAboutUsMouseExited

    private void jLabel1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentMoved
        // TODO add your handling code here:
dialogHowtoplay.setLocationRelativeTo(jPanel1);

    }//GEN-LAST:event_jLabel1ComponentMoved

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
    private javax.swing.JDialog aboutUsDialog;
    private javax.swing.JLabel btnAboutUs;
    private javax.swing.JLabel btnContinue;
    private javax.swing.JLabel btnHowtoplay;
    private javax.swing.JLabel btnNewGame;
    private javax.swing.JDialog continueDialog;
    private javax.swing.JDialog dialogHowtoplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
