/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.LoginController;
import Model.DAO.Banco;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author mateus.ranzani
 */
public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    public Login() {
        initComponents();
        controller = new LoginController(this);
        Banco.inicia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextUser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        TextPassword = new javax.swing.JPasswordField();
        StringPassword = new javax.swing.JLabel();
        StringUser = new javax.swing.JLabel();
        StringLogin = new javax.swing.JLabel();
        jLabelPanel = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextUser.setBackground(new java.awt.Color(255, 255, 255));
        TextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUserActionPerformed(evt);
            }
        });
        getContentPane().add(TextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 260, 30));

        jButton1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 260, 40));

        TextPassword.setBackground(new java.awt.Color(255, 255, 255));
        TextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(TextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 260, 30));

        StringPassword.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        StringPassword.setForeground(new java.awt.Color(255, 255, 255));
        StringPassword.setText("Senha");
        getContentPane().add(StringPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, -1, -1));

        StringUser.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        StringUser.setForeground(new java.awt.Color(255, 255, 255));
        StringUser.setText("Usuário");
        getContentPane().add(StringUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        StringLogin.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        StringLogin.setForeground(new java.awt.Color(255, 255, 255));
        StringLogin.setText("Login");
        getContentPane().add(StringLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        jLabelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/painel-login.png"))); // NOI18N
        getContentPane().add(jLabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/Logo.jpg"))); // NOI18N
        jLabelBackground.setMaximumSize(new java.awt.Dimension(813, 1000));
        jLabelBackground.setMinimumSize(new java.awt.Dimension(813, 1000));
        jLabelBackground.setPreferredSize(new java.awt.Dimension(813, 1000));
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUserActionPerformed

    private void TextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        controller.entrarNoSistema();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StringLogin;
    private javax.swing.JLabel StringPassword;
    private javax.swing.JLabel StringUser;
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JTextField TextUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelPanel;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public JPasswordField getTextPassword() {
        return TextPassword;
    }

    public void setTextPassword(JPasswordField TextPassword) {
        this.TextPassword = TextPassword;
    }

    public JTextField getTextUser() {
        return TextUser;
    }

    public void setTextUser(JTextField TextUser) {
        this.TextUser = TextUser;
    }

}
