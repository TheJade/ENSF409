
import java.io.*;

public class Sums {

    public static void sum(BufferedReader in) { 
        // takes a sequence of integers as inputs, and outputs their sum
		try{
			int s, nextInt;
			s = 0;

			System.out.println("Please input the sequence of integers to sum, terminated by a 0");
   	    	nextInt = Integer.parseInt(in.readLine());
   	    	        //Read next datum in input. An integer is expected

			while (nextInt!=0) {
			    s = s + nextInt;
			    nextInt = Integer.parseInt(in.readLine());
			}

   	    	System.out.println("The sum is " + s);
		}
		catch(NumberFormatException enm){
			System.out.println("A non-integer was entered. Please enter an integer.");
			sum(in);
		}
		catch(IOException e){
			System.out.println("An error ocurred with your input, please enter again.");
			sum(in);
		}
	}

    public static void main(String[] arg) {         
		
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    		                     //"in" will receive data from the standard input stream
			String c;

			System.out.println("Do you wish to calculate a sum? (y/n)");

			c = in.readLine();
    		     //Read next datum in input. A string "y" or "n" is expected

			while (!c.equals("y") && !c.equals("n")) {
			    System.out.println("Please answer y or n");
			    c = in.readLine();
			}
		
			while (c.equals("y")) {
			    sum(in);
			    System.out.println("Do you wish to calculate another sum? (y/n)");
			    c = in.readLine();
			
			    while (!c.equals("y") && !c.equals("n")) {
				System.out.println("Please answer y or n");
				c = in.readLine();
			    }
			}
		}
		catch (IOException IOe){
			System.out.println("An error ocurred with your input, please enter again.\n Exiting the programme . . . ");
		}
		finally{
			System.out.println("Goodbye");
		}	
    }
}
