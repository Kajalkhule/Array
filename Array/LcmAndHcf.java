package Array;

public class LcmAndHcf {

	public static void main(String[] args) {
		 int[] arr = {2,3,6,12};
	      int min, max, x, lcm = 0 ,hcf = 0;
	     
	      for(int i = 0; i<arr.length; i++) {
	         for(int j = i+1; j<arr.length-1; j++) {
	            if(arr[i] > arr[j]) {
	               min =arr[j];
	               max = arr[i];
	            } else {
	               min = arr[i];
	               max = arr[j];
	            }
	            for(int k =0; k<arr.length; k++) {
	               x = k * max;
	               if(x % min == 0) {
	                  lcm = x ;
	               }
	            }
	            
	            for(int p=0;p<arr.length;p++){
	            x= p * min;
	            if(x * min==0) {
	            	hcf=x;
	            }
	            	
	            }
	         }
	      }
	      
	      System.out.println("LCM of the given array of numbers : "+lcm);
	      System.out.println("LCM of the given array of numbers : "+hcf);
	      
	   }
	}