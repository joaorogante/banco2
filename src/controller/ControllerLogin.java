
package controller;

import dao.CadastroDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.FrameLogin;
import view.FrameMenu;

/**
 *
 * @author João
 */

public class ControllerLogin {
    private FrameLogin jl;

    public ControllerLogin(FrameLogin jl) {
        this.jl = jl;
    }

    public void loginCliente(){
        Usuario cliente = new Usuario(null,jl.getTxtCpf().getText(),jl.getTxtSenhal().getText());
        Conexao conexao = new Conexao();
         try{
            Connection conn = conexao.getConnection();
             
            CadastroDAO dao = new CadastroDAO(conn);
             
            ResultSet resultado = dao.consultar(cliente);
             
            if(resultado.next()){
                JOptionPane.showMessageDialog(jl, "Login Feito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                String cpf = resultado.getString("cpf");
                String senha = resultado.getString("senha");
                FrameMenu jm = new FrameMenu();
                jm.setVisible(true);
               
            } else{
                JOptionPane.showMessageDialog(jl, "Login não efetuado", "Erro", JOptionPane.ERROR_MESSAGE);
                
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(jl, "Erro de conexão", "Erro", JOptionPane.ERROR_MESSAGE);
                
        }
    }
        
    }

   
     
       
     
   
   
        
  
    
    
    
    
    