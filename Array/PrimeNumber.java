package Array;

public class PrimeNumber {

	public static void main(String[] args) {
		int num =15;
	  int  flag =1;
	  
	    for (int i = 2; i <= num / 2; ++i) {
	    // while(i<=num/2)
	     
	   if (num % i == 0) {
	        flag =0;
	        break;
	      }
	    }

	    if (flag==1)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	
	}

