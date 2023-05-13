package tester;

import inheritance.Faculty;
import inheritance.Person;
//Run time Polymorphism
import inheritance.Student;

public class Test2 {

	public static void main(String[] args) {
	
		Object ref = new Student("Shweta", "Jadhav", 2021, "BAMS", 50000, 80);//indirect ref : upcasting : student is a object
		System.out.println(ref);//decision wether to call object's toString or student's toString compiler canot take as both have same signature so jvm takes this decision at run time
		//JVM will invoke toString : Student

//		p = new Faculty("Madhura", "A", 10, "java");
//		System.out.println(p);//JVM will invoke: toString: Faculty's object
		
		ref = new Faculty("Madhura", "A", 10, "java");//Faculty IS-A Object:yes :upcasting
		System.out.println(ref);
	
	}

}
