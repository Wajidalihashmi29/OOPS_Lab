
public class Q2 {
	public static void main(String args[]){
		try{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e+":"+"a number Cannot be devided by zero");
		}
	}
}
