package Execicios.Exercicio2.Ex2;

public class Lista {
    No primeiro = null, ultimo = null;

    public void adicionarProduto(No produto){
        if (primeiro == null){
            primeiro = produto;
        }else {
            ultimo.prox = produto;
        }
        ultimo = produto;
        System.out.println("Produto adicionado!");
    }

    public void valorFinalCompra(){
        double acum = 0;
        for (No i = primeiro; i != null; i = i.prox){
            acum += i.preco;
        }
        System.out.println("Valor final da compra foi de: "+acum);
    }

    public void buscaItemLista(String produto){
        for (No i = primeiro; i != null; i = i.prox){
            if (i.nome.equals(produto)){
                System.out.println("Nome do produto: "+i.nome);
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    public void maiorValorItemLista(){
        double maior = 0;
        String Prod = null;
        for (No i = primeiro; i != null; i = i.prox){
            if (i.preco > maior){
                maior = i.preco;
                Prod = i.nome;
            }
        }
        System.out.println("O maior valor é "+maior+" do produto "+Prod);
    }

    public void listaItensCategoria(String categoria){
        boolean acho = false;
        System.out.println("Lista de produtos na categoria: "+categoria);
        for (No i = primeiro; i != null; i = i.prox){
            if (i.categoria.equals(categoria)){
                System.out.println(i.nome);
                acho = true;
            }
        }

        if (!acho){
            System.out.println("Não tem nenhum produto nesta categoria!");
        }

    }
}
