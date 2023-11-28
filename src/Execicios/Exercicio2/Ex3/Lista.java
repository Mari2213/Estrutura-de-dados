package Execicios.Exercicio2.Ex3;

import java.util.Date;

public class Lista {
    No primeiro = null , ultimo = null;

    public void inserirDespesas(No despesa){
        if (primeiro == null){
            primeiro = despesa;
        }else {
            ultimo.prox = despesa;
        }
        ultimo = despesa;
        System.out.println("Despesa cadastrada!");
    }

    public void despCadastr(Date dataLimite){
        for (No i = primeiro; i != null; i = i.prox){
            if (i.encerrmentoBoleto.before(dataLimite)){
                System.out.println("Nome da despesa: "+i.nomeDesp);
                System.out.println("Valor da despesa: "+i.valorDesp);
                System.out.println("Prazo de encerramento do boleto: "+i.encerrmentoBoleto);
                System.out.println("Situação do boleto (0 - Pago e 1 - Não pago): "+i.situacaoBoleto);
                System.out.println("--------------------------");
                return;
            }
        }
        System.out.println("Não tem nenhuma despesa cadastrada para essa data!");
    }

    public void despPagas(Date dataDesp){
        for (No i = primeiro; i != null; i = i.prox){
            if (i.encerrmentoBoleto.before(dataDesp) || i.encerrmentoBoleto.equals(dataDesp)){
                if (i.situacaoBoleto == 0){
                    System.out.println("Nome da despesa: "+i.nomeDesp);
                    System.out.println("Valor da despesa: "+i.valorDesp);
                    System.out.println("Prazo de encerramento do boleto: "+i.encerrmentoBoleto);
                    System.out.println("Situação do boleto (0 - Pago e 1 - Não pago): "+i.situacaoBoleto);
                    System.out.println("--------------------------");
                    return;
                }
            }
        }
        System.out.println("Não despesa paga até essa data!");
    }

    public void totalDesp(){
        int count = 0;
        for (No i = primeiro; i != null; i = i.prox){
            count ++;
        }
        System.out.println("Total de despesas cadastradas: "+count);
    }

    public void despNaoPagas(Date dataDesp){
        for (No i = primeiro; i != null; i = i.prox){
            if (i.encerrmentoBoleto.before(dataDesp) || i.encerrmentoBoleto.equals(dataDesp)){
                if (i.situacaoBoleto == 1){
                    System.out.println("Nome da despesa: "+i.nomeDesp);
                    System.out.println("Valor da despesa: "+i.valorDesp);
                    System.out.println("Prazo de encerramento do boleto: "+i.encerrmentoBoleto);
                    System.out.println("Situação do boleto (0 - Pago e 1 - Não pago): "+i.situacaoBoleto);
                    System.out.println("--------------------------");
                    return;
                }
            }
        }
        System.out.println("Não tem despesa não paga até essa data!");
    }

    public void imprimir(){
        for (No i = primeiro; i != null; i = i.prox){
            System.out.println("Nome da despesa: "+i.nomeDesp);
            System.out.println("Valor da despesa: "+i.valorDesp);
            System.out.println("Prazo de encerramento do boleto: "+i.encerrmentoBoleto);
            System.out.println("Situação do boleto (0 - Pago e 1 - Não pago): "+i.situacaoBoleto);
            System.out.println("--------------------------");
        }
    }
}
