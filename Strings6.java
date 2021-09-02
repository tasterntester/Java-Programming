package javaTraining;

public class Strings6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6. Matching a String Against a Regular Expression With matches()
	    String Str = new String("Welcome to India");

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("(.*)India(.*)"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("India"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("Welcome(.*)"));
	      
	}

}
