class ParentClass {
	private String name="abir";
	private int roll;
	public ParentClass(){System.out.println("Parent class constructor");}
	String song = "home";
}

class child extends ParentClass{
	public child(){System.out.println("Child class constructor");}

	/*
	public child(){
		name = "joy";
		System.out.println(name);
	}
	*/
}

class SuperExample{
	public static void main(String[] args){
	child c = new child();
	c.song = "coming home";
	System.out.println(c.song);
	
	}
	
}