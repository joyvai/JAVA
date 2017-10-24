class A{
	public A(){System.out.println("constructor of class A");}
	public void methodA(){
		System.out.println("Hi, I am a method A");
	}
}

class B extends A {
	public void methodB(){
		System.out.println("Hi, I am a method B");
	}
}

class C extends B {
	void methodC(){System.out.println("Hi, I am a method C");}
}

class HierarchicalInheritanceTest{
	public static void main(String[] args){
		B a = new B();
		C c = new C();
		a.methodA();
		a.methodB();
		c.methodB();
		c.methodC();
	}
}