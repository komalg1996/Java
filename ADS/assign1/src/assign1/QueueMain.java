/*Write a program to implement queue using array. Implement functions for below operations.
Insert element in queue
Remove element from queue.
Print elements of queue.
Check if queue is full
Check if queue is empty.
*/

package assign1;

public class QueueMain {

	public static void main(String[] args) {
		Queue q = new Queue(10);
		q.enqueue(30);
		q.enqueue(45);
		q.enqueue(20);
		q.enqueue(10);
		q.enqueue(25);
		System.out.println(q);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q);
	}

}
