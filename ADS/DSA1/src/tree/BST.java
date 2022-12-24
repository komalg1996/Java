package tree;

public class BST {
	public Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	// insert data in BST
	public void insert(int data) {
		Node node = new Node(data);
//		if(node==null) {
//			return false;
//		}
		if (root == null) {
			root = node;
			return;
		}
		// compare data with root data and add to left or right 
		//insert with non recursion
		Node temp = root;
		Node prev = null;
		while (temp != null) {
			prev = temp;
			if (data < temp.getData()) {
				temp = temp.getLeft();
			} else {
				temp = temp.getRight();
			}
		}
		if (data < prev.getData()) {
			prev.setLeft(node);
		} else {
			prev.setRight(node);
		}

	}
	//recursive preorder traversal
	public void preOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.getData()+" ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	//recursive inorder traversal
	public void inOrder(Node root) {
		if(root==null) {
			return;
		}
		inOrder(root.getLeft());
		System.out.print(root.getData()+" ");
		inOrder(root.getRight());
	}
	//recursive postorder traversal
	
	
}
