
public class Threaddemo1 {

    static Thread laurel,hardy;
	
	
	
	
	public static void main(String[] args) {
		laurel=new Thread() {
			public void run() {
				System.out.println("laurel running");
				try {
					hardy.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("laurel wokeup");
			}
		};
		
		
		hardy=new Thread() {
			public void run() {
				System.out.println("running2");
				
				synchronized(hardy) {
					try {
						hardy.wait();//its frozen at this line
					} catch (InterruptedException e) {
						System.out.println("exception");
					}
				}
				System.out.println("hardy woke up");
			}
		};
		
		laurel.start();
		hardy.start();
	}
	
	
}
