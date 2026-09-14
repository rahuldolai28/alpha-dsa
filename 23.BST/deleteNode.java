public class deleteNode {

    public static Node delete(Node root, int val){
       
        if (root.data< val) {
            root.right = delete(root.right, val);
        }
        else if (root.data> val) {
            root.left = delete(root.left, val);
        }
        else{
            //case 1 leaf node
            if (root.left ==null && root.right==null) {
                return null;
            }
            
            //case 2 , one child
            if () {
                
            }
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

        int key = 7;

        Node ans =  search(root, key);
        System.out.println(ans.left);

    }
}
