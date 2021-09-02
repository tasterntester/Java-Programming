package operators;

public class Operator05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Que.5:Programs on Logical AND,OR operator and Logical NOT
	    int l = 5;
	    System.out.println(l > 3 && l < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
	    
	    System.out.println(l > 3 || l < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
	    
	    System.out.println(!(l > 3 && l < 10)); // returns false because ! (not) is used to reverse the result
	}

}
