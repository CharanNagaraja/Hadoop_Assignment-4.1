package acadsumoftwo;

public class array {

	public static void main(String[] args) {
		
		int[] intArray = {5,6,2,7,8,9,65,67,54,27,99} ;  // integer array with values in an unsorted order
		
		
		int high = 0; // this variable will to used to compare the numbers present integer array 
		int temp;  
	
		while(high < intArray.length ){  // to compare from element at 0 till  last element
		for(int sortValue = 0 ; sortValue < intArray.length ; sortValue++ ){ // Iterate through the elements in array 
				
		if(intArray[high] > intArray[sortValue]){// If number at 0 position is greater than the elements in the array , swap them
			temp = intArray[sortValue];
			intArray[sortValue] = intArray[high];
			intArray[high]= temp;
		}
						
		}
		high++; //incremeting the index position to be considered for comparing
	}
		
		//Printing the values present in the array
		for(int value : intArray){
			System.out.println(value);
		}
		
		}

	}
