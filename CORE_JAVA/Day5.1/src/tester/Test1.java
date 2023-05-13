package tester;

import inheritance.Faculty;
import inheritance.Person;
//Run time Polymorphism
import inheritance.Student;

public class Test1 {

	public static void main(String[] args) {
		// super class ref,super class obj. sub class ref, sub class obj
		// sub class ref--->sub class obj ()
		Student s1 = new Student("Shweta", "Jadhav", 2021, "BAMS", 50000, 80);
		System.out.println(s1);// JAVAC checks if toString exists in student class:YES complies Ok
		// JVM : late binding ---> toString---> will be called on student object.

		Person p;// p:super class ref
		p = s1; // upcasting Student --->Person : done implicitly by javac
		System.out.println(p);// javac checks if toString exixts in Person class
		// in run time (JVM) : JVM will invoke toString : of student : i.e will pick
		// @runtime : overrinding form of method

		p = new Faculty("Madhura", "A", 10, "java");
		System.out.println(p);//JVM will invoke: toString: Faculty's object

	
	}

}
