class ThisExample{
	void m(){System.out.println("Hello m");}
	void n(){
		System.out.println("hello n");
		this.m();
	}
	public static void main(String[] args){
		ThisExample a = new ThisExample();
		a.n();
	}
}

