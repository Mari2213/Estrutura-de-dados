package Execicios.Exercicio2.Ex3;

import java.util.Date;

public class No {
    String nomeDesp;
    double valorDesp;
    Date encerrmentoBoleto;
    int situacaoBoleto;
    No prox = null;

    public No(String nomeDesp, double valorDesp, Date encerrmentoBoleto, int situacaoBoleto) {
        this.nomeDesp = nomeDesp;
        this.valorDesp = valorDesp;
        this.encerrmentoBoleto = encerrmentoBoleto;
        this.situacaoBoleto = situacaoBoleto;
    }
}
