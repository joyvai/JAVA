// this is a default class
class Student8{
	int rollno;
	String name;
	static String college = "ITS";
	static int count = 0;
	// constructor
	// so this counter increment the number everytime if any object created
	// only one time it's loads in the memory
	static void change(){
		college="aiub";

	}
	Student8(){
		count++;
		System.out.println(count);
	}
	Student8(int r, String n){
		rollno = r;
		name = n;
	}
	void display (){System.out.println(rollno+" "+name+" "+college);}
	// we don't send arguments college because is static
	// you can't change
	public static void main(String[] args){
		Student8.change();
		Student8 s1 = new Student8(111,"Karan");
		Student8 s2 = new Student8(222, "Aryan");
		s1.display();
		s2.display();
		Student8 s3 = new Student8();
		Student8 s4 = new Student8();
	}
}