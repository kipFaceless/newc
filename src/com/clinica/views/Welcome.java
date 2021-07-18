
package com.clinica.views;

import static com.clinica.views.Home.jDesktopPane1;

/**
 *
 * @author flow
 */
public class Welcome extends javax.swing.JInternalFrame {
  Welcome tela = new Welcome();
  
  FormAgendaHoje telaAgendHoje = new FormAgendaHoje();
  FormAgendaMedico telaAgMed = new FormAgendaMedico();
   FormPaciente telaPaciente = new FormPaciente();
    
    public Welcome() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonAgendaMedico = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonAgendaHoje = new javax.swing.JButton();
        jButtonCadPacientes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(90, 0, 45));
        jLabel2.setText("AGENDA/HOJE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(90, 0, 45));
        jLabel3.setText("AGENDA/MÉDICO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, -1, 20));

        jButtonAgendaMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/welcome/icons8_Contact_90px.png"))); // NOI18N
        jButtonAgendaMedico.setBorder(null);
        jButtonAgendaMedico.setBorderPainted(false);
        jButtonAgendaMedico.setContentAreaFilled(false);
        jButtonAgendaMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgendaMedico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAgendaMedico.setIconTextGap(-3);
        jButtonAgendaMedico.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/welcome/icons8_Contact_100px.png"))); // NOI18N
        jButtonAgendaMedico.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/welcome/icons8_Contact_80px.png"))); // NOI18N
        jButtonAgendaMedico.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonAgendaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgendaMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 120, 80));

        jLabel4.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(90, 0, 45));
        jLabel4.setText("PACIENTES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, -1, 20));

        jButtonAgendaHoje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/welcome/icons8_Calendar_90px.png"))); // NOI18N
        jButtonAgendaHoje.setBorder(null);
        jButtonAgendaHoje.setBorderPainted(false);
        jButtonAgendaHoje.setContentAreaFilled(false);
        jButtonAgendaHoje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgendaHoje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAgendaHoje.setIconTextGap(-3);
        jButtonAgendaHoje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/welcome/icons8_Calendar_100px.png"))); // NOI18N
        jButtonAgendaHoje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/welcome/icons8_Calendar_80px.png"))); // NOI18N
        jButtonAgendaHoje.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonAgendaHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaHojeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgendaHoje, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 90, 90));

        jButtonCadPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/welcome/icons8_Conference_90px.png"))); // NOI18N
        jButtonCadPacientes.setBorder(null);
        jButtonCadPacientes.setBorderPainted(false);
        jButtonCadPacientes.setContentAreaFilled(false);
        jButtonCadPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadPacientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCadPacientes.setIconTextGap(-3);
        jButtonCadPacientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/welcome/icons8_Conference_100px_1.png"))); // NOI18N
        jButtonCadPacientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/welcome/icons8_Conference_80px.png"))); // NOI18N
        jButtonCadPacientes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonCadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 110, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/desktop pane.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1090, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPacientesActionPerformed
       telaPaciente.setVisible(true);
        tela.toBack();
        jDesktopPane1.add(telaPaciente);
        telaPaciente.toFront();
    }//GEN-LAST:event_jButtonCadPacientesActionPerformed

    private void jButtonAgendaHojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaHojeActionPerformed
        telaAgendHoje.setVisible(true);
         tela.toBack();
        jDesktopPane1.add(telaAgendHoje);
        telaAgendHoje.toFront();
    }//GEN-LAST:event_jButtonAgendaHojeActionPerformed

    private void jButtonAgendaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaMedicoActionPerformed
        telaAgMed.setVisible(true);
        tela.toBack();
        jDesktopPane1.add(telaAgMed);
        telaAgMed.toFront();
    }//GEN-LAST:event_jButtonAgendaMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgendaHoje;
    private javax.swing.JButton jButtonAgendaMedico;
    private javax.swing.JButton jButtonCadPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
