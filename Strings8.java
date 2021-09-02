package javaTraining;

public class Strings8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
		
	      //1
	      String s11="java";  
	      String s22="java";  
	      String s33="JAVA";  
	      String s44="python";  
	      System.out.println(s11.equalsIgnoreCase(s22));//true because content and case both are same  
	      System.out.println(s11.equalsIgnoreCase(s33));//true because case is ignored  
	      System.out.println(s11.equalsIgnoreCase(s44));//false because content is not same  
	      
	      
	      //2
	      String s11a="java string split method by javatpoint";  
	      System.out.println(s11a.startsWith("ja"));  
	      System.out.println(s11a.startsWith("java string")); 
	      
	      
	      //3
	      String s11b="java by javatpoint";  
	      System.out.println(s11b.endsWith("t"));  
	      System.out.println(s11b.endsWith("point")); 
	      
	      
	      //4
	      String s111="hello";  
	      String s222="hello";  
	      String s333="meklo";  
	      String s444="hemlo";  
	      String s555="flag";  
	      System.out.println(s111.compareTo(s222));//0 because both are equal  
	      System.out.println(s111.compareTo(s333));//-5 because "h" is 5 times lower than "m"  
	      System.out.println(s111.compareTo(s444));//-1 because "l" is 1 times lower than "m"  
	      System.out.println(s111.compareTo(s555));//2 because "h" is 2 times greater than "f"  
	}

}
