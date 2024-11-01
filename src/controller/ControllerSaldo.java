
package controller;

import dao.CadastroDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.FrameLogin;
import view.FrameSaldo;

/**
 *
 * @author João
 */

public class ControllerSaldo {
    private FrameSaldo js;
    
    
    //contrutores
    public ControllerSaldo() {
    }

    public ControllerSaldo(FrameSaldo js) {
        this.js = js;
    }

public boolean consultarSaldo() throws SQLException {
        String senha = js.getTxtSenhas().getText();
        if (senha.length() < 6) {
            JOptionPane.showMessageDialog(js, "A senha deve ter 6 dígitos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        Usuario cliente = new Usuario();
        cliente.setSenha(senha);

        Conexao conexao = new Conexao();
        try (Connection conn = conexao.getConnection()) {
            CadastroDAO dao = new CadastroDAO(conn);

            if (dao.verificarCliente(cliente)) {
                JOptionPane.showMessageDialog(js, "Cliente identificado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);

                // Imprimir os dados
                StringBuilder sb = new StringBuilder();
                sb.append("Nome: ").append(cliente.getNome()).append("\n");
                sb.append("CPF: ").append(cliente.getCpf()).append("\n");
                sb.append("Saldo Reais: ").append(cliente.getReais()).append("\n");
                sb.append("Saldo Bitcoin: ").append(cliente.getBitcoin()).append("\n");
                sb.append("Saldo Ethereum: ").append(cliente.getEthereum()).append("\n");
                sb.append("Saldo Ripples: ").append(cliente.getRipple()).append("\n");

                js.getJtxtAreaSaldo().setText(sb.toString());
                return true;
            } else {
                JOptionPane.showMessageDialog(js, "Usuário não identificado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(js, "Falha na conexão!", "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return false;
        }
    }
     
    }
      
        
        
        
        
        
    
    
    
    
    
    
      
        
        
        
        
        
    
    
    
    
    
    

