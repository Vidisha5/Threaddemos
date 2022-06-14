
public class MyThread extends Thread{

	
	
	public MyThread() {
		System.out.println("inconstructor");
	}
	
	@Override
	public void run() {
		System.out.println("threadrunnning");
	}
	
	//another version
	public void run(String name1) {
		System.out.println("different version"+name1);
		
	}
	
	public static void main(String[] args) {
		MyThread thread=new MyThread() {
			@Override
			public void run() {
				System.out.println("running");
			}
		};
		thread.start();
	}
}
