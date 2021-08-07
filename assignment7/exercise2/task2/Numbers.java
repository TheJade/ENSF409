//ENSF 409 Assignment 7, Exercise 2, Task 2
import java.util.ArrayList;
public class Numbers {
    static ArrayList<Integer> randomNumbers;

    public Numbers(){
        randomNumbers = new ArrayList<Integer>();
    }
    public ArrayList<Integer> getRandomNumbers(){
        return randomNumbers;
    }

    synchronized public void addToRandomNumbers(int n){
        randomNumbers.add(n);
        System.out.print(randomNumbers.get(randomNumbers.size()-1)+" ");
    }
}
