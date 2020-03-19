package Trees;
import java.util.*;

public class BinaryTree {
	private class Node{
		int data;
		Node left;
		Node right;
		public Node(int data,Node left,Node right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
		
	}
	private int size=0;
	private Node root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		Scanner scn=new Scanner(System.in);
		this.root=takeInput(scn,null,false);
		
	}
	private Node takeInput(Scanner s,Node parent,boolean isLOR) {
		if(parent==null) 
			System.out.println("Enter data for parent");
		else { 
			if(isLOR) {
				System.out.println("Enter data for left child of "+parent.data);
			}else
				System.out.println("Enter data for right child of "+parent.data );
		}
					
		int nodeData=s.nextInt();
		Node node=new Node(nodeData,null,null);
		this.size++;
		System.out.println("There is left child of "+nodeData);
		boolean choice=s.nextBoolean();
		if(choice) {
			node.left=takeInput(s,node,true);
		}
		System.out.println("There is right child of "+nodeData);
		choice=s.nextBoolean();
		if(choice) {
			node.right=takeInput(s,node,false);
		}
		
		return node;
		
	}
	public void display() { 
		this.display(this.root);
	}
	private void display (Node node) {
		String str="";
		if(node.left!=null)
			str+=node.left.data+"=>";
		else
			str+="END=>";
		str+=node.data+"";
		if(node.right!=null)
			str+="<="+node.right.data;
		else
			str+="<=END";
		System.out.println(str);
		if(node.left!=null)
			display(node.left);
		if(node.right!=null)
			display(node.right);
	}
	public int height() {
		return height(this.root);
	}
	private int height(Node node) {
		if (node==null)
			return -1;
		int Lheight=height(node.left);
		int Rheight=height(node.right);
		return Math.max(Lheight, Rheight)+1;
	}
	private class BalancedPair{
		Boolean isBalance;
		int height;
		BalancedPair(){}
		BalancedPair(Boolean isBalance,int height){
			this.isBalance=isBalance;
			this.height=height;
		}
	}
	public Boolean isBalanced() {
		return isBalanced(this.root).isBalance;
	}
	private BalancedPair isBalanced(Node node) {
		if (node==null) {
			BalancedPair bp=new BalancedPair(true,-1);
			return bp;
		}
		BalancedPair LPair=isBalanced(node.left);
		
		BalancedPair RPair=isBalanced(node.right);
		
		BalancedPair mp=new BalancedPair();
		mp.height=Math.max(LPair.height,RPair.height)+1;
		if(Math.abs(LPair.height-RPair.height)<=1&&LPair.isBalance&&RPair.isBalance) {
			mp.isBalance=true;
		}else
			mp.isBalance=false;
		return mp;
	}
	public Boolean isSimilar(BinaryTree secTree) {
		return this.isSimilar(this.root,secTree.root);
	}
	private Boolean isSimilar(Node node1,Node node2) {
		if(node1==null&&node2==null) {
			return true;
		}
		else if(node1==null&&node2!=null||node2==null&&node1!=null){
			return false;
		}
		else {
			if(!isSimilar(node1.left,node2.left))
				return false;
			if(!isSimilar(node1.right,node2.right))
				return false;
			return true;
		}
	}
	public static void main(String[] args) {
		// 1 true 2 true 4 true 8 false false false true 5 false false true 3 false false
		// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
		// 1 true 2 true 3 false false true 4 false false true 5 true 6 true 7 false false false false
		BinaryTree tree= new BinaryTree();
		tree.display();
		//System.out.println(tree.isBalanced());
		BinaryTree tree2= new BinaryTree();
		tree2.display();
		System.out.println(tree.isSimilar(tree2));
	}

}
