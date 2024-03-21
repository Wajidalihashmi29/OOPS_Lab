public class thread3 {
	static Thread[] thread3 = new Thread[10];
	public static void main(String[] args) {
		try {
			data d = new data();
			for(int i=0;i<10;i++) {
				thread3[i] = new Thread(d);
				thread3[i].start();
				Thread.sleep(100);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
class data implements Runnable{
	int count = 0;
	data d = this;
	Thread t;
	public void run() {
		d=sys.increment(d);
		System.out.println(d.count);
	}
}
class sys{
	synchronized static data increment(data i) {
		i.count++;
		return(i);
	}
}