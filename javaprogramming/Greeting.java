package javaprogramming;

import java.util.Scanner;

public class Greeting {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
		System.out.println("What is your name");
		sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hello " + name + " have a good day!");

	}

}
