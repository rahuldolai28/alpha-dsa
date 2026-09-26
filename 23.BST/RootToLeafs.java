import java.util.*;

public class RootToLeafs {

    public static void paths(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.data);

        // leaf node
        if (root.left == null && root.right == null) {
            System.out.println(list);
        }
        paths(root.left, list);
        paths(root.right, list);
        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);

        paths(root, list);
    }
}
