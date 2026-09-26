public class LargestBSTinBT {

    public static int findLargest(Node root, int min, int max, int ans) {
        if (root == null) {
            return 0;
        }
        if (root.data >= max || root.data <= min) {
            return -1;
        }
        int left = findLargest(root.left, min, root.data, ans);
        int right = findLargest(root.right, root.data, max, ans);
        int temp ;
        if (left == -1 || right == -1) {
            temp = 0;
        } else {
            temp = left + right + 1;
        }
        ans = Math.max(temp, ans);
        return ans ;
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
        int ans  = findLargest(root, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        System.out.println(ans);
    }
}
