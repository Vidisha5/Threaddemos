
public class Thread3 implements Runnable{

	@Override
	public void run() {
		System.out.println("runningnnn");
		
	}
	
	public static void main(String[] args) {
		new Thread(new Thread3()).start();
	}

	
}
