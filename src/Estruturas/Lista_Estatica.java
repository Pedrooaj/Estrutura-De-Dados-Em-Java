package Estruturas;

public class Lista_Estatica {
    private String[] vetor;
    public int length = 0;
    private int capacity;

    public Lista_Estatica(int capacity) {
        this.capacity = capacity;
        this.vetor = new String[capacity];
    }

    public void add(String value) {
        if (length < capacity) {
            vetor[length] = value;
            this.length++;
        }
    }


    public void removePosition(int position){
        if(position < 0 || position > length){
            System.out.println("Posição inválida");
            return;
        }

        if (length == 0) {
            System.out.println("Lista vazia...");
            return;
        }
        
        for(int i = position; i < length - 1;i++){
            vetor[i] = vetor[i + 1];
        }
        length--;
    }

    public void insert(String value, int position) {
        if(position < 0 || position > length){
            System.out.println("Posição inválida");
            return;
        }

        if(length == capacity){
            System.out.println("Lista cheia");
            return;
        }

        for (int i = this.length; i > position; i--) {
            this.vetor[i] = this.vetor[i - 1];
        }
        this.vetor[position] = value;
        this.length++;

    }

    public void addStart(String value) {
        if (length < capacity) {
            for (int i = length; i > 0; i--) {
                vetor[i] = vetor[i - 1];
            }
            vetor[0] = value;
            length++;
        } else {
            System.out.println("Lista cheia. Não e possivel adicionar elementos");
        }
    }

    public void remove() {
        if (length != 0) {
            vetor[length - 1] = null;
            length--;
        } else {
            System.out.println("Não e possivel remover da lista");
        }
    }

    public void removeStart() {
        if (length != 0) {
            for (int i = 0; i < length - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            length--;
        } else {
            System.out.println("Não e possivel remover da lista");
        }
    }

    public void printList() {
        for (int i = 0; i < length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();

    }

}
