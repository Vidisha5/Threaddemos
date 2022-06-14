
public class Messager implements Runnable {

	
	private String name;

	public Messager(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		//Method being called from run()
		message(1); message(2);
		
	}

	private synchronized void message(int i) {
		System.out.println(name+i);
		
	}
	
	
	public static void main(String[] args) {
		new Thread(new Messager("Wallace")).start();
		new Thread(new Messager("Gromit")).start();
	}
	
}
