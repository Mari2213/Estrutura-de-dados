package Execicios.ExeSaladeAula6;

public class Tree {
    private No root; // raiz da arvore

    public Tree(){
        root = null;
    }

    public void insert(long a){
        No novo = new No(); // criar um novo Nó

        novo.item = a; // atribui o valor recebido ao item de dados do No
        novo.right = null;
        novo.left = null;

        if (root == null) root = novo;
        else { // se não for a raiz
            No atual = root;
            No anterior;
            while (true){
                anterior = atual;
                if (a <= atual.item){ // ir para esquerda
                    atual = atual.left;
                    if (atual == null){
                        anterior.left = novo;
                        return;
                    }
                }else { // ir para direita
                    atual = atual.right;
                    if (atual == null){
                        anterior.right = novo;
                        return;
                    }
                }
            }
        }
    }

    public No search(long key){
        if (root == null){ // se a arvore estiver vazia
            return null;
        }

        No noAtual = root;

        while (noAtual.item != key){
            if (key < noAtual.item){
                noAtual = noAtual.left; //caminha para a esquerda
            }else { // caminha para a direita
                noAtual = noAtual.right;
            }

            if (noAtual == null){ // encontrou uma folha e saí
                return null;
            }
        }
        return noAtual; // encontrou o item
    }

    public boolean delete(long a){
        if (root == null){
            return false;
        }

        No noAtual = root;
        No dad = root;
        boolean sonLeft = true;

        // busca o valor
        while (noAtual.item != a){
            dad = noAtual;

            if (a < noAtual.item){ // caminha para esquerda
                noAtual = noAtual.left;
                sonLeft = true;
            }else { // caminha para direita
                noAtual = noAtual.right;
                sonLeft = false;
            }

            if (noAtual == null){ // se encontrou uma folha sai
                return false;
            }
        }

        // se chegou aqui quer dizer que encontrou o valor (a)
        // "NoAtual": contem a referencia ao No a ser eliminado
        // "dad": contem a referencia para o pai do No a ser eliminado
        // "sonLeft": é verdadeiro se atual é filho a esquerda do pai

        // se não possui filho é uma folha, elimine-o
        if (noAtual.left == null && noAtual.right == null){
            if (noAtual == root){ // se é raiz
                root = null;
            }else if (sonLeft){ // se for filho a esquerda do pai
                dad.left = null;
            }else { // se for filho a direita do pai
                dad.right = null;
            }
        } else if (noAtual.right == null) { // Se é pai e nao possui um filho a direita, substitui pela subarvore a direita
            if (noAtual == root){
                root = noAtual.left; // se raiz
            } else if (sonLeft){
                dad.left = noAtual.left; // se for filho a esquerda do pai
            } else{
                dad.right = noAtual.left; // se for filho a direita do pai
            }
        } else if (noAtual.left == null) { // Se é pai e nao possui um filho a esquerda, substitui pela subarvore a esquerda
            if (noAtual == root){
                root = noAtual.right; // se raiz
            } else if (sonLeft){
                dad.left = noAtual.right; // se for filho a esquerda do pai
            } else {
                dad.right = noAtual.right; // se for  filho a direita do pai
            }
        }else { // Se possui mais de um filho, se for um avô ou outro grau maior de parentesco
            No successor = noSuccessor(noAtual);
            // Usando sucessor que seria o Nó mais a esquerda da subarvore a direita do No que deseja-se remover
            if (noAtual == root) {
                root = successor; // se raiz
            } else if(sonLeft){
                dad.left = successor; // se for filho a esquerda do pai
            } else{
                dad.right = successor; // se for filho a direita do pai
            }
            successor.left = noAtual.left; // acertando o ponteiro a esquerda do sucessor agora que ele assumiu
            // a posição correta na arvore
        }
        return true;
    }

    public No noSuccessor(No delete){ // O sucessor é o Nó mais a esquerda da subarvore a direita do No que foi passado como parametro do metodo
        // O parametro é a referencia para o No que deseja-se apagar

        No dadSuccessor = delete;
        No successor = delete;
        No noAtual = delete.right; // vai para a subarvore a direita

        while (noAtual != null){ // enquanto nao chegar no Nó mais a esquerda
            dadSuccessor = successor;
            successor = noAtual;
            noAtual = noAtual.left; // caminha para a esquerda
        }

        // quando sair do while "sucessor" será o Nó mais a esquerda da subarvore a direita
        // "paidosucessor" será o o pai de sucessor e "apaga" o Nó que deverá ser eliminado

        if (successor != delete.right){  // se sucessor nao é o filho a direita do Nó que deverá ser eliminado
            dadSuccessor.left = successor.right; // pai herda os filhos do sucessor que sempre serão a direita

            // lembrando que o sucessor nunca poderá ter filhos a esquerda, pois, ele sempre será o
            // Nó mais a esquerda da subarvore a direita do Nó apaga.
            // lembrando também que sucessor sempre será o filho a esquerda do pai

            successor.right = delete.right; // guardando a referencia a direita do sucessor para
            // quando ele assumir a posição correta na arvore
        }

        return successor;
    }

    public void printTree(){
        printTree(this.root);
    }

    private void printTree(No no){
        if (no == null){
            return;
        }

        // mostra a raiz
        System.out.print(no.item+" ");

        // mostra o filho à esquerda e se tiver filhos mostra eles
        if (no.left != null){
            System.out.print("(");
            printTree(no.left);
            System.out.print(")");
        }else {
            System.out.print("(sem filho)");
        }

        // mostra o filho à direita e se tiver filhos mostra eles
        if (no.right != null){
            System.out.print(",");
            printTree(no.right);
            System.out.print(")");
        }else {
            System.out.print("(sem filho)");
        }
    }

    public void walk(){
        printTree();

        System.out.print("\nEm ordem: ");
        inOrder(root);
        System.out.print("\nEm pós-ordem: ");
        posOrder(root);
        System.out.print("\nEm pré-ordem: ");
        preOrder(root);

        System.out.println("\nAltura da arvore: "+height(root));
        System.out.println("Quantidade de folhas: "+leaves(root));
        System.out.println("Quantidade de Nós: "+countNo(root));

        if (root != null){
            System.out.println("Valor minimo: "+min().item);
            System.out.println("Valor máximo: "+max().item);
        }
    }

    public void inOrder(No atual) {
        if (atual != null) {
            inOrder(atual.left);
            System.out.print(atual.item + " ");
            inOrder(atual.right);
        }
    }

    public void preOrder(No atual) {
        if (atual != null) {
            System.out.print(atual.item + " ");
            preOrder(atual.left);
            preOrder(atual.right);
        }
    }

    public void posOrder(No atual) {
        if (atual != null) {
            posOrder(atual.left);
            posOrder(atual.right);
            System.out.print(atual.item + " ");
        }
    }

    public int height(No atual) {
        if(atual == null || (atual.left == null && atual.right == null))
            return 0;
        else {
            if (height(atual.left) > height(atual.right))
                return ( 1 + height(atual.left) );
            else
                return ( 1 + height(atual.right) );
        }
    }

    public int leaves(No atual) {
        if(atual == null){
            return 0;
        }
        if(atual.left == null && atual.right == null){
            return 1;
        }
        return leaves(atual.left) + leaves(atual.right);
    }

    public int countNo(No atual) {
        if(atual == null){
            return 0;
        }
        else{
            return ( 1 + countNo(atual.left) + countNo(atual.right));
        }
    }

    public No min() {
        No atual = root;
        No anterior = null;
        while (atual != null) {
            anterior = atual;
            atual = atual.left;
        }
        return anterior;
    }

    public No max() {
        No atual = root;
        No anterior = null;
        while (atual != null) {
            anterior = atual;
            atual = atual.right;
        }
        return anterior;
    }

}
