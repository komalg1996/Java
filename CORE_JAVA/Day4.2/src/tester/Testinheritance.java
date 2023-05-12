package tester;

//constructor invocation in inheritance
import inheritance.Faculty;
import inheritance.Student;

public class Testinheritance {

	public static void main(String[] args) {
		// create student object
		Student s1 = new Student("Komal", "G", 2023, "dac", 10000, 78);
		// java.lang.Object's Method : public String toString()
		// System.out.println(s1.toString()); //@2d363fb3
		System.out.println(s1); // internally calls s1.toString WHY????
		// 3String objs n 1 student obj created
		Faculty f1 = new Faculty("Madhura", "A", 10, "java");
		System.out.println(f1.toString()); // @5aaa6d82

	}

}
