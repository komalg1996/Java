package inheritance;

public class Person {
	//tight encapsulation
	private String firstName;
	private String lastName;
	public Person(String firstName, String lastName) {
		super();
		System.out.println("in person constr......");
		this.firstName = firstName;
		this.lastName = lastName;
	}
//	public Person() {
//	
//	}
	public String toString()
	{
		return firstName+" "+lastName;
	}
	
	
}
