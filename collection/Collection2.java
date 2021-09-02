package collection;

import java.util.HashMap;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     
		   /*Create a HashMap with at least 10 key value pairs of the Student ID and Name
	Insert a Key value mapping into the map
	Fetch the value of a Key
	Create a clone/copy of HashMap
	Check if the given Key is in the Map
	Check if the value is in the Map
	Check if the map is empty
	Print the size of the Map to the console
	Print all the Keys of the map to the console
	Print all the Keys of the map to the console
	Remove a specific Key-value pair
	Copy all the elements of the Map to another Map*/    
		       
		       HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		       /*Adding elements to HashMap*/
		       hmap.put(1, "Chaitanya");
		       hmap.put(2, "Rahul");
		       hmap.put(3, "Singh");
		       hmap.put(4, "Ajeet");
		       hmap.put(5, "Anuj");
		       hmap.put(6, "Raj");
		       hmap.put(7, "Mimi");
		       hmap.put(8, "Shama");
		       hmap.put(9, "Bhanu");
		       hmap.put(10, "Nitu");
		       
		     // Displaying the new map
		        System.out.println("New map is: " + hmap);
		        
		        // Getting values from HashMap
		       String val=hmap.get(4);
		       System.out.println("The Value mapped to Key 4 is:"+ val);
		       // using clone() method
		        System.out.println("The cloned map look like this: "
		                           + hmap.clone());
		     // Checking for the key_element '5'
		        System.out.println("Is the key 5 present? " + 
		        hmap.containsKey(5));
		     // Checking for the Value 'Rahul'
		        System.out.println("Is the value Rahul present? " + 
		        hmap.containsValue("Rahul"));
		       
	}

}
