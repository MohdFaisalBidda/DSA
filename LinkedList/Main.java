package LinkedList;

public class Main {
  public static void main(String[] args) {
    
     // ------ single LinkeList ------
     LL list = new LL();
     list.insertFirst(4);
     list.insertFirst(7);
     list.insertFirst(8);
     list.insertFirst(19);
     list.insertFirst(27);
     list.insertLast(50);
     list.display();
     System.out.println("First Node deleted with value: "+list.deleteFirst());
     list.display();
     System.out.println("Last Node deleted with value: "+list.deleteLast());
     list.display();
     System.out.println("Node deleted with value: "+list.delete(2));
     list.insertRec(80, 2);
     list.display();
    
    /*
     * DLL list =new DLL();
     * list.insertFirst(4);
     * list.insertFirst(7);
     * list.insertFirst(8);
     * list.insertFirst(19);
     * list.insertFirst(27);
     * list.insertLast(33);
     */

    /*
     * CLL list = new CLL();
     * list.insert(8);
     * list.insert(25);
     * list.insert(10);
     * list.display();
     * list.delete(25);
     * list.insert(20);
     * list.display();
     */
    
    // list.displayReverse();
  }
}