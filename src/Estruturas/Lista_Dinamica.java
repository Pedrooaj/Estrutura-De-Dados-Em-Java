package Estruturas;

public class Lista_Dinamica {
    public Nodo<Integer> start;
    public Nodo<Integer> end;
    public int length;
    
    public Lista_Dinamica(){
        this.start = null;
        this.end = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return start == null;
    }

    public void add(int value){
        Nodo<Integer> newNodo = new Nodo<Integer>(value);
        if(isEmpty()){
            this.start = newNodo;
            this.end = newNodo;
        }else{
            this.end.setNext(newNodo);
            this.end = newNodo;
        }
        length++;
    }




    public void printList(){

        

        Nodo<Integer> currentNodo = this.start;


        if(isEmpty()){
            System.out.println("Lista vazia...");
            return;
        }

        for(int i = 0; i < length;i++){
            System.out.print(currentNodo.getValue());
            if(currentNodo.getNext() != null){
                System.out.print(" -> ");
            }
            currentNodo = currentNodo.getNext();
        }
    }

}
