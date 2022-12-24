package gfg;

public class MiddleInLL {

	class Node {
		public int[] arr;
		public Node head;
		public Node next;
		public int data;
		public int count;

		public Node(int size) {
			arr = new int[size];

		}

		int getMiddle(Node head) {
			Node node = new Node(10);
			Node temp = head;
			while (temp != null) {
				for (int i = 0; i < arr.length; i++) {
					count++;
				}
				count = count / 2;
				System.out.println(arr[count] + " ");
			}

			return -1;

		}
		public static void main(String[] args) {
			MiddleInLL m= =new MiddleInLL();
			m.getMiddle();
		}

	}
}