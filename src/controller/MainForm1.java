/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controller;

import java.io.BufferedReader; // lib file
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; // lib file
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.index;

/**
 *
 * @author ADMIN
 */
public class MainForm1 extends javax.swing.JFrame implements Runnable {

    private int row = 2; //8
    private int col = 2;//8
    private final int beginRow = 2; //8
    private final int beginCol = 2;//8
    private final int beginLevel=1;
    public ButtonEvent graphicsPanel;
    private boolean pause = false;
    private boolean resume = false;
    private int maxTime = 300;
    public int time = maxTime;
    public int swap = 5;
    public int score = 0;
    private int level = 1;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Creates new form MainForm
     */
    public MainForm1() {
        initComponents();
        pauseDialog.setLocationRelativeTo(pnlIcon);// set pause dialog center
        lblSwap.setText("" + swap);
        lblScore.setText("" + score);
        createGraphicsPanel();
        pgbTime.setStringPainted(true);
        pgbTime.setForeground(Color.blue);
    }

    public MainForm1(int score, int swap) {
        initComponents();
//        pauseDialog.setLocationRelativeTo(pnlIcon);// set pause dialog center
        lblSwap.setText("" + swap);
        lblScore.setText("" + score);
        createGraphicsPanel();
    }

    private JPanel createGraphicsPanel() {
        pnlIcon.removeAll();// sau khi new game thi xoa panel cu
        graphicsPanel = new ButtonEvent(this, row, col); // this,row col
        pnlIcon.setBackground(Color.gray);
        pnlIcon.add(graphicsPanel);
        return pnlIcon;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pauseDialog = new javax.swing.JDialog();
        resumeBtn = new javax.swing.JButton();
        Menubtn = new javax.swing.JButton();
        restartBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        playNextDialog = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        playAgainDialog = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pnlIcon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pgbTime = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblSwap = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        pauseDialog.setLocation(new java.awt.Point(0, 0));
        pauseDialog.setMinimumSize(new java.awt.Dimension(500, 500));
        pauseDialog.setModal(true);
        pauseDialog.setUndecorated(true);
        pauseDialog.setResizable(false);
        pauseDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resumeBtn.setText("resume");
        resumeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumeBtnActionPerformed(evt);
            }
        });
        pauseDialog.getContentPane().add(resumeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, 30));

        Menubtn.setText("Menu");
        Menubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenubtnActionPerformed(evt);
            }
        });
        pauseDialog.getContentPane().add(Menubtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        restartBtn.setText("restart");
        restartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartBtnActionPerformed(evt);
            }
        });
        pauseDialog.getContentPane().add(restartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        exitBtn.setText("exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        pauseDialog.getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 70, -1));

        playNextDialog.setUndecorated(true);
        playNextDialog.setResizable(false);
        playNextDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Main Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        playNextDialog.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 100, 50));

        jButton4.setText("Play Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        playNextDialog.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 100, 50));

        jLabel6.setText("Very good");
        playNextDialog.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 210, 50));
        playNextDialog.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        playAgainDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Congratulation!!You are the winner...");
        playAgainDialog.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 290, 50));

        jButton5.setText("Main Menu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        playAgainDialog.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, 50));

        jButton6.setText("Play Again");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        playAgainDialog.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 100, 50));
        playAgainDialog.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIcon.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnlIcon.setLayout(new java.awt.GridBagLayout());
        getContentPane().add(pnlIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 600, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Screenshot 2021-12-13 233159.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 130));

        pgbTime.setOrientation(SwingConstants.VERTICAL);
        getContentPane().add(pgbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 131, 23, 480));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SCORE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 70, 30));

        lblScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScore.setText("0");
        getContentPane().add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 80, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("SWAP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 73, 31));

        lblSwap.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSwap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSwap.setText("5");
        getContentPane().add(lblSwap, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 63, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("LEVEL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 60, -1));

        lblLevel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLevel.setText("1");
        getContentPane().add(lblLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("PAUSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 40, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hinh-nen-pokemon-chibi_035414814.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (swap > 0) {
            graphicsPanel.changePosition();
            swap--;
            lblSwap.setText("" + swap);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (isPause()) {
            pause = false;
            pauseDialog.setVisible(false);

        } else {
            pause = true;
            pauseDialog.setVisible(true);

        }
//        showDialogNewGame();
//        showDialogPlayAgainGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void resumeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumeBtnActionPerformed
        // TODO add your handling code here:
        pauseDialog.setVisible(false);
        pause = !pause;
    }//GEN-LAST:event_resumeBtnActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        System.out.println("da thoat");
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        saveData();
    }//GEN-LAST:event_formWindowClosing

    private void MenubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenubtnActionPerformed
        NewJFrame menu = new NewJFrame();
        saveData();
        pauseDialog.setVisible(false);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenubtnActionPerformed

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
        pauseDialog.setLocationRelativeTo(pnlIcon);
    }//GEN-LAST:event_formComponentMoved

    private void restartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartBtnActionPerformed
        //ODO add your handling code here: T
        newGame();
        pause = !pause;
        pauseDialog.setVisible(false);
    }//GEN-LAST:event_restartBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        saveData();
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        continueGameAfterWin();

        playNextDialog.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        NewJFrame frame = new NewJFrame();
//        saveData();
        frame.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        NewJFrame frame = new NewJFrame();
//        saveData();
        frame.setVisible(true);
        this.setVisible(false);
        playAgainDialog.setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        newGame();
        playAgainDialog.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void saveData() {

        graphicsPanel.saveMap();
        graphicsPanel.saveScore();
        graphicsPanel.saveSwap(swap);
        graphicsPanel.saveTime(time);
    }

    public static void main1(String args[]) {
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
            java.util.logging.Logger.getLogger(MainForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
        MainForm1 form = new MainForm1();
        form.setVisible(true);
        new Thread((Runnable) form).start();
//        });
    }

    public void newGame() {
        swap = 5;//// new game them swap
        lblSwap.setText("" + swap);// new game them swap
        this.row=beginRow;
        this.col=beginCol;
        this.level=1;
        this.graphicsPanel.setLevel(1);
        lblLevel.setText("1");
        time = maxTime;
        
        graphicsPanel.removeAll();
        graphicsPanel.setVisible(false);
        createGraphicsPanel();
        pnlIcon.validate();
        pnlIcon.setVisible(true);
        lblScore.setText("0");
        System.out.println("level: " + this.graphicsPanel.getLevel());
        ///

        
       
        
    }

    public void continueGameAfterWin() {
        time = maxTime;

        System.out.println("continue after win");
//        createGraphicsPanel();
//        jLabel6.setText("Very good. You won level :" + this.level);
        pnlIcon.remove(this.graphicsPanel);

        this.level++;
        System.out.println("level....: " + this.level);
        this.row += 2;
        this.col += 2;
        graphicsPanel = new ButtonEvent(this, row, col);
        graphicsPanel.setScore(Integer.valueOf(this.lblScore.getText()));
        graphicsPanel.setLevel(this.level);
        System.out.println("level: " + graphicsPanel.getLevel());
        pnlIcon.add(graphicsPanel);//, BorderLayout.CENTER
        pnlIcon.validate();
        pnlIcon.setVisible(true);
        lblScore.setText(String.valueOf(graphicsPanel.getScore()));
        lblLevel.setText(String.valueOf(level));
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (isPause()) {

            } else {
                time--;
            }
            if (time == 0) {

                if (showDialogNewGame(
                        "Full time\nDo you want play again?", "Lose", 1) == true) {

                }
            }
            if (pgbTime != null) {
                pgbTime.setValue((int) ((double) time / maxTime * 100));
            }
        }
    }

    public boolean isPause() {
        return pause;
    }

    public void setPause(boolean pause) {
        this.pause = pause;
    }

    public boolean isResume() {
        return resume;
    }

//    public void setResume(boolean resume) {
//        this.resume = resume;
//    }
    public boolean showDialogNewGame(String message, String title, int t) {
        pause = true;
        resume = false;

        int select = JOptionPane.showOptionDialog(null, message, title,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                null, null);
        if (select == 0) {
            pause = false;
            newGame();
            return true;
        } else {
            if (t == 1) {
                System.exit(0);
                return false;
            } else {

                resume = true;
                return true;
            }
        }
    }

    public boolean showDialogNewGame() {
        pause = true;
        resume = false;
        jLabel6.setText("VERY GOOD! YOU WON LEVEL "+this.level);
        playNextDialog.setBounds(400, 300, 400, 300);
        playNextDialog.setVisible(true);
        return true;
    }

    public boolean showDialogPlayAgainGame() {
        pause = true;
        resume = false;
        playAgainDialog.setBounds(400, 300, 400, 300);
        playAgainDialog.setVisible(true);
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menubtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblLevel;
    public javax.swing.JLabel lblScore;
    public javax.swing.JLabel lblSwap;
    private javax.swing.JDialog pauseDialog;
    private javax.swing.JProgressBar pgbTime;
    private javax.swing.JDialog playAgainDialog;
    private javax.swing.JDialog playNextDialog;
    private javax.swing.JPanel pnlIcon;
    private javax.swing.JButton restartBtn;
    private javax.swing.JButton resumeBtn;
    // End of variables declaration//GEN-END:variables
}
