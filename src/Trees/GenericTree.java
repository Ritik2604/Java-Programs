package Trees;

import java.util.*;

public class GenericTree {
	private class Node{
		int data;
		ArrayList<Node> children;
		public Node(int data){
			this.data=data;
			this.children =new ArrayList<>();
		}
		
	}
	private int size=0;
	private Node root;

	public GenericTree() {
		// TODO Auto-generated constructor stub
		Scanner scn=new Scanner(System.in);
		this.root=takeInput(scn,null,0);
		
	}
	private Node takeInput(Scanner s,Node parent,int ithChild) {
		if(parent==null) 
			System.out.println("Enter data for parent");
		else 
			System.out.println("Enter data for "+ithChild+"th Child of "+parent.data);
		
		int nodeData=s.nextInt();
		Node node=new Node(nodeData);
		System.out.println("Enter no. of children of "+nodeData);
		this.size++;
		int children=s.nextInt();
		for(int i=0;i<children;i++) {
			Node child=takeInput(s,node,i);
			node.children.add(child);
		}
		return node;
		
	}
	public void display() { 
		this.display(this.root);
	}
	private void display (Node node) {
		String str=node.data+"=>";
		for(int i=0;i<node.children.size();i++) {
			str+=node.children.get(i).data+",";
		}
		str+="END";
		System.out.println(str);
		for(int i=0;i<node.children.size();i++) {
			display(node.children.get(i));
		}
	}
	
	 static int ans;
	public void sum(int k) {
		sum(this.root,k);
		
	}
	
	private void sum(Node node,int k) {
		if(k<0)
			return;
		if(k==0)
			ans+=node.data;
		for(int i=0;i<node.children.size();i++)
		sum(node.children.get(i),k-1);
	}
	
	public static void main(String[] args) {
		// 50 2 25 2 38 0 48 1 18 0 45 2 85 0 60 0
		GenericTree tree=new GenericTree();
		tree.display();
		tree.sum(3);
		System.out.println(ans);
	}

}
