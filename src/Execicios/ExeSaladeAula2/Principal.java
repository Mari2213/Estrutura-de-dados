package Execicios.ExeSaladeAula2;

public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();

        No n1 = new No("Davi");
        No n2 = new No("Ricardo");
        No n3 = new No("Alessandro");
        No n4 = new No("Viviane");
        No n5 = new No("Alexandre");
        No n6 = new No("Lynwood");
        No n7 = new No("Thiane");
        No n8 = new No("Maurilio");

        System.out.println("Adicionar no final");
        lista.insereFinal(n1);
        lista.insereFinal(n2);
        lista.insereFinal(n3);
        lista.insereFinal(n4);
        lista.insereFinal(n5);
        lista.imprimir();
        lista.tamanho();

        System.out.println("Adicionar no inicio");
        lista.insereInicio(n6);
        lista.insereInicio(n7);
        lista.insereInicio(n8);
        lista.imprimir();
        lista.tamanho();

        System.out.println("Remover o ultimo");
        lista.removerFinal();
        lista.imprimir();
        lista.tamanho();

        System.out.println("Remover o primeiro");
        lista.removerInicio();
        lista.imprimir();
        lista.tamanho();

        lista.posProf("Alessandro");

        System.out.println("Alterar nome");
        lista.alterarNome("Davi", "Davi Taveira");
        lista.imprimir();

        lista.posProf("Alexandre");

        lista.posicao(3);

        lista.imprimirPorLetra('a');
    }
}
