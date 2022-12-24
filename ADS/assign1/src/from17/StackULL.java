/*Write a program to implement stack using linked list. Implement functions for below operations.
a.	 Push element
b.	Pop element
c.	Peep element
d.	Check if stack is empty*/

package from17;

public class StackULL {
	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node head;

	// push in stack=insert at 1st in ll
	public void push(int data) {
		Node newNode = new Node(data);
		// check if new node is created
		if (newNode == null)
			return;
		// if ll is empty
		if (head == null) {
			head = newNode;
			return;
		}
		// if more than 1 node present in LL
		newNode.next = head;
		head = newNode;
	}

	public void pop() {
		if (head == null) {
			System.out.println("stack empty");
			return;
		}
		// if 1 node only present
		if (head.next == null) {
			head = null;
			return;
		}
		// if more than one node present
		head = head.next;
	}

	public int peek() {
		if (head == null) {
			System.out.println("stack empty");
			return -1;
		} else
			return head.data;

	}

	public boolean isStackEmpty() {
		return head == null;

	}

	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("empty stack");
		}
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}

	}

	public static void main(String[] args) {
		StackULL s = new StackULL();
		System.out.println(s.isStackEmpty());
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		//System.out.println(s.isStackEmpty());
		// s.peek();
		// System.out.println(s.peek()+"");
		// s.display();
	}

}
