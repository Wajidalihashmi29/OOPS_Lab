public class thread1 extends Thread{
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("Running");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		thread1 t = new thread1();
		t.start();
	}
}

