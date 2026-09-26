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

    //secondary approach
      public static boolean inorderValidation(Node root, long[] prev) {
    if (root == null) {
        return true;
    }

    if (!inorderValidation(root.left, prev)) {
        return false;
    }

    if (root.data <= prev[0]) {
        return false;
    }

    prev[0] = root.data; // as we only track prev[0] elemnt the sc will be O(1)
    // total sc  = O(h) due to recursion stack

    return inorderValidation(root.right, prev);
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
        boolean ans2 = inorderValidation(root,new long[]{Long.MIN_VALUE});
        System.out.println(ans2);
    }
}