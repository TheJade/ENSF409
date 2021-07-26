import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 * ENSF 409 Assigment 1 Exercise 5
 * Student Names: Tsenguun Ulambayar, Jade Fjestad
 * This class is modified from class Marathon used in exercise 2
 * of the same assignment.
 */
public class Marathon {
    /**
     * method findFastest accepts an arraylist of times and returns the
     * index of the fastest time
     * @param times ArrayList of runner's times
     * @return index of fastest time
     */
    public static int findFastestRunner (ArrayList<Integer>times){
        int indexOfFastest = 0;
        for(int i=0; i<times.size();i++){
            if(times.get(i)<times.get(indexOfFastest)){
                indexOfFastest = i;
            }
        }
        return indexOfFastest;
    }
    
    /**
     * main method creates two ArrayLists for participants and their
     * respective times. Then it gets user input to fill in the two ArrayLists
     * and then calls findFastsestRunner to find index of the fastest time. This
     * index is returned to print out the name of the fastest runner on
     * the console.
     * @param args ignored command line argument
     */
    public static void main(String[] args) {
        //two array lists here to store the names and the running times
        ArrayList <String>participants = new ArrayList <String>();
        ArrayList <Integer>times = new ArrayList <Integer>();

        // Read user input
        String input;
        Scanner scan = new Scanner(System.in);
        while (true)
        {
        System.out.println("Please enter the name of the participant "+
        "or enter 'quit' calculate fastest runner");
        input = scan.nextLine();
        if(input.toUpperCase().equals("QUIT")){
            scan.close();
            break;
        }
        
        // Add the name to participants ArrayList
        participants.add(input);

        System.out.println("Please enter the running time of the participant");
        input = scan.nextLine();
        // Add the running time to your array list
        times.add(Integer.parseInt(input));
        }
        // Call the function findFastestRunner and pass the running times array list to it
        // Print the name of the fastestrunner to the console
        
        int index = findFastestRunner(times);
        System.out.println("The fastest runner is "+ participants.get(index)+
        ", and their running time is "+ Integer.toString(times.get(index)));
        
        }
    
}

