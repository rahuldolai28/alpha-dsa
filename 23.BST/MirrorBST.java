public class MirrorBST {
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node mirrorTransform(Node root){
        if(root==null){
            return root;
        }
        Node left = mirrorTransform(root.left);
        Node right = mirrorTransform(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
        inorder(root);
        root = mirrorTransform(root);
        System.out.println();
        inorder(root);

    }
}
