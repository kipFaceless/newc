
package com.clinica.views;

import com.clinica.Controller.ControlAgendamento;
import com.clinica.connection.ConnectionBD;
import com.clinica.model.ModeloAgendamento;
import com.clinica.model.ModeloTabela;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class FormAgendaHoje extends javax.swing.JInternalFrame {
    ConnectionBD conex =new ConnectionBD();
    ModeloAgendamento agenda = new ModeloAgendamento();
    ControlAgendamento dal = new ControlAgendamento();
    String dtHoje;
    String status;
    String cod_agenda;
    public FormAgendaHoje() {
        initComponents();
        
         Calendar data = Calendar.getInstance();
        Date d = data.getTime(); 
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateFormat.format(d);
        dtHoje = dateFormat.format(d);
       
        status="Aberto";
       preencherTabela("SELECT a.id, p.nome,m.nome, a.status FROM agendamentos a JOIN pacientes p ON a.paciente_id=p.id JOIN medicos m ON a.medico_id=m.id WHERE a.data ='"+dtHoje+"' AND a.status='"+status+"' ORDER BY a.hora;");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgendaHoje = new javax.swing.JTable();
        jButtonAtender = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 0, 51));
        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(1106, 693));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1060, 590));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(101, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTableAgendaHoje.setAutoCreateRowSorter(true);
        jTableAgendaHoje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTableAgendaHoje.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jTableAgendaHoje.setForeground(new java.awt.Color(32, 10, 93));
        jTableAgendaHoje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAgendaHoje.setGridColor(new java.awt.Color(255, 255, 255));
        jTableAgendaHoje.setSelectionBackground(new java.awt.Color(255, 204, 102));
        jTableAgendaHoje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAgendaHojeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAgendaHoje);

        jButtonAtender.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAtender.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButtonAtender.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtender.setText("ATENDER PACIENTE");
        jButtonAtender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButtonAtender.setContentAreaFilled(false);
        jButtonAtender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtender.setOpaque(false);
        jButtonAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAtender, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAtender, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(70, 120, 950, 410);

        jPanel3.setBackground(new java.awt.Color(32, 10, 93));

        jLabel1.setFont(new java.awt.Font("Tunga", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTAS  AGENDADAS PARA HOJE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(210, 30, 680, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, -7, 1060, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAgendaHojeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAgendaHojeMouseClicked
         cod_agenda =""+ jTableAgendaHoje.getValueAt(jTableAgendaHoje.getSelectedRow(), 0);
        conex.conexao();
        conex.executaSql("SELECT *FROM agendamentos WHERE id='"+cod_agenda+"'");

        try {
            conex.rs.first();
            agenda.setStatus("Em Atendimento");
            agenda.setAgendaCod(conex.rs.getInt("id"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "d"+ex);
        }

    }//GEN-LAST:event_jTableAgendaHojeMouseClicked

    private void jButtonAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtenderActionPerformed
        dal.alterarStatus(agenda);
        preencherTabela("SELECT a.id, p.nome, m.nome, a.status FROM agendamentos a JOIN pacientes p ON a.paciente_id=p.id JOIN medicos m ON a.medico_id=m.id WHERE a.data ='"+dtHoje+"' AND a.status='"+status+"' ORDER BY a.hora;");
    }//GEN-LAST:event_jButtonAtenderActionPerformed

public void preencherTabela (String sql){
        ArrayList dados = new ArrayList();
        
        String []colunas = new String []{"Cód", "Paciente",  "Médico","Status"  };  
        conex.conexao();
        
        conex.executaSql(sql);
        try {
            conex.rs.first();
            do{
                dados.add( new Object[]{conex.rs.getInt("a.id"), conex.rs.getString("p.nome"), conex.rs.getString("m.nome"), conex.rs.getString("a.status")});
            }while(conex.rs.next());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não Existem Mais Agendamentos Para Hoje!");
        }
        
         ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTableAgendaHoje.setModel(modelo);
        jTableAgendaHoje.getColumnModel().getColumn(0).setPreferredWidth(33);
        jTableAgendaHoje.getColumnModel().getColumn(0).setResizable(false);
         jTableAgendaHoje.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableAgendaHoje.getColumnModel().getColumn(1).setResizable(false);
         jTableAgendaHoje.getColumnModel().getColumn(2).setPreferredWidth(40);
        jTableAgendaHoje.getColumnModel().getColumn(2).setResizable(false);
         jTableAgendaHoje.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableAgendaHoje.getColumnModel().getColumn(3).setResizable(false);
       
       
        
        jTableAgendaHoje.getTableHeader().setReorderingAllowed(false);
        jTableAgendaHoje.setAutoResizeMode(jTableAgendaHoje.AUTO_RESIZE_OFF);
        jTableAgendaHoje.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conex.desconecta();
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAgendaHoje;
    // End of variables declaration//GEN-END:variables
}
