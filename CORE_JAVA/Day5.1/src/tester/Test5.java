package tester;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test5 {

	public static void main(String[] args) {
		Person ref = new Student("Shweta", "Jadhav", 2021, "BAMS", 50000, 80);//indirect ref : upcasting : student is a object
		System.out.println(ref);//JVM will invoke toString:Student :Dynamic method dispatch
		//JVM will invoke toString : Student


//		
//		ref = new Faculty("Madhura", "A", 10, "java");//Faculty IS-A Object:yes :upcasting
//		System.out.println(ref);
	
		
		//ref.study();//javac checks by type of ref
		//so adding explicit type casting
		((Student)ref).study();//javac checks by type of ref : why explicit type casting is required?
		//down casting :Is NOT implicit conversion, programmer has to do it.
		
		ref = new Faculty("Madhura", "A", 10, "java");//Faculty IS-A Object:yes :upcasting
		System.out.println(ref);//it prints faculty;s details
		
		//ref.teach();//javac checks if teach() exists in person : no -- so javac err
		//how to tell compiler that its not person but a faculty--- by down casting
		
		((Faculty)ref).teach();// now does teach exists in faculty : yes -- no javac err
	
	}

}
