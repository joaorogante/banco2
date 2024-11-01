
package model;

/**
 *
 * Classe para representar um usuário com saldo em várias moedas
 *
 */
public class Usuario {

    private String nome;
    private String cpf;
    private String senha;
    private double reais;
    private double bitcoin;
    private double ethereum;
    private double ripple;

    // Construtores

    public Usuario() {
    }

    public Usuario(String nome, String cpf, String senha, double reais, double bitcoin, double ethereum, double ripple) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.reais = reais;
        this.bitcoin = bitcoin;
        this.ethereum = ethereum;
        this.ripple = ripple;
    }

    public Usuario(String nome, String cpf, String senha) {
        this(nome, cpf, senha, 0.0, 0.0, 0.0, 0.0);
    }

    public Usuario(String senha, double reais, double bitcoin, double ethereum, double ripple) {
        this("", "", senha, reais, bitcoin, ethereum, ripple);
    }

    public Usuario(String senha, double reais) {
        this("", "", senha, reais, 0.0, 0.0, 0.0);
    }

    public Usuario(String nome, String senha) {
        this(nome, "", senha, 0.0, 0.0, 0.0, 0.0);
    }

    public Usuario(String nome, String cpf, String senha, double reais) {
        this(nome, cpf, senha, reais, 0.0, 0.0, 0.0);
    }

    public Usuario(String senha) {
        this("", "", senha, 0.0, 0.0, 0.0, 0.0);
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getReais() {
        return reais;
    }

    public void setReais(double reais) {
        this.reais = reais;
    }

    public double getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(double bitcoin) {
        this.bitcoin = bitcoin;
    }

    public double getEthereum() {
        return ethereum;
    }

    public void setEthereum(double ethereum) {
        this.ethereum = ethereum;
    }

    public double getRipple() {
        return ripple;
    }

    public void setRipple(double ripple) {
        this.ripple = ripple;
    }

    // Métodos para obter o câmbio das moedas (valores podem ser definidos conforme a necessidade)

    public double getCambioBTC() {
        // Substitua pelo valor de câmbio atual para BTC em reais
        return 100000.0; // Exemplo: 1 BTC = 100.000 BRL
    }

    public double getCambioETH() {
        // Substitua pelo valor de câmbio atual para ETH em reais
        return 5000.0; // Exemplo: 1 ETH = 5.000 BRL
    }

    public double getCambioXRP() {
        // Substitua pelo valor de câmbio atual para XRP em reais
        return 3.0; // Exemplo: 1 XRP = 3.00 BRL
    }
}
