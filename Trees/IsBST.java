    


public class isBST{
	

	ArrayList<Integer> valueList = new ArrayList<Integer>();
    boolean isBST = true;
    
    boolean checkBST(Node root) {
        inOrderTraversal(root);  
        return isBST;
    }

    void inOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.left);
        if(valueList.size()!=0){
            valueList.add(root.data);
            
            int i= valueList.size()-1;
            if(valueList.get(i) <= valueList.get(i-1)){
                isBST = false; 
            } 
        }else{
            valueList.add(root.data);
        }
        inOrderTraversal(root.right);
   }
    
}

class Node {
    int data;
    Node left;
    Node right;
 }