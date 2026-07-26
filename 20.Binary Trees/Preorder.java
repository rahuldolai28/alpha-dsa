
import java.util.LinkedList;
import java.util.Queue;

public class Preorder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // tc= O(n )
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preorderPrint(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorderPrint(root.left);
        preorderPrint(root.right);
    }

    public static void postOrderPrint(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        postOrderPrint(root.left);
        postOrderPrint(root.right);
        System.out.print(root.data + " ");
    }

    // level order traversal
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

    }

    // Height of a tree
    public static int height(Node curr) {
        if (curr == null) {
            return 0;
        }
        int left = height(curr.left);
        int right = height(curr.right);
        int max = Integer.max(left, right);
        return max + 1;
    }

    // count of nodes of a tree
    public static int countNodes(Node curr) {
        if (curr == null) {
            return 0;
        }
        int left = countNodes(curr.left);
        int right = countNodes(curr.right);
        return left + right + 1;
    }

    // Diameter of a tree
    // no. of nodes in the longest path between two leaves

    // Approach 1
    public static int diameter(Node curr) { // T.C = O(n^2)
        if (curr == null) {
            return 0;
        }
        int leftDepth = height(curr.left);
        int rightDepth = height(curr.right);
        int diameter = leftDepth + rightDepth + 1;

        int left = diameter(curr.left);
        int right = diameter(curr.right);
        int max = Integer.max(left, right);
        return Integer.max(max, diameter);
    }

    // Apporoach 2 (Optimised) in Linear time complexity
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameterOptimised(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameterOptimised(root.left);
        Info rightInfo = diameterOptimised(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),
                leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        int nodes1[] = { 1, 2, 4, -1, -1, 5, -1, 6, -1, 7, -1, -1, 3, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // preorderPrint(root);
        // System.out.println();
        // postOrderPrint(root);
        // System.out.println();
        // levelOrder(root);

        // // Node root1 = tree.buildTree(nodes1);
        // System.out.println("Height of tree = " + height(root));

        // System.out.println(countNodes(root));
        // System.out.println("The diameter of the tree = " + diameter(root));

        System.out.println(diameterOptimised(root).diam);
    }
}
