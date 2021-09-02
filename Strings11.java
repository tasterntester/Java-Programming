package javaTraining;

public class Strings11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//11. Splitting strings with split()
	      String s11e="java string split method by javaeclipse";  
	      String[] words=s11e.split("\\s");//splits the string based on whitespace 
	      
	      //using java for each loop to print elements of string array  
	      
	      for(String w:words){  
	      System.out.println(w);  
	      }  
	}

}
