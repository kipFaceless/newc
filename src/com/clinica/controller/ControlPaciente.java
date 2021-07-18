
package com.clinica.Controller;

import com.clinica.connection.ConnectionBD;
import com.clinica.model.ModeloPaciente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JuneHendrix
 */
public class ControlPaciente {
    
   
    ConnectionBD conex = new ConnectionBD();
    int codigomunicipio;
    
    
    public void salvar(ModeloPaciente pac){
        
       // buscaCodigo(pac.getPaciMuni());
        
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO pacientes (nome, data_nasc, tipo_doc,num_doc, morada, tel, email )VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, pac.getNome());
            pst.setString(2, pac.getDataNasc());
            pst.setString(3, pac.getTipoDoc());
            pst.setString(4, pac.getNumDoc());
            pst.setString(5, pac.getMorada());
            pst.setString(6, pac.getTel());
            pst.setString(7, pac.getEmail());
           
            pst.execute();
            JOptionPane.showMessageDialog(null, "Paciente Salvo com Sucesso!");
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Salvar Paciente!"+ex.getMessage());
        }
        
        conex.desconecta();
        
    }
    
     public void editar(ModeloPaciente pac){
        
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement(" UPDATE pacientes SET nome=?, tipo_doc=?, num_doc=?, morada=?, tel=?, email=? WHERE id=?");
             pst.setString(1, pac.getNome());
           // pst.setString(2, pac.getDataNasc());
            pst.setString(2, pac.getTipoDoc());
            pst.setString(3, pac.getNumDoc());
            pst.setString(4, pac.getMorada());
            pst.setString(5, pac.getTel());
            pst.setString(6, pac.getEmail());
            pst.setInt(7, pac.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro na alteração de dados - Paciente!\n"+ex.getMessage());
        }
        
        conex.desconecta();
    }
    
    public void excluir(ModeloPaciente mod){
        
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM pacientes WHERE id=?");
            pst.setInt(1, mod.getId());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Paciente Excluído com Sucesso!");
                    } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Excluir Paciente!\n"+ex.getMessage());
        }
        conex.desconecta();
        
    }
    
    
    
    public void buscaCodigo(String nomemuni){
        conex.conexao();
        
        try {
            conex.executaSql("SELECT *FROM tb_municipio WHERE nome_munici='"+nomemuni+'"');
            conex.rs.first();
            
            codigomunicipio=conex.rs.getInt("cod_prov ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Província"+ex);
        }
        
        conex.desconecta();
        
    }
    
    public ModeloPaciente buscaPaciente(ModeloPaciente mod){
        conex.conexao();
             
        try { conex.executaSql("SELECT *FROM pacientes WHERE nome LIKE '%"+mod.getFiltrar()+"%'");
            conex.rs.first();
            mod.setId(Integer.valueOf(conex.rs.getInt("id")));
            mod.setNome(conex.rs.getString("nome"));
            mod.setDataNasc(conex.rs.getString("data_nasc"));
        
            mod.setMorada(conex.rs.getString("morada"));
            mod.setTipoDoc(conex.rs.getString("tipo_doc"));
            mod.setNumDoc(conex.rs.getString("num_doc"));
            mod.setTel(conex.rs.getString("tel"));
            mod.setEmail(conex.rs.getString("email"));
        } catch (SQLException ex) {
            Logger.getLogger(ControlPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
         conex.desconecta();
        return mod;
    }
}
