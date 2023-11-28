package Execicios.Exercicio2.Ex1;

public class Lista {
    No primeiro = null, ultimo = null;

    public void inserirFinal(No novo){
        if (primeiro == null){
            primeiro = novo;

        }else {
            ultimo.prox = novo;
        }
        ultimo = novo;
        System.out.println("Adicionado!");
    }

    public void calcularMedia(){
        int cont = 0;
        double acum = 0;
        double result;

        for (No i = primeiro; i != null; i = i.prox){
            cont ++;
            acum += i.num;
        }
        result = acum/cont;

        System.out.println("A média aritmética dos números é: "+result);
    }

    public void antecessorSucessor(No noEscolhido){
        No antecessor = null;
        No sucessor = null;

        for (No i = primeiro; i != null; i = i.prox){
            if (primeiro == noEscolhido) {
                sucessor = i.prox;
                break;
            }
            if (i.prox == noEscolhido){
                antecessor = i;
                sucessor = i.prox.prox;
            }

        }

        if (antecessor != null){
            System.out.println("Antecessor: "+antecessor.num);

        }else {
            System.out.println("Não tem antecessor!");
        }

        if (sucessor != null){
            System.out.println("Sucessor: "+sucessor.num);
        }else {
            System.out.println("Não tem sucessor!");
        }
    }

    public void imprimir(){
        for (No i= primeiro; i != null; i = i.prox){
            System.out.println("Número: "+i.num);
        }
    }
}