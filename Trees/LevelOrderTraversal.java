public class LevelOrderTraversal{

Queue<Node> q = new LinkedList<Node>();
    
   void LevelOrder(Node root){
       if(root==null) return;
       System.out.print(root.data + " ");
       if(root.left!=null){
           q.add(root.left);
       }
       if(root.right!=null){
           q.add(root.right); 
        }
      LevelOrder(q.remove());   
    }

}