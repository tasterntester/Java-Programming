package ThisAndSuper;
//Que1Print the fields/instance members of the current class using this and without using object
//Java code for using 'this' keyword to
//refer current class instance variables
class Que1
{
	int a;
	int b;
	
	// Parameterized constructor
	Que1(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	void display()
	{
		//Displaying value of variables a and b
		System.out.println("a = " + a + " b = " + b);
	}

	public static void main(String[] args)
	{
		Que1 object = new Que1(10, 20);
		object.display();
	}
}
