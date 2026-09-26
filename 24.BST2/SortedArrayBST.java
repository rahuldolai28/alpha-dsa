public class SortedArrayBST {
        public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public static Node createBST(int[] arr, int si, int ei ){
        if(si>ei){
            return null;
        }
        int mid = si + (ei-si)/2;
        Node left =  createBST(arr, si, mid-1);
        Node right = createBST(arr, mid+1, ei);

        Node root = new Node(arr[mid]);
        root.left = left;
        root.right = right;
        return root;
    }


    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};
        Node start  = createBST(arr, 0, arr.length-1);
        inorder(start);
    }
}
