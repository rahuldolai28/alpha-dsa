public class zigZag {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node findMid(Node temp) {
        if (temp.next == null) {
            return temp;
        }
        Node slow = temp;
        Node fast = temp.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void reorder(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        // find mid
        Node mid = findMid(head);

        // reverse half
        Node prev = null;
        Node curr = mid.next;
        mid.next = null; // split
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        // zig zag 123 456
        Node right = prev;
        Node left = head;
        Node temp1;
        Node temp2;
        while (right != null) {
            temp1 = right;
            right = right.next;

            temp2 = left;
            left = left.next;
            temp2.next = temp1;
            temp1.next = left;
        }
    }

    public static void main(String[] args) {
        // 3 8 6 4 5 2
        Node head = new Node(3);
        head.next = new Node(8);
        head.next.next = new Node(6);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);
        // expected 3 2 8 5 6 4
        reorder(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

    }
}
