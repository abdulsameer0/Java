package Day3;

public class ThreadClass {
      public synchronized void table(int no) {
    	  
		for(int i =1; i<=10; i++) {
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println(no*i);
			
		}
	}
}
