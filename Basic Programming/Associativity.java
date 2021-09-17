package javaprogramming;

public class Associativity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// Precedence & Associativity
		
		 Associativity tells the direction of the execution of operators. It can either be left to right or vice versa.

         / * -> L to R

         + - -> L to R

         ++, = -> R to L
         
         EXAMPLES  
         
		//int a = 6*5-34/2;
		Highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity
		            =30-34/2
		            =30-17
		            =13
		         
		//int b = 60/5-34*2;
		        = 12-34*2
		        = 12-68
		        = -56
		        //System.out.println(a);
		        //System.out.println(b);
		*/
		        // Quick Quiz
		
		//1
		        int x =6;
		        int y = 1;
		        int k = x * y/2;
		        System.out.println(k);
		        
       //2
		        int b = 20;
		        int c = 50;
		        int a = 10;
		        int k1 = b*b - (4*a*c)/(2*a);
		        System.out.println(k1);
		        
		//3     
		        int v = 8;
		        int u = 4;
		        int k2 = v * v - u * u;
		        System.out.println(k2);
		        
	   //4
               int m = 5;
               int n = 6;
               int o = 4;
               int k3 = m * n - o; 
               System.out.println(k3);
               
               
		    }


	}

