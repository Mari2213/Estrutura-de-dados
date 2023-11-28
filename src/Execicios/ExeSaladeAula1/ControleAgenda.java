package Execicios.ExeSaladeAula1;

public class ControleAgenda {
    Contato [] agenda;
    int qtdContatos;

    public ControleAgenda(int qtdMaxima) {
        agenda = new Contato[qtdMaxima];
        qtdContatos = 0;
    }

    public void adicionarContatoFinal(Contato c){
        if (qtdContatos < 100){
            agenda[qtdContatos] = c;
            qtdContatos ++;
            System.out.println("Contato adiconado!!");
        }else {
            System.out.println("Agenda cheia!");
        }
    }

    public void adiconarContatoPosicao(int pos, Contato c){
        for (int i = agenda.length -1; i > pos; i--){
            agenda[i] = agenda[i - 1];
        }

        agenda[pos] = c;
        qtdContatos ++;
        System.out.println("Contato adicionado por posição!");
    }

    public void excluirContato(String nome){
        for (int i=0; i < agenda.length; i++){
            if (agenda[i] != null && agenda[i].getNome().equals(nome)){
                agenda[i] = null;
                System.out.println("Contato excluido!");
                qtdContatos --;
                break;
            }
        }
    }

    public void buscarContato(String nome){
        for (int i=0; i < qtdContatos; i++){
            if (agenda[i] != null){
                if (agenda[i].getNome().equals(nome)){
                    System.out.println("Nome: "+agenda[i].getNome()+" / Telefone: "+agenda[i].getTelefone());
                }
            }
        }
    }

    public void qtdContatos(){
        System.out.println("Tamanho da lista: "+qtdContatos);
    }

    public void imprimirContatoPorLetra(char letra){
        boolean encontrouContato = false;

        for (int i=0; i < qtdContatos; i++){
            Contato contato = agenda[i];
            if (contato != null){
                if (contato.getNome().toUpperCase().charAt(0) == Character.toUpperCase(letra)){
                    System.out.println("Nome: "+contato.getNome()+" / Telefone: "+contato.getTelefone());
                    encontrouContato = true;
                }
            }
        }
        if (!encontrouContato){
            System.out.println("Não foi encontrado nenhum contato com essa inicial!");
        }
    }

    public void imprimir(){
        System.out.println("///////Agenda Telefonica///////");
        for (int i=0; i < agenda.length; i++){
            if (agenda[i] != null){
                System.out.println("Nome: "+agenda[i].getNome()+" / Telefone: "+agenda[i].getTelefone());
            }

        }
    }
}
