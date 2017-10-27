interface Drawable {
	void draw();
}
// Implementation
class Rectangle implements Drawable{
	public void draw(){System.out.println("drawing Rectangle");}
}

class Circle implements Drawable{
	public void draw(){System.out.println("drawing circle");}
}

class TestInterface1{
	public static void main(String[] args){
		Drawable d = new Circle();
		d.draw();
	}
}