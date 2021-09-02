package javaTraining;

public class Strings5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5. Searching in strings using indexOf()
		
		
		//  Search a string for the first occurrence of "planet":
		
			String myStr = "Hello planet earth, you are a great planet.";
			System.out.println(myStr.indexOf("planet"));
			
		//  Find the first occurrence of the letter "e" in a string, starting the search at position 5:	
			
			String myStr1 = "Hello planet earth, you are a great planet.";
		    System.out.println(myStr1.indexOf("e", 5));
	}

}
