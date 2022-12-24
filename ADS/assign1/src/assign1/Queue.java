package assign1;

import java.util.Arrays;

public class Queue {
	private int arr[];
	private int front=-1,rear=-1;
	private int size=10;
	
	public Queue() {
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	
	public Queue(int size) {
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isfull() {
		if(rear==arr.length-1)
		return true;
		return false;	
	}
	
	public boolean isempty() {
		if(front==-1 || front>rear)
			return true;
		return false;
	}
	
	public boolean enqueue(int data) {
		if(!isfull()) {
			arr[++rear]=data;
			if(front==-1) {
				front=0;
			}
			return true;
		}
		return false;
		
	}
	public int dequeue() {
		if(!isempty()) {
			return arr[front++];
		}
		return -1;
		
	}

	@Override
	public String toString() {
		return "Queue [arr=" + Arrays.toString(arr) + "]";
	}
	 
}
