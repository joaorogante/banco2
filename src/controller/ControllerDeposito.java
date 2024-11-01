
package controller;

import dao.CadastroDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import model.Usuario;
import view.FrameDeposito;

/**
 *
 * @author João
 */

public class ControllerDeposito {
    private FrameDeposito jd;

    public ControllerDeposito() {
    }

    public ControllerDeposito(FrameDeposito jd) {
        this.jd = jd;
    }
    
    
    // Método para formatar valores decimais
    private String formatarDecimal(double numero) {
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(numero);
    }
    
    
    //metodo
    
    public boolean Depositar(){
      String senha = jd.getTxtSenhaDeposito().getText();
      double valorDeposito = Double.parseDouble(jd.getTxtValorReais().getText());
      double valoreReais;
        if (senha.length() < 6) {
            JOptionPane.showMessageDialog(jd, "A senha deve ter 6 dígitos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        Usuario cliente = new Usuario();
        cliente.setSenha(senha);

        Conexao conexao = new Conexao();
        try (Connection conn = conexao.getConnection()) {
            CadastroDAO dao = new CadastroDAO(conn);

            if (dao.verificarCliente(cliente)) {
                JOptionPane.showMessageDialog(jd, "Cliente identificado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);

                //incremento de valor
                cliente.setReais(cliente.getReais() + valorDeposito);
                dao.atualizarSaldos(cliente);
                
                // Imprimir os dados
                StringBuilder sb = new StringBuilder();
                sb.append("Nome: ").append(cliente.getNome()).append("\n");
                sb.append("CPF: ").append(cliente.getCpf()).append("\n");
                sb.append("Saldo de Reais: ").append(cliente.getReais()).append("\n");
                sb.append("Saldo de Bitcoin: ").append(cliente.getBitcoin()).append("\n");
                sb.append("Saldo de  Ethereum: ").append(cliente.getEthereum()).append("\n");
                sb.append("Saldo de Ripples: ").append(cliente.getRipple()).append("\n");

                jd.getJtxtAreaDeposito().setText(sb.toString());
                return true;
            } else {
                JOptionPane.showMessageDialog(jd, "Usuário não identificado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jd, "Falha na conexão!", "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return false;
        }
        
    }
   
    }
    

