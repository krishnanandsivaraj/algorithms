package trees;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Node node=new Node(1);
	node.left=new Node(2);
	node.right=new Node(3);
	
	System.out.println("InOrderTraversal");
	Traversals.InOrderTreeTraversal(node);
	
	System.out.println("PreOrderTraversal");
	Traversals.PreOrderTreeTraversal(node);
		
	System.out.println("PostOrderTraversal");
	Traversals.PostOrderTreeTraversal(node);
	}

}
