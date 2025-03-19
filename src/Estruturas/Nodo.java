package Estruturas;

public class Nodo<T> {
    private T value;
    private Nodo<T> next;

    public Nodo(T value){
        this.value = value;
        next = null;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }
    public void setValue(T value) {
        this.value = value;
    }

    public Nodo<T> getNext() {
        return this.next;
    }
    public T getValue() {
        return value;
    }
}
