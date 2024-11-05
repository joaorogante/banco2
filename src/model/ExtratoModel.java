package model;

import java.util.Date;

public class ExtratoModel {
    private String tipo;         
    private double quantidade;   
    private double taxa;         // Taxa aplicada
    private double cambio;       // Câmbio usado
    private Date data;           // Data da transação

    // Construtor
    public ExtratoModel(String tipo, double quantidade, double taxa, double cambio, Date data) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.taxa = taxa;
        this.cambio = cambio;
        this.data = data;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getTaxa() {
        return taxa;
    }

    public double getCambio() {
        return cambio;
    }

    public Date getData() {
        return data;
    }

    // Setters (caso precise alterar os valores)
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ExtratoModel{" +
                "tipo='" + tipo + '\'' +
                ", quantidade=" + quantidade +
                ", taxa=" + taxa +
                ", cambio=" + cambio +
                ", data=" + data +
                '}';
    }
}
