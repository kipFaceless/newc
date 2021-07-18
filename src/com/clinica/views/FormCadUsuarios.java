
package com.clinica.views;

import com.clinica.model.ModeloTabela;
import com.clinica.connection.ConnectionBD;
import com.clinica.controller.ControlUsuario;
import com.clinica.model.ModeloUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class FormCadUsuarios extends javax.swing.JInternalFrame {

    ModeloUsuario mod = new ModeloUsuario();
    ControlUsuario dal = new ControlUsuario();
    ConnectionBD conex = new ConnectionBD();
    
      int flag=0;
    public FormCadUsuarios() {
        initComponents();
        
          preencherTabela("SELECT *FROM users ORDER BY name");
        conex.conexao();
        jTextFieldId.setVisible(false);
    }

    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"Código", "Nome", "Perfil", "Endereço"};
        
        conex.conexao();
        conex.executaSql(Sql);
        try {
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("id"), conex.rs.getString("name"),conex.rs.getString("perfil"), conex.rs.getString("endereco")});
                
            }while(conex.rs.next());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Procure por Outro Usuário");
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableUsuarios.setModel(modelo);
        jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTableUsuarios.getColumnModel().getColumn(0).setResizable(false);
         jTableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(290);
        jTableUsuarios.getColumnModel().getColumn(1).setResizable(false);
         jTableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(180);
        jTableUsuarios.getColumnModel().getColumn(2).setResizable(false);
         jTableUsuarios.getColumnModel().getColumn(3).setPreferredWidth(90);
        jTableUsuarios.getColumnModel().getColumn(3).setResizable(false);
         //jTableDentista.getColumnModel().getColumn(4).setPreferredWidth(90);
       // jTableDentista.getColumnModel().getColumn(4).setResizable(false);
        
        jTableUsuarios.getTableHeader().setReorderingAllowed(false);
        jTableUsuarios.setAutoResizeMode(jTableUsuarios.AUTO_RESIZE_OFF);
        jTableUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonFiltrar = new javax.swing.JButton();
        jTextFieldFiltrar = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPasswordFieldConfPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBoxPerfil = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextFieldTel = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jTextFieldId = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(101, 0, 51));
        setClosable(true);
        setIconifiable(true);
        setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(101, 0, 51));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTableUsuarios.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jTableUsuarios.setForeground(new java.awt.Color(32, 10, 93));
        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableUsuarios.setGridColor(new java.awt.Color(255, 255, 255));
        jTableUsuarios.setSelectionBackground(new java.awt.Color(255, 230, 127));
        jTableUsuarios.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(jTableUsuarios);

        jButtonExcluir.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButtonExcluir.setContentAreaFilled(false);
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("EDITAR");
        jButtonEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButtonEditar.setContentAreaFilled(false);
        jButtonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonNovo.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setText("NOVO");
        jButtonNovo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButtonNovo.setContentAreaFilled(false);
        jButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonFiltrar.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButtonFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFiltrar.setText("FILTRAR");
        jButtonFiltrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButtonFiltrar.setContentAreaFilled(false);
        jButtonFiltrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jTextFieldFiltrar.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jTextFieldFiltrar.setForeground(new java.awt.Color(32, 10, 93));
        jTextFieldFiltrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFiltrar.setBorder(null);
        jTextFieldFiltrar.setOpaque(false);

        jButtonCancelar.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.setEnabled(false);

        jTextFieldNome.setFont(new java.awt.Font("Tunga", 1, 11)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNome.setBorder(null);
        jTextFieldNome.setEnabled(false);
        jTextFieldNome.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 230, 127));
        jLabel2.setText("NOME COMPLETO:");

        jButton4.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ÚLTIMO");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setEnabled(false);

        jPasswordFieldConfPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordFieldConfPassword.setForeground(new java.awt.Color(32, 10, 93));
        jPasswordFieldConfPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldConfPassword.setBorder(null);
        jPasswordFieldConfPassword.setEnabled(false);
        jPasswordFieldConfPassword.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 230, 127));
        jLabel6.setText("CONFIRMAR SENHA:");

        jTextFieldEmail.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(32, 10, 93));
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEmail.setBorder(null);
        jTextFieldEmail.setEnabled(false);
        jTextFieldEmail.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 230, 127));
        jLabel7.setText("E-MAIL:");

        jButton3.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ANTERIOR");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setEnabled(false);

        jButton2.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("PRÓXIMO");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PRIMEIRO");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setEnabled(false);

        jComboBoxPerfil.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jComboBoxPerfil.setForeground(new java.awt.Color(32, 10, 93));
        jComboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Recepcionista", "Médico", " " }));
        jComboBoxPerfil.setEnabled(false);
        jComboBoxPerfil.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 230, 127));
        jLabel3.setText("TIPO DE USUÁRIO");

        jTextFieldEndereco.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jTextFieldEndereco.setForeground(new java.awt.Color(32, 10, 93));
        jTextFieldEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEndereco.setBorder(null);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldEndereco.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 230, 127));
        jLabel8.setText("ENDEREÇO:");

        jFormattedTextFieldTel.setBorder(null);
        jFormattedTextFieldTel.setForeground(new java.awt.Color(32, 10, 93));
        jFormattedTextFieldTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldTel.setEnabled(false);
        jFormattedTextFieldTel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jFormattedTextFieldTel.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 230, 127));
        jLabel5.setText("TEL:");

        jPasswordFieldPassword.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(32, 10, 93));
        jPasswordFieldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldPassword.setBorder(null);
        jPasswordFieldPassword.setEnabled(false);
        jPasswordFieldPassword.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 230, 127));
        jLabel4.setText("SENHA:");

        jButtonSalvar.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButtonSalvar.setContentAreaFilled(false);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(292, 292, 292))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                            .addComponent(jSeparator2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel8))
                                        .addGap(63, 63, 63)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jPasswordFieldConfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jSeparator3))
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jComboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                                        .addComponent(jFormattedTextFieldTel)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(103, 103, 103)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldFiltrar)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                .addComponent(jTextFieldEmail))))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordFieldPassword)
                            .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldConfPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                            .addComponent(jSeparator7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addGap(5, 5, 5)
                        .addComponent(jButtonEditar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonFiltrar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jTextFieldFiltrar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTextFieldId.setEnabled(false);

        jPanel4.setBackground(new java.awt.Color(32, 10, 93));

        jLabel10.setFont(new java.awt.Font("Tunga", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("USUÁRIOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel10)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(321, 321, 321)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       
            if  (jTextFieldNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o Nome para continuar", "Cadastrando Usuário", JOptionPane.OK_OPTION);
            jTextFieldNome.requestFocus();
        } else if(jPasswordFieldPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha SENHA para continuar", "Cadastrando Usuário", JOptionPane.OK_OPTION);
            jPasswordFieldPassword.requestFocus();
        }
        else if(jPasswordFieldConfPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Confirme a SENHA para continuar", "Cadastrando Usuário", JOptionPane.OK_OPTION);
            jPasswordFieldConfPassword.requestFocus();
        }
            
            else{
            if(flag==1){
                mod.setNome(jTextFieldNome.getText());
                mod.setEndereco(jTextFieldEndereco.getText());
                mod.setPerfil((String) jComboBoxPerfil.getSelectedItem());
                mod.setEmail(jTextFieldEmail.getText());
                mod.setTel(jFormattedTextFieldTel.getText());
                mod.setPassword(jPasswordFieldPassword.getText());
                dal.salvar(mod);
                jTextFieldNome.setText("");
                jTextFieldEndereco.setText("");
                jPasswordFieldPassword.setText("");
                jPasswordFieldConfPassword.setText("");
                jTextFieldEmail.setText("");
                jFormattedTextFieldTel.setText("");
                jTextFieldId.setText("");
                
                jTextFieldNome.setEnabled(false);
                jTextFieldEndereco.setEnabled(false);
                jTextFieldEmail.setEnabled(false);
                jFormattedTextFieldTel.setEnabled(false);
                jPasswordFieldPassword.setEnabled(false);
                 jPasswordFieldConfPassword.setEnabled(false);
                
                jComboBoxPerfil.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jButtonEditar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                jButtonNovo.setEnabled(true);
                jButtonFiltrar.setEnabled(true);
                jTextFieldFiltrar.setEnabled(true);

                preencherTabela("SELECT *FROM users ORDER BY name");
            }else
            {
                mod.setId(Integer.parseInt(jTextFieldId.getText()));
                mod.setNome(jTextFieldNome.getText());
                mod.setEndereco(jTextFieldEndereco.getText());
                mod.setPerfil((String) jComboBoxPerfil.getSelectedItem());
                mod.setEmail(jTextFieldEmail.getText());
                mod.setTel(jFormattedTextFieldTel.getText());
                mod.setPassword(jPasswordFieldPassword.getText());
                dal.editar(mod);
                jButtonSalvar.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                
                jTextFieldId.setText("");
                jTextFieldNome.setText("");
                jTextFieldEndereco.setText("");
                jPasswordFieldPassword.setText("");
                jPasswordFieldConfPassword.setText("");
                jTextFieldEmail.setText("");
                jFormattedTextFieldTel.setText("");
               
                
                jButtonFiltrar.setEnabled(true);
                jTextFieldFiltrar.setEnabled(true);

                preencherTabela("SELECT *FROM users ORDER BY name");
            }
        
        } 
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag =1;
        
        jTextFieldNome.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jPasswordFieldPassword.setEnabled(true);
        jPasswordFieldConfPassword.setEnabled(true);
        jComboBoxPerfil.setEnabled(true);
        jFormattedTextFieldTel.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
       
         mod.setFiltrar(jTextFieldFiltrar.getText());
        ModeloUsuario model = dal.filtrarUsuario(mod);
        jTextFieldId.setText(String.valueOf(model.getId()));
        jTextFieldNome.setText(model.getNome());
        jTextFieldEndereco.setText(model.getEndereco());
        jComboBoxPerfil.setSelectedItem(model.getPerfil());
        jFormattedTextFieldTel.setText(model.getTel());
        jTextFieldEmail.setText(model.getEmail());
        jPasswordFieldPassword.setText(model.getPassword());
        jPasswordFieldConfPassword.setText(mod.getPassword());
        
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(false);

        preencherTabela("SELECT *FROM users WHERE name LIKE '%"+mod.getFiltrar()+"%' ");
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
       
         flag=2;

        jTextFieldNome.setEnabled(true);
        jTextFieldNome.requestFocus();
        jTextFieldEndereco.setEnabled(true);
        jComboBoxPerfil.setEnabled(true);
        jPasswordFieldPassword.setEnabled(true);
        jPasswordFieldConfPassword.setEnabled(true);
        jFormattedTextFieldTel.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        
         int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente Excluir?");
        if (resposta==JOptionPane.YES_OPTION){
            mod.setId(Integer.parseInt(jTextFieldId.getText()));
            dal.excluir(mod);
            jTextFieldId.setText("");
            jTextFieldNome.setText("");
            jTextFieldEndereco.setText("");
            jFormattedTextFieldTel.setText("");
            jPasswordFieldPassword.setText("");
            jPasswordFieldConfPassword.setText("");
            jTextFieldFiltrar.setText("");
            jButtonExcluir.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonNovo.setEnabled(true);

            preencherTabela("SELECT *FROM users ORDER BY name");
    }//GEN-LAST:event_jButtonExcluirActionPerformed
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxPerfil;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordFieldConfPassword;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldFiltrar;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
