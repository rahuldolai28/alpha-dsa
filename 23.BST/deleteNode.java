public class deleteNode {

    public static Node delete(Node root, int val) {

        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case 1 leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 , one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 , both children
            // replace the key with inorder successor
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        int key = 4;
        inorder(root);
        System.out.println();
        root = delete(root, key);

        inorder(root);

    }
}
