package javaprogramming;
//Exercise 1 cbse board percentage calculator
import java.util.Scanner;
class CBSC{
    private static Scanner sc;

	public static void main(String[] args) {
        System.out.println("5 subjects");
        sc = new Scanner(System.in);
        System.out.println("maximum marks 100 in each subject");
        System.out.print("1st subject marks : ");
        int a = sc.nextInt();
        System.out.print("2nd subject marks : ");
        int b = sc.nextInt();
        System.out.print("3rd subject marks : ");
        int c = sc.nextInt();
        System.out.print("4th subject marks : ");
        int d = sc.nextInt();
        System.out.print("5th subject marks : ");
        int e = sc.nextInt();
        int f = a+b+c+d+e;
        int g = f*100/500;
        System.out.println("percentage(%) : ");
        System.out.println(g);
    }
}
