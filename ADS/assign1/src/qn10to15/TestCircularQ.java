package qn10to15;
//10.	Implement circular queue using array 
public class TestCircularQ {

	public static void main(String[] args) {
		CircularQ q=new CircularQ();
		q.enqueue(70);
		q.enqueue(20);
		q.enqueue(40);
		q.enqueue(60);
		q.enqueue(50);
		q.enqueue(65);
		q.enqueue(38);
		q.enqueue(90);
		q.enqueue(29);
		q.enqueue(68);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

	}

}
