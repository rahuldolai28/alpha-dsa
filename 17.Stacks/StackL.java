public class StackL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        // push
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // POP
        public int pop() {
            if (isEmpty()) {
                System.out.println("There is nothing to pop");
                return -1;
            }

            int data = head.data;
            head = head.next;

            return data;

        }

        // PEEK
        public int peek() {
            if (isEmpty()) {
                System.out.println("There is nothing to peek");
                return -1;
            }
            return head.data;
        }

        // print
        public void print() {

            if (head == null) {
                System.out.println("Stack is empty");
                return;
            }

            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        // PUSH AT BOTTOM
        public void pushAtBottom(int data) {
            pushAtBottomHelper(data, head);
        }

        private void pushAtBottomHelper(int data, Node temp) {
            if (temp == null) {
                head = new Node(data);
                return;
            }

            if (temp.next == null) {
                temp.next = new Node(data);
                return;
            }

            pushAtBottomHelper(data, temp.next);
        }

        // push at bottom , Approach 2, where first we pop the elements, then backtrack
        public void pat2(int data) {
            pushAtBottomHelper2(data);
        }

        private void pushAtBottomHelper2(int data) {

            if (isEmpty()) {
                push(data);
                return;
            }

            int top = pop();

            pushAtBottomHelper2(data);

            push(top);
        }

    }

    public static void main(String[] args) {
        Stack ss = new Stack();

        ss.print();

        ss.push(1);
        ss.push(2);
        ss.push(3);

        // System.out.println("peek = " + ss.peek());

        // ss.print();

        // ss.pop();

        // ss.pushAtBottom(10);
        ss.print();
        System.out.println("afer");

        ss.pat2(10);
        ss.print();
    }
}
