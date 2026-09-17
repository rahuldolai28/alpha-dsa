public class Doublyll {
    public static class Node {
        int data;
        Node prev;
        Node next;
        public Node (int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //ADD
    //addfirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head ==null) {
            head = tail =newNode;
            size++;
            return;
            
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    //remove

    //print
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Size = "+ size);
    }

    //reverse
    public  void reverse(){
        Node prev =null,next;
        Node curr = head;
        tail = head;
        while(curr!=null){
            next = curr.next;
            curr.prev = next;
            curr.next = prev;

            prev= curr;
            curr = next;
        }
        head = prev;
    }


    public static void main(String[] args) {
        Doublyll dll = new Doublyll();
        dll.addFirst(6);
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();

        dll.reverse();
        dll.print();

    }
}
