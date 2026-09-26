
import java.util.ArrayList;

public class BSTtoBalancedBST {
    public static  ArrayList<Integer> inorder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return list;
        }
        inorder(root.left,list);
        System.out.print(root.data + " ");
        list.add(root.data);
        inorder(root.right,list);
        return list;
    }
    
    public static Node createBST(  ArrayList<Integer> list, int si, int ei ){
        if(si>ei){
            return null;
        }
        int mid = si + (ei-si)/2;
        Node left =  createBST(list, si, mid-1);
        Node right = createBST(list, mid+1, ei);

        Node root = new Node(list.get(mid));
        root.left = left;
        root.right = right;
        return root;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        list= inorder(root, list);
        System.out.println(list);
        Node balancedRoot = createBST(list, 0, list.size() - 1);
        inorder(balancedRoot, new ArrayList<>());
    }
}
