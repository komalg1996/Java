package from17;

import java.util.Stack;

public class Bst {
	Node root;

	public class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	// insert data in bst
	public void insert(int data) {
		Node node = new Node(data);
		// check if node is cretaed
		if (node == null)
			return;
		// if node is 1st node or root is null
		if (root == null)
			root = node;
		// temp to traverse tree
		Node temp = root;
		while (true) {
			if (data == temp.data)
				return;
			// check if data is less than root
			if (data < temp.data) {
				if (temp.left == null) {
					temp.left = node;
					return;
				}
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = node;
					return;
				}
				temp = temp.right;
			}

		}

	}

	// inorder recursion
	public void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	// preorder recursion
	public void preorder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	// postorder recursion
	public void postorder(Node root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}

	// inorder without recursion
	public void inorder() {
		Stack<Node> stack = new Stack<>();
		Node temp = root;
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop();
			System.out.print(temp.data + " ");
			temp = temp.right;
		}
	}

	// preorder without recursion
	public void preorder() {
		Stack<Node> stack = new Stack<>();
		Node temp = root;
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				System.out.print(temp.data + " ");
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop().right;
		}
	}
	//postorder without recursion
	public void postorder() {
		
	}

	public Node getRoot() {
		return root;
	}
	
	//find height of tree
	public int height(Node root) {
		if(root==null) {
		return 0;
		}
		return 1+Math.max(height(root.left),height(root.right));
	}
	
	public boolean deleteNode(int data) {
		if(root==null)
			return false;
		//locate del node along with its parent
		Node parent=root,del=root;
		while(del.data!=data) {
			parent=del;
			if(data<del.data) {
				del=del.left;
			}else {
				del=del.right;
			}if(del==null) {
				return false;
			}
		}
		
		while(true) {
			//check if del is terminal node
			if(del.left==null && del.right==null) {
				//if del is root node
				if(del==root) {
					root=null;
				return true;
				}
				//set del parent's l r to null
				if(del==parent.left) {
					parent.left=null;
				}else {
					parent.right=null;
				}
				return true;
			}
			//if del is non terminal node shift it down the tree
			if(del.left!=null) {
				//find max from left sub tree
				Node max=del.left;
				parent=del;
				while(max.right!=null) {
					parent=max;
					max=max.right;
				}
				int temp=del.data;
				del.data=max.data;
				max.data=temp;
				
				del=max;
			}
			else {
				//find min from right sub tree
				Node min=del.right;
				parent=del;
				
				while(min.left!=null) {
					parent=min;
					min=min.left;
				}
				int temp=min.data;
				min.data=del.data;
				del.data=temp;
				
				del=min;
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		Bst b = new Bst();
		b.insert(80);
		b.insert(50);
		b.insert(30);
		b.insert(90);
		b.insert(40);
		b.insert(60);
		b.inorder(b.getRoot());
		System.out.println();
		b.inorder();
		System.out.println();
		b.preorder();
		System.out.println();
		b.preorder(b.getRoot());
		System.out.println();
		b.postorder(b.getRoot());
		System.out.println();
		System.out.println(b.height(b.getRoot()));
		//b.postorder();
		//b.deleteNode(50);
		//b.preorder();
	}

	

}
