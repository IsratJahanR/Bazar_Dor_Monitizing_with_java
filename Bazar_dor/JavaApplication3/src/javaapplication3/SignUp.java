/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.Window;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    Connection connect;
    ResultSet result;
    PreparedStatement statement;

    public SignUp() {
        super("Login");
        initComponents();
        connect = javaconnect.ConnectDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        one = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        passcode = new javax.swing.JLabel();
        passwordretype = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        passwordmatch = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        signup = new javax.swing.JButton();
        age = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        right.setBackground(new java.awt.Color(255, 255, 255));
        right.setAlignmentX(0.0F);
        right.setAlignmentY(0.0F);
        right.setMinimumSize(new java.awt.Dimension(800, 500));
        right.setPreferredSize(new java.awt.Dimension(800, 500));
        right.setLayout(null);

        text.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        text.setForeground(new java.awt.Color(0, 153, 153));
        text.setText("Sign Up");
        right.add(text);
        text.setBounds(530, 50, 170, 50);

        one.setText("Name:");
        right.add(one);
        one.setBounds(440, 130, 47, 20);

        mail.setText("E-mail:");
        right.add(mail);
        mail.setBounds(440, 160, 51, 20);

        passcode.setText("Password:");
        right.add(passcode);
        passcode.setBounds(440, 200, 70, 20);

        passwordretype.setText("Retype Password:");
        right.add(passwordretype);
        passwordretype.setBounds(440, 230, 130, 20);

        jLabel1.setText("Age:");
        right.add(jLabel1);
        jLabel1.setBounds(440, 260, 34, 20);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        right.add(name);
        name.setBounds(580, 130, 170, 26);
        right.add(password);
        password.setBounds(580, 200, 170, 26);
        right.add(passwordmatch);
        passwordmatch.setBounds(580, 230, 170, 26);
        right.add(email);
        email.setBounds(580, 160, 170, 26);

        signup.setBackground(new java.awt.Color(0, 153, 153));
        signup.setText("SignUp");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        right.add(signup);
        signup.setBounds(660, 380, 90, 29);
        right.add(age);
        age.setBounds(580, 260, 170, 26);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        right.add(back);
        back.setBounds(440, 380, 79, 29);

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/rakib.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bazar-Dor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_BOTTOM));
        right.add(jLabel3);
        jLabel3.setBounds(40, 80, 309, 330);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));
        right.add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 500);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        right.add(jPanel3);
        jPanel3.setBounds(430, 30, 350, 400);

        getContentPane().add(right);
        right.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (!WindowStack.isEmpty()) {
            Window previousWindow = WindowStack.pop();
            previousWindow.setVisible(true);
            previousWindow.setLocationRelativeTo(null);
            this.dispose();
        }else{
            Login obj=new Login();
            obj.setVisible(true);
            obj.dispose();
        }
    }//GEN-LAST:event_backActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        // TODO add your handling code here:
        try {
            String pass1 = String.valueOf(password.getPassword()), pass2 = String.valueOf(passwordmatch.getPassword());
            if (pass1.equals(pass2)) {
                String string = "INSERT INTO account(name,email,password,age)values (?,?,?,?)";
                statement = connect.prepareStatement(string);
                statement.setString(1, name.getText());
                statement.setString(2, email.getText());
                statement.setString(3, String.valueOf(password.getPassword()));
                statement.setString(4, age.getText());
                statement.execute();
                JOptionPane.showMessageDialog(null, "new account created");
                statement.close();
            } else {
                JOptionPane.showMessageDialog(null, "password doesn't match.Try again" + pass1 + " " + pass2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_signupActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SignUp().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mail;
    private javax.swing.JTextField name;
    private javax.swing.JLabel one;
    private javax.swing.JLabel passcode;
    public javax.swing.JPasswordField password;
    public javax.swing.JPasswordField passwordmatch;
    private javax.swing.JLabel passwordretype;
    private javax.swing.JPanel right;
    private javax.swing.JButton signup;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
