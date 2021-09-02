package operators;

import java.util.Scanner;

public class Operator07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Que.7:Print the smaller and larger number
	    
	    int o, p, q;
	      System.out.println("Enter three integers ");
	    Scanner sc = new Scanner(System.in);
	 
	      o = sc.nextInt();
	      p = sc.nextInt();
	      q = sc.nextInt();
	 
	      if ( o > p && o > q )
	         System.out.println("First number is largest.");
	      else if ( p > o && p > q )
	         System.out.println("Second number is largest.");
	      else if ( q > o && q > p )
	         System.out.println("Third number is largest.");
	      else   
	         System.out.println("Entered numbers are not distinct.");
	}

}
