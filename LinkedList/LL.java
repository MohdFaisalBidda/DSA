package LinkedList;

public class LL{
  private Node head;
  private Node tail;
  private int size;

  public LL(){
    this.size =0;
  }

  public void insertFirst(int val){
    Node n =new Node(val);
    n.next=head;
    head = n;

    if(tail == null){
      tail = head;
    }
    size+=1;
  }

  public void insertLast(int val){
    if(tail == null){
      insertFirst(val);
      return;
    }
    Node n =new Node(val);
    tail.next=n;
    tail=n;
    size++;
  }

  public int deleteFirst(){
    if(head == null){
      tail =null;
    }
    int val =head.value;
    head =head.next;
    size--;
    return val;
  }

  public Node get(int index){
    Node node = head;
    for(int i=0;i< index;i++){
      node =node.next;
    }
    return node;
  }

  public int deleteLast(){
    if(size <= 1){
      return deleteFirst();
    }
    int val =tail.value;
    Node lastSecond =get(size - 2);
    tail =lastSecond;
    tail.next = null;
    return val;
  }

  public int delete(int index){
    if(index == 0){
      return deleteFirst();
    }
    if(index == size -1){
      return deleteLast();
    }
    Node prev =get(index -1);
    int val =prev.next.value;
    prev.next =prev.next.next;
    
    return val;
  }

  public void display(){
    Node temp=head;
    while(temp != null){
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("End");
  }
  
  private class Node{
    private int value;
    private Node next;

    public Node(int value){
      this.value=value;
    }

    public Node(int value,Node next){
      this.value=value;
      this.next=next;
    }
  }
}