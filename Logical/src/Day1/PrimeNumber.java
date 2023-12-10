package Day1;

public class PrimeNumber {
	public static void main(String[] args) {
        int no = 7;
        int temp = 0;
        for(int i = 2; i<no; i++) {
        	if(no%i==0) {
        		temp=temp+i;
        	}
        }if(temp>0) {
        		System.out.println("this is a not a palindrom");
        	}else {
        		System.out.println("this is a palindrom");
        	}
        		
        
	}
}
