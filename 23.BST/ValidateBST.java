public class ValidateBST {

    //tc = O(n) and sc = O(h)
    public static boolean validate(Node root, long min, long max) {
        if (root == null) {
            return true;
        }

        if (root.data <= min || root.data >= max) {
            return false;
        }

        boolean left = validate(root.left, min, root.data);
        boolean right = validate(root.right, root.data, max);

        return left && right;
    }

      public static boolean inorderValidation(Node root, long prev) {
        if (root == null) {
            return true;
        }
        boolean left = inorderValidation(root.left, prev);
        System.out.print(root.data + " ");
        if (root.data < prev) {
            return false;
        }
        prev = root.data;
        boolean right = inorderValidation(root.right, prev);
        return left && right;
    }
    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(11);

        root.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);

        boolean ans = validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
        boolean ans2 = inorderValidation(root,  Long.MIN_VALUE);
        System.out.println(ans2);
    }
}