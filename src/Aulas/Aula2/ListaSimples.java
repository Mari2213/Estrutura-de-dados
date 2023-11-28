package Aulas.Aula2;

public class ListaSimples {
    No primeiro=null,ultimo=null;

    public void inserirNoFinal(No novoNo){

        if(primeiro==null){
            //Lista vazia
            //inserir nó na lista
            //nó será o primeiro e o último elemento
            primeiro=novoNo;
        }else{
            //existe elementos na lista
            //inserir na ultima posição
            ultimo.prox=novoNo;
        }
        ultimo=novoNo;

    }
    public void imprimir(){

        No aux=primeiro;
        int i=0;
        while(aux!=null){
            System.out.println("Pos: "+i+" Valor: "+aux.valor);
            i++;
            aux=aux.prox;
        }


    }

    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples();

        No no1 = new No(10);
        No no2 = new No(20);
        No no3 = new No(30);

        listaSimples.inserirNoFinal(no1);
        listaSimples.inserirNoFinal(no2);
        listaSimples.inserirNoFinal(no3);
        listaSimples.imprimir();



    }


}
