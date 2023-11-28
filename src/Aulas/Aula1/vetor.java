package Aulas.Aula1;

import java.util.Scanner;

public class vetor {
    aluno[] alunos = new aluno[100];
    int qtdAlunos = 0;

    public void inserirFinalVetorV1(aluno a){
        for (int i=0; i < alunos.length; i++){
            if (alunos[i] == null){
                alunos[i] = a;
                System.out.println("Aluno inserido!");
                break;
            }
        }
    }

    public void inserirFinalVetorV2(aluno a){
        for (int i=0; i< alunos.length; i++){
            if (alunos[i]==null){
                alunos[i] = a;
                System.out.println("Aluno inserido");
                break;
            }
        }
    }

    public void  inserirFinalVetorV3(aluno a){
        if (qtdAlunos < 100){
            alunos[qtdAlunos] = a;
            qtdAlunos ++;
        }else {
            System.out.println("Vetor cheio!");
        }
    }

    public void tamanhoLista(){
        System.out.println("Tamanho da lista: "+qtdAlunos);
    }

    public boolean verificarAlunoLista(String nome){
        for (int i=0; i < qtdAlunos; i++){
            if (alunos[i].nome.equals(nome)){
                return true;
            }
        }
        return false;
    }

    public String buscaralunoPosicao(int pos){
        if (pos >= 0 && pos < (qtdAlunos - 1)){
            return "Nome: "+alunos[pos].nome;
        }else {
            return "Posição inválida";
        }
    }
    
    public void adicionarPorPosicao(int pos, aluno nome){
        for (int i= alunos.length -1; i > pos; i--){
            alunos[i] = alunos[i - 1];
        }

        alunos[pos] = nome;
    }

    public void excluirPorPosicao(int pos){
        for (int i = pos; i < alunos.length -1; i++){
            alunos[i] = alunos[i + 1];
        }
    }

    public void imprimir(){
        for (int i=0; i < alunos.length; i++){
            if (alunos[i] != null){
                System.out.println("Pos: "+i+" Nome: "+alunos[i].nome);
            }
        }
    }


    public static void main(String[] args) {
        vetor v = new vetor();

        aluno a1 = new aluno("Marianna");
        aluno a2 = new aluno("Marcos");
        aluno a3 = new aluno("Carlos");

        v.inserirFinalVetorV3(a1);
        v.inserirFinalVetorV3(a2);
        v.imprimir();

        if (v.verificarAlunoLista("Marianna")){
            System.out.println("Aluno existe no vetor!");
        }else {
            System.out.println("Aluno não existe!");
        }

        System.out.println(v.buscaralunoPosicao(0));

        System.out.println("//////////");
        v.adicionarPorPosicao(0,a3);
        v.imprimir();

        System.out.println("//////////");
        v.excluirPorPosicao(1);
        v.imprimir();
    }
}
