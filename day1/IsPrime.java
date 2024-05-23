package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		boolean flag = true;
         int n = 15;
         for (int i = 2; i <= n-1; i++) {
		
     
		if(n%i==0) {
			System.out.println("not a prime");
			flag =true;
			break;
		}
         }
		if(flag==false) {
			System.out.println("is a prime");
		
	}
	}

}
