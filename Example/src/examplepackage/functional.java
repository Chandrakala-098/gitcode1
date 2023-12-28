package examplepackage;

public class functional implements sayable{  
		    public void say(String msg){  
	        System.out.println(msg);  
	    }  
	    public static void main(String[] args) {  
	    	functional fie = new functional();  
	        fie.say("Hello there");  
	    }  
	}  

