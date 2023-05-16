package inheritance;

public class Student extends Person{
	private int gradYear;
	private String courseName;
	private double fees;
	private int marks;
	
	public Student(String fn, String ln,int gradYear,String courseName,double fees,int marks)
	{
		super(fn,ln);//programmer must call explicitly the matching super class cotr
		System.out.println("in student constr.....");
		//sub class specific init
		this.gradYear=gradYear;
		this.courseName=courseName;
		this.fees=fees;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student "+super.toString()+" year of passing "+gradYear+" course "+courseName+" fees "+fees+" marks"+marks;
	}

	//aditional behaviour
	public void study() {
		//display fn of student  studying in this course
		System.out.println(getFirstName()+" Studying in course "+courseName);
		
	}
	
	
}
