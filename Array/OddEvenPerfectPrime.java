package Array;

import java.util.Arrays;

public class OddEvenPerfectPrime {

	public static void main(String[] args) {
		
		int[] nu = {8, 6, 2, 7, 11};
		int even = 0, odd = 0, perfect = 0, prime = 0;
		
		    
	    for(int i = 0; i < nu.length; i++) {
	        if(nu[i] % 2 == 0)
			{         
	          even++;
			}
			else
			   odd++;	
	    } 
	    
	    
	    System.out.println("number of even element:"+even);
	    System.out.println("number of odd element:"+odd);
	    
	    
	    for(int j=2;j<=nu.length-1;j++)
	    {
	    	if(nu[j]%2!=0) 
	    	{
	    	prime++;	
	    }
	    }
	   
	   System.out.println("number of prime element:"+prime);
		
	       }
	
	
	}
