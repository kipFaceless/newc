
package com.clinica.Controller;

import com.clinica.model.ModeloAgendamento;
import com.clinica.connection.ConnectionBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class ControlAgendamento {
    
    ModeloAgendamento mod = new ModeloAgendamento();
    ConnectionBD conecta = new ConnectionBD();
    ConnectionBD Conectapac = new ConnectionBD();
    ConnectionBD conectmed = new ConnectionBD();
    
    int codMed;
    int codPac;
    
    
    public void salvaragenda(ModeloAgendamento mod){
        buscaCodMed(mod.getComboNomeDentista());
        buscaCodPac(mod.getComboNomePaciente());
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO agendamentos (paciente_id, medico_id,hora,data,sintomas,status)VALUES(?,?,?,?,?,?)");
            pst.setInt(1, codPac);
            pst.setInt(2, codMed);
            pst.setString(3, mod.getTurno());
            pst.setDate(4, new java.sql.Date(mod.getData().getTime()));
            pst.setString(5, mod.getSintomas());
            pst.setString(6, mod.getStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null, " Agendamento Marcado com Sucesso!");
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro ao Enviar os dados para Agenda!"+ex);
        }
        conecta.desconecta();
        
    }
    
    public void buscaMedico(String nome ){
        conectmed.conexao();
        
        try {conectmed.executaSql("SELECT *FROM medicos WHERE nome='"+nome+"'");
            conectmed.rs.first();
            codMed = conectmed.rs.getInt("id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Médico não Encontrado!"+ex);
        }
        conectmed.desconecta();
    }
    
    public void buscaCodPac(String nome ){
        Conectapac.conexao();
        
        try {Conectapac.executaSql("SELECT *FROM pacientes WHERE nome='"+nome+"'");
            Conectapac.rs.first();
            codPac = Conectapac.rs.getInt("id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Paciente não Encontrado!"+ex);
        }
        Conectapac.desconecta();
    }
    
    public void alterarStatus(ModeloAgendamento mod){
        conecta.conexao();
        
        try {
            PreparedStatement pst = conecta.con.prepareStatement("UPDATE agendamentos set status=? WHERE id=?");
            pst.setString(1, mod.getStatus());
            pst.setInt(2, mod.getAgendaCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Agendamento em Atendimento...");
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao atender o Agendamento! ");
        }
        
        conecta.desconecta();
    }
    
    public int buscaCodMed(String nome ){
        conectmed.conexao();
        
        try {conectmed.executaSql("SELECT *FROM medicos WHERE nome='"+nome+"'");
            conectmed.rs.first();
            codMed = conectmed.rs.getInt("id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Médico não Encontrado!"+ex);
        }
        return codMed;
    }
    
    public ModeloAgendamento buscaAgendaPorCodigo( int cod){
        ModeloAgendamento agendacons = new ModeloAgendamento();
        conecta.conexao();
        conecta.executaSql("SELECT *FROM agendamentos a JOIN pacientes p ON a.paciente_id=p.id join medicos m ON a.medico_id =m.id WHERE a.id='"+cod+"'");
        try {
            conecta.rs.first();
            agendacons.setComboNomePaciente(conecta.rs.getString("p.nome"));
             agendacons.setComboNomeDentista(conecta.rs.getString("m.nome"));
             agendacons.setSintomas(conecta.rs.getString("a.sintomas"));
             agendacons.setPeso(Float.valueOf(conecta.rs.getFloat("a.peso")));
             agendacons.setDataNasc(conecta.rs.getString("a.data"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Buscar Agendamento Por Código!"+ex);
        
        }
        return agendacons;
    } 
}
