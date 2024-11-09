
package controller;

import dao.CadastroDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import model.Usuario;
import view.FrameComprar;

/**
 *
 * @author João
 */

public class ControllerComprar{
    private FrameComprar jc;
   
    
    //construtores

    public ControllerComprar() {
    }

    public ControllerComprar(FrameComprar jc) {
        this.jc = jc;
    }
    
  

    
   //metodo
   public boolean comprar() {
        String senha = jc.getTxtsenhaCompra().getText();
        int opcao = Integer.parseInt(jc.getTxtOpcaoMoedaCompra().getText());
        double valorCompra = Double.parseDouble(jc.getTxtValorCompra().getText());
        
        if (senha.length() < 6) {
            JOptionPane.showMessageDialog(jc, "A senha deve ter 6 dígitos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        Usuario cliente = new Usuario();
        cliente.setSenha(senha);
        
        Conexao conexao = new Conexao();
        try (Connection conn = conexao.getConnection()) {
            CadastroDAO dao = new CadastroDAO(conn);
            if (dao.verificarCliente(cliente)) {
                JOptionPane.showMessageDialog(jc, "Cliente identificado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                
                double taxaFixa = 0.0;
                double taxaCotacao = 0.0;
                String moeda = "";
                
                switch (opcao) {
                    case 7:
                        taxaFixa = 0.02;  // 2%
                        taxaCotacao = 1.75; //taxa da cotação
                        moeda = "Bitcoin";
                        break;
                    case 8:
                        taxaFixa = 0.01;  // 1%
                        taxaCotacao = 1.02; //taxa da cotação
                        moeda = "Ethereum";
                        break;
                    case 9:
                        taxaFixa = 0.01;  // 1%
                        taxaCotacao = 0.7; //taxa da cotação
                        moeda = "Ripples";
                        break;
                    default:
                        JOptionPane.showMessageDialog(jc, "Opção inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                        return false;
                }
                
                double valorTotal = valorCompra * (1 + taxaFixa + taxaCotacao);
                
                if (cliente.getReais() < valorTotal) {
                    JOptionPane.showMessageDialog(jc, "Saldo insuficiente", "Erro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }

                cliente.setReais(cliente.getReais() - valorTotal);
                
                switch (opcao) {
                    case 7:
                        cliente.setBitcoin(cliente.getBitcoin() + valorCompra);
                        break;
                    case 8:
                        cliente.setEthereum(cliente.getEthereum() + valorCompra);
                        break;
                    case 9:
                        cliente.setRipple(cliente.getRipple() + valorCompra);
                        break;
                }

                dao.atualizarSaldos(cliente);

                StringBuilder sb = new StringBuilder();
                sb.append("Nome: ").append(cliente.getNome()).append("\n");
                sb.append("CPF: ").append(cliente.getCpf()).append("\n");
                sb.append("Saldo atual Reais: ").append(cliente.getReais()).append("\n");
                sb.append("Saldo atual Bitcoin: ").append(cliente.getBitcoin()).append("\n");
                sb.append("Saldo atual Ethereum: ").append(cliente.getEthereum()).append("\n");
                sb.append("Saldo atual Ripples: ").append(cliente.getRipple()).append("\n");

                jc.getTxtAreaCotacaoCompra().setText(sb.toString());
                return true;
             
               
                
            } else {
                JOptionPane.showMessageDialog(jc, "Usuário não identificado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jc, "Falha na conexão!", "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return false;
        }
    }
       
       
    private String formatarDecimal(double numero) {
                 DecimalFormat df = new DecimalFormat("#0.00");
                 return df.format(numero);}
    }
    


    

