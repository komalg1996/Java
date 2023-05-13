package tester;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test4 {

	public static void main(String[] args) {
		Person[] people= {new Student("Shweta", "Jadhav", 2021, "BAMS", 50000, 80),
									new Faculty("Madhura", "A", 10, "java")};//3 objs--> 1 array of refs, student obj created outside & its ref added in the 0st index of the array
																									//Faculty obj created outside & its ref added in the 1st index of the array
																								//people[0]:person-->student obj,people[1]--->faculty
		for(Person p:people)//p=people[0],p=people[1]
			System.out.println(p);
	
	}

}
