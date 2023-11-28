package Execicios.ExeSaladeAula4;

public class Lista {

    No primeiro = null, ultimo = null ;

    public void inserirFinal(No novo){
        if (primeiro == null){
            primeiro = novo;
        }else {
            ultimo.prox = novo;
        }
        ultimo = novo;
    }

    public void inserir(No novo){
        if (primeiro == null){
            primeiro = novo;
            ultimo = novo;
        }else {
            if (novo.cor == 'V'){
                inserirFinal(novo);
            }else {
                inserirPrioridade(novo);
            }
        }
    }

    public void inserirPrioridade(No novo){
        No noNovo = primeiro;

        if (noNovo.cor == 'V'){
            novo.prox = noNovo;
            primeiro = novo;
            return;
        }
        while (noNovo.prox.cor != 'V'){
            noNovo = noNovo.prox;
        }
        novo.prox = noNovo.prox;
        noNovo.prox = novo;

    }

    public void imprimir(){
        for (No i = primeiro; i != null; i = i.prox){
            System.out.println("Número: "+i.valor+" Cor: "+i.cor);
        }
    }
}
