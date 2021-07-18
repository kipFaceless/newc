
package com.clinica.views;

import com.clinica.Controller.ControlAgendamento;
import com.clinica.connection.ConnectionBD;
import com.clinica.model.ModeloTabela;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class FormAgendaMedico extends javax.swing.JInternalFrame {
 String status;
    String dtHoje;

    ConnectionBD conecta = new ConnectionBD();
    ControlAgendamento agenda = new ControlAgendamento();
    
    String cod_ag;
    
    public FormAgendaMedico() {
        initComponents();
        
        preenchercombodentista();
        Calendar data = Calendar.getInstance();
        Date d = data.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateFormat.format(d);

        dtHoje = dateFormat.format(d);
        status = "Em Atendimento";
    }
    
    public void preenchercombodentista() {
        conecta.conexao();
        conecta.executaSql("SELECT *FROM medicos ");
        try {
            conecta.rs.first();
            jComboBoxMedicos.removeAllItems();
            do {
                jComboBoxMedicos.addItem(conecta.rs.getString("nome"));

            } while (conecta.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(FormAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        conecta.desconecta();

    }
     public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();

       String []colunas = new String []{"Cód", "Paciente",  "Médico","Status"  };  
        conecta.conexao();

        conecta.executaSql(sql);
        try {
            conecta.rs.first();
            do {
          dados.add( new Object[]{conecta.rs.getInt("a.id"), conecta.rs.getString("p.nome"), conecta.rs.getString("m.nome"), conecta.rs.getString("a.status")});
            } while (conecta.rs.next());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não Existem Mais Agendamentos Para Este Dentista");
        }

        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        jTableAtenderPaciente.setModel(modelo);
        jTableAtenderPaciente.getColumnModel().getColumn(0).setPreferredWidth(33);
        jTableAtenderPaciente.getColumnModel().getColumn(0).setResizable(false);
        jTableAtenderPaciente.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableAtenderPaciente.getColumnModel().getColumn(1).setResizable(false);
        jTableAtenderPaciente.getColumnModel().getColumn(2).setPreferredWidth(40);
        jTableAtenderPaciente.getColumnModel().getColumn(2).setResizable(false);
        jTableAtenderPaciente.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableAtenderPaciente.getColumnModel().getColumn(3).setResizable(false);
       

        jTableAtenderPaciente.getTableHeader().setReorderingAllowed(false);
        jTableAtenderPaciente.setAutoResizeMode(jTableAtenderPaciente.AUTO_RESIZE_OFF);
        jTableAtenderPaciente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conecta.desconecta();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxMedicos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAtenderPaciente = new javax.swing.JTable();
        jButtonAtenderPaciente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(101, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jComboBoxMedicos.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jComboBoxMedicos.setForeground(new java.awt.Color(32, 10, 93));
        jComboBoxMedicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMedicos.setBorder(null);
        jComboBoxMedicos.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 230, 127));
        jLabel2.setText("DENTISTA:");

        jTableAtenderPaciente.setForeground(new java.awt.Color(32, 10, 93));
        jTableAtenderPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAtenderPaciente.setSelectionBackground(new java.awt.Color(255, 230, 127));
        jTableAtenderPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAtenderPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAtenderPaciente);

        jButtonAtenderPaciente.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButtonAtenderPaciente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtenderPaciente.setText("ATENDER PACIENTE");
        jButtonAtenderPaciente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButtonAtenderPaciente.setContentAreaFilled(false);
        jButtonAtenderPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtenderPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtenderPacienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 230, 127));
        jLabel3.setText("PACIENTES AGENDADOS");

        jButtonBuscar.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAtenderPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                                        .addComponent(jComboBoxMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jComboBoxMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAtenderPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(32, 10, 93));

        jLabel7.setFont(new java.awt.Font("Tunga", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AGENDA / MÉDICOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel7)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAtenderPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAtenderPacienteMouseClicked
        cod_ag =""+jTableAtenderPaciente.getValueAt(jTableAtenderPaciente.getSelectedRow(), 0);
    }//GEN-LAST:event_jTableAtenderPacienteMouseClicked

    private void jButtonAtenderPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtenderPacienteActionPerformed
        FormConsulta tela = new FormConsulta(cod_ag);
        tela.setVisible(true);
        Home.jDesktopPane1.add(tela);
        dispose();
    }//GEN-LAST:event_jButtonAtenderPacienteActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

        int cod = agenda.buscaCodMed((String) jComboBoxMedicos.getSelectedItem());

        String codigo = String.valueOf(cod);
        preencherTabela("SELECT a.id, p.nome,m.nome, a.status FROM agendamentos a JOIN pacientes p ON a.paciente_id=p.id JOIN medicos m ON a.medico_id=m.id WHERE a.medico_id ='"+codigo+"' AND a.status='"+status+"' AND a.data ='"+dtHoje+"' ORDER BY a.hora;");
    }//GEN-LAST:event_jButtonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtenderPaciente;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JComboBox<String> jComboBoxMedicos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAtenderPaciente;
    // End of variables declaration//GEN-END:variables
}
