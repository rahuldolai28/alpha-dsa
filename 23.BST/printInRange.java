public class printInRange {
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printRange(Node root,int k1, int k2){
        if(root==null){
            return;
        }
        // case-1  k1 < root < k2  (assuming k1 < k2)
        if(root.data >= k1 && root.data <= k2){
            printRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printRange(root.right, k1, k2);
        }
        //case -2  root in left
        else if (root.data < k1 ){
            printRange(root.right, k1, k2);
        }
        else{
            printRange(root.left, k1, k2);
        }
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

        int k1 = 5, k2 = 8;
        inorder(root);
        System.out.println();
        printRange(root,k1,k2);

    }
}
