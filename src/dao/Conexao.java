
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author João
 */

public class Conexao {
    
       public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/bancoCliente",
            "postgres", "abc1234");
        return conexao;
    
       } 
   
}
