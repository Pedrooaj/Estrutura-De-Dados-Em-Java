import Estruturas.Lista_Estatica;

public class App {
    public static void main(String[] args) throws Exception {
       Lista_Estatica list = new Lista_Estatica(5);
       list.add("1");
       list.add("2");
       list.add("3");
       list.insert("5", 3);
       list.insert("4", 3);
       list.remove();
       list.printList();
    
    }
}
