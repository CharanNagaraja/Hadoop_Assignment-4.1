package acadsumoftwo;

public class overloadsamereturn {

	public static void main(String[] args) {
		System.out.println(sum(10,40)); //Calling sum method to add two values
		System.out.println(sum("Charan " , "Nagaraja") ); //Calling sum method to concatenate  two strings
		 
	}

	
	//sum method to concatenate two strings
	private static String sum(String string, String string2) {
		
		return string + string2;
	}

	//orveloading sum method to add two integers 
	private static int sum(int value1, int value2) {
	
		return value1+value2;
	}
}