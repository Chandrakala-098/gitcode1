package examplepackage;

public class exception {
	public static void main(String[] args) {
		 System.out.println("start");
		 int a=5;
		 int b=0;
		 int result=0;
		 
		 try {
		 result = a/b;
		 }
		 catch(ArithmeticException e) {
					 
				 System.out.println(e.toString());

		 }
	}	
}


