/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader; // lib file
import java.io.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException; // lib file
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Hungdim
 */
public class ButtonEvent extends JPanel implements ActionListener, Runnable {

    private static final long serialVersionUID = 1L;
    private int row;
    private int col;
    private int bound = 1;
    private int size = 38;
    public int score = 0;
    private JButton[][] btn;
    private Point p1 = null;
    private Point p2 = null;
    public Controller algorithm;
    private PointLine line;
    private MainForm1 frame;
    private Color backGroundColor = Color.lightGray;
   // private int item;
    public int timeHandle;
    public int level = 1;
    boolean closeThread = false;
    public int[] higScore = new int[5];
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

    public ButtonEvent(MainForm1 frame, int row, int col) {
        this.frame = frame;
        this.row = row + 2;
        this.col = col + 2;
        //item = row * col / 2;
        setLayout(new GridLayout(row, col, bound, bound));
        setBackground(backGroundColor);//backGroundColor
        setPreferredSize(new Dimension((size + bound) * col, (size + bound)
                * row));
        setBorder(new EmptyBorder(2, 2, 2, 2));//10 
        setAlignmentY(JPanel.CENTER_ALIGNMENT);
        newGame();

    }

    public void newGame() {
        algorithm = new Controller(this.frame, this.row, this.col);
        addArrayButton();

        new Thread((Runnable) this).start();
//        saveMap();

    }

    @Override
    public void run() {
        while (!closeThread) {
            try {
                Thread.sleep(1000);
                ++timeHandle;
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            if (timeHandle > 10) {
            }

            System.out.println("time Handle: " + timeHandle);
        }

    }

    private void addArrayButton() {
        this.removeAll();
        btn = new JButton[row][col];
        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < col - 1; j++) {
                if (algorithm.getMatrix()[i][j] != 0) {
                    btn[i][j] = createButton(i + "," + j);
                    Icon icon = getIcon(algorithm.getMatrix()[i][j]);
                    btn[i][j].setIcon(icon);
                    add(btn[i][j]);
                } else {
                    btn[i][j] = createButton(i + "," + j);
                    add(btn[i][j]);
                    setDisable(btn[i][j]);
                }
            }
        }
    }

    private Icon getIcon(int index) {
        int width = 38, height = 38;//48
        Image image = new ImageIcon(getClass().getResource(
                "/icon/" + index + ".png")).getImage();
        Icon icon = new ImageIcon(image.getScaledInstance(width, height,
                image.SCALE_SMOOTH));
        return icon;

    }

    public void changePosition() { // random 
        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < col - 1; j++) {
                setDisable(btn[i][j]);
            }
        }
        this.removeAll();
        algorithm.newRandMap();
        addArrayButton();
    }

    private JButton createButton(String action) {
        JButton btn = new JButton();
        btn.setActionCommand(action);
        btn.setBorder(null);
        btn.addActionListener(this);
        return btn;
    }

    public void execute(Point p1, Point p2) {
        System.out.println("delete");
        setDisable(btn[p1.x][p1.y]);
        setDisable(btn[p2.x][p2.y]);
    }

    private void setDisable(JButton btn) {
        btn.setIcon(null);
        btn.setBackground(backGroundColor);
        btn.setVisible(false);
        btn.setEnabled(false);
    }

    public void setResume(ArrayList<Integer> arr) { // ??
        int k = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                algorithm.getMatrix()[i][j] = arr.get(k);
                k++;
            }
        }
        addArrayButton();
    }

    public void saveMap() {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("saveMap.txt");
            FileWriter fw = new FileWriter(f);
            //Bước 2: Ghi dữ liệu
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    fw.write(algorithm.getIndex(i, j) + " ");
                }
                fw.write("\n");
            }
            //Bước 3: Đódssng luồng
            fw.close();

        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }

    }

    public void saveTime(int time) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("saveTime.txt");
            FileWriter fw = new FileWriter(f);
            //Bước 2: Ghi dữ liệu
            fw.write(time + "");

            //Bước 3: Đódssng luồng
            fw.close();

        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }

    public void saveLevel(int level) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("saveLevel.txt");
            FileWriter fw = new FileWriter(f);
            //Bước 2: Ghi dữ liệu
            fw.write(level + "");

            //Bước 3: Đódssng luồng
            fw.close();

        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }

    public void close() {
        closeThread = true;
    }

    public void saveSwap(int swap) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("saveSwap.txt");
            FileWriter fw = new FileWriter(f);
            //Bước 2: Ghi dữ liệu
            fw.write(swap + "");

            //Bước 3: Đódssng luồng
            fw.close();

        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }

    public void saveScore() {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("saveScore.txt");
            FileWriter fw = new FileWriter(f);
            //Bước 2: Ghi dữ liệu
            fw.write(score + "");
            //Bước 3: Đódssng luồng
            fw.close();

        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btnIndex = e.getActionCommand();
        int indexDot = btnIndex.lastIndexOf(",");
        int x = Integer.parseInt(btnIndex.substring(0, indexDot));
        int y = Integer.parseInt(btnIndex.substring(indexDot + 1,
                btnIndex.length()));

        if (p1 == null) {
            p1 = new Point(x, y);
            btn[p1.x][p1.y].setBorder(new LineBorder(Color.red));
        } else {
            p2 = new Point(x, y);
            System.out.println("(" + p1.x + "," + p1.y + ")" + " --> " + "("
                    + p2.x + "," + p2.y + ")");
            line = algorithm.checkTwoPoint(p1, p2);
            if (line != null) {
                if (level == 1 || level == 6) {
                    int iconRemove = algorithm.getMatrix()[p1.x][p1.y]; // remove icon ra khoi mang list Icon
                    System.out.println("line != null");
                    for (int i = 0; i < algorithm.getListIcon().size(); i++) {  // remove icon ra khoi mang list Icon
                        if (algorithm.getListIcon().get(i) == iconRemove) {
                            algorithm.listIcon.remove(i);
                            break;
                        }
                    }
                    for (int i = 0; i < algorithm.getListIcon().size(); i++) {  // remove icon ra khoi mang list Icon
                        if (algorithm.getListIcon().get(i) == iconRemove) {
                            algorithm.listIcon.remove(i);
                            break;
                        }
                    }
                    algorithm.getMatrix()[p1.x][p1.y] = 0;
                    algorithm.getMatrix()[p2.x][p2.y] = 0;
                    algorithm.listIndexRemove.add(p1);
                    algorithm.listIndexRemove.add(p2);
                    algorithm.showMatrix();
                    execute(p1, p2);
                    line = null;

                } else {
                    for (int i = 1; i < row - 1; i++) {
                        for (int j = 1; j < col - 1; j++) {
                            setDisable(btn[i][j]);
                        }
                    }
                    int iconRemove = algorithm.getMatrix()[p1.x][p1.y]; // remove icon ra khoi mang list Icon
                    System.out.println("line != null");
                    for (int i = 0; i < algorithm.getListIcon().size(); i++) {  // remove icon ra khoi mang list Icon
                        if (algorithm.getListIcon().get(i) == iconRemove) {
                            algorithm.listIcon.remove(i);
                            break;
                        }
                    }
                    for (int i = 0; i < algorithm.getListIcon().size(); i++) {  // remove icon ra khoi mang list Icon
                        if (algorithm.getListIcon().get(i) == iconRemove) {
                            algorithm.listIcon.remove(i);
                            break;
                        }
                    }

                    frame.pnlIcon.removeAll();
                    algorithm.newLevel(p1, p2, level);
                    algorithm.showMatrix();
                    frame.pnlIcon.remove(this);
                    addArrayButton();
                    frame.pnlIcon.add(this);
                    line = null;

                }
                if (timeHandle < 5) {
                    score += 10;
                } else if (timeHandle >= 5 && timeHandle <= 10) {
                    score += 5;
                } else {
                    score += 2;
                }
                //item--;
                frame.time++;
                frame.lblScore.setText(score + "");
                timeHandle = 0; // xu ly diem 
            }
            btn[p1.x][p1.y].setBorder(null);
            p1 = null;
            p2 = null;
            System.out.println("done");
            if (algorithm.isEmty() && level < 5) {
                frame.showDialogNewGame();
                close();
            } else if (algorithm.isEmty() && this.level == 5) {
                frame.showDialogPlayAgainGame();
                close();
            }
        }
    }
}
