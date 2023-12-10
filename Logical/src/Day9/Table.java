package Day9;

public class  Table {
 public synchronized void table(int no) {
	 for(int i = 1; i<=10; i++) {
		 System.out.println(no*i);
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
 }
}
