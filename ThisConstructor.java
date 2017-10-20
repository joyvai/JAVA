// this(): to call current class constructor

class ThisConstructor{
	ThisConstructor(){System.out.println("hello a");}
	ThisConstructor(int x){
		this(); // this() calls the default constructor
		System.out.println(x);
	}
	public static void main(String[] args){
		ThisConstructor t = new ThisConstructor(10);
		
	}
}