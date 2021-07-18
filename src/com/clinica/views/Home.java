
package com.clinica.views;

import com.clinica.connection.ConnectionBD;
import java.awt.Color;
import java.text.DateFormat;
import java.util.Date;            
import javax.swing.JPanel;

public class Home extends javax.swing.JFrame {
    
    ConnectionBD conex = new ConnectionBD();
    Welcome tela = new Welcome();
 
  FormCadUsuarios usuarios = new FormCadUsuarios();
  FormPaciente telaPaciente = new FormPaciente();
  FormMed telaMedico = new FormMed();
  FormAgendamento telaAgendamento = new FormAgendamento();
  FormAgendaHoje telaAgendHoje = new FormAgendaHoje();
  FormAgendaMedico telaAgMed = new FormAgendaMedico();
// FormConsulta telaConsulta = new FormConsulta(cod_ag);
    public Home() {
        initComponents();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        conex.conexao();
      
        tela.setVisible(true);
        jDesktopPane1.add(tela);
       
    }
  
  void setColor(JPanel panel){
      panel.setBackground(new Color(255,255,255));
  }
  
  
   void resetColor(JPanel panel){
      panel.setBackground(new Color(240,240,240));
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonMenuCadUsuarios = new javax.swing.JButton();
        jButtonMenuAgendaHoje = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonMenuAgendaMedico = new javax.swing.JButton();
        jButtonConsulta = new javax.swing.JButton();
        jButtonMenuCadPacientes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonMenuUsuarios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonMenuMedicos = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jPanelRelPacientes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelRelMedico = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelConfig = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanelWebsite = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanelAjuda = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelDataHoje = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelPerfil = new javax.swing.JLabel();
        jLabelTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 230, 127));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(null);

        jButtonMenuCadUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/homeMenu/icons8_Calendar_Plus_50px_1.png"))); // NOI18N
        jButtonMenuCadUsuarios.setContentAreaFilled(false);
        jButtonMenuCadUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuCadUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMenuCadUsuarios);
        jButtonMenuCadUsuarios.setBounds(330, 10, 90, 60);

        jButtonMenuAgendaHoje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/homeMenu/icons8_Today_50px_1.png"))); // NOI18N
        jButtonMenuAgendaHoje.setBorder(null);
        jButtonMenuAgendaHoje.setContentAreaFilled(false);
        jButtonMenuAgendaHoje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuAgendaHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuAgendaHojeActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMenuAgendaHoje);
        jButtonMenuAgendaHoje.setBounds(40, 10, 90, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(90, 0, 45));
        jLabel1.setText("USUÁRIOS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(910, 70, 60, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(90, 0, 45));
        jLabel5.setText("AGENDA/HOJE");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 70, 110, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(90, 0, 45));
        jLabel6.setText("AGENDAR PACIENTES");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 70, 120, 14);

        jButtonMenuAgendaMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/homeMenu/icons8_Timesheet_50px.png"))); // NOI18N
        jButtonMenuAgendaMedico.setContentAreaFilled(false);
        jButtonMenuAgendaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuAgendaMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMenuAgendaMedico);
        jButtonMenuAgendaMedico.setBounds(480, 10, 70, 60);

        jButtonConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/homeMenu/icons8_Combo_Chart_50px.png"))); // NOI18N
        jButtonConsulta.setContentAreaFilled(false);
        jButtonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonConsulta);
        jButtonConsulta.setBounds(610, 0, 90, 60);

        jButtonMenuCadPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/homeMenu/icons8_User_Groups_50px_1.png"))); // NOI18N
        jButtonMenuCadPacientes.setBorder(null);
        jButtonMenuCadPacientes.setBorderPainted(false);
        jButtonMenuCadPacientes.setContentAreaFilled(false);
        jButtonMenuCadPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuCadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuCadPacientesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMenuCadPacientes);
        jButtonMenuCadPacientes.setBounds(180, 10, 90, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(90, 0, 45));
        jLabel3.setText("PACIENTES");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 70, 70, 14);

        jButtonMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/homeMenu/icons8_Add_User_Group_Man_Man_50px_1.png"))); // NOI18N
        jButtonMenuUsuarios.setContentAreaFilled(false);
        jButtonMenuUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMenuUsuarios);
        jButtonMenuUsuarios.setBounds(890, 0, 70, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(90, 0, 45));
        jLabel2.setText("RELATÓRIO/PACIENTES");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(600, 70, 140, 14);

        jButtonMenuMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/homeMenu/icons8_Medical_Doctor_50px.png"))); // NOI18N
        jButtonMenuMedicos.setContentAreaFilled(false);
        jButtonMenuMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuMedicosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMenuMedicos);
        jButtonMenuMedicos.setBounds(760, 0, 70, 60);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(90, 0, 45));
        jLabel21.setText("MÉDICOS");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(770, 70, 60, 14);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(90, 0, 45));
        jLabel22.setText("AGENDA/MÉDICOS");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(470, 70, 110, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 30, 1020, 90);

        jDesktopPane1.setBackground(new java.awt.Color(255, 204, 102));
        jDesktopPane1.setOpaque(false);
        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(-30, 120, 1050, 570);

        jPanel2.setBackground(new java.awt.Color(255, 230, 118));
        jPanel2.setLayout(null);

        jPanelRelPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelRelPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRelPacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRelPacientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelRelPacientesMousePressed(evt);
            }
        });
        jPanelRelPacientes.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/home/icons8_Page_Setup_30px.png"))); // NOI18N
        jPanelRelPacientes.add(jLabel7);
        jLabel7.setBounds(10, 10, 50, 30);

        jLabel8.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 10, 95));
        jLabel8.setText("RELATÓRIO DE PACIENTES");
        jPanelRelPacientes.add(jLabel8);
        jLabel8.setBounds(50, 10, 170, 30);

        jPanel2.add(jPanelRelPacientes);
        jPanelRelPacientes.setBounds(0, 0, 230, 50);

        jPanelRelMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelRelMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRelMedicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRelMedicoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelRelMedicoMousePressed(evt);
            }
        });
        jPanelRelMedico.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/home/icons8_Edit_Pie_Chart_Report_30px.png"))); // NOI18N
        jPanelRelMedico.add(jLabel9);
        jLabel9.setBounds(10, 10, 50, 30);

        jLabel4.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 10, 95));
        jLabel4.setText("RELATÓRIO/ MÉDICOS");
        jPanelRelMedico.add(jLabel4);
        jLabel4.setBounds(50, 10, 150, 30);

        jPanel2.add(jPanelRelMedico);
        jPanelRelMedico.setBounds(0, 60, 230, 50);

        jPanelConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelConfigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelConfigMouseExited(evt);
            }
        });
        jPanelConfig.setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/home/icons8_Administrative_Tools_30px.png"))); // NOI18N
        jPanelConfig.add(jLabel15);
        jLabel15.setBounds(10, 10, 50, 30);

        jLabel16.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(32, 10, 95));
        jLabel16.setText("CONFIGURAÇÕES");
        jPanelConfig.add(jLabel16);
        jLabel16.setBounds(50, 10, 150, 30);

        jPanel2.add(jPanelConfig);
        jPanelConfig.setBounds(0, 120, 230, 50);

        jPanelWebsite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelWebsite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelWebsiteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelWebsiteMouseExited(evt);
            }
        });
        jPanelWebsite.setLayout(null);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/home/icons8_Internet_Connection_30px.png"))); // NOI18N
        jPanelWebsite.add(jLabel17);
        jLabel17.setBounds(10, 10, 50, 30);

        jLabel18.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(32, 10, 95));
        jLabel18.setText("VISITE O NOSSO WEBSITE");
        jPanelWebsite.add(jLabel18);
        jLabel18.setBounds(50, 10, 150, 30);

        jPanel2.add(jPanelWebsite);
        jPanelWebsite.setBounds(0, 180, 230, 50);

        jPanelAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelAjudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAjudaMouseExited(evt);
            }
        });
        jPanelAjuda.setLayout(null);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/home/icons8_Questions_30px.png"))); // NOI18N
        jPanelAjuda.add(jLabel19);
        jLabel19.setBounds(10, 10, 50, 30);

        jLabel20.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(32, 10, 95));
        jLabel20.setText("AJUDA");
        jPanelAjuda.add(jLabel20);
        jLabel20.setBounds(50, 10, 150, 30);

        jPanel2.add(jPanelAjuda);
        jPanelAjuda.setBounds(0, 240, 230, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(1080, 210, 230, 390);

        jLabel10.setBackground(new java.awt.Color(100, 0, 50));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1080, 180, 230, 30);

        jLabel11.setBackground(new java.awt.Color(100, 0, 50));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(1080, 600, 230, 30);

        jLabelUser.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.setText("Usuário");
        getContentPane().add(jLabelUser);
        jLabelUser.setBounds(1210, 640, 130, 25);

        jLabelDataHoje.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabelDataHoje.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataHoje.setText("Data de Hoje");
        getContentPane().add(jLabelDataHoje);
        jLabelDataHoje.setBounds(1210, 690, 90, 14);

        jLabel12.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("@Usuário:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(1080, 640, 60, 20);

        jLabel13.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Data Actualizada:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(1080, 690, 110, 25);

        jLabel14.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Perfil:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1080, 670, 60, 25);

        jLabelPerfil.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabelPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPerfil.setText("jLabel15");
        getContentPane().add(jLabelPerfil);
        jLabelPerfil.setBounds(1210, 660, 90, 20);

        jLabelTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/Tela.jpg"))); // NOI18N
        getContentPane().add(jLabelTela);
        jLabelTela.setBounds(-30, 0, 1500, 750);

        setSize(new java.awt.Dimension(1501, 725));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuCadUsuariosActionPerformed
        // TODO add your handling code here:
         telaAgendamento.setVisible(true);
         tela.toBack();
        jDesktopPane1.add(telaAgendamento);
        telaAgendamento.toFront();
       
       
        
    }//GEN-LAST:event_jButtonMenuCadUsuariosActionPerformed

    private void jButtonMenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuUsuariosActionPerformed

        
         usuarios.setVisible(true);
        tela.toBack();
        jDesktopPane1.add(usuarios);
        usuarios.toFront();
        
        
         
    }//GEN-LAST:event_jButtonMenuUsuariosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        jLabelDataHoje.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void jButtonMenuCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuCadPacientesActionPerformed
      
        
        telaPaciente.setVisible(true);
        tela.toBack();
        jDesktopPane1.add(telaPaciente);
        telaPaciente.toFront();
    }//GEN-LAST:event_jButtonMenuCadPacientesActionPerformed

    private void jButtonMenuMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuMedicosActionPerformed
        telaMedico.setVisible(true);
         tela.setVisible(false);
        jDesktopPane1.add(telaMedico);
        telaMedico.toFront();        
        
       
    }//GEN-LAST:event_jButtonMenuMedicosActionPerformed

    private void jButtonMenuAgendaHojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuAgendaHojeActionPerformed
        telaAgendHoje.setVisible(true);
         tela.toBack();
        jDesktopPane1.add(telaAgendHoje);
        telaAgendHoje.toFront();
    }//GEN-LAST:event_jButtonMenuAgendaHojeActionPerformed

    private void jButtonMenuAgendaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuAgendaMedicoActionPerformed
        telaAgMed.setVisible(true);
        tela.toBack();
        jDesktopPane1.add(telaAgMed);
        telaAgMed.toFront();
    }//GEN-LAST:event_jButtonMenuAgendaMedicoActionPerformed

    private void jButtonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaActionPerformed
        /*telaConsulta.setVisible(true);
        tela.setVisible(false);
        jDesktopPane1.add(telaConsulta);
        */
    }//GEN-LAST:event_jButtonConsultaActionPerformed

    private void jPanelRelPacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRelPacientesMouseEntered
    setColor(jPanelRelPacientes);
        resetColor(jPanelRelMedico);
        resetColor(jPanelConfig);
        resetColor(jPanelWebsite);
        resetColor(jPanelAjuda);        
    }//GEN-LAST:event_jPanelRelPacientesMouseEntered

    private void jPanelRelPacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRelPacientesMouseExited
        resetColor(jPanelRelPacientes);
      
    }//GEN-LAST:event_jPanelRelPacientesMouseExited

    private void jPanelRelPacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRelPacientesMousePressed
        
    }//GEN-LAST:event_jPanelRelPacientesMousePressed

    private void jPanelRelMedicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRelMedicoMouseEntered
       resetColor(jPanelRelPacientes);
        setColor(jPanelRelMedico);
        resetColor(jPanelConfig);
        resetColor(jPanelWebsite);
        resetColor(jPanelAjuda);
    }//GEN-LAST:event_jPanelRelMedicoMouseEntered

    private void jPanelRelMedicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRelMedicoMousePressed
       
    }//GEN-LAST:event_jPanelRelMedicoMousePressed

    private void jPanelRelMedicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRelMedicoMouseExited
       
        resetColor(jPanelRelMedico);
       
    }//GEN-LAST:event_jPanelRelMedicoMouseExited

    private void jPanelConfigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConfigMouseEntered
        resetColor(jPanelRelPacientes);
        resetColor(jPanelRelMedico);
        setColor(jPanelConfig);
        resetColor(jPanelWebsite);
        resetColor(jPanelAjuda);
    }//GEN-LAST:event_jPanelConfigMouseEntered

    private void jPanelConfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConfigMouseExited
      
        resetColor(jPanelConfig);
        
    }//GEN-LAST:event_jPanelConfigMouseExited

    private void jPanelWebsiteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelWebsiteMouseEntered
       resetColor(jPanelRelPacientes);
        resetColor(jPanelRelMedico);
        resetColor(jPanelConfig);
        setColor(jPanelWebsite);
        resetColor(jPanelAjuda);
    }//GEN-LAST:event_jPanelWebsiteMouseEntered

    private void jPanelWebsiteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelWebsiteMouseExited
      
        resetColor(jPanelWebsite);
       
    }//GEN-LAST:event_jPanelWebsiteMouseExited

    private void jPanelAjudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAjudaMouseEntered
        resetColor(jPanelRelPacientes);
        resetColor(jPanelRelMedico);
        resetColor(jPanelConfig);
        resetColor(jPanelWebsite);
        setColor(jPanelAjuda);
    }//GEN-LAST:event_jPanelAjudaMouseEntered

    private void jPanelAjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAjudaMouseExited
       
        resetColor(jPanelAjuda);
    }//GEN-LAST:event_jPanelAjudaMouseExited

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButtonConsulta;
    public static javax.swing.JButton jButtonMenuAgendaHoje;
    public static javax.swing.JButton jButtonMenuAgendaMedico;
    public static javax.swing.JButton jButtonMenuCadPacientes;
    public static javax.swing.JButton jButtonMenuCadUsuarios;
    public static javax.swing.JButton jButtonMenuMedicos;
    public static javax.swing.JButton jButtonMenuUsuarios;
    public static javax.swing.JDesktopPane jDesktopPane1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabelDataHoje;
    public static javax.swing.JLabel jLabelPerfil;
    public static javax.swing.JLabel jLabelTela;
    public static javax.swing.JLabel jLabelUser;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanelAjuda;
    public static javax.swing.JPanel jPanelConfig;
    public static javax.swing.JPanel jPanelRelMedico;
    public static javax.swing.JPanel jPanelRelPacientes;
    public static javax.swing.JPanel jPanelWebsite;
    // End of variables declaration//GEN-END:variables
}
