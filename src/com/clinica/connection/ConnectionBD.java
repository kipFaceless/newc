package com.clinica.connection;



import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author JuneHendrix
 */
public class ConnectionBD {
    
   public Statement stm;
   public ResultSet rs;
   private String driver ="com.mysql.jdbc.Driver";
   private String url="jdbc:mysql://localhost/clinic";
   private String usuario ="root";
   private String senha="";
   public Connection con;
   
   public void conexao(){
    
    System.setProperty("jdbc.Drivers", driver);
       try {
           con=DriverManager.getConnection(url, usuario, senha);
           //JOptionPane.showMessageDialog(null,"Conexão efectuada com sucesso!");
       } catch (SQLException ex) {
              // JOptionPane.showMessageDialog(null,"Erro ao se conectar com o Banco de Dados!\n"+ex);
       }

}
   
   
    public void executaSql (String sql){
        try {
            stm=con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs= stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ExecutaSql !"+ ex.getMessage());
        }
    }
   
   
   
   public void desconecta(){
       try {
           con.close();
            //JOptionPane.showMessageDialog(null,"Desconectado com sucesso!");
       } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null,"Erro ao fechar Conexão com o Banco de Dados!\n"+ex.getMessage());
       }
   }
    
}
