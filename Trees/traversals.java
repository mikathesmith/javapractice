import org.w3c.dom.Node;
import java.io.*;
import java.util.*;

public class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class traversals{


	public void preOrder(Node root){
		System.out.print(root.data+ " ");
		if(root.left != null){
	        preOrder(root.left);
	    }
	    if(root.right!=null){
	        preOrder(root.right);
	    }
	}
	

	public void inOrder(Node root) {
	    if(root.left != null){
	        inOrder(root.left);
	    }
	    System.out.print(root.data + " ");
	    if(root.right != null){
	        inOrder(root.right);
	    }
	}
		
	public void postOrder(Node root) {
	    
	    if(root.left != null){
	        postOrder(root.left);
	    }
	    if(root.right!=null){
	        postOrder(root.right);
	    }
	    
	    System.out.print(root.data + " ");
	
	}
	
	static int height(Node root) {

        if(root == null){
            return -1; 
        }
    
        return 1+ Math.max(height(root.left), height(root.right));

 
    }
	
	public static Node insert(Node root, int data) {
        if(root == null){
            return new Node(data);
        }
        else {
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }

}