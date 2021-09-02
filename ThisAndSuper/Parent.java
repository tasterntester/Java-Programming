package ThisAndSuper;
//Que.5Call constructor of the parent class using super()


/* superclass Person */
class Person
{
	Person()
	{
		System.out.println("Person class Constructor");
	}
}

/* subclass Student extending the Person class */
class Student extends Person
{
	Student()
	{
		// invoke or call parent class constructor
		super();

		System.out.println("Student class Constructor");
	}
}

/* Driver program to test*/
class Test
{
	public static void main(String[] args)
	{
		
		new Student();
	}
}


