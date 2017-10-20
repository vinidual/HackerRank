
public class TreesIsThisABinarySearchTree {
	
    class Node {
        int data;
        Node left;
        Node right;
    }
    
    boolean isValidBST(Node node, int l, int h) {
        if(node == null)
            return true;
        
        return node.data > l 
            && node.data < h
            && isValidBST(node.left, l, node.data)
            && isValidBST(node.right, node.data, h);
   }
    
    boolean checkBST(Node root) {
        return isValidBST(root, Integer.MIN_VALUE,
             Integer.MAX_VALUE);
   }

}
