//switch statement

public class SwitchExample{
	public static void main(String[] args){
		int number = 40;
		switch(number){
			case 10: System.out.println("10");break;
			case 20: System.out.println("20");break;
			case 30: System.out.println("30");break;
			default: System.out.println("Not in 10,20 or 30");
		}
		for (int i=0;i < 10; i+=2){
			System.out.println(i);
		}
	}
}