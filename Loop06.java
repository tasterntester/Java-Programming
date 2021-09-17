package javaAssignment;

public class Loop06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Que.6:Write a program to print even number between 10 and 100 
				int n = 100;
				System.out.print("Even Numbers from 10 to "+n+" are: ");
				for (int i = 10; i <= n; i++) {
				   //if number%2 == 0 it means its an even number
				   if (i % 2 == 0) {
					System.out.print(i + " ");
				   }
				}
	}

}
