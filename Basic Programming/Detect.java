package javaprogramming;

import java.util.Scanner;

public class Detect {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to detect whether a number entered by the user is an integer or not.
		System.out.println("Enter your number");
        sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
	}

}
