public class Thursday{
	private String courseName1;
	private String courseName2;
	private String courseName3;
	
	private String CourseTeacher1;
	private String CourseTeacher2;
	private String CourseTeacher3;
	private char courseSec1;
	private char courseSec2;
	private char courseSec3;
	
	public void SetCourseTeacherName(String cName1,String cName2, String cName3){
		CourseTeacher1=cName1;
		CourseTeacher2=cName2;
		CourseTeacher3=cName3;
	}
	public void setCourseName(String cn1,String cn2, String cn3){
		courseName1 = cn1;
		courseName2 = cn2;
		courseName3 = cn3;
	}
	public void setCourseSection(char cS1,char cS2, char cS3){
		courseSec1 = cS1;
		courseSec2 = cS2;
		courseSec3 = cS3;
	}
	public String getCourseName(){
		System.out.printf("Your Course name: ");
		return  courseName1;
		//return courseName2;
		//return courseName3;
		//System.out.printf("Your Second Course name: ");
	 
		//	System.out.printf("Your Third Course name: ");
		
	}
	
	public void ShowInformation(){
		System.out.printf("Your Second course name: "+courseName2+"\n");
		System.out.printf("Your Third course name: "+courseName3);
		
		//System.out.printf();
		//System.out.printf();
		//System.out.printf();
	}
	
	
}