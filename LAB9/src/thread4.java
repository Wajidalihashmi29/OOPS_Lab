public class thread4 extends Thread {
	public static void main(String[] args) throws InterruptedException{
		Thread T1 = new Thread();
		Thread T2 = new Thread();
		Thread T3 = new Thread();
		Thread T4 = new Thread();
		Thread T5 = new Thread();
		T1.setPriority(6);
		T2.setPriority(1);
		T3.setPriority(9);
		T4.setPriority(10);
		T5.setPriority(4);
		T1.sleep(200);
		if(T1.isAlive()) {
			System.out.println("T1 is Alive");
		}
		else {
			System.out.println("T1 is not Alive");
		}
		T2.start();
		if(T2.isAlive()) {
			System.out.println("T2 is Alive");
		}
		else {
			System.out.println("T2 is not Alive");
		}
		T3.sleep(1500);
		if(T3.isAlive()) {
			System.out.println("T3 is Alive");
		}
		else {
			System.out.println("T3 is not Alive");
		}
		T4.start();
		if(T4.isAlive()) {
			System.out.println("T4 is Alive");
		}
		else {
			System.out.println("T4 is not Alive");
		}
		T5.start();
		if(T5.isAlive()) {
			System.out.println("T5 is Alive");
		}
		else {
			System.out.println("T5 is not Alive");
		}		
	}
}
