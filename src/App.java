import Estruturas.Lista_Dinamica;
import Estruturas.Lista_Estatica;

public class App {
    // test
    public static void main(String[] args) throws Exception {
       Lista_Estatica list = new Lista_Estatica(5);
       list.add("1");
       list.add("2");
       list.add("3");
       list.insert("5", 3);
       list.insert("4", 3);
       list.removePosition(2);
       list.remove();
       list.printList();


    // Lista_Dinamica list = new Lista_Dinamica();

    // list.addStart(3);
    // list.addStart(2);
    // list.addStart(1);
  
    // list.printList();

    // list.add(4);
    // list.add(5);
    // list.printList();

    // list.insertPosition(10, 2);
    // list.printList();

    // list.removePosition(3);
    // list.printList();

    // list.removeStart();
    // list.printList();

    // list.remove();
    // list.printList();
    

    // System.out.println(list.length);
    }
}
