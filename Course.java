public class Course{
	private String courseName;
	private double courseFee;
	private int courseCredit;

	public Course(){
		this ("Java",110000,2);
		System.out.println("Right now there is no subject");
	}
	public Course(String subjectName, double subjectFee, int credit){
		courseName = subjectName;
		courseFee = subjectFee;
		courseCredit=credit;
	}
	
	public void setCourse(String subject){
		courseName = subject;
	}
	public void setCourseFee(double money){
		courseFee = money;
	}
	public void courseCredit(int credit) { courseCredit=credit; }
	
	public String getCourseName(){
		return courseName;
	}
	public double getCourseFee(){
		return courseFee;
	}
	public int getCourseCredit(){
		return courseCredit;
	}
	
	public void display(){
		System.out.println("Your course name:"+ courseName);
		System.out.println("Your course fee:"+ courseFee);
		System.out.println("Your course credit:"+ courseCredit);
	}
}

