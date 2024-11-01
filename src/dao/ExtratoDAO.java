package dao;

import model.ExtratoModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExtratoDAO {
    private Connection conn;

    public ExtratoDAO(Connection conn) {
        this.conn = conn;
    }

    // Método para buscar o extrato de um cliente pelo CPF
    public List<ExtratoModel> buscarExtrato(String cpfCliente) throws SQLException {
        List<ExtratoModel> extratos = new ArrayList<>();

        // Consulta SQL para incluir os campos de taxa e câmbio
        String sql = "SELECT tipo, quantidade, data, taxa, cambio FROM public.bancouser WHERE cpf = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cpfCliente);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // Extrair os valores do ResultSet e criar um novo ExtratoModel
                String tipo = rs.getString("tipo");
                double quantidade = rs.getDouble("quantidade");
                double taxa = rs.getDouble("taxa");
                double cambio = rs.getDouble("cambio");
                Date data = rs.getDate("data");

                ExtratoModel extrato = new ExtratoModel(tipo, quantidade, taxa, cambio, data);
                extratos.add(extrato);
            }
        }

        return extratos;
    }
}
