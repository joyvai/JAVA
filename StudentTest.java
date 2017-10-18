// StudentTest is a parent class of  Student class 

public class StudentTest{
	public static void main(String[] args){
	// s1 call the default constructor
// s2 call the parameter constructor
		
		Account1 a = new Account1();
		a.showAccount();
		Account1 alamin = new Account1(12212,70000);
		
		Course c = new Course ("python",2);
		Student joy = new Student("Alamin",1,24,"CSE",alamin);
		
		joy.dropCourse(c); // dropCourse method calls the Course class object 
		// c is a Course class object 
		System.out.println("After dropping the course my amount now: ");
		alamin.showAccount();
		//System.out.println (alamin.withdraw());
		//alamin.showAccount();
		
		//Student s1 = new Student();
		//Student s2 = new Student("JOY",1,22,"software engineering");
		//Course c1 = new Course();
		//Course c2 = new Course("Object orianted Programming 1",13500,3);
		//Course python = new Course("Python",13500,3);
		//s1.addCourse(c1);
		//s2.addCourse(python);
		//s2.showCourses();
		//s1.showCourses();
		//c2.display();
//s2 calls the show function
		//s2.show();
	// s2 calls getName() which is a single name output.
		//System.out.println(s2.getName());
		//s2.setAge(20);
		//System.out.println("Your new age is :");
		//System.out.println(s2.getAge());
		//s1.dropCourse(c1);
		//s1.showCourses();
	}
}