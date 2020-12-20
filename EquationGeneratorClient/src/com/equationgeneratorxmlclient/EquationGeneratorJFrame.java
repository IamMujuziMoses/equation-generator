package com.equationgeneratorxmlclient;

import javax.swing.JOptionPane;
import javax.xml.bind.JAXB;

/**
 * @author LordTusha Forbes
 */

public class EquationGeneratorJFrame extends javax.swing.JFrame {
    
    private String operation = "add";
    private int difficulty = 1;
    private int answer;
    
    public EquationGeneratorJFrame() {
    
        initComponents();
    }//end constructor
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        operationJL = new javax.swing.JLabel();
        levelJL = new javax.swing.JLabel();
        operationCB = new javax.swing.JComboBox<>();
        levelCB = new javax.swing.JComboBox<>();
        generateJB = new javax.swing.JButton();
        questionJL = new javax.swing.JLabel();
        answerJL = new javax.swing.JLabel();
        answerTF = new javax.swing.JTextField();
        checkJB = new javax.swing.JButton();
        equationJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equation Generator");
        setResizable(false);

        operationJL.setText("Choose Operation: ");

        levelJL.setText("Choose Level: ");

        operationCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Addition", "Subtraction", "Multiplication" }));
        operationCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                operationCBItemStateChanged(evt);
            }
        });

        levelCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "One-Digit Number", "Two-Digit Number", "Three-Digit Number" }));
        levelCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                levelCBItemStateChanged(evt);
            }
        });

        generateJB.setMnemonic('G');
        generateJB.setText("Generate Equation");
        generateJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateJBActionPerformed(evt);
            }
        });

        questionJL.setText("Question: ");

        answerJL.setText("Answer: ");

        answerTF.setEnabled(false);
        answerTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerTFActionPerformed(evt);
            }
        });

        checkJB.setMnemonic('C');
        checkJB.setText("Check Answer");
        checkJB.setEnabled(false);
        checkJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(generateJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(operationJL)
                            .addComponent(levelJL))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(operationCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(levelCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(checkJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionJL)
                            .addComponent(equationJL, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answerJL)
                            .addComponent(answerTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(operationJL)
                    .addComponent(operationCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelJL)
                    .addComponent(levelCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(generateJB)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionJL)
                    .addComponent(answerJL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equationJL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(checkJB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkJBActionPerformed

        if (answerTF.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter Your Answer");
            return;
        }//end if
        
        int userAnswer = Integer.parseInt(answerTF.getText());
        
        if (userAnswer == answer) {
            
            equationJL.setText("");
            answerTF.setText("");
            checkJB.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Correct! Good Job!", "Correct",
                    JOptionPane.INFORMATION_MESSAGE);
        }//end if
        else {
            JOptionPane.showMessageDialog(this, "Incorrect! Try Again!", "Incorrect",
                    JOptionPane.ERROR_MESSAGE);
            answerTF.setText("");
        }//end else
    }//GEN-LAST:event_checkJBActionPerformed

    private void generateJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateJBActionPerformed

        try {
            
            String url = String.format("http://localhost:8080/EquationGenerator/"
                                     + "webresources/equation/%s/%d", operation, difficulty);
            
            Equation equation = JAXB.unmarshal(url, Equation.class);
            answer = equation.getResults();
            answerTF.setEnabled(true);
            equationJL.setText(equation.getLeftHandSide() + " =");
            checkJB.setEnabled(true);
        } catch(Exception e) {
            
            e.printStackTrace();
        }//end try...catch
    }//GEN-LAST:event_generateJBActionPerformed

    private void operationCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_operationCBItemStateChanged

        String item = (String) operationCB.getSelectedItem();
        
        if (item.equals("Addition"))
            operation = "add";
        else if (item.equals("Subtraction"))
            operation = "subtract";
        else
            operation = "multiply";
    }//GEN-LAST:event_operationCBItemStateChanged

    private void levelCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_levelCBItemStateChanged

        difficulty = levelCB.getSelectedIndex() + 1;
    }//GEN-LAST:event_levelCBItemStateChanged

    private void answerTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTFActionPerformed

        if (answerTF.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter Your Answer");
            return;
        }//end if
        
        int userAnswer = Integer.parseInt(answerTF.getText());
        
        if (userAnswer == answer) {
            
            equationJL.setText("");
            answerTF.setText("");
            checkJB.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Correct! Good Job!", "Correct",
                    JOptionPane.INFORMATION_MESSAGE);
        }//end if
        else {
            JOptionPane.showMessageDialog(this, "Incorrect! Try Again!", "Incorrect",
                    JOptionPane.ERROR_MESSAGE);
            answerTF.setText("");
        }//end else
    }//GEN-LAST:event_answerTFActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(EquationGeneratorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquationGeneratorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquationGeneratorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquationGeneratorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EquationGeneratorJFrame().setVisible(true);
            }//end run
        }//end anonymous inner class Runnable
        );//end call to invokeLater
    }//end main

    // <editor-fold desc="Variables Declaration" defaultstate="collapsed">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerJL;
    private javax.swing.JTextField answerTF;
    private javax.swing.JButton checkJB;
    private javax.swing.JLabel equationJL;
    private javax.swing.JButton generateJB;
    private javax.swing.JComboBox<String> levelCB;
    private javax.swing.JLabel levelJL;
    private javax.swing.JComboBox<String> operationCB;
    private javax.swing.JLabel operationJL;
    private javax.swing.JLabel questionJL;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}//end EquationGeneratorJFrame
