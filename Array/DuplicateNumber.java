package Array;

public class DuplicateNumber {

	public static void main(String[] args) {
		
	 int[] numArray = {2, 3, 7, 3, 2, 17};
	 int count=0;
	 for(int i = 0; i < numArray.length; i++){
	 for(int j = i + 1; j < numArray.length; j++){
	  if(numArray[i] == numArray[j]){
	    System.out.println("Duplicate element found " + numArray[j]);
	        count++;
	          }
	          }
	          }
	            System.out.println("Count of Duplicate Numbers are:"+count);
	          }
	        }


