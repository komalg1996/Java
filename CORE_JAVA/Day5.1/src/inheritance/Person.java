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
	@Override
	public String toString()
	{
		return firstName+" "+lastName;
	}
	//add a getter for firstname
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
}
