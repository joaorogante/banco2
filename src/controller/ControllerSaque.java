
package controller;

import dao.CadastroDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.FrameSaque;

/**
 *
 * @author João
 */

public class ControllerSaque {
    
    private FrameSaque js;
    
    //construtores do controller

    public ControllerSaque(FrameSaque js) {
        this.js = js;
    }
    
    public boolean SacarReais(){
       
    String senha = js.getTxtSenhaSaque().getText();
    double valorSaque = Double.parseDouble(js.getTxtValorSaque().getText());

    // Verificação se o valor do saque é maior que o saldo em reais do cliente
    Usuario cliente = new Usuario();
    cliente.setSenha(senha);

    Conexao conexao = new Conexao();
    try (Connection conn = conexao.getConnection()) {
        CadastroDAO dao = new CadastroDAO(conn);

        if (dao.verificarCliente(cliente)) {
            // Verificar se o valor do saque é maior que o saldo em reais do cliente
            if (cliente.getReais() < valorSaque) {
                JOptionPane.showMessageDialog(js, "Saldo em Reais insuficiente para o saque", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return false; // Não permitir o saque
            }

            // Cliente identificado e saldo suficiente, realizar o saque
            cliente.setReais(cliente.getReais() - valorSaque);
            dao.atualizarSaldos(cliente);

            // Imprimir os dados
            StringBuilder sb = new StringBuilder();
            sb.append("Nome: ").append(cliente.getNome()).append("\n");
            sb.append("CPF: ").append(cliente.getCpf()).append("\n");
            sb.append("Saldo atual Reais: ").append(cliente.getReais()).append("\n");
            sb.append("Saldo atual Bitcoin: ").append(cliente.getBitcoin()).append("\n");
            sb.append("Saldo atual Ethereum: ").append(cliente.getEthereum()).append("\n");
            sb.append("Saldo atual Ripples: ").append(cliente.getRipple()).append("\n");

            js.getTxtAreaSaque().setText(sb.toString());
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
