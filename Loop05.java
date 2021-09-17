package javaAssignment;

import java.util.Scanner;

public class Loop05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Que.5:Write a program to print largest number among three numbers
				int a, b, c;

				Scanner in=new Scanner (System.in);

				System.out.println("Enter a:"); 
				
				a= in.nextInt ();

				System.out.println("Enter b:");

				b=in.nextInt ();

				System.out.println("Enter c:");

				c=in.nextInt ();

				if(a > b && a > c) {

				System.out.println("a is big number");

				} else if(b> a && b > c) {

				System.out.println("b is big number");

				} else

				System.out.println("c is big number");
	}

}
