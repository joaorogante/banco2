package controller;

import dao.CadastroDAO;
import dao.Conexao;
import model.Usuario;
import view.FrameExtrato;
import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ControllerExtrato {

    private FrameExtrato je;

    public ControllerExtrato(FrameExtrato je) {
        this.je = je;
    }

    public boolean notaExtrato() {
        String senha = je.getTxtSenhae().getText();
        if (senha.length() != 6) {
            JOptionPane.showMessageDialog(je, "A senha deve ter 6 dígitos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        Usuario cliente = new Usuario();
        cliente.setSenha(senha);

        Conexao conexao = new Conexao();
        try (Connection conn = conexao.getConnection()) {
            CadastroDAO cadastroDAO = new CadastroDAO(conn);

            // Verificar cliente pelo CPF e senha
            if (cadastroDAO.verificarCliente(cliente)) {
                JOptionPane.showMessageDialog(je, "Cliente identificado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);

                // Formatação de valores em duas casas decimais
                DecimalFormat df = new DecimalFormat("#,##0.00");

                // Obter a data e hora atuais no formato desejado
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
                String dataAtual = dateFormat.format(new Date());

                // Montar o extrato simplificado com a data atual
                StringBuilder sb = new StringBuilder();
                sb.append("Data do Extrato: ").append(dataAtual).append("\n\n");
                sb.append("Nome: ").append(cliente.getNome()).append("\n");
                sb.append("CPF: ").append(cliente.getCpf()).append("\n\n");
                
                // Exibir apenas os saldos de Real, BTC, ETH, e XRP
                sb.append("Saldo em Real: ").append(df.format(cliente.getReais())).append("\n");
                sb.append("Saldo em BTC: ").append(df.format(cliente.getBitcoin())).append("\n");
                sb.append("Saldo em ETH: ").append(df.format(cliente.getEthereum())).append("\n");
                sb.append("Saldo em XRP: ").append(df.format(cliente.getRipple())).append("\n");

                // Exibir o extrato na interface gráfica
                je.getTxtAreaExtrato().setText(sb.toString());
                return true;
            } else {
                JOptionPane.showMessageDialog(je, "Usuário não identificado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(je, "Falha na conexão!", "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return false;
        }
    }
}



