/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhsconnectfour;

import javax.swing.JOptionPane; // popups
import java.util.ArrayList; // array handling
import java.util.List;

/**
 *
 * @author Ben
 * me me big boye, me me large person. nice and gender neutral.
 */
public class HHSConnectFour extends javax.swing.JFrame {

    // for keeping track of cell statuses
    int[][] playfield = new int[8][7];
    
    // for getting the right cell coordinates
    int[][] labelfield = new int[8][7];
    
    CoinHandler Coinman = new CoinHandler();
    
    /**
     * Creates new form HHSConnectGUI
     */
    public HHSConnectFour() {
        initComponents();
        
        // put every cell of playfield in list
        Coinman.spaceList.add(cell_x1y1); // 0
        Coinman.spaceList.add(cell_x2y1); // 1
        Coinman.spaceList.add(cell_x3y1); // 2
        Coinman.spaceList.add(cell_x4y1); // 3
        Coinman.spaceList.add(cell_x5y1); // 4
        Coinman.spaceList.add(cell_x6y1); // 5
        Coinman.spaceList.add(cell_x7y1); // 6

        Coinman.spaceList.add(cell_x1y2); // 7
        Coinman.spaceList.add(cell_x2y2); // 8
        Coinman.spaceList.add(cell_x3y2); // 9
        Coinman.spaceList.add(cell_x4y2); // 10
        Coinman.spaceList.add(cell_x5y2); // 11
        Coinman.spaceList.add(cell_x6y2); // 12
        Coinman.spaceList.add(cell_x7y2); // 13

        Coinman.spaceList.add(cell_x1y3); // 14
        Coinman.spaceList.add(cell_x2y3); // 15
        Coinman.spaceList.add(cell_x3y3); // 16
        Coinman.spaceList.add(cell_x4y3); // 17
        Coinman.spaceList.add(cell_x5y3); // 18
        Coinman.spaceList.add(cell_x6y3); // 19
        Coinman.spaceList.add(cell_x7y3); // 20

        Coinman.spaceList.add(cell_x1y4); // 21
        Coinman.spaceList.add(cell_x2y4); // 22
        Coinman.spaceList.add(cell_x3y4); // 23
        Coinman.spaceList.add(cell_x4y4); // 24
        Coinman.spaceList.add(cell_x5y4); // 25
        Coinman.spaceList.add(cell_x6y4); // 26
        Coinman.spaceList.add(cell_x7y4); // 27

        Coinman.spaceList.add(cell_x1y5); // 28
        Coinman.spaceList.add(cell_x2y5); // 29
        Coinman.spaceList.add(cell_x3y5); // 30
        Coinman.spaceList.add(cell_x4y5); // 31
        Coinman.spaceList.add(cell_x5y5); // 32
        Coinman.spaceList.add(cell_x6y5); // 33
        Coinman.spaceList.add(cell_x7y5); // 34

        Coinman.spaceList.add(cell_x1y6); // 35
        Coinman.spaceList.add(cell_x2y6); // 36
        Coinman.spaceList.add(cell_x3y6); // 37
        Coinman.spaceList.add(cell_x4y6); // 38
        Coinman.spaceList.add(cell_x5y6); // 39
        Coinman.spaceList.add(cell_x6y6); // 40
        Coinman.spaceList.add(cell_x7y6); // 41
        
        // make blank playfield
        playfield = wipePlayfield(playfield);
        
        // store labels for playfield
        labelfield[1][1] = 0;
        labelfield[2][1] = 1;
        labelfield[3][1] = 2;
        labelfield[4][1] = 3;
        labelfield[5][1] = 4;
        labelfield[6][1] = 5;
        labelfield[7][1] = 6;

        labelfield[1][2] = 7;
        labelfield[2][2] = 8;
        labelfield[3][2] = 9;
        labelfield[4][2] = 10;
        labelfield[5][2] = 11;
        labelfield[6][2] = 12;
        labelfield[7][2] = 13;

        labelfield[1][3] = 14;
        labelfield[2][3] = 15;
        labelfield[3][3] = 16;
        labelfield[4][3] = 17;
        labelfield[5][3] = 18;
        labelfield[6][3] = 19;
        labelfield[7][3] = 20;

        labelfield[1][4] = 21;
        labelfield[2][4] = 22;
        labelfield[3][4] = 23;
        labelfield[4][4] = 24;
        labelfield[5][4] = 25;
        labelfield[6][4] = 26;
        labelfield[7][4] = 27;

        labelfield[1][5] = 28;
        labelfield[2][5] = 29;
        labelfield[3][5] = 30;
        labelfield[4][5] = 31;
        labelfield[5][5] = 32;
        labelfield[6][5] = 33;
        labelfield[7][5] = 34;

        labelfield[1][6] = 35;
        labelfield[2][6] = 36;
        labelfield[3][6] = 37;
        labelfield[4][6] = 38;
        labelfield[5][6] = 39;
        labelfield[6][6] = 40;
        labelfield[7][6] = 41;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insert_x2 = new javax.swing.JButton();
        insert_x1 = new javax.swing.JButton();
        insert_x3 = new javax.swing.JButton();
        insert_x4 = new javax.swing.JButton();
        insert_x5 = new javax.swing.JButton();
        insert_x6 = new javax.swing.JButton();
        insert_x7 = new javax.swing.JButton();
        cell_x3y1 = new javax.swing.JLabel();
        cell_x1y1 = new javax.swing.JLabel();
        cell_x2y1 = new javax.swing.JLabel();
        cell_x4y1 = new javax.swing.JLabel();
        cell_x5y1 = new javax.swing.JLabel();
        cell_x6y1 = new javax.swing.JLabel();
        cell_x7y1 = new javax.swing.JLabel();
        cell_x6y2 = new javax.swing.JLabel();
        cell_x7y2 = new javax.swing.JLabel();
        cell_x3y2 = new javax.swing.JLabel();
        cell_x1y2 = new javax.swing.JLabel();
        cell_x2y2 = new javax.swing.JLabel();
        cell_x4y2 = new javax.swing.JLabel();
        cell_x5y2 = new javax.swing.JLabel();
        cell_x6y3 = new javax.swing.JLabel();
        cell_x7y3 = new javax.swing.JLabel();
        cell_x3y3 = new javax.swing.JLabel();
        cell_x1y3 = new javax.swing.JLabel();
        cell_x2y3 = new javax.swing.JLabel();
        cell_x4y3 = new javax.swing.JLabel();
        cell_x5y3 = new javax.swing.JLabel();
        cell_x6y4 = new javax.swing.JLabel();
        cell_x7y4 = new javax.swing.JLabel();
        cell_x3y4 = new javax.swing.JLabel();
        cell_x1y4 = new javax.swing.JLabel();
        cell_x2y4 = new javax.swing.JLabel();
        cell_x4y4 = new javax.swing.JLabel();
        cell_x5y4 = new javax.swing.JLabel();
        cell_x5y5 = new javax.swing.JLabel();
        cell_x6y5 = new javax.swing.JLabel();
        cell_x7y5 = new javax.swing.JLabel();
        cell_x3y5 = new javax.swing.JLabel();
        cell_x1y5 = new javax.swing.JLabel();
        cell_x2y5 = new javax.swing.JLabel();
        cell_x4y5 = new javax.swing.JLabel();
        cell_x5y6 = new javax.swing.JLabel();
        cell_x6y6 = new javax.swing.JLabel();
        cell_x7y6 = new javax.swing.JLabel();
        cell_x3y6 = new javax.swing.JLabel();
        cell_x1y6 = new javax.swing.JLabel();
        cell_x2y6 = new javax.swing.JLabel();
        cell_x4y6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insert_x2.setText("Insert");
        insert_x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_x2ActionPerformed(evt);
            }
        });

        insert_x1.setText("Insert");
        insert_x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_x1ActionPerformed(evt);
            }
        });

        insert_x3.setText("Insert");
        insert_x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_x3ActionPerformed(evt);
            }
        });

        insert_x4.setText("Insert");
        insert_x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_x4ActionPerformed(evt);
            }
        });

        insert_x5.setText("Insert");
        insert_x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_x5ActionPerformed(evt);
            }
        });

        insert_x6.setText("Insert");
        insert_x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_x6ActionPerformed(evt);
            }
        });

        insert_x7.setText("Insert");
        insert_x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_x7ActionPerformed(evt);
            }
        });

        cell_x3y1.setText(".");

        cell_x1y1.setText(".");

        cell_x2y1.setText(".");

        cell_x4y1.setText(".");

        cell_x5y1.setText(".");

        cell_x6y1.setText(".");

        cell_x7y1.setText(".");

        cell_x6y2.setText(".");

        cell_x7y2.setText(".");

        cell_x3y2.setText(".");

        cell_x1y2.setText(".");

        cell_x2y2.setText(".");

        cell_x4y2.setText(".");

        cell_x5y2.setText(".");

        cell_x6y3.setText(".");

        cell_x7y3.setText(".");

        cell_x3y3.setText(".");

        cell_x1y3.setText(".");

        cell_x2y3.setText(".");

        cell_x4y3.setText(".");

        cell_x5y3.setText(".");

        cell_x6y4.setText(".");

        cell_x7y4.setText(".");

        cell_x3y4.setText(".");

        cell_x1y4.setText(".");

        cell_x2y4.setText(".");

        cell_x4y4.setText(".");

        cell_x5y4.setText(".");

        cell_x5y5.setText(".");

        cell_x6y5.setText(".");

        cell_x7y5.setText(".");

        cell_x3y5.setText(".");

        cell_x1y5.setText(".");

        cell_x2y5.setText(".");

        cell_x4y5.setText(".");

        cell_x5y6.setText(".");

        cell_x6y6.setText(".");

        cell_x7y6.setText(".");

        cell_x3y6.setText(".");

        cell_x1y6.setText(".");

        cell_x2y6.setText(".");

        cell_x4y6.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insert_x1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insert_x2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insert_x3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insert_x4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insert_x5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insert_x6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insert_x7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cell_x1y5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x2y5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x3y5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x4y5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x5y5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x6y5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x7y5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cell_x1y4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x2y4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x3y4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x4y4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x5y4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x6y4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x7y4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cell_x1y3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x2y3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x3y3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x4y3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x5y3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x6y3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x7y3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cell_x1y2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x2y2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x3y2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x4y2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x5y2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x6y2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cell_x7y2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cell_x1y6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x2y6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x3y6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x4y6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x5y6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x6y6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x7y6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cell_x1y1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x2y1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x3y1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x4y1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x5y1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x6y1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cell_x7y1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert_x2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert_x1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert_x3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert_x4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert_x5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert_x6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert_x7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cell_x3y1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x1y1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x2y1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x4y1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x5y1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x6y1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x7y1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cell_x3y2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x1y2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x2y2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x4y2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x5y2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x6y2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x7y2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cell_x3y3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x1y3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x2y3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x4y3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x5y3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x6y3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x7y3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cell_x3y4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x1y4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x2y4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x4y4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x5y4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x6y4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x7y4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cell_x3y5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x1y5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x2y5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x4y5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x5y5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x6y5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x7y5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cell_x3y6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x1y6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x2y6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x4y6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x5y6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x6y6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell_x7y6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insert_x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_x2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insert_x2ActionPerformed

    private void insert_x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_x1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Button clicked!");
        renderPlayfield(playfield);
    }//GEN-LAST:event_insert_x1ActionPerformed

    private void insert_x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_x3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insert_x3ActionPerformed

    private void insert_x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_x4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insert_x4ActionPerformed

    private void insert_x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_x5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insert_x5ActionPerformed

    private void insert_x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_x6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insert_x6ActionPerformed

    private void insert_x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_x7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insert_x7ActionPerformed
    
    public int[][] wipePlayfield(int[][] playfield) {
        for(int i=0;i<(6*7);i++) {
            int x=1;
            int y=1;
            if(x<8) {
                x++;
            } else {
                x=1;
                y++;
            }
            playfield[x][y] = 0;
        }
        
        return playfield;
    }
    
    public void renderPlayfield(int[][] playfield) {
        int x=0;
        int y=1;
        
        for(int i=0;i<(7*6);i++) {
            if((x<7)) {
                x++;
            } else {
                x=1;
                y++;
            }
            
            // debug stuff
            String str_x = Integer.toString(x);
            String str_y = Integer.toString(y);
            System.out.println("Currently at X:"+str_x+", Y:"+str_y);
            
            // render field
            String value;
            
            switch(playfield[x][y]) {
                case 1:
                    value="red";
                    break;
                case 2:
                    value="blue";
                    break;
                case 0:    
                default:
                    value="none";
                    break;
            }
            
            Coinman.spaceList.get(labelfield[x][y]).setText(value);
        }
    }
    
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
            java.util.logging.Logger.getLogger(HHSConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HHSConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HHSConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HHSConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        // create array for keeping track of the playfield
        
        
        CoinHandler Test1 = new CoinHandler();
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HHSConnectFour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cell_x1y1;
    private javax.swing.JLabel cell_x1y2;
    private javax.swing.JLabel cell_x1y3;
    private javax.swing.JLabel cell_x1y4;
    private javax.swing.JLabel cell_x1y5;
    private javax.swing.JLabel cell_x1y6;
    private javax.swing.JLabel cell_x2y1;
    private javax.swing.JLabel cell_x2y2;
    private javax.swing.JLabel cell_x2y3;
    private javax.swing.JLabel cell_x2y4;
    private javax.swing.JLabel cell_x2y5;
    private javax.swing.JLabel cell_x2y6;
    private javax.swing.JLabel cell_x3y1;
    private javax.swing.JLabel cell_x3y2;
    private javax.swing.JLabel cell_x3y3;
    private javax.swing.JLabel cell_x3y4;
    private javax.swing.JLabel cell_x3y5;
    private javax.swing.JLabel cell_x3y6;
    private javax.swing.JLabel cell_x4y1;
    private javax.swing.JLabel cell_x4y2;
    private javax.swing.JLabel cell_x4y3;
    private javax.swing.JLabel cell_x4y4;
    private javax.swing.JLabel cell_x4y5;
    private javax.swing.JLabel cell_x4y6;
    private javax.swing.JLabel cell_x5y1;
    private javax.swing.JLabel cell_x5y2;
    private javax.swing.JLabel cell_x5y3;
    private javax.swing.JLabel cell_x5y4;
    private javax.swing.JLabel cell_x5y5;
    private javax.swing.JLabel cell_x5y6;
    private javax.swing.JLabel cell_x6y1;
    private javax.swing.JLabel cell_x6y2;
    private javax.swing.JLabel cell_x6y3;
    private javax.swing.JLabel cell_x6y4;
    private javax.swing.JLabel cell_x6y5;
    private javax.swing.JLabel cell_x6y6;
    private javax.swing.JLabel cell_x7y1;
    private javax.swing.JLabel cell_x7y2;
    private javax.swing.JLabel cell_x7y3;
    private javax.swing.JLabel cell_x7y4;
    private javax.swing.JLabel cell_x7y5;
    private javax.swing.JLabel cell_x7y6;
    private javax.swing.JButton insert_x1;
    private javax.swing.JButton insert_x2;
    private javax.swing.JButton insert_x3;
    private javax.swing.JButton insert_x4;
    private javax.swing.JButton insert_x5;
    private javax.swing.JButton insert_x6;
    private javax.swing.JButton insert_x7;
    // End of variables declaration//GEN-END:variables

    
}
