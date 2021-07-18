
package com.clinica.views;

import com.clinica.model.ModeloTabela;
import com.clinica.Controller.ControlPaciente;
import com.clinica.connection.ConnectionBD;
import com.clinica.model.ModeloPaciente;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class FormPaciente extends javax.swing.JInternalFrame {
    ModeloPaciente pac = new ModeloPaciente();
    ControlPaciente dal = new ControlPaciente();
    ConnectionBD conecta = new ConnectionBD();
    int flag=0;
    public FormPaciente() {
        initComponents();
        conecta.conexao();
        //jTextFieldCodigo.setVisible(false);
        preencherTabela("SELECT *FROM pacientes");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldDocNum = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jComboBoxTipoDoc = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jComboBoxProvincia = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxMunici = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextFieldMorada = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePaciente = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jButtonFiltrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 182, 200, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/imagesyy.jpg"))); // NOI18N
        jLabel1.setText("PACIENTE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(682, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, 930, -1));

        jTextFieldPesquisar.setBorder(null);
        jTextFieldPesquisar.setOpaque(false);
        getContentPane().add(jTextFieldPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 200, 30));

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextFieldNome.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNome.setBorder(null);
        jTextFieldNome.setEnabled(false);
        jTextFieldNome.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 10, 93));
        jLabel3.setText("Nome Completo:");

        jLabel4.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 10, 93));
        jLabel4.setText("Data/Nasc");

        jLabel5.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 10, 93));
        jLabel5.setText("Tipo de Documento:");

        jTextFieldCodigo.setForeground(new java.awt.Color(0, 0, 153));

        jDateChooser1.setEnabled(false);
        jDateChooser1.setOpaque(false);

        jComboBoxSexo.setBackground(new java.awt.Color(255, 204, 102));
        jComboBoxSexo.setForeground(new java.awt.Color(32, 10, 93));
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jComboBoxSexo.setEnabled(false);
        jComboBoxSexo.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(32, 10, 93));
        jLabel16.setText("Sexo:");

        jTextFieldDocNum.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldDocNum.setBorder(null);
        jTextFieldDocNum.setEnabled(false);
        jTextFieldDocNum.setOpaque(false);

        jLabel21.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(32, 10, 93));
        jLabel21.setText("Doc. Nº:");

        jComboBoxTipoDoc.setBackground(new java.awt.Color(255, 204, 102));
        jComboBoxTipoDoc.setForeground(new java.awt.Color(32, 10, 93));
        jComboBoxTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bilhete", "Cédula", "Passaporte", "Outro" }));
        jComboBoxTipoDoc.setEnabled(false);
        jComboBoxTipoDoc.setOpaque(false);
        jComboBoxTipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jComboBoxTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(5, 5, 5))
                                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextFieldDocNum)
                            .addComponent(jSeparator3))))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDocNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane2.setBackground(new java.awt.Color(255, 204, 102));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane2.setForeground(new java.awt.Color(102, 0, 51));
        jTabbedPane2.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel8.setBackground(new java.awt.Color(102, 0, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jComboBoxProvincia.setBackground(new java.awt.Color(102, 0, 51));
        jComboBoxProvincia.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N
        jComboBoxProvincia.setForeground(new java.awt.Color(0, 0, 153));
        jComboBoxProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxProvincia.setEnabled(false);
        jComboBoxProvincia.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Província");

        jLabel8.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Morada");

        jLabel12.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Natural de");

        jComboBoxMunici.setBackground(new java.awt.Color(255, 204, 51));
        jComboBoxMunici.setEditable(true);
        jComboBoxMunici.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N
        jComboBoxMunici.setForeground(new java.awt.Color(0, 0, 153));
        jComboBoxMunici.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMunici.setBorder(null);
        jComboBoxMunici.setEnabled(false);
        jComboBoxMunici.setOpaque(false);

        jButton11.setText("+");
        jButton11.setEnabled(false);

        jButton12.setText("+");
        jButton12.setEnabled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTextFieldMorada.setForeground(new java.awt.Color(0, 0, 153));
        jTextFieldMorada.setBorder(null);
        jTextFieldMorada.setEnabled(false);
        jTextFieldMorada.setOpaque(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMorada)
                            .addComponent(jSeparator5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jComboBoxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jComboBoxMunici, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12))
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jComboBoxMunici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTextFieldMorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Endereço", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 204, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel7.setBackground(new java.awt.Color(102, 0, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextFieldEmail.setForeground(new java.awt.Color(0, 0, 153));
        jTextFieldEmail.setBorder(null);
        jTextFieldEmail.setEnabled(false);
        jTextFieldEmail.setOpaque(false);
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E-mail:");

        jLabel7.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefone:");

        jFormattedTextFieldTelefone.setBorder(null);
        jFormattedTextFieldTelefone.setForeground(new java.awt.Color(0, 0, 153));
        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" (+244 )###  ###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.setEnabled(false);
        jFormattedTextFieldTelefone.setOpaque(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jSeparator6)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldTelefone))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Contactos", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 190, 430, 350));

        jPanel3.setBackground(new java.awt.Color(102, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setBorder(null);

        jTablePaciente.setAutoCreateRowSorter(true);
        jTablePaciente.setBackground(new java.awt.Color(255, 204, 102));
        jTablePaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTablePaciente.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jTablePaciente.setForeground(new java.awt.Color(0, 0, 153));
        jTablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePaciente.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePaciente.setSelectionBackground(new java.awt.Color(0, 0, 153));
        jTablePaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePaciente);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, 350));

        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("|<");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton7.setContentAreaFilled(false);
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 70, 30));

        jButtonNovo.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setText("NOVO");
        jButtonNovo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButtonNovo.setContentAreaFilled(false);
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 30));

        jButtonSalvar.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButtonSalvar.setContentAreaFilled(false);
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 70, 30));

        jButtonEditar.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("EDITAR");
        jButtonEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButtonEditar.setContentAreaFilled(false);
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 80, 30));

        jButtonExcluir.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButtonExcluir.setContentAreaFilled(false);
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 80, 30));

        jButtonCancelar.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 90, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 300, -1, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 200, -1));

        jLabel10.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pesquisar:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 80, -1));

        jButtonFiltrar.setFont(new java.awt.Font("Tunga", 1, 16)); // NOI18N
        jButtonFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFiltrar.setText("FILTRAR");
        jButtonFiltrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButtonFiltrar.setContentAreaFilled(false);
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 80, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clinica/images/fundoTela [1600x1200].png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

      
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTablePacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacienteMouseClicked
        String nome_paciente= ""+jTablePaciente.getValueAt(jTablePaciente.getSelectedRow(), 0);
        conecta.conexao();
        conecta.executaSql("SELECT *FROM pacientes WHERE nome='"+nome_paciente+"'");
        try {
            conecta.rs.first();
            jTextFieldCodigo.setText(String.valueOf(conecta.rs.getInt("id")));
            jTextFieldNome.setText(conecta.rs.getString("nome"));
            //jFormattedTextFieldData.setText(conecta.rs.getString("data_paciente"));
            
            jTextFieldMorada.setText(conecta.rs.getString("morada"));
           jTextFieldDocNum.setText(conecta.rs.getString("num_doc"));
           jComboBoxTipoDoc.setSelectedItem(conecta.rs.getString("tipo_doc"));
           
            jFormattedTextFieldTelefone.setText(conecta.rs.getString("tel"));
            jTextFieldEmail.setText(conecta.rs.getString("email"));
            
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao seleccionar registro");
        }

        conecta.desconecta();
    }//GEN-LAST:event_jTablePacienteMouseClicked

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
    flag=1;
     jButtonSalvar.setEnabled(true);
    jButtonCancelar.setEnabled(true);
    jTextFieldNome.setEnabled(true);
    jDateChooser1.setEnabled(true);
    jTextFieldDocNum.setEnabled(true);
    jComboBoxTipoDoc.setEnabled(true);
    jTextFieldMorada.setEnabled(true);
    jFormattedTextFieldTelefone.setEnabled(true);
    jTextFieldEmail.setEnabled(true);
    
     jTextFieldNome.setText("");
    
    jTextFieldDocNum.setText("");
    
 
    jTextFieldEmail.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o NOME para continuar");
            jTextFieldNome.requestFocus();
        }else
        if(jTextFieldDocNum.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o número de IDENTIFICAÇÃO para continuar");
            jTextFieldDocNum.requestFocus();
        }else if(flag==1){
            pac.setNome(jTextFieldNome.getText());
        //pac.setPaciNasc(jFormattedTextFieldData.getText());
       
        //pac.setDataNasc(jDateChooser1.getDateFormatString());
        pac.setTipoDoc((String) jComboBoxTipoDoc.getSelectedItem());
        pac.setNumDoc(jTextFieldDocNum.getText());
        pac.setMorada(jTextFieldMorada.getText());
        pac.setTel(jFormattedTextFieldTelefone.getText());
        pac.setEmail(jTextFieldEmail.getText());
        dal.salvar(pac);
        
         preencherTabela("SELECT *FROM pacientes");
         
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jTextFieldCodigo.setText("");
            jTextFieldNome.setText("");
            jTextFieldMorada.setText("");
            jTextFieldDocNum.setText("");
            jTextFieldEmail.setText("");
           
        }else {
         pac.setId(Integer.parseInt(jTextFieldCodigo.getText()));   
        pac.setNome(jTextFieldNome.getText());
        //pac.setPaciNasc(jFormattedTextFieldData.getText());
      
        //pac.setDataNasc(jDateChooser1.getDateFormatString());
        pac.setTipoDoc((String) jComboBoxTipoDoc.getSelectedItem());
        pac.setNumDoc( jTextFieldDocNum.getText());
        pac.setMorada(jTextFieldMorada.getText());
        pac.setTel(jFormattedTextFieldTelefone.getText());
        pac.setEmail(jTextFieldEmail.getText());
        dal.editar(pac);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldMorada.setText("");
        jTextFieldDocNum.setText("");
        jTextFieldEmail.setText("");
        
        jButtonFiltrar.setEnabled(true);
        jTextFieldPesquisar.setEnabled(true);
        
            
   preencherTabela("SELECT *FROM pacientes");
          }
       
        

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
       
         flag=2;
                    
        jTextFieldNome.setEnabled(true);
        jTextFieldNome.requestFocus();
        jTextFieldMorada.setEnabled(true);
        jComboBoxTipoDoc.setEnabled(true);
        jFormattedTextFieldTelefone.setEnabled(true);
        jTextFieldDocNum.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jDateChooser1.setEnabled(true);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente Excluir?");
        if (resposta==JOptionPane.YES_OPTION){
            pac.setId(Integer.parseInt(jTextFieldCodigo.getText()));
            dal.excluir(pac);
            jTextFieldCodigo.setText("");
            jTextFieldNome.setText("");
            jTextFieldMorada.setText("");
            jTextFieldDocNum.setText("");
            jTextFieldEmail.setText("");
           
            jButtonExcluir.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            
            
              preencherTabela("SELECT *FROM pacientes ORDER BY nome");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
         jTextFieldMorada.setEnabled(!true);
        jComboBoxTipoDoc.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
          jTextFieldNome.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        
         jButtonFiltrar.setEnabled(true);
        jTextFieldPesquisar.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
       
        
         pac.setFiltrar(jTextFieldPesquisar.getText());
        ModeloPaciente model = dal.buscaPaciente(pac);
        jTextFieldCodigo.setText(String.valueOf(model.getId()));
        jTextFieldNome.setText(model.getNome());
        jComboBoxTipoDoc.setSelectedItem(model.getTipoDoc());
        jTextFieldDocNum.setText(model.getNumDoc());
        jFormattedTextFieldTelefone.setText(model.getTel());
        jTextFieldEmail.setText(model.getEmail());
        //jDateChooser1.setDate(model.getDataNasc());
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(false);

        preencherTabela("SELECT *FROM pacientes WHERE nome LIKE '%"+pac.getFiltrar()+"%' ");
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jComboBoxTipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoDocActionPerformed
public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"Nome", "Sexo", "Morada", "Telefone"};
        
        conecta.conexao();
        conecta.executaSql(Sql);
        try {
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getString("nome"), conecta.rs.getString("sexo"),conecta.rs.getString("morada"), conecta.rs.getString("tel")});
                
            }while(conecta.rs.next());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Procure por Outro Paciente");
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTablePaciente.setModel(modelo);
        jTablePaciente.getColumnModel().getColumn(0).setPreferredWidth(290);
        jTablePaciente.getColumnModel().getColumn(0).setResizable(false);
         jTablePaciente.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTablePaciente.getColumnModel().getColumn(1).setResizable(false);
         jTablePaciente.getColumnModel().getColumn(2).setPreferredWidth(180);
        jTablePaciente.getColumnModel().getColumn(2).setResizable(false);
         jTablePaciente.getColumnModel().getColumn(3).setPreferredWidth(90);
        jTablePaciente.getColumnModel().getColumn(3).setResizable(false);
         //jTableDentista.getColumnModel().getColumn(4).setPreferredWidth(90);
       // jTableDentista.getColumnModel().getColumn(4).setResizable(false);
        
        jTablePaciente.getTableHeader().setReorderingAllowed(false);
        jTablePaciente.setAutoResizeMode(jTablePaciente.AUTO_RESIZE_OFF);
        jTablePaciente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conecta.desconecta();
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxMunici;
    private javax.swing.JComboBox<String> jComboBoxProvincia;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxTipoDoc;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTablePaciente;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDocNum;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldMorada;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
