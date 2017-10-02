class Student{
	int rollno;
	String name;
	void insertRecord(int r, String n){
		rollno=r;
		name=n;
	}
	void displayInformation(){System.out.println(rollno+" "+name);}
}

class TestStudent2{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student(); 
		s1.insertRecord(111,"Karan");
		s2.insertRecord(222,"Aryan");
		s2.displayInformation();
		s1.displayInformation();
		//s1.id = 101;
		//s1.name = "Sonoo";
		//System.out.println(s1.id+" "+s1.name);// printing members with a white space
	}
}