package calculator;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Krishna Xavier
 */
public class Interface extends javax.swing.JFrame {

    private static String num = "";
    private static String firstTerm = "";

    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNumber4 = new javax.swing.JButton();
        btnNumber5 = new javax.swing.JButton();
        btnNumber6 = new javax.swing.JButton();
        txtFieldResult = new javax.swing.JTextField();
        number1 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number7 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        number0 = new javax.swing.JButton();
        point = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        subtraction = new javax.swing.JButton();
        addition = new javax.swing.JButton();
        multiplication = new javax.swing.JButton();
        division = new javax.swing.JButton();
        firstPartCal = new javax.swing.JLabel();

        btnNumber4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnNumber4.setText("1");

        btnNumber5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnNumber5.setText("1");

        btnNumber6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnNumber6.setText("1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 650));
        setMinimumSize(new java.awt.Dimension(700, 650));
        getContentPane().setLayout(null);

        txtFieldResult.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtFieldResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFieldResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldResultActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldResult);
        txtFieldResult.setBounds(43, 66, 608, 50);

        number1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number1.setText("1");
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        getContentPane().add(number1);
        number1.setBounds(43, 149, 85, 85);

        number2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number2.setText("2");
        number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        getContentPane().add(number2);
        number2.setBounds(148, 149, 85, 85);

        number3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number3.setText("3");
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ActionPerformed(evt);
            }
        });
        getContentPane().add(number3);
        number3.setBounds(250, 150, 85, 85);

        number4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number4.setText("4");
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ActionPerformed(evt);
            }
        });
        getContentPane().add(number4);
        number4.setBounds(43, 254, 85, 85);

        number5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number5.setText("5");
        number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ActionPerformed(evt);
            }
        });
        getContentPane().add(number5);
        number5.setBounds(148, 254, 85, 85);

        number6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number6.setText("6");
        number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ActionPerformed(evt);
            }
        });
        getContentPane().add(number6);
        number6.setBounds(250, 250, 85, 85);

        number7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number7.setText("7");
        number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ActionPerformed(evt);
            }
        });
        getContentPane().add(number7);
        number7.setBounds(43, 357, 85, 85);

        number8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number8.setText("8");
        number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ActionPerformed(evt);
            }
        });
        getContentPane().add(number8);
        number8.setBounds(148, 357, 85, 85);

        number9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number9.setText("9");
        number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ActionPerformed(evt);
            }
        });
        getContentPane().add(number9);
        number9.setBounds(250, 360, 85, 85);

        number0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        number0.setText("0");
        number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ActionPerformed(evt);
            }
        });
        getContentPane().add(number0);
        number0.setBounds(43, 460, 190, 85);

        point.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        point.setText(".");
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });
        getContentPane().add(point);
        point.setBounds(250, 460, 85, 85);

        equal.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        getContentPane().add(equal);
        equal.setBounds(461, 460, 191, 85);

        subtraction.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        subtraction.setText("-");
        subtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionActionPerformed(evt);
            }
        });
        getContentPane().add(subtraction);
        subtraction.setBounds(560, 210, 85, 85);

        addition.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        addition.setText("+");
        addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionActionPerformed(evt);
            }
        });
        getContentPane().add(addition);
        addition.setBounds(460, 210, 85, 85);

        multiplication.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        multiplication.setText("*");
        multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationActionPerformed(evt);
            }
        });
        getContentPane().add(multiplication);
        multiplication.setBounds(460, 310, 85, 85);

        division.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        getContentPane().add(division);
        division.setBounds(560, 310, 85, 85);

        firstPartCal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        firstPartCal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(firstPartCal);
        firstPartCal.setBounds(50, 10, 600, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String calculate(String calculation) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        Object result = engine.eval(calculation);                        
        return result.toString();
    }      
    
    private void txtFieldResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldResultActionPerformed

    }//GEN-LAST:event_txtFieldResultActionPerformed

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ActionPerformed
        num += "2";
        txtFieldResult.setText(num);
    }//GEN-LAST:event_number2ActionPerformed

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number5ActionPerformed
        num += "5";
        txtFieldResult.setText(num);
    }//GEN-LAST:event_number5ActionPerformed

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number6ActionPerformed
        num += "6";
        txtFieldResult.setText(num);
    }//GEN-LAST:event_number6ActionPerformed

    private void multiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationActionPerformed
        num += "*";
        firstPartCal.setText(firstTerm = num);
        txtFieldResult.setText(num = "");
    }//GEN-LAST:event_multiplicationActionPerformed

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
        num += "1";
        txtFieldResult.setText(num);
    }//GEN-LAST:event_number1ActionPerformed

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ActionPerformed
        num += "3";
        txtFieldResult.setText(num);
    }//GEN-LAST:event_number3ActionPerformed

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ActionPerformed
        num += "4";
        txtFieldResult.setText(num);
    }//GEN-LAST:event_number4ActionPerformed

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number7ActionPerformed
        num += "7";
        txtFieldResult.setText(num);
    }//GEN-LAST:event_number7ActionPerformed

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number8ActionPerformed
        num += "8";
        txtFieldResult.setText(num);
    }//GEN-LAST:event_number8ActionPerformed

    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number9ActionPerformed
        num += "9";
        txtFieldResult.setText(num);
    }//GEN-LAST:event_number9ActionPerformed

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number0ActionPerformed
        num += "0";
        txtFieldResult.setText(num);
    }//GEN-LAST:event_number0ActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        try {
            firstPartCal.setText(calculate(firstTerm+num));            
            txtFieldResult.setText(num = "");
        } catch (ScriptException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_equalActionPerformed

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed
        num += ".";
    }//GEN-LAST:event_pointActionPerformed

    private void additionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionActionPerformed
        num += "+";
        firstPartCal.setText(firstTerm = num);
        txtFieldResult.setText(num = "");
    }//GEN-LAST:event_additionActionPerformed

    private void subtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractionActionPerformed
        num += "-";
        firstPartCal.setText(firstTerm = num);
        txtFieldResult.setText(num = "");
    }//GEN-LAST:event_subtractionActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        num += "/";
        firstPartCal.setText(firstTerm = num);
        txtFieldResult.setText(num = "");
    }//GEN-LAST:event_divisionActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addition;
    private javax.swing.JButton btnNumber4;
    private javax.swing.JButton btnNumber5;
    private javax.swing.JButton btnNumber6;
    private javax.swing.JButton division;
    private javax.swing.JButton equal;
    private javax.swing.JLabel firstPartCal;
    private javax.swing.JButton multiplication;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JButton point;
    private javax.swing.JButton subtraction;
    private javax.swing.JTextField txtFieldResult;
    // End of variables declaration//GEN-END:variables
}
