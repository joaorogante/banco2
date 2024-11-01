
package controller;

import dao.CadastroDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import model.Usuario;
import view.FrameVender;

/**
 *
 * @author João
 */

public class ControllerVender {
    
    private FrameVender jv;
    
    //construtores

    public ControllerVender(FrameVender jv) {
        this.jv = jv;
    }

    public FrameVender getJv() {
        return jv;
    }

    public void setJv(FrameVender jv) {
        this.jv = jv;
    }
    
     public boolean vender() {
        String senha = jv.getTxtsenhaVenda().getText();
        int opcao = Integer.parseInt(jv.getTxtOpcaoMoedaVenda().getText());
        double valorVenda = Double.parseDouble(jv.getTxtValorVenda().getText());

        if (senha.length() < 6) {
            JOptionPane.showMessageDialog(jv, "A senha deve ter 6 dígitos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        Usuario cliente = new Usuario();
        cliente.setSenha(senha);

        Conexao conexao = new Conexao();
        try (Connection conn = conexao.getConnection()) {
            CadastroDAO dao = new CadastroDAO(conn);
            if (dao.verificarCliente(cliente)) {
                JOptionPane.showMessageDialog(jv, "Cliente identificado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);

                double taxaFixa = 0.0;
                double taxaCotacao = 0.0;
                String moeda = "";

                switch (opcao) {
                    case 6:
                        taxaFixa = 0.02;  // 2%
                        taxaCotacao = 0.03; // 3%
                        moeda = "Bitcoin";
                        break;
                    case 7:
                        taxaFixa = 0.01;  // 1%
                        taxaCotacao = 0.02; // 2%
                        moeda = "Ethereum";
                        break;
                    case 8:
                        taxaFixa = 0.01;  // 1%
                        taxaCotacao = 0.01; // 1%
                        moeda = "Ripples";
                        break;
                    default:
                        JOptionPane.showMessageDialog(jv, "Opção inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                        return false;
                }

                double valorTotal = valorVenda * (1 - (taxaFixa + taxaCotacao));

                switch (opcao) {
                    case 1:
                        if (cliente.getBitcoin() < valorVenda) {
                            JOptionPane.showMessageDialog(jv, "Saldo insuficiente de Bitcoin", "Erro", JOptionPane.ERROR_MESSAGE);
                            return false;
                        }
                        cliente.setBitcoin(cliente.getBitcoin() - valorVenda);
                        break;
                    case 2:
                        if (cliente.getEthereum() < valorVenda) {
                            JOptionPane.showMessageDialog(jv, "Saldo insuficiente de Ethereum", "Erro", JOptionPane.ERROR_MESSAGE);
                            return false;
                        }
                        cliente.setEthereum(cliente.getEthereum() - valorVenda);
                        break;
                    case 3:
                        if (cliente.getRipple() < valorVenda) {
                            JOptionPane.showMessageDialog(jv, "Saldo insuficiente de Ripple", "Erro", JOptionPane.ERROR_MESSAGE);
                            return false;
                        }
                        cliente.setRipple(cliente.getRipple() - valorVenda);
                        break;
                }

                cliente.setReais(cliente.getReais() + valorTotal);
                dao.atualizarSaldos(cliente);

                StringBuilder sb = new StringBuilder();
                sb.append("Nome: ").append(cliente.getNome()).append("\n");
                sb.append("CPF: ").append(cliente.getCpf()).append("\n");
                sb.append("Saldo atual Reais: ").append(formatarDecimal(cliente.getReais())).append("\n");
                sb.append("Saldo atual Bitcoin: ").append(formatarDecimal(cliente.getBitcoin())).append("\n");
                sb.append("Saldo atual Ethereum: ").append(formatarDecimal(cliente.getEthereum())).append("\n");
                sb.append("Saldo atual Ripples: ").append(formatarDecimal(cliente.getRipple())).append("\n");

                jv.getTxtAreaCotacaoVenda().setText(sb.toString());
                return true;

            } else {
                JOptionPane.showMessageDialog(jv, "Usuário não identificado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jv, "Falha na conexão!", "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return false;
        }
    }

    private String formatarDecimal(double numero) {
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(numero);
    }
}
        
        
    

