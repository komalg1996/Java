package tree;

public class Main {

	public static void main(String[] args) {
		BST b=new BST();
		b.insert(50);
		b.insert(30);
		b.insert(20);
		b.insert(10);
		b.insert(25);
		b.preOrder(b.getRoot());
		System.out.println();
		b.inOrder(b.getRoot());
	}

}
