package qn10to15;

public class CircularQ {
	private int[] arr;
	private int front = -1, rear = -1;
	private int count = 0;

	public CircularQ(int size) {
		arr = new int[size];
	}

	public CircularQ() {
		arr = new int[10];
	}

	// Enter value into circular Queue
	public void enqueue(int data) {
		if (!isFull()) {
			rear = (++rear) % arr.length;
			arr[rear] = data;
			if (front == -1)
				front = 0;
			count++;

		} else {
			System.out.println("Queue is Full");
		}
	}

	// Delete Element from Queue
	public int dequeue() {
		if (!isEmpty()) {
			int temp = arr[front];
			front = (++front) % arr.length;
			count--;
			return temp;
		} else
			System.out.println("Queue is Empty");
		return -1;
	}

	private boolean isEmpty() {
		if (count == 0)
			return true;
		return false;
	}

	private boolean isFull() {
		if (count == arr.length)
			return true;
		return false;
	}
}