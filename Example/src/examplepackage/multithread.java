package examplepackage;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " - Value: " + i);
        }
    }
}
public class multithread {
	  public static void main(String[] args) {
	        // Create two threads using the MyRunnable class
	        Thread thread1 = new Thread(new MyRunnable());
	        Thread thread2 = new Thread(new MyRunnable());

	        // Start the threads
	        thread1.start();
	        thread2.start();
	    }
}