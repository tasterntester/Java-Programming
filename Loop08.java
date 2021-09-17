package javaAssignment;

import java.util.Scanner;

public class Loop08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Que.8:Write a program to find Armstrong number or not
	    int num12;
	  Scanner in1=new Scanner(System.in);
	  System.out.println("Enter num:");
	  num12=in1.nextInt();

	  int a1=num12;
	  int check=0;
	  int remainder;

	  while(num12 > 0){
	  remainder=num12 % 10;
	  check=check + (int)Math.pow(remainder,3);
	  num12=num12 / 10;
	  }

	  if(check==a1)
	  System.out.println(a1+" is an Armstrong Number");
	  else
	  System.out.println(a1+" is not an Armstrong Number");
	}

}
