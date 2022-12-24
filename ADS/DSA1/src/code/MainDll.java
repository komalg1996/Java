package code;

public class MainDll {
	public static void main(String[] args) {
		
	Dll d1 = new Dll();
	d1.insertFirst(10);
	d1.insertFirst(20);
	d1.insertFirst(30);
	d1.display();
	d1.insertLast(40);
	d1.insertLast(50);
	d1.display();
	d1.insertAtIndex(100, 5);
	d1.display();
	
}
}