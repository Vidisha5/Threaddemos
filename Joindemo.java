
public class Joindemo {

	
	public static void main(String[] args) {
		Runnabletarget rt=new Runnabletarget();
		Thread t1=new Thread(rt);
		Thread t2=new Thread(rt);
		Thread t3=new Thread(rt);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Threadrunning"+t1.isAlive());
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static class Runnabletarget implements Runnable{

		@Override
		public void run() {
			System.out.println("Threadrunning"+Thread.currentThread().getName());
			
		}
		
	}
}
