package LinkedList;

import java.util.LinkedList;

public class CycleProblems {
    // Ques 3. LinkedList cycle
    // Slow and Fast pointer Approach
    public static boolean cycleLL(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static int cycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // length of cycle
                int length = 0;
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                length = cycleLength(slow);
                break;
            }
        }
        // finding start node
        ListNode f = head;
        ListNode s = head;

        if (length == 0) {
            return null;
        }

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving f,s till they reach the start node;

        while (f != s) {
            s = s.next;
            f = f.next;
        }
        return s;
    }

    // https://leetcode.com/problems/happy-number/description/
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }

        return false;
    }

    private static int findSquare(int num) {
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

    // https://leetcode.com/problems/middle-of-the-linked-list/
    public ListNode middleNode(ListNode head) {
        ListNode slow =head;
        ListNode fast =head;

        while (fast != null && fast.next != null) {
            slow =slow.next;
            fast =fast.next.next;
        }
        return slow;
    }

    private static ListNode createLinkedListWithCycle() {
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creating a cycle

        return head;
    }

    public static void main(String[] args) {
        ListNode head = createLinkedListWithCycle();

        boolean hasCycle = CycleProblems.cycleLL(head);
        System.out.println("Has Cycle: " + hasCycle);

        int cycleLength = CycleProblems.cycleLength(head);
        System.out.println("Cycle Length: " + cycleLength);

        boolean isHappynum = CycleProblems.isHappy(19);
        System.out.println("Happy Number: " + isHappynum);
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}