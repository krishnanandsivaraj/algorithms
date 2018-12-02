public class BuildTree {
public Node BuildTrees(int[] in,int[] pre,int start,int end)
{
	Node node=null;
	if(start<=end) {
		return null;
	}
	int prefixpos=0;
	node=new Node(pre[prefixpos++]);
	int index=0;
	for(int i=start;i<end;i++) {
		if(in[i]==node.Data) {
			index=i;
		}
	}
	node.left=BuildTrees(in,pre,start,index-1);
	node.right=BuildTrees(in,pre,index+1,end);
	return node;
	
}
}
