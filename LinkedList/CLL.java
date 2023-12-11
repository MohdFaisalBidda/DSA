package LinkedList;

public class CLL {
  private Node head;
  private Node tail;

  public void insert(int value) {
    Node node = new Node(value);
    if (head == null) {
      head = node;
      tail = node;
      return;
    }
    tail.next = node;
    node.next = head;
    tail = node;
  }

  public void delete(int value) {
    Node node = head;
    if (node == null) {
      return;
    }

    if (node.value == value) {
      head = head.next;
      tail.next = head;
    }

    do {
      Node n = node.next;
      if (n.value == value) {
        node.next = n.next;
        break;
      }
      node = node.next;
    } while (node != head);
  }

  public void display() {
    Node n = head;
    if (head != null) {
      do {
        System.out.print(n.value + "->");
        n = n.next;
      } while (n != head);
    }
    System.out.println(" Head");
  }

  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

}