package examplepackage;

public class LambdaExample {
	 public static void main(String[] args) {  
		 Drawable myInterface = (s1, s2) -> {  
	            return s1 + " " + s2; // Concatenate the two strings  
	        };  
	        String result = myInterface.myMethod("Hello", "World!");  
	        System.out.println(result); // Output: Hello World!  
	    }  
	}  

