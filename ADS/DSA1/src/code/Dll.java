package code;

public class Dll {
	Node head;

	// insert 1st
	public void insertFirst(int val) {
		Node newnode = new Node(val);
		newnode.prev = null;
		if (head == null) {
			head = newnode;
		}

		// more than 1 node in dll
		else {
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		}
	}

	// insert last
	public void insertLast(int value) {
		Node newnode = new Node(value);
		Node last = head;
		// check if head is null
		if (head == null) {
			head = newnode;
		} else {
			while (last.next != null) {
				last = last.next;
			}
			last.next = newnode;
			newnode.prev = last;
			newnode.next = null;
		}

	}

	// insert at index
	public void insertAtIndex(int value, int Index) {
		Node newNode=new Node(value);
		int size=0;
		Node count=head;
		while(count.next!=null) {
			size++;
			count=count.next;
		}
		size++;
		if(head==null) {
			head= newNode;
		}
		else {
			if(Index==1) {
				insertFirst(value);
			}
		else if(Index==size){
			insertLast(value);
			
		}
		else {
			Node temp=head;
			for(int i=1;i<Index;i++) {
				temp=temp.next;
			}
			newNode.prev=temp;
			newNode.next=temp.next;
			newNode.next.prev=newNode;
			temp.next=newNode;
		}
			
				
		}
		
		
		
	}

	// display Dll
	public void display() {
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.value);
	}

	private class Node {
		private int value;
		private Node next;
		private Node prev;

		public Node(int value) {

			this.value = value;

		}

	}
}
