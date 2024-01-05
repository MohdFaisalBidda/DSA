package Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
     CircularQueue queue = new CircularQueue();
     queue.insert(4);  
     queue.insert(7);  
     queue.insert(8);  
     queue.insert(9);  
     queue.insert(11);
     
     queue.display();
     System.out.println(queue.remove());
     queue.insert(133);
     queue.display();
     
    //  CustomQueue queue = new CustomQueue();
    //  queue.push(4);  
    //  queue.push(7);  
    //  queue.push(8);  
    //  queue.push(9);  
    //  queue.push(11);
     
    //  queue.display();
    //  System.out.println(queue.remove());
    //  queue.display();
    }
}
