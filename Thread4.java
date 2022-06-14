
public class Thread4 {

	
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("threadrunning");
				
			}
			
		}).start();
	}
}
