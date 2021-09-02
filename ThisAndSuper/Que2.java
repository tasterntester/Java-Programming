package ThisAndSuper;

//Parent class or Superclass or base class
class Que2
{
   int num = 100;
}
//Child class or subclass or derived class
class Subclass extends Que2
{
   /* The same variable num is declared in the Subclass
    * which is already present in the Superclass
    */
    int num = 110;
    void printNumber(){
	System.out.println(num);
    }
    public static void main(String args[]){
	Subclass obj= new Subclass();
	obj.printNumber();	
    }
}
