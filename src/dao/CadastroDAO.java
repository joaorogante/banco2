
package dao;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Usuario;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.FrameLogin;

/**
 *
 * @author João
 */

public class CadastroDAO {
   private Connection conn;

    public CadastroDAO(Connection conn) {
        this.conn = conn;
    }
   
     public void inserir(Usuario cliente) throws SQLException{
        String sql = "insert into public.\"bancouser\" (nome, cpf, senha, reais, bitcoin, ethereum, ripples) values (?, ?, ?,0,0,0,0)";
        PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCpf());
            statement.setString(3, cliente.getSenha());
            
            statement.execute();  
    }
   
   //metodo para verificar se já existe cadastro
     
      public ResultSet consultar(Usuario cliente) throws SQLException{
       
        String sql = "select * from public.\"bancouser\" where cpf = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        statement.setString(2, cliente.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
       
    return resultado;
      
      }
      
     public boolean jaCadastrado(Usuario cliente) throws SQLException{
        String sql = "select * from public.\"bancouser\" where cpf = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        statement.setString(2, cliente.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado.next();
     }
    
  //consulta com senhas 
     public boolean verificarCliente(Usuario cliente) throws SQLException {
        String sql = "SELECT nome, cpf, reais, bitcoin, ethereum, ripples from bancouser where senha = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getSenha());
            ResultSet resultado = statement.executeQuery();
            if (resultado.next()) {
                cliente.setNome(resultado.getString("nome"));
                cliente.setCpf(resultado.getString("cpf"));
                cliente.setReais(resultado.getDouble("reais"));
                cliente.setBitcoin(resultado.getDouble("bitcoin"));
                cliente.setEthereum(resultado.getDouble("ethereum"));
                cliente.setRipple(resultado.getDouble("ripples"));
                return true;
            } else {
                return false;
            }
        }
     }
     
      //atualização de valores do banco de dados 
     
     public void atualizarSaldos(Usuario cliente) throws SQLException {
    String sql = "UPDATE bancouser SET reais = ?, bitcoin = ?, ethereum = ?, ripples = ? WHERE cpf = ?";
    try (PreparedStatement statement = conn.prepareStatement(sql)) {
        statement.setDouble(1, cliente.getReais());
        statement.setDouble(2, cliente.getBitcoin());
        statement.setDouble(3, cliente.getEthereum());
        statement.setDouble(4, cliente.getRipple());
        statement.setString(5, cliente.getCpf());
        statement.executeUpdate();
    }
}

}


        
        
     
     


    



      
    
    
    
 
   


    


      
    
      

  



    
