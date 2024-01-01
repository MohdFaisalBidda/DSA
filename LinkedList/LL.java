package LinkedList;

import Sort.BubbleSort.bubbleSort;

public class LL {
  private Node head;
  private Node tail;
  private int size;

  public LL() {
    this.size = 0;
  }

  public void insertFirst(int val) {
    Node n = new Node(val);
    n.next = head;
    head = n;

    if (tail == null) {
      tail = head;
    }
    size += 1;
  }

  public void insertLast(int val) {
    if (tail == null) {
      insertFirst(val);
      return;
    }
    Node n = new Node(val);
    tail.next = n;
    tail = n;
    size++;
  }

  public int deleteFirst() {
    if (head == null) {
      tail = null;
    }
    int val = head.value;
    head = head.next;
    size--;
    return val;
  }

  public Node get(int index) {
    Node node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }

  public int deleteLast() {
    if (size <= 1) {
      return deleteFirst();
    }
    int val = tail.value;
    Node lastSecond = get(size - 2);
    tail = lastSecond;
    tail.next = null;
    return val;
  }

  public int delete(int index) {
    if (index == 0) {
      return deleteFirst();
    }
    if (index == size - 1) {
      return deleteLast();
    }
    Node prev = get(index - 1);
    int val = prev.next.value;
    prev.next = prev.next.next;

    return val;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("End");
  }

  // Ques: Recusrively inserting elements to index
  public void insertRec(int val, int index) {
    head = insertRec(val, index, head);
  }

  private Node insertRec(int val, int index, Node node) {
    if (index == 0) {
      Node temp = new Node(val, node);
      size++;
      return temp;
    }
    node.next = insertRec(val, index - 1, node.next);
    return node;
  }

  // Ques 1.Remove Duplicates from Sorted List
  public void duplicates() {
    Node node = head;
    while (node.next != null) {
      if (node.value == node.next.value) {
        node.next = node.next.next;
        size--;
      } else {
        node = node.next;
      }
    }

    tail = node;
    tail.next = null;
  }

  // Question 2. Merge two linked list
  public static LL mergeLL(LL first, LL second) {
    Node f = first.head;
    Node s = second.head;

    LL ans = new LL();
    while (f.next != null && s.next != null) {
      if (f.value < s.value) {
        ans.insertLast(f.value);
        f = f.next;
      } else {
        ans.insertLast(s.value);
        s = s.next;
      }
    }

    while (f != null) {
      ans.insertLast(f.value);
      f = f.next;
    }

    while (s != null) {
      ans.insertLast(s.value);
      s = s.next;
    }
    return ans;
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

  private void bubbleSort(int row, int col) {
    if (row == 0) {
      return;
    }
    if (col < row) {
      Node first = get(col);
      Node second = get(col + 1);

      if (first.value > second.value) {
        if (first == head) {
          head = second;
          first.next = head.next;
          second.next = first;
        } else if (second == tail) {
          Node prev = get(col - 1);
          prev.next = second;
          tail = first;
          first.next = null;
          second.next = tail;
        } else {
          Node prev = get(col - 1);
          prev.next = second;
          first.next = second.next;
          second.next = first;
        }
      }
      bubbleSort(row, col + 1);
    } else {
      bubbleSort(row - 1, 0);
    }
  }

  // Recursion Reverse

  private void reverse(Node node) {
    if (node == tail) {
      head = tail;
      return;
    }
    reverse(node.next);

    tail.next = node;
    tail = node;
    tail.next = null;
  }

  public void reverseIterative() {
    if (size < 2) {
      return;
    }
    Node prev = null;
    Node present = head;
    Node next = present.next;

    while (present != null) {
      present.next = prev;
      prev = present;
      present = next;
      if (next != null) {
        next = next.next;
      }
      head = prev;
    }
  }

  public static void main(String[] args) {
    // LL list = new LL();
    // list.insertLast(1);
    // list.insertLast(1);
    // list.insertLast(2);
    // list.insertLast(3);
    // list.insertLast(3);
    // list.insertLast(3);

    // list.display();
    // list.duplicates();
    // list.display();
    LL first = new LL();
    LL second = new LL();

    first.insertLast(1);
    first.insertLast(3);
    first.insertLast(5);

    second.insertLast(1);
    second.insertLast(2);
    second.insertLast(9);
    second.insertLast(14);

    LL ans = mergeLL(first, second);
    ans.display();

    LL list = new LL();
    for (int i = 5; i > 0; i--) {
      list.insertLast(i);
    }
    list.display();
    list.bubbleSort(5, 5);
    list.display();
  }
}