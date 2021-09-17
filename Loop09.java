package javaAssignment;

public class Loop09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Que.9:Write a program to find the prime or not.
	    int num11 = 29;
	    boolean flag = false;
	    for (int j = 2; j <= num11 / 2; ++j) {
	      // condition for nonprime number
	      if (num11 % j == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num11 + " is a prime number.");
	    else
	      System.out.println(num11 + " is not a prime number.");
	}

}
