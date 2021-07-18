
package com.clinica.views;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SplashScreen extends javax.swing.JFrame {

  
           
    public SplashScreen() {
        initComponents();
        
        
         //SPLASH
       new Thread(){
           
           public void run(){
           for(int i =0; i<101; i++){
               
               try {
                   sleep(85);
                   
                   jProgressBar1.setValue(i);
                   if(jProgressBar1.getValue()<=40){
                       
                       jLabelCarregandoBanco.setVisible(true);
                       jLabelCarregandoTabelas.setVisible(false);
                       jLabelCarregandoSistema.setVisible(false);
                       jLabelContactar.setVisible(false);
                       
                   }else if(jProgressBar1.getValue()<=70){
                       jLabelCarregandoBanco.setVisible(false);
                       jLabelCarregandoTabelas.setVisible(true);
                       jLabelCarregandoSistema.setVisible(false);
                       jLabelContactar.setVisible(false);
                   }else{
                      jLabelCarregandoBanco.setVisible(false);
                       jLabelCarregandoTabelas.setVisible(false);
                       jLabelCarregandoSistema.setVisible(true);
                       jLabelContactar.setVisible(true);
                       jLabelSoftDev.setVisible(false);
                   }
               } catch (InterruptedException ex) {
                   Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           Login tela = new Login();
                    tela.setVisible(true);
                    dispose();
       }
           
       }.start();
    }
    
public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagens/icon.png"));
       return retValue;
                 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSoftDev = new javax.swing.JLabel();
        jLabelVersion = new javax.swing.JLabel();
        jLabelCarregandoBanco = new javax.swing.JLabel();
        jLabelCarregandoTabelas = new javax.swing.JLabel();
        jLabelCarregandoSistema = new javax.swing.JLabel();
        jLabelContactar = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabelSoftDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/Software desenv-1.png"))); // NOI18N
        getContentPane().add(jLabelSoftDev);
        jLabelSoftDev.setBounds(10, 300, 340, 60);

        jLabelVersion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/chivas veraão.png"))); // NOI18N
        getContentPane().add(jLabelVersion);
        jLabelVersion.setBounds(520, 270, 80, 20);

        jLabelCarregandoBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/carregando banco de dados.png"))); // NOI18N
        getContentPane().add(jLabelCarregandoBanco);
        jLabelCarregandoBanco.setBounds(470, 340, 190, 18);

        jLabelCarregandoTabelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/carregando tabelas.png"))); // NOI18N
        getContentPane().add(jLabelCarregandoTabelas);
        jLabelCarregandoTabelas.setBounds(520, 340, 130, 20);

        jLabelCarregandoSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/carregar o sistema.png"))); // NOI18N
        jLabelCarregandoSistema.setText("jLabel1");
        getContentPane().add(jLabelCarregandoSistema);
        jLabelCarregandoSistema.setBounds(520, 340, 100, 18);

        jLabelContactar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/contactar.png"))); // NOI18N
        getContentPane().add(jLabelContactar);
        jLabelContactar.setBounds(10, 310, 240, 40);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/splash.gif"))); // NOI18N
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 678, 360);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(-10, 354, 660, 20);

        setSize(new java.awt.Dimension(641, 369));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelCarregandoBanco;
    private javax.swing.JLabel jLabelCarregandoSistema;
    private javax.swing.JLabel jLabelCarregandoTabelas;
    private javax.swing.JLabel jLabelContactar;
    private javax.swing.JLabel jLabelSoftDev;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
