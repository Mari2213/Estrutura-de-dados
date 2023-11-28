package Execicios.Exercicio2.Ex2;

public class Principal {
    public static void main(String[] args) {
        Lista listaProd = new Lista();

        No prod1 = new No("Arroz","Cereais e Grãos",24.99);
        No prod2 = new No("Feijão","Cereais e Grãos",6.30);
        No prod3 = new No("Sabonete","Higiene",3.00);
        No prod4 = new No("Detergente","Limpeza",2.19);

        listaProd.adicionarProduto(prod1);
        listaProd.adicionarProduto(prod2);
        listaProd.adicionarProduto(prod3);
        listaProd.adicionarProduto(prod4);

        listaProd.valorFinalCompra();
        listaProd.maiorValorItemLista();
        listaProd.buscaItemLista("Sabonete");
        listaProd.listaItensCategoria("Cereais e Grãos");
    }
}
