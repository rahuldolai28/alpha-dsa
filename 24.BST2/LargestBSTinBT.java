public class LargestBSTinBT {

    public static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;

        }
    }

    static int maxSize = 0;

    public static Info findLargest(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info left = findLargest(root.left);
        Info right = findLargest(root.right);

        boolean temp = false;
        if (left.isBST == true && right.isBST == true && root.data > left.max && root.data < right.min) {
            temp = true;
        }
        int tempSize = left.size + right.size + 1;
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        if (temp) {
            maxSize = Math.max(tempSize, maxSize);
        }
        return new Info(temp, tempSize, min, max);

    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        root.right.right.left = new Node(65);
        Info ans = findLargest(root);
        System.out.println(maxSize);
    }
}
