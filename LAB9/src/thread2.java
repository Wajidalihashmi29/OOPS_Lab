class even extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				System.out.println(i+" : Even");
			}
		}
	}
	
}
class odd extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			if(i%2!=0) {
				System.out.println(i+" : Odd");
			}
		}
	}
}
public class thread2{
	public static void main (String[] args) {
		even e = new even();
		odd o = new odd();
		e.start();
		o.start();
	}
}