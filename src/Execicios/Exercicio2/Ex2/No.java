package Execicios.Exercicio2.Ex2;

public class No {
    String nome, categoria;
    double preco;
    No prox = null;

    public No(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
}
