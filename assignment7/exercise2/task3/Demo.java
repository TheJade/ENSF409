//ENSF 409 Assignment 7, Exercise 2, Task 3
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class Demo {
    public static void main(String [] args){
        Numbers numbers = new Numbers();

        ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			executor.submit (new Thread(new RandomNumberThread ()));
            
		}
		executor.shutdown();
		System.out.print("5 random numbers are: ");
        
        try{
            executor.awaitTermination(1,  TimeUnit.HOURS);
            
        }catch(InterruptedException ignored){
        }
		
        System.out.println();
        
        System.out.println("The sum of 5 random numbers is: "+ numbers.getSum());
    }
}
