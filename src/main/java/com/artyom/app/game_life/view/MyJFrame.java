/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artyom.app.game_life.view;

import com.artyom.app.game_life.cells.CellSet;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
/**
 *
 * @author 122
 */
public class MyJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MyJFrame
     */
    public MyJFrame() {
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

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = jPanel1 = new MyJPanel();
        ;
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        StartPauseMenuItem = new javax.swing.JMenuItem();
        ClearMenuItem = new javax.swing.JMenuItem();
        ExitMenuItem = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        AddMenu = new javax.swing.JMenu();
        AddCellMenuItem = new javax.swing.JMenuItem();
        AddGliderMenuItem = new javax.swing.JMenuItem();
        AddNineMenuItem = new javax.swing.JMenuItem();
        AddEightMenuItem = new javax.swing.JMenuItem();
        AddCornMenuItem = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuColorCell = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonSizeCell16 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonSizeCell8 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonSizeCell4 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonSizwCell2 = new javax.swing.JRadioButtonMenuItem();
        HelpMenu = new javax.swing.JMenu();
        AboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game of Life");
        setResizable(false);
        setSize(new java.awt.Dimension(400, 421));

        jPanel1.setBackground(Color.WHITE);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        FileMenu.setText("File");

        StartPauseMenuItem.setText("Start/Pause");
        StartPauseMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartPauseMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(StartPauseMenuItem);

        ClearMenuItem.setText("Clear");
        ClearMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(ClearMenuItem);

        ExitMenuItem.setText("Exit");
        ExitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(ExitMenuItem);

        jMenuBar1.add(FileMenu);

        EditMenu.setText("Edit");

        AddMenu.setText("Add...");

        AddCellMenuItem.setText("Cell");
        AddCellMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setCellMode(evt);
            }
        });
        AddMenu.add(AddCellMenuItem);

        AddGliderMenuItem.setText("Glider");
        AddGliderMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setCellMode(evt);
            }
        });
        AddMenu.add(AddGliderMenuItem);

        AddNineMenuItem.setText("Nine");
        AddNineMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setCellMode(evt);
            }
        });
        AddMenu.add(AddNineMenuItem);

        AddEightMenuItem.setText("Eight");
        AddEightMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setCellMode(evt);
            }
        });
        AddMenu.add(AddEightMenuItem);

        AddCornMenuItem.setText("Corn");
        AddCornMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setCellMode(evt);
            }
        });
        AddMenu.add(AddCornMenuItem);

        EditMenu.add(AddMenu);

        jMenuItem3.setText("Randomed");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        EditMenu.add(jMenuItem3);

        jMenuColorCell.setText("Cell's color");

        jRadioButtonMenuItem1.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Red");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenuColorCell.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem2.setForeground(new java.awt.Color(51, 51, 255));
        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Blue");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenuColorCell.add(jRadioButtonMenuItem2);

        jRadioButtonMenuItem3.setForeground(new java.awt.Color(51, 255, 51));
        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Green");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenuColorCell.add(jRadioButtonMenuItem3);

        EditMenu.add(jMenuColorCell);

        jMenu1.setText("Size of cell (in pixels)");

        jRadioButtonSizeCell16.setSelected(true);
        jRadioButtonSizeCell16.setText("16");
        jRadioButtonSizeCell16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSizeCell16ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonSizeCell16);

        jRadioButtonSizeCell8.setSelected(true);
        jRadioButtonSizeCell8.setText("8");
        jRadioButtonSizeCell8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSizeCell16ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonSizeCell8);

        jRadioButtonSizeCell4.setSelected(true);
        jRadioButtonSizeCell4.setText("4");
        jRadioButtonSizeCell4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSizeCell16ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonSizeCell4);

        jRadioButtonSizwCell2.setSelected(true);
        jRadioButtonSizwCell2.setText("2");
        jRadioButtonSizwCell2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSizeCell16ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonSizwCell2);

        EditMenu.add(jMenu1);

        jMenuBar1.add(EditMenu);

        HelpMenu.setText("Help");

        AboutMenuItem.setText("About program");
        AboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutMenuItemActionPerformed(evt);
            }
        });
        HelpMenu.add(AboutMenuItem);

        jMenuBar1.add(HelpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuItemActionPerformed
        // close the program
        System.exit(0);
    }//GEN-LAST:event_ExitMenuItemActionPerformed

    private void StartPauseMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartPauseMenuItemActionPerformed
        // Start/Pause the game:
        MyJPanel myJPanel = (MyJPanel)jPanel1;
        myJPanel.setPause(!myJPanel.isPaused());
    }//GEN-LAST:event_StartPauseMenuItemActionPerformed

    private void ClearMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearMenuItemActionPerformed
        // pause the game and clear the cell set:
        MyJPanel myJPanel = (MyJPanel)jPanel1;
        myJPanel.setPause(true);
        CellSet emptyCellSet = myJPanel.getCellSetFactory().newInstance();
        myJPanel.setCellSet(emptyCellSet);
        // now there is no cells and candidates
        myJPanel.getCellController().setCellSet(emptyCellSet);
    }//GEN-LAST:event_ClearMenuItemActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void setCellMode(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setCellMode
        // TODO add your handling code here:
        MyJPanel myJPanel = (MyJPanel)jPanel1;
        JMenuItem menuMode = (JMenuItem) evt.getSource();
        
        CellSet.Mode mode = CellSet.Mode.INVERT_CELL;
        
        switch(menuMode.getText()) {
            case "Cell" :
                mode = CellSet.Mode.INVERT_CELL;
                break;
            case "Glider" :
                mode = CellSet.Mode.ADD_GLIDER;
                break;
            case "Eight" :
                mode = CellSet.Mode.ADD_EIGHT;
                break;
            case "Nine" :
                mode = CellSet.Mode.ADD_NINE;
                break;
            case "Corn" :
                mode = CellSet.Mode.ADD_CORN;
        }
        
        myJPanel.setCellSet_mode(mode);
    }//GEN-LAST:event_setCellMode

    private void AboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutMenuItemActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This program was created by Ivanov Artyom.", "About program", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AboutMenuItemActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        MyJPanel myJPanel = (MyJPanel)jPanel1;
        myJPanel.setPause(true);
       
        myJPanel.configureCellSet();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        // TODO add your handling code here:
        MyJPanel myJPanel = (MyJPanel)jPanel1;
        Color cellColor = Color.red;
        
        JRadioButtonMenuItem colorMenuItem = (JRadioButtonMenuItem) evt.getSource();
        
        switch(colorMenuItem.getText()) {
            case "Red" :
                cellColor = Color.red;
                break;
            case "Blue" :
                cellColor = Color.blue;
                break;
            case "Green" :
                cellColor = Color.green;
        }
        
        myJPanel.setCellColor(cellColor);
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jRadioButtonSizeCell16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSizeCell16ActionPerformed
        // TODO add your handling code here:
        MyJPanel myJPanel = (MyJPanel)jPanel1;
        // pause the game
         myJPanel.setPause(true);
        JRadioButtonMenuItem sizeCell = (JRadioButtonMenuItem)evt.getSource();
        int size = 1;
        try {
           size = Integer.parseInt(sizeCell.getText());
        } catch(NumberFormatException nfe) {
            System.err.println(nfe);
        }
        myJPanel.setSizeCell(size);
        // set new settings for the new game
        myJPanel.configureCellSet();
    }//GEN-LAST:event_jRadioButtonSizeCell16ActionPerformed

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
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutMenuItem;
    private javax.swing.JMenuItem AddCellMenuItem;
    private javax.swing.JMenuItem AddCornMenuItem;
    private javax.swing.JMenuItem AddEightMenuItem;
    private javax.swing.JMenuItem AddGliderMenuItem;
    private javax.swing.JMenu AddMenu;
    private javax.swing.JMenuItem AddNineMenuItem;
    private javax.swing.JMenuItem ClearMenuItem;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JMenuItem StartPauseMenuItem;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuColorCell;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonSizeCell16;
    private javax.swing.JRadioButtonMenuItem jRadioButtonSizeCell4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonSizeCell8;
    private javax.swing.JRadioButtonMenuItem jRadioButtonSizwCell2;
    // End of variables declaration//GEN-END:variables
}
