package Execicios.ExeSaladeAula5.Ex1;

public class No {
    int senha;
    boolean isPNE;
    No next;

    public No(int senha, boolean isPNE) {
        this.senha = senha;
        this.isPNE = isPNE;
        this.next = null;
    }
}
