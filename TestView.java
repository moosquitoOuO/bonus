/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testapplication;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author cyrus
 */
public class TestView extends javax.swing.JFrame {

    /**
     * Creates new form TestView
     */
    public TestView() {
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

        JConfirmed = new javax.swing.JButton();
        JNext = new javax.swing.JButton();
        JPrev = new javax.swing.JButton();
        Jquestion = new javax.swing.JLabel();
        JOption1 = new javax.swing.JRadioButton();
        JOption2 = new javax.swing.JRadioButton();
        JOption3 = new javax.swing.JRadioButton();
        JOption4 = new javax.swing.JRadioButton();
        JResult = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Jmenu = new javax.swing.JMenu();
        XMLMenu = new javax.swing.JMenuItem();
        JSONMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TestApplication");

        JConfirmed.setText("confirmed");

        JNext.setText("next");

        JPrev.setText("prev");

        Jquestion.setText("jLabel1");

        JOption1.setText("jRadioButton1");

        JOption2.setText("jRadioButton2");

        JOption3.setText("jRadioButton3");

        JOption4.setText("jRadioButton4");

        JResult.setText("jLabel1");

        Jmenu.setText("File");
        Jmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmenuActionPerformed(evt);
            }
        });

        XMLMenu.setText("XML");
        Jmenu.add(XMLMenu);

        JSONMenu.setText("JSON");
        JSONMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSONMenuActionPerformed(evt);
            }
        });
        Jmenu.add(JSONMenu);

        jMenuBar1.add(Jmenu);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JOption4)
                    .addComponent(JOption3)
                    .addComponent(JOption2)
                    .addComponent(JOption1)
                    .addComponent(Jquestion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JConfirmed))
                    .addComponent(JResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Jquestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JOption1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JOption2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JOption3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JOption4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JConfirmed)
                    .addComponent(JNext)
                    .addComponent(JPrev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JResult)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JSONMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSONMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JSONMenuActionPerformed

    private void JmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JmenuActionPerformed
    void XMLListener(ActionListener listForXMLButton){
        XMLMenu.addActionListener(listForXMLButton);
    }
    void JSONListener(ActionListener listForJSONButton){
        JSONMenu.addActionListener(listForJSONButton);
    }
    void addPrevListener(ActionListener listForPrevButton){
        JPrev.addActionListener(listForPrevButton);
    }
    void addNextListener(ActionListener listForNextButton){
        JNext.addActionListener(listForNextButton);
    }
    void addConfirmedListener(ActionListener listForConfirmedButton){
        JConfirmed.addActionListener(listForConfirmedButton);
    }
    
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
    
    void setQuestion(String question){
        Jquestion.setText(question);
    }
    void setOptions(ArrayList<String> option){
        JOption1.setText(option.get(0));
        JOption2.setText(option.get(1));
        JOption3.setText(option.get(2));
        JOption4.setText(option.get(3));
    }
    void setResult(String result){
        JResult.setText(result);
    }
    void disableNext(boolean noNext){
        JNext.setEnabled(!noNext);
    }
    void disablePrev(boolean noPrev){
        JPrev.setEnabled(!noPrev);
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JConfirmed;
    private javax.swing.JButton JNext;
    private javax.swing.JRadioButton JOption1;
    private javax.swing.JRadioButton JOption2;
    private javax.swing.JRadioButton JOption3;
    private javax.swing.JRadioButton JOption4;
    private javax.swing.JButton JPrev;
    private javax.swing.JLabel JResult;
    private javax.swing.JMenuItem JSONMenu;
    private javax.swing.JMenu Jmenu;
    private javax.swing.JLabel Jquestion;
    private javax.swing.JMenuItem XMLMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
    private ButtonGroup optionsGroup;
    void setOptions(String string, String string0, String string1, String string2) {
        JOption1.setText(string);
        JOption2.setText(string0);
        JOption3.setText(string1);
        JOption4.setText(string2);
    }
    private void setupRadioButtons() {
        ButtonGroup group = new ButtonGroup();
        group.add(JOption1);
        group.add(JOption2);
        group.add(JOption3);
        group.add(JOption4);
        JOption1.setActionCommand("Option 1");
        JOption2.setActionCommand("Option 2");
        JOption3.setActionCommand("Option 3");
        JOption4.setActionCommand("Option 4");
    }
    public String getSelectedOption() {
        if (JOption1.isSelected()) {
            return JOption1.getText();
        } else if (JOption2.isSelected()) {
            return JOption2.getText();
        } else if (JOption3.isSelected()) {
            return JOption3.getText();
        } else if (JOption4.isSelected()) {
            return JOption4.getText();
        }
        return null;
    }
    void clearSelections() {
       if (optionsGroup != null) {
            optionsGroup.clearSelection();
        }
    }


}