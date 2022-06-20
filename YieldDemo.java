
public class YieldDemo implements Runnable{

	
	

	@Override
	public void run() {
		
		System.out.println("Thread running"+Thread.currentThread().isAlive());
	}
	
	public static void main(String[] args) {
		
		
		new Thread(new YieldDemo()).start();
		
		
		Thread.yield();
	
	
		System.out.println(new Thread(new YieldDemo()).isAlive());
	}
}
