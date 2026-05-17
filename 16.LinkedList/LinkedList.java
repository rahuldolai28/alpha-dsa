public class LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) { // it is a constructor which runs when we create an object of the class
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step-1 create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step-2 newNode next = head
        newNode.next = head;

        // step-3 head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // step -1 create new node
        Node newNode = new Node(data);
        size++;

        // connect with previous node
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public void addMiddle(int data, int idx) {
        // Special case for idx = 0
        if (idx == 0) {
            addFirst(data);
            return;
        }
        // error for idx > size
        if (idx > size || idx < 0) {
            System.out.println("not possible");
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev : i = size -2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int findKey(int key) { // iterative search
        Node temp = head;
        for (int i = 0; i < size; i++) { // other condition while( temp != null )
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    // recursive approach
    public int findKeyRecursively(int key) {
        return helper(head, key);
    }

    public int helper(Node head, int key) {

        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);

        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    // reverse a LL
    public void reverse() {
        Node prev = null;
        Node curr = head;
        tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // Find & remove Nth node from end
    public void removeNthFromEnd(int n) {
        // Invalid case
        if (n <= 0 || n > size) {
            System.out.println("Invalid input");
            return;
        }
        // Remove head
        if (n == size) {
            head = head.next;
            size--;
            return;
        }

        int key = size - n;
        Node temp = head;

        for (int i = 1; i < key; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }

    // Check checkPallindrome
    public boolean checkPallindrome() {

        if (head ==null || head.next==null ) {
            return true;
        }

        // Step-1 find middle node
        Node mid = findMid(head);

        // reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        // check 1st half == 2nd half ?
        Node left = head;
        Node right = prev;
        while (right != null) {

            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;
    }

    // Find mid  SLOW-FAST APPROACH
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);

        // ll.addMiddle(3, 3);
        // ll.addMiddle(0, 0);
        // ll.addMiddle(4, 4);

        // System.out.println("again");
        ll.print();

        // System.out.println("The index of key is " + ll.findKey(10));
        // System.out.println("The index of key is " + ll.findKeyRecursively(10));

        // reverse
        // ll.reverse();
        // ll.print();

        // ll.removeNthFromEnd(3);
        // ll.print();

        System.out.println("Pallindrome is " +ll.checkPallindrome());
        System.out.println("The size of ll is = " + size);
    }
}
