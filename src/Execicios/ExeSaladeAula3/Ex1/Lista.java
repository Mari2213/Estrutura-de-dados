package Execicios.ExeSaladeAula3.Ex1;

public class Lista {
    No primeira = null, ultimo = null;


    public void insereFinal(No novo){
        if (primeira == null){
            primeira = novo;
        }else {
            ultimo.prox = novo;
        }
        ultimo = novo;
        System.out.println("Adicionado!");
    }

    public void insereInicio(No novo){
        if (primeira == null){
            primeira = novo;
            ultimo = novo;
        }else {
            novo.prox = primeira;
            primeira = novo;
        }
        System.out.println("Adicionado!");
    }

    public void adicionarPosicao(No num, int pos){
        int count = 0;

        if (pos < 0){
            System.out.println("Posição inválida");
            return;
        }

        if (pos == 0){
            num.prox = primeira;
            primeira = num;
            return;
        }

        No atual = primeira;

        while (atual != null && count < pos -1){
            atual = atual.prox;
            count++;
        }

        if (atual == null){
            System.out.println("Posição inválida");
            return;
        }

        num.prox = atual.prox;
        atual.prox = num;
    }

    public void removePosicao(double numero, int pos){
        if (pos < 0){
            System.out.println("Posição inválida");
            return;
        }

        if (pos == 0){
            if (primeira != null){
                if (primeira.num == numero){
                    primeira = primeira.prox;
                }else {
                    System.out.println("Valor não encontrado na posição: "+pos);
                }
            }else {
                System.out.println("Lista vazia");
            }
            return;
        }

        No atual = primeira;
        int count = 0;

        while (atual != null && count < pos -1){
            atual = atual.prox;
            count++;
        }

        if (atual == null || atual.prox == null){
            System.out.println("Posição inválida");
            return;
        }

        if (atual.prox.num == numero){
            atual.prox = atual.prox.prox;
        }else {
            System.out.println("Valor não encontrado na posição: "+pos);
        }

    }

    public void imprimir(){
        System.out.println("Lista");
        for (No i = primeira; i != null; i = i.prox){
            System.out.println("Número: "+i.num);
        }
    }
}
