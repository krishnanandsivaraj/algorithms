package trees;

public class Traversals {
	
	public static void InOrderTraversal(Node node)
	{
		if (node == null) 
            return;
		
		InOrderTraversal(node.left);
		System.out.println(node.data);
		
		InOrderTraversal(node.right);
	}
	
	public static void PreOrderTraversal(Node node)
	{
		if (node == null) 
            return; 
		System.out.println(node.data);
		PreOrderTraversal(node.left);
		PreOrderTraversal(node.right);
		
	}
	
	public static void PostOrderTraversal(Node node)
	{
		if (node == null) 
            return; 
		PostOrderTraversal(node.left);
		PostOrderTraversal(node.right);
		System.out.println(node.data);
	}
	
	public static void InOrderTreeTraversal(Node root){ 
		InOrderTraversal(root); 
		}
	public static void PreOrderTreeTraversal(Node root) {
		PreOrderTraversal(root);
		}
	public static void PostOrderTreeTraversal(Node root) {
		PostOrderTraversal(root);
		}
	
}
