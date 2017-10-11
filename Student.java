public class Student{
	private int  stdId;
	private String stdName;
	private String stdDept;
	private int stdAge;
	static int courseLimit=10; // fixed maintime i change the value
	int courseCounter=0;
	Course course[]; // class type array
	//withour parameter
	public Student(){
		this("Lotif",122,11,"computer science");
		//System.out.println("Empty Constructor");
		
	}
	// constructor with parameter 
	public Student(String name, int id, int Age,String dept){
		stdName = name;
		stdId = id;
		stdAge = Age;
		stdDept = dept;
		course = new Course[10]; // i create space for array to hold the memory address
		//courseCounter = 0;

	}
	// Add courses method 
	public void addCourse(Course temp){
		if (courseCounter < courseLimit){
		course[courseCounter] =temp;// save course in array
		courseCounter++;
		System.out.println("Course Added: ");
	}
	}
	// set the student name
	public void setName(String name){
		stdName = name;
	}
	// return the string name
	public String getName(){
		return stdName;
	}
	public void setAge(int age){
		stdAge = age;
	}
	public int getAge(){
		return stdAge;
}
	// it's a show function
	public void show(){
		System.out.println("Your student Id: "+stdId);
		System.out.println("Student name: "+stdName);
		System.out.println("your age: "+stdAge);

	}
// drop method
	public void dropCourse(Course temp){
		int courseFoundFlag=0; // False
		for (int i=0; i<courseCounter;i++){
			if (temp.getCourseName() == course[i].getCourseName()){
				courseFoundFlag = 1; // True
				courseCounter--; // if subject found then it decrease from the array 
			}
			// if it's true then drop the course
			if (courseFoundFlag==1){ course[i] = course[i+1]; }
		}
		if (courseFoundFlag==1){
			System.out.println("dropped");
		}
	}
	public void showCourses(){
		for (int i=0; i<courseCounter;i++){
			System.out.println(course[i].getCourseName());
		}
	}
	
}