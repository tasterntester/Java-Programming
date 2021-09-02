package collection;

import java.util.ArrayList;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to
		ArrayList and perform the below operations
		Add an element to the ArrayList
		Iterate through the ArrayList by using Iterator object
		Add an element at a specific index
		Remove an element from the ArrayList, Remove at an index
		Update the element at a specific index
		Check the element is present at a particular index
		Get an element at a particular index
		Find out the size of the ArrayList
		Check the given element is present in the ArrayList
		Remove all elements of the ArrayList*/
				
				 ArrayList<String> alist=new ArrayList<String>();  
			      alist.add("Steve");
			      alist.add("Tim");
			      alist.add("Lucy");
			      alist.add("Pat");
			      alist.add("Angela");
			      alist.add("Tom");
			      alist.add("bob");
			      alist.add("kevin");
			      alist.add("harry");
			      alist.add("kat");
			    //displaying elements
			      System.out.println(alist);
			      //iterating ArrayList
			      for(String str:alist)  
			         System.out.println(str); 
			    //Adding "Steve" at the fourth position
			      alist.add(3, "Steve");
			      
			    //Removing "Steve" and "Angela"
			      alist.remove("Steve");
			      alist.remove("Angela");

			      //displaying elements
			      System.out.println(alist);
			      
			    //Updating 1st element
			      alist.set(0, "Robin");
			      System.out.println("ArrayList after Update: "+alist);
			      
			      //Check the element
			      System.out.println("The bob is available in ArrayList? " + alist.contains("bob"));
			      System.out.println("ArrayList contains the string 'Rehan': "
		                  +alist.contains("Rehan"));
			      //size of Arraylist
			      System.out.println("Number of elements in ArrayList: "+alist.size());
			      
			      //Remove all 
			      System.out.println("ArrayList before removeAll: "+alist); 
			       alist.removeAll(alist);
			       System.out.println("ArrayList after removeAll: "+alist);
	}

}
