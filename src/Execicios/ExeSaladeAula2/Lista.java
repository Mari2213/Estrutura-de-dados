package Execicios.ExeSaladeAula2;

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

    public void removerInicio(){
        primeira = primeira.prox;
    }

    public void removerFinal(){
        for (No i = primeira; i != null; i = i.prox){
            if (i.prox == ultimo){
                i.prox = null;
                ultimo = i;
                break;
            }
        }
        System.out.println("Removido!");
    }

    public void posProf(String nome){
        int count = 0;
        for (No i = primeira; i != null; i = i.prox){
            if (i.nome.equals(nome)){
                System.out.println("Posição do Prof."+nome+": "+count);
                return;
            }
            count ++;
        }
        System.out.println("Nome não encontrado!");
    }

    public void alterarNome(String nome, String novoNome){
        for (No i = primeira; i != null; i = i.prox){
            if (i.nome.equals(nome)){
                i.nome = novoNome;
                System.out.println("Nome Alterado");
                return;
            }
        }
        System.out.println("Nome não encontrado");
    }

    public void imprimirPorLetra(char letra){
        boolean achouLetra = false;

        for (No i = primeira; i != null; i = i.prox){
            if (i.nome.toUpperCase().charAt(0) == Character.toUpperCase(letra)){
                System.out.println("Nome: "+i.nome);
                achouLetra = true;
            }
        }

        if (!achouLetra){
            System.out.println("Não foi encontrado nenhum professor com essa letra!");
        }
    }

    public void posicao(int pos){
        int count = 0;
        for (No i = primeira; i != null; i = i.prox){
            if (pos == count){
                System.out.println("Nome do professor nesta posição: "+i.nome);
                return;
            }
            count ++;
        }
        System.out.println("Posição não encontrada!");
    }

    public void tamanho(){
        int count = 0;
        for (No i = primeira; i != null; i = i.prox){
            count++;
        }
        System.out.println("Tamanho da Lista: "+count);
    }

    public void imprimir(){
        System.out.println("Lista");
        for (No i = primeira; i != null; i = i.prox){
            System.out.println("Nome: "+i.nome);
        }
    }
}
