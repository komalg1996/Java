package tester;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test6 {
//fooling the compiler
	public static void main(String[] args) {
		Person ref=new Student("Rama", "Singh", 2020, "cdac", 12345, 78);
		
		((Student)ref).study();
		
		ref=new Faculty("Amit", "Kulkarni", 10, "DotNet");
		((Student)ref).study();
		//type of object is faculty
		//this is fooling compiler
		//u get r.t.err--java.lang.cast class exception: jvm tells u canot cast a faculty to a student
	
	System.out.println("main over");
	}

}
