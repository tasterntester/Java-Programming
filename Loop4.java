package javaAssignment;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Que.4:Write a program to print the odd and even numbers
	    Scanner sc=new Scanner (System.in); 
	    int num1;

	    System.out.print("Enter a number: ");

	    num1=sc.nextInt ();

	    if (num1%2==0) {

	    System.out.println(num1 +" is an EVEN number.");

	    }

	    else{

	    System.out.println(num1 +" is an ODD number.");

	    }
	}

}
