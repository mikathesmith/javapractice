public class TopView{
	
	ArrayList<Integer> valueList = new ArrayList<Integer>();
	
	void top_view(Node root)
	{
	    goLeft(root.left);
	    System.out.print(root.data+ " ");
	    goRight(root.right);
	    
	}
	
	void goLeft(Node node){
	    if(node==null) return;
	    
	    if(node.left!=null){
	        goLeft(node.left);
	    }
	    System.out.print(node.data+" ");
	}
	
	void goRight(Node node){
	    if(node==null) return;
	    System.out.print(node.data +" ");
	    if(node.right!=null){
	        goRight(node.right);
	    }
	}
}