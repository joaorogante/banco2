
package controller;

import static java.lang.Math.random;
import java.text.DecimalFormat;
import java.util.Random;
import view.FrameCotacao;

/**
 *
 * @author João
 */

public class ControllerCotacao {
    
    private FrameCotacao jc;
    private double taxaBitcoin;
    private double taxaEthereum;
    private double taxaRipples;
    
    //contrutores

    public ControllerCotacao() {
    }

    public ControllerCotacao(FrameCotacao jc) {
        this.jc = jc;
    }

   //metodos getters and setters para as taxa de cotsacao

    public double getTaxaBitcoin() {
        return taxaBitcoin;
    }

    public void setTaxaBitcoin(double taxaBitcoin) {
        this.taxaBitcoin = taxaBitcoin;
    }

    public double getTaxaEthereum() {
        return taxaEthereum;
    }

    public void setTaxaEthereum(double taxaEthereum) {
        this.taxaEthereum = taxaEthereum;
    }

    public double getTaxaRipples() {
        return taxaRipples;
    }

    public void setTaxaRipples(double taxaRipples) {
        this.taxaRipples = taxaRipples;
    }
    
    public void Cotacao() {
        // Inicializar gerador de números aleatórios
        Random random = new Random();

        double taxaBitcoin = 1.75;
        double taxaEthereum = 1.02 ;
        double taxaRipples = 0.7 ;

        // Gerar flutuações aleatórias
        taxaBitcoin += taxaBitcoin * (random.nextDouble() * 0.1 - 0.05); // +/- 5%
        taxaEthereum += taxaEthereum * (random.nextDouble() * 0.1 - 0.05); // +/- 5%
        taxaRipples += taxaRipples * (random.nextDouble() * 0.1 - 0.05); // +/- 5%

        // Formatar as cotações com duas casas decimais
        DecimalFormat df = new DecimalFormat("#0.00");
        String bitcoinFormatted = df.format(taxaBitcoin);
        String ethereumFormatted = df.format(taxaEthereum);
        String ripplesFormatted = df.format(taxaRipples);

        // Atualizar as cotações no JTextArea
        StringBuilder sb = new StringBuilder();
        sb.append("Bitcoin: ").append(bitcoinFormatted).append("\n");
        sb.append("Ethereum: ").append(ethereumFormatted).append("\n");
        sb.append("Ripples: ").append(ripplesFormatted).append("\n");

        jc.getTxtAreaCotacao().setText(sb.toString());
    }

}


