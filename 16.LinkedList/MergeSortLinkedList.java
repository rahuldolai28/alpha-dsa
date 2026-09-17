public class MergeSortLinkedList {
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

    public static Node merge(Node left, Node right) {
        Node head;
        if (left.data <= right.data) {
            head = left;
            left = left.next;
        } else {
            head = right;
            right = right.next;
        }

        Node temp = head;
        while (left != null && right != null) {

            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next; // VERY IMPORTANT
        }

        // Attach whatever is remaining
        if (left != null) {
            temp.next = left;
        } else {
            temp.next = right;
        }

        return head;
    }

    public static Node Mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // step 1 = find mid
        Node mid = findMid(head);

        Node right = mid.next;
        mid.next = null;

        Node leftMid = Mergesort(head);
        Node rightMid = Mergesort(right);

        return merge(leftMid, rightMid);

    }

    public static void main(String[] args) {
        // 3 8 6 4 5 2
        Node head = new Node(3);
        head.next = new Node(8);
        head.next.next = new Node(6);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);
        Node temp = Mergesort(head);

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
