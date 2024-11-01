
package model;

import java.util.Date;

/**
 *
 * @author João
 */

public class CotacaoModel {
    
    private double valorBitcoin,valorEthereum,valorRipple;
    private Date dataAtual;
    
    //construtores

    public CotacaoModel() {
    }

    public CotacaoModel(double valorBitcoin, double valorEthereum, double valorRipple, Date dataAtual) {
        this.valorBitcoin = valorBitcoin;
        this.valorEthereum = valorEthereum;
        this.valorRipple = valorRipple;
        this.dataAtual = dataAtual;
    }
    
    //get and setters

    public double getValorBitcoin() {
        return valorBitcoin;
    }

    public void setValorBitcoin(double valorBitcoin) {
        this.valorBitcoin = valorBitcoin;
    }

    public double getValorEthereum() {
        return valorEthereum;
    }

    public void setValorEthereum(double valorEthereum) {
        this.valorEthereum = valorEthereum;
    }

    public double getValorRipple() {
        return valorRipple;
    }

    public void setValorRipple(double valorRipple) {
        this.valorRipple = valorRipple;
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }
    
}
