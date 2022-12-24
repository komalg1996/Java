package assign1;
import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack();
		Queue q=new Queue();
		//push all elements in stack
		for(int i=0;i<s.size();i++) {
			s.push(i);
		}
		// make stack and display function
		System.out.println();
		//pop all elements and store in queue
		for(int i=0;i<s.size();i++) {
			q.enqueue(s.pop());
		}
		//push all elements in stack again (reverse order)
		for(int i=0;i<s.size();i++) {
			s.push(q.dequeue());
		//print elements of stack
			for(int i=0;i<s.size();i++) {
				System.out.println(s.pop()+"");
			}
		}
	}

}
