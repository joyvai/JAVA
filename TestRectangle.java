import java.util.Scanner;

class Rectangle{
	int length,width;
	
	void calculateArea(int l,int w){
		length=l;
		width=w;
		
	}
	void result(){System.out.println(length * width);}
	
}

public class TestRectangle{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle();
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		r1.calculateArea(a,b);
		r1.result();
		
	}
}