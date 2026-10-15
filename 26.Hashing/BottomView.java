import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BottomView {
    // Bottom View of a Binary Tree
    // The top view of a binary tree is the set of nodes visible when the tree is
    // viewed from the top.
    // Given a binary tree, print the top view of it. The output nodes can be
    // printed in any order.
    // Sample Input :
    // 20
    // /\
    // 8 22
    // /\ \
    // 5 3 25
    //   /\
    //  10 14
    // Sample Output : 5 10 3 14 25
    // Hint : Use the concept of Vertical Order

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    static class Pair {
        Node node;
        int hd;

        public Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void findBottomView(Node root){
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        q.offer(new Pair(root, 0));

        while(!q.isEmpty()){
            Pair curr = q.poll();

            Node node = curr.node;
            int hd = curr.hd;

            map.put(hd, node.data);
            if(node.left!=null){
                q.offer(new Pair(node.left, hd-1));
            }
            if(node.right!=null){
                q.offer(new Pair(node.right, hd+1));
            }
        }
        for(int val : map.values()){
            System.out.print(val + " ");
        }

    }

    public static void main(String[] args) {
        //given
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.left = new Node(100);
        root.right.right = new Node(25);

        //find ans
        findBottomView(root);
    }
}
