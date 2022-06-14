
public class Thread1 extends Thread{

	
	public static void main(String[] args) {
		Thread1 thread1=new Thread1();
		/*Thread threadobject=new Thread(thread1);
		threadobject.start();*/
		thread1.start();
		
	}
	
	public void run() {
		System.out.println("running");
	}
}
