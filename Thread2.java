
public class Thread2 {

	public static void main(String[] args) {
		RunnableTarget rt=new RunnableTarget();
		Thread t=new Thread(rt);
		t.start();
	}
	
	static class RunnableTarget implements Runnable{

		@Override
		public void run() {
			System.out.println("runningthread");
			
		}
		
	}
}
