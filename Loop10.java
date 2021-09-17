package javaAssignment;

import java.util.Scanner;

public class Loop10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Que.10:Write a program to palindrome or not.
	    int num13;
	  Scanner in2=new Scanner(System.in);
	  System.out.println("Enter num:");
	  num13=in2.nextInt();

	  int a2=num13;
	  int reverse=0;
	  int remainder1;

	  while(num13 > 0){
	  remainder1=num13 % 10;
	  reverse=reverse * 10 + remainder1;
	  num13=num13 / 10;
	  }

	  if(reverse==a2)
	  System.out.println(a2+" is a Palindrome Number");
	  else
	  System.out.println(a2+" is not a Palindrome Number");
	}

}
