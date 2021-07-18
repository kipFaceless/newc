
package com.clinica.controller;

import com.clinica.connection.ConnectionBD;
import com.clinica.model.ModeloUsuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ControlUsuario {
       ConnectionBD conex = new ConnectionBD();
    ModeloUsuario mod = new ModeloUsuario();
    
    public void salvar(ModeloUsuario mod) {
    conex.conexao();
        try {
            PreparedStatement pst= conex.con.prepareStatement("insert into users (name,email,password,tel, endereco, perfil  ) values(?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEmail());
            pst.setString(3, mod.getPassword());
            pst.setString(4, mod.getTel());
            pst.setString(5, mod.getEndereco());
            pst.setString(6, mod.getPerfil());
                      
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro efectuado Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Usuário!\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
      public void editar(ModeloUsuario mod){
        
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement(" UPDATE users SET name=?, email=?,password=?,tel=?, endereco=?, perfil=? WHERE id=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEmail());
            pst.setString(3, mod.getPassword());
            pst.setString(4, mod.getTel());
            pst.setString(5, mod.getEndereco());
            pst.setString(6, mod.getPerfil());
            pst.setInt(7, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário alterado com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro na alteração de dados do Usuário!\n");
        }
        
        conex.desconecta();
    }
    
      
        public void excluir(ModeloUsuario mod){
        
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM users WHERE id=?");
            pst.setInt(1, mod.getId());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Usuário Excluído com Sucesso!");
                    } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Excluir dados - Usuário!\n");
        }
        conex.desconecta();
        
    }
     
    public ModeloUsuario filtrarUsuario(ModeloUsuario mod){
        
        conex.conexao();
        
        conex.executaSql("SELECT *FROM users WHERE name LIKE '%"+mod.getFiltrar()+"%'");
        try {
            conex.rs.first();
            mod.setId(conex.rs.getInt("id"));
            mod.setNome(conex.rs.getString("name"));
            mod.setPerfil(conex.rs.getString("perfil"));
            mod.setEndereco(conex.rs.getString("endereco"));
            mod.setEmail(conex.rs.getString("email"));
            mod.setTel(conex.rs.getString("tel"));
            mod.setPassword(conex.rs.getString("password"));
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Usuário não cadastrado!\n");
        }
        
        conex.desconecta();
        return mod;
        
    }
}
