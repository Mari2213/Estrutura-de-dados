package Execicios.Exercicio2.Ex3;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Lista listaDespesas = new Lista();

        No despesa1 = new No("Água",124,new Date(2023,10,24),1);
        No despesa2 = new No("Energia",330,new Date(2023,10,24), 1);
        No despesa3 = new No("Cartão de crédito",200, new Date(2023,10,18), 1);
        No despesa4 = new No("Supermecado", 500, new Date(2023,9,12), 0);

        listaDespesas.inserirDespesas(despesa1);
        listaDespesas.inserirDespesas(despesa2);
        listaDespesas.inserirDespesas(despesa3);
        listaDespesas.inserirDespesas(despesa4);

        System.out.println("Despesa cadastrada até uma data");
        listaDespesas.despCadastr(new Date(2023,10,20));
        listaDespesas.despCadastr(new Date(2023,9,20));

        System.out.println("Despesas pagas até essa data");
        listaDespesas.despPagas(new Date(2023,10,30));

        System.out.println("Total de despesas");
        listaDespesas.totalDesp();

        System.out.println("Despesas não pagas mais próximas da data");
        listaDespesas.despNaoPagas(new Date(2023,10,30));

    }
}
