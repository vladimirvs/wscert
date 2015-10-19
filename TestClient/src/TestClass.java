import javax.management.MXBean;

public class TestClass {

	
	public static void main(String[] args) {
		while (true) {
			
			Runnable t = new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("hello " + this.toString());
				}
			};
			t.run();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	protected void finalize() throws Throwable {
		System.out.println("Finally doing this");
	}
}
