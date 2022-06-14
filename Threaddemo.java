
public class Threaddemo extends Thread {

	public static void main(String[] args) {
		Threaddemo td=new Threaddemo();
		System.out.println(td.isAlive());
		td.start();
		//td.start();IllegalThreadStateException cannot invoke start() once the thread hsa started
		System.out.println(td.isAlive());
	}
	
	public void run() {
		System.out.println("running");
	}
}
