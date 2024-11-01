package controller;

import dao.CadastroDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.FrameCadastro;
import view.FrameLogin;

/**
 *
 * @author João
 */

public class ControllerCadastro {
    
    private FrameCadastro view;
    public ControllerCadastro(FrameCadastro view){
        this.view = view;
    }
    
    public boolean SalvarUsuario(){
        String nome = view.getTxtNome().getText();
        String cpf = view.getTxtCpf().getText();
        String senha = view.getTxtSenha().getText();
       
        
        //verificar se digitou 11 digitos no cpg e 6 na senha
        if(cpf.length() <11){
            JOptionPane.showMessageDialog(view, "CPF deve ter 11 digitos"," Erro",JOptionPane.ERROR_MESSAGE);
            return false;
        }
         if(senha.length() <6){
            JOptionPane.showMessageDialog(view, "A senha deve ter 6 digitos"," Erro",JOptionPane.ERROR_MESSAGE);
            return false;
        }
       
         
        
          Conexao conexao = new Conexao();
        try {
             Usuario cliente  = new Usuario(nome,cpf,senha);
            Connection conn = conexao.getConnection();
            
            CadastroDAO dao = new CadastroDAO(conn);
           
               dao.inserir(cliente);
               JOptionPane.showMessageDialog(view, "Usuario Cadastrado!","Aviso", JOptionPane.INFORMATION_MESSAGE);   
                FrameLogin jl = new FrameLogin();
                jl.setVisible(true);
               return true;
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Falha na conexão!","Erro", JOptionPane.ERROR_MESSAGE);
           
            ex.printStackTrace();
            return false;
        }
}
}
       
    
       
    
       
      
    
   
    

    
       
    
        
    
    

   
    
    
        
     
    
