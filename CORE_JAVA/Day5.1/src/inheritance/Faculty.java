package inheritance;

public class Faculty extends Person {
	//fn,ln,exp,sme
	private int expInYears;
	private String sme;
	public Faculty(String firstName, String lastName, int expInYears, String sme) {
		super(firstName, lastName);
		System.out.println("in faculty constr");
		this.expInYears = expInYears;
		this.sme = sme;
	}
	public String toString() {
		return "Faculty "+super.toString()+" exp "+expInYears+" sme "+sme;
	}
	//add new behaviour : teach
	public void teach() {
		//lastname : teaching in sme
		System.out.println(getLastName()+"Teaching in "+sme);
	}
	
}
