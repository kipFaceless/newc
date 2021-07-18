
package com.clinica.controller;


import com.clinica.connection.ConnectionBD;
import com.clinica.model.ModeloMedico;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class ControlMedico {
    ConnectionBD conex = new ConnectionBD();
    ModeloMedico mod = new ModeloMedico();
    
    public void salvar(ModeloMedico mod) {
    conex.conexao();
        try {
            PreparedStatement pst= conex.con.prepareStatement("insert into medicos (nome, endereco, especialidade, tel, email) values(?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getEspecialidade());
            pst.setString(4, mod.getTel());
            pst.setString(5, mod.getEmail());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro efectuado Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Dentista!\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    public void editar(ModeloMedico mod){
        
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement(" UPDATE medicos SET nome=?, endereco=?, especialidade=? WHERE id=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getEspecialidade());
            pst.setInt(4, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro na alteração de dados - Dentista!\n"+ex.getMessage());
        }
        
        conex.desconecta();
    }
    
    public void excluir(ModeloMedico mod){
        
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM medicos WHERE id=?");
            pst.setInt(1, mod.getId());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Excluído com Sucesso!");
                    } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Excluir dados - Dentista!\n"+ex.getMessage());
        }
        conex.desconecta();
        
    }
    
    
    
    
    public ModeloMedico filtrarDentista(ModeloMedico mod){
        
        conex.conexao();
        
        conex.executaSql("SELECT *FROM medicos WHERE nome LIKE '%"+mod.getFiltrar()+"%'");
        try {
            conex.rs.first();
            mod.setId(conex.rs.getInt("id"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setEspecialidade(conex.rs.getString("especialidade"));
            mod.setEndereco(conex.rs.getString("endereco"));
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Dentista não cadastrado!\n");
        }
        
        conex.desconecta();
        return mod;
        
    }
}

