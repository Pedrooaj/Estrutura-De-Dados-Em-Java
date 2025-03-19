package Estruturas;

public class Lista_Dinamica {
    public Nodo<Integer> start;
    public Nodo<Integer> end;
    public int length;

    public Lista_Dinamica() {
        this.start = null;
        this.end = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void add(int value) {
        Nodo<Integer> newNodo = new Nodo<Integer>(value);
        if (isEmpty()) {
            this.start = newNodo;
            this.end = newNodo;
        } else {
            this.end.setNext(newNodo);
            this.end = newNodo;
        }
        length++;
    }

    public void addStart(int value) {
        Nodo<Integer> newNodo = new Nodo<Integer>(value);
        if (isEmpty()) {
            this.start = newNodo;
            this.end = newNodo;
        } else {
            newNodo.setNext(this.start);
            this.start = newNodo;
        }
        length++;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Nada há remover pois a lista esta vazia...");
            return;
        } else {
            if (start == end) {
                this.start = null;
                this.end = null;
            } else {
                Nodo<Integer> currentNodo = this.start;
                while (currentNodo.getNext() != this.end) {
                    currentNodo = currentNodo.getNext();
                }
                currentNodo.setNext(null);
                this.end = currentNodo;
            }
            length--;
        }
    }

    public void removePosition(int position) {
        if (isEmpty()) {
            System.out.println("Nada há remover pois a lista esta vazia...");
            return;
        }

        if(position == 0){
            removeStart();
        }

        if(position == length){
            remove();
        }

        if (position < 0 || position > length) {
            System.out.println("Posição invalida");
            return;
        }

        Nodo<Integer> currentNodo = this.start;

        for (int i = 0; i < position - 1; i++) {
            currentNodo = currentNodo.getNext();
        }

        currentNodo.setNext(currentNodo.getNext().getNext());
        length--;

    }

    public void removeStart() {
        if (isEmpty()) {
            System.out.println("Nada há remover pois a lista esta vazia...");
        } else {
            start = start.getNext();
            length--;

            // confirma se houver apenas um elemento na lista ele deixar o end como nulo.
            if (length == 0) {
                end = null;
            }
        }
    }

    public void insertPosition(int position, int value) {

        if (position > length || position < 0) {
            System.out.println("Posição invalida");
            return;
        }

        if (position == 0) {
            this.addStart(value);
            return;
        }

        if (position == length) {
            this.add(value);
            return;
        }

        Nodo<Integer> newNodo = new Nodo<Integer>(value);
        Nodo<Integer> currentNodo = this.start;

        for (int i = 0; i < position - 1; i++) {
            currentNodo = currentNodo.getNext();
        }
        newNodo.setNext(currentNodo.getNext());
        currentNodo.setNext(newNodo);
        length++;

    }

    public void printList() {
        Nodo<Integer> currentNodo = this.start;
        if (isEmpty()) {
            System.out.println("Lista vazia...");
            return;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(currentNodo.getValue());
            if (currentNodo.getNext() != null) {
                System.out.print(" -> ");
            }
            currentNodo = currentNodo.getNext();
        }
        System.out.println("");
    }

}
