package inheritance;

public class Student extends Person{
	private int geadYear;
	private String courseName;
	private double fees;
	private int marks;
	
	public Student(String fn, String ln,int gradYear,String courseName,double fee,int marks)
	{
		super(fn,ln);//programmer must call explicitly the matching super class cotr
		System.out.println("in student constr.....");
		//sub class specific init
		this.geadYear=geadYear;
		this.courseName=courseName;
		this.fees=fees;
		this.marks=marks;
	}
	public String toString() {
		return "Student "+super.toString()+" year of passing "+geadYear+" course "+courseName+" fees "+fees+" marks"+marks;
	}

	
	
	
}
