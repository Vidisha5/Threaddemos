
public class Threadexample {

	
	public static void main(String[] args) {
		System.out.println("running"+Thread.currentThread().getName()+"priority"+Thread.currentThread().getPriority());
		RunnableExample runnableExample=new RunnableExample();
		Thread t=new Thread(runnableExample);
		Thread t1=new Thread(runnableExample);
		Thread t2=new Thread(runnableExample);
		t.setName("t");
		t.start();
		t1.setName("t1");
		t1.start();
		t2.setName("t2");
		t2.start();
	}
}
class RunnableExample implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<4;i++) {
			System.out.println("running"+Thread.currentThread().getName()+"priority"+Thread.currentThread().getPriority());//threads have the same priority as that of the main thread unless explicitly specified because it is being invoked from main thread
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
			
		
	   
	}
	
}
