
package com.clinica.views;

import com.clinica.Controller.ControlAgendamento;
import com.clinica.model.ModeloAgendamento;
import com.clinica.connection.ConnectionBD;
import com.clinica.model.ModeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;


public class FormAgendamento extends javax.swing.JInternalFrame {

    ConnectionBD conecta = new ConnectionBD();
    ModeloAgendamento agenda = new ModeloAgendamento();
    ControlAgendamento control = new ControlAgendamento();
    
    public FormAgendamento() {
        initComponents();
        conecta.conexao();
        preenchercomboMedico();
        preencherTabela("SELECT *FROM pacientes");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgendaPaciente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxTurno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxMedico = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonFinalizarAgendamento = new javax.swing.JButton();
        jButtonCancelarAgendamento = new javax.swing.JButton();
        jDateChooserData = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSintomas = new javax.swing.JTextArea();
        jButtonBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(1060, 590));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(32, 10, 93));

        jPanel1.setBackground(new java.awt.Color(101, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableAgendaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAgendaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAgendaPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAgendaPaciente);

        jLabel1.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 230, 127));
        jLabel1.setText("TURNO:");

        jComboBoxTurno.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jComboBoxTurno.setForeground(new java.awt.Color(32, 10, 93));
        jComboBoxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite" }));
        jComboBoxTurno.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 230, 127));
        jLabel2.setText("PACIENTE:");

        jTextFieldPaciente.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jTextFieldPaciente.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPaciente.setBorder(null);
        jTextFieldPaciente.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 230, 127));
        jLabel4.setText("DENTISTA:");

        jComboBoxMedico.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jComboBoxMedico.setForeground(new java.awt.Color(32, 10, 93));
        jComboBoxMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMedico.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 230, 127));
        jLabel5.setText("DATA:");

        jLabel6.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 230, 127));
        jLabel6.setText("SINTOMAS:");

        jButtonFinalizarAgendamento.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButtonFinalizarAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFinalizarAgendamento.setText("FINALIZAR AGENDAMENTO");
        jButtonFinalizarAgendamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButtonFinalizarAgendamento.setContentAreaFilled(false);
        jButtonFinalizarAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFinalizarAgendamento.setEnabled(false);
        jButtonFinalizarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarAgendamentoActionPerformed(evt);
            }
        });

        jButtonCancelarAgendamento.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButtonCancelarAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarAgendamento.setText("CANCELAR AGENDAMENTO");
        jButtonCancelarAgendamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButtonCancelarAgendamento.setContentAreaFilled(false);
        jButtonCancelarAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAgendamento.setEnabled(false);
        jButtonCancelarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAgendamentoActionPerformed(evt);
            }
        });

        jDateChooserData.setForeground(new java.awt.Color(32, 10, 93));
        jDateChooserData.setEnabled(false);
        jDateChooserData.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N

        jTextAreaSintomas.setColumns(20);
        jTextAreaSintomas.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jTextAreaSintomas.setForeground(new java.awt.Color(32, 10, 93));
        jTextAreaSintomas.setRows(5);
        jTextAreaSintomas.setEnabled(false);
        jTextAreaSintomas.setSelectionColor(new java.awt.Color(255, 230, 127));
        jTextAreaSintomas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaSintomasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTextAreaSintomas);

        jButtonBuscar.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator1)
                                            .addComponent(jTextFieldPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(70, 70, 70))
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(384, 384, 384)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                        .addComponent(jDateChooserData, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelarAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonFinalizarAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBuscar)
                        .addComponent(jTextFieldPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxMedico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarAgendamento)
                    .addComponent(jButtonFinalizarAgendamento))
                .addGap(95, 95, 95))
        );

        jPanel3.setBackground(new java.awt.Color(32, 10, 93));

        jLabel7.setFont(new java.awt.Font("Tunga", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AGENDAR PACIENTE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel7)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAgendaPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAgendaPacienteMouseClicked
        String paciente =""+ jTableAgendaPaciente.getValueAt(jTableAgendaPaciente.getSelectedRow(), 1);
        conecta.conexao();

        try {
            conecta.executaSql("SELECT *FROM pacientes WHERE nome='"+paciente+"'");
            conecta.rs.first();
            jTextFieldPaciente.setText(conecta.rs.getString("nome"));

        } catch (SQLException ex) {
            Logger.getLogger(FormAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        conecta.desconecta();
        jComboBoxTurno.setEnabled(true);
        jComboBoxMedico.setEnabled(true);
        jDateChooserData.setEnabled(true);
        jTextAreaSintomas.setEnabled(true);
        jButtonFinalizarAgendamento.setEnabled(true);
        jButtonCancelarAgendamento.setEnabled(true);
    }//GEN-LAST:event_jTableAgendaPacienteMouseClicked

    private void jButtonFinalizarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarAgendamentoActionPerformed

        /*if(jDateChooserData.getDate().getTime()inst){
            JOptionPane.showMessageDialog(null, "Preencha a Data Para Continuar!");
            jDateChooserData.requestFocus();}
        else

        if(jTextAreaMotivo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o Motivo Para Continuar!");
            jTextAreaMotivo.requestFocus();
        }
        else{*/
            agenda.setComboNomePaciente(jTextFieldPaciente.getText());
            agenda.setTurno((String) jComboBoxTurno.getSelectedItem());
            agenda.setSintomas(jTextAreaSintomas.getText());
            agenda.setComboNomeDentista((String) jComboBoxMedico.getSelectedItem());
            agenda.setData(jDateChooserData.getDate());
            agenda.setStatus("Aberto");
            control.salvaragenda(agenda);

            //dispose();
            jTextFieldPaciente.setText("");
            jTextAreaSintomas.setText("");
            jDateChooserData.setDateFormatString("null");

            jComboBoxTurno.setEnabled(!true);
            jComboBoxMedico.setEnabled(!true);
            jDateChooserData.setEnabled(!true);
            jTextAreaSintomas.setEnabled(!true);
            jButtonFinalizarAgendamento.setEnabled(!true);
            jButtonCancelarAgendamento.setEnabled(!true);
    }//GEN-LAST:event_jButtonFinalizarAgendamentoActionPerformed

    private void jButtonCancelarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAgendamentoActionPerformed
        jTextFieldPaciente.setText("");
        jTextAreaSintomas.setText("");
        jDateChooserData.setDateFormatString("null");

        jComboBoxTurno.setEnabled(!true);
        jComboBoxMedico.setEnabled(!true);
        jDateChooserData.setEnabled(!true);
        jTextAreaSintomas.setEnabled(!true);
        jButtonFinalizarAgendamento.setEnabled(!true);
        jButtonCancelarAgendamento.setEnabled(!true);
    }//GEN-LAST:event_jButtonCancelarAgendamentoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        preencherTabela("SELECT id, nome, data_nasc, morada, num_doc, tel FROM pacientes WHERE nome LIKE '%"+jTextFieldPaciente.getText()+"%'");
        
        
        jComboBoxTurno.setEnabled(true);
        jComboBoxMedico.setEnabled(true);
        jDateChooserData.setEnabled(true);
        jTextAreaSintomas.setEnabled(true);
        jButtonFinalizarAgendamento.setEnabled(true);
        jButtonCancelarAgendamento.setEnabled(true);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextAreaSintomasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaSintomasMouseClicked
       
    }//GEN-LAST:event_jTextAreaSintomasMouseClicked

     public void preenchercomboMedico(){
        conecta.conexao();
        conecta.executaSql("SELECT *FROM medicos");
        try {
            conecta.rs.first();
            jComboBoxMedico.removeAllItems();
            do{
                jComboBoxMedico.addItem(conecta.rs.getString("nome"));
                
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(FormAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        conecta.desconecta();
       
    }  
     public void preencherTabela (String sql){
        ArrayList dados = new ArrayList();
        
        String []colunas = new String []{"Cód", "Nome", "Data Nasc", "Morada", "Identificação","Telefone"  };  
        conecta.conexao();
        
        conecta.executaSql(sql);
        try {
            conecta.rs.first();
            do{
                dados.add( new Object[]{conecta.rs.getInt("id"), conecta.rs.getString("nome"), conecta.rs.getString("data_nasc"), conecta.rs.getString("morada"), conecta.rs.getString("num_doc"), conecta.rs.getString("tel")});
            }while(conecta.rs.next());
        } catch (Exception ex) {
            
        }
        
         ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTableAgendaPaciente.setModel(modelo);
        jTableAgendaPaciente.getColumnModel().getColumn(0).setPreferredWidth(33);
        jTableAgendaPaciente.getColumnModel().getColumn(0).setResizable(false);
         jTableAgendaPaciente.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableAgendaPaciente.getColumnModel().getColumn(1).setResizable(false);
         jTableAgendaPaciente.getColumnModel().getColumn(2).setPreferredWidth(40);
        jTableAgendaPaciente.getColumnModel().getColumn(2).setResizable(false);
         jTableAgendaPaciente.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableAgendaPaciente.getColumnModel().getColumn(3).setResizable(false);
          jTableAgendaPaciente.getColumnModel().getColumn(4).setPreferredWidth(80);
        jTableAgendaPaciente.getColumnModel().getColumn(4).setResizable(false);
         jTableAgendaPaciente.getColumnModel().getColumn(5).setPreferredWidth(87);
        jTableAgendaPaciente.getColumnModel().getColumn(5).setResizable(false);
        
        jTableAgendaPaciente.getTableHeader().setReorderingAllowed(false);
        jTableAgendaPaciente.setAutoResizeMode(jTableAgendaPaciente.AUTO_RESIZE_OFF);
        jTableAgendaPaciente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conecta.desconecta();
       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelarAgendamento;
    private javax.swing.JButton jButtonFinalizarAgendamento;
    private javax.swing.JComboBox<String> jComboBoxMedico;
    private javax.swing.JComboBox<String> jComboBoxTurno;
    private com.toedter.calendar.JDateChooser jDateChooserData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableAgendaPaciente;
    private javax.swing.JTextArea jTextAreaSintomas;
    private javax.swing.JTextField jTextFieldPaciente;
    // End of variables declaration//GEN-END:variables
}
