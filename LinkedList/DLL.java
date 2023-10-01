package LinkedList;

public class DLL{
  private Node head;
  private Node tail;

  public void insertFirst(int val){
    Node n =new Node(val);
    n.next=head;
    n.prev=null;
    if(head != null){
      head.prev = n;
    }
    head =n;
  }

  public void insertLast(int val){
    if(tail == null){
      insertFirst(val);
      return;
    }
    Node n =new Node(val);
    tail.next = n;
    n.prev=tail;
    n.next=null;
    tail =n;
  }

  public void display(){
    Node temp=head;
    while(temp != null){
      System.out.print(temp.value+" ->");
      temp=temp.next;
    }
    System.out.println("End");
  } 

  public void displayReverse(){
    Node temp=head;
    Node last =null;
    while(temp != null){
      last=temp;
      temp=temp.next;
    }
    while(last != null){
      System.out.print(last.value+" ->");
      last=last.prev;
    }
    System.out.println("Start");
  }
  
  private class Node{
    private int value;
    private Node next;
    private Node prev;
    
    public Node(int val){
      this.value=val;
    }

    public Node(int val,Node next,Node prev){
      this.value=val;
      this.next=next;
      this.prev=prev;
    }
  }
}