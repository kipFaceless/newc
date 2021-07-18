
package com.clinica.views;
import com.clinica.connection.ConnectionBD;
import java.sql.*;
import javax.swing.JOptionPane;



public class Login extends javax.swing.JFrame {
 ConnectionBD conecta = new ConnectionBD();
    Home tela = new Home();
    
    public Login() {
        initComponents();
        focus.requestFocus();
        conecta.conexao();
        if(conecta.con != null){
            jLabelStatus.setText(" Conectado");
            jButtonEntrar.setVisible(true);
        }else
            if(conecta.con == null){
            jLabelStatus.setText("Não Conectado");
            jButtonEntrar.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelStatus = new javax.swing.JLabel();
        jLabelPlaceholderUSU = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelSair = new javax.swing.JLabel();
        hover = new javax.swing.JTextField();
        jButtonEntrar = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();
        focus = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabelStatus.setForeground(new java.awt.Color(255, 204, 0));
        jLabelStatus.setText("jLabel1");
        getContentPane().add(jLabelStatus);
        jLabelStatus.setBounds(310, 260, 100, 14);

        jLabelPlaceholderUSU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPlaceholderUSU.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPlaceholderUSU.setText(" Usuário");
        jLabelPlaceholderUSU.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabelPlaceholderUSUFocusGained(evt);
            }
        });
        jLabelPlaceholderUSU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPlaceholderUSUMouseClicked(evt);
            }
        });
        jLabelPlaceholderUSU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabelPlaceholderUSUKeyReleased(evt);
            }
        });
        getContentPane().add(jLabelPlaceholderUSU);
        jLabelPlaceholderUSU.setBounds(430, 114, 60, 40);

        jTextFieldUsuario.setBackground(new java.awt.Color(242, 212, 132));
        jTextFieldUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(97, 13, 52));
        jTextFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldUsuario.setOpaque(false);
        jTextFieldUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextFieldUsuarioMouseMoved(evt);
            }
        });
        jTextFieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusGained(evt);
            }
        });
        jTextFieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldUsuarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextFieldUsuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldUsuarioMousePressed(evt);
            }
        });
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(240, 120, 250, 30);

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPassword.setText("Sua Senha");
        getContentPane().add(jLabelPassword);
        jLabelPassword.setBounds(420, 180, 80, 17);

        jPasswordFieldSenha.setBackground(new java.awt.Color(242, 212, 132));
        jPasswordFieldSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordFieldSenha.setForeground(new java.awt.Color(97, 13, 52));
        jPasswordFieldSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldSenha.setBorder(null);
        jPasswordFieldSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldSenhaFocusGained(evt);
            }
        });
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(250, 170, 240, 30);

        jLabelSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSairMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelSair);
        jLabelSair.setBounds(490, 10, 80, 30);

        hover.setEditable(false);
        hover.setBackground(new java.awt.Color(117, 18, 67));
        hover.setForeground(new java.awt.Color(255, 255, 255));
        hover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hover.setBorder(null);
        hover.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hover.setOpaque(false);
        getContentPane().add(hover);
        hover.setBounds(220, 290, 330, 30);

        jButtonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/gif.gif"))); // NOI18N
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(440, 220, 100, 20);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/Login2-1.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 580, 320);

        focus.setText("jTextField1");
        getContentPane().add(focus);
        focus.setBounds(30, 70, 59, 20);

        jButtonLogin.setBackground(new java.awt.Color(208, 195, 167));
        jButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(97, 13, 52));
        jButtonLogin.setText("Login");
        jButtonLogin.setBorder(null);
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin);
        jButtonLogin.setBounds(30, 100, 110, 40);

        setSize(new java.awt.Dimension(579, 319));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
        jTextFieldUsuario.transferFocus();
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
jPasswordFieldSenha.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jLabelPlaceholderUSUKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabelPlaceholderUSUKeyReleased
//jLabelPlaceholderUSU.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelPlaceholderUSUKeyReleased

    private void jTextFieldUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioMouseClicked
    // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioMouseClicked

    private void jLabelPlaceholderUSUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPlaceholderUSUMouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_jLabelPlaceholderUSUMouseClicked

    private void jTextFieldUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioMousePressed
          // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioMousePressed

    private void jLabelPlaceholderUSUFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabelPlaceholderUSUFocusGained
jLabelPlaceholderUSU.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_jLabelPlaceholderUSUFocusGained

    private void jTextFieldUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusGained
jLabelPlaceholderUSU.setVisible(false);           // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioFocusGained

    private void jTextFieldUsuarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioMouseMoved
hover.setText("Entre com o seu nome de Usuário");        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioMouseMoved

    private void jTextFieldUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioMouseExited
hover.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioMouseExited

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
  
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jLabelSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSairMouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSairMouseClicked

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
       
     try {
         conecta.executaSql("SELECT *FROM users WHERE name ='"+ jTextFieldUsuario.getText()+"'");
         conecta.rs.first();
         
         if(conecta.rs.getString("password").equals(jPasswordFieldSenha.getText())){
             
             String perfil = conecta.rs.getString("perfil");
            
             //JOptionPane.showMessageDialog(null, perfil);
             if(  "Recepcionista".equals(perfil)){
                 
                Home.jButtonMenuUsuarios.setEnabled(false);
                 Home.jButtonMenuCadUsuarios.setEnabled(false);
                 Home.jLabelUser.setText(conecta.rs.getString("name"));
                 Home.jLabelPerfil.setText(conecta.rs.getString("perfil"));
              
             } else {
             }
            
             tela.setVisible(true);
             dispose();
             
             
     }
             
              
         else{
             JOptionPane.showMessageDialog(null, "Senha Incorrecta!\n Tente outra vez");
         }
         
     } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Usuário não encontrado!\n Tente outra vez");
     }

 
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jPasswordFieldSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaFocusGained
       jLabelPassword.setVisible(false);   
    }//GEN-LAST:event_jPasswordFieldSenhaFocusGained

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
    private javax.swing.JTextField focus;
    private javax.swing.JTextField hover;
    public static javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPlaceholderUSU;
    private javax.swing.JLabel jLabelSair;
    private javax.swing.JLabel jLabelStatus;
    public static javax.swing.JPasswordField jPasswordFieldSenha;
    public static javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
